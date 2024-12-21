public class QueuePenumpang {
   Penumpang front, rear;
   StackBarang stackBarang;
   ListTiket listTiket;
   ListKendaraan listKendaraan;
   Graph graph;

   public QueuePenumpang(StackBarang stackBarang, ListTiket listTiket, ListKendaraan listKendaraan, Graph graph) {
      this.stackBarang = stackBarang;
      this.listTiket = listTiket;
      this.listKendaraan = listKendaraan;
      this.graph = graph;
      this.front = null;
      this.rear = null;
   }

   public void pesanTiket(String namaPenumpang, String labelTiket, String tempatAsal, String tempatTujuan) {
      // Tempat asal = graph.listTempat.searchTempat(tempatAsal);
      // Tempat tujuan = graph.listTempat.searchTempat(tempatTujuan);
      if (front == null) {
         // System.out.println("Tidak ada penumpang dalam antrean.");
         return;
      }

      Penumpang currentPenumpang = front;
      while (currentPenumpang != null) {
         if (currentPenumpang.nama.equals(namaPenumpang)) {
            Tiket tiket = listTiket.searchTiket(labelTiket);

            if (tiket == null) {
               return;
            }

            double hargaTiket = listTiket.hitungHargaTiket(tempatAsal, tempatTujuan, tiket.hargaTiket);
            if (currentPenumpang.uang >= hargaTiket) {
               currentPenumpang.uang -= hargaTiket;

               System.out.println("----------------------------------------------------------");
               System.out.println("|                    NOTIFIKASI TIKET                    |");
               System.out.println("----------------------------------------------------------");
               System.out.println(" " + namaPenumpang + " berhasil memesan tiket " + labelTiket + " "
                     + tempatAsal + " ke " + tempatTujuan);
               System.out.println(" Sisa uang: Rp" + currentPenumpang.uang);
               System.out.println("----------------------------------------------------------\n");
            } else {
               System.out.println("----------------------------------------------------------");
               System.out.println("|                    NOTIFIKASI TIKET                    |");
               System.out.println("----------------------------------------------------------");
               System.out.println(" Uang penumpang " + namaPenumpang + " tidak mencukupi untuk membeli tiket.");
               System.out.println("----------------------------------------------------------\n");
            }
            return;
         }
         currentPenumpang = currentPenumpang.next;
      }

      System.out.println(" Penumpang dengan nama '" + namaPenumpang + "' tidak ditemukan.");
      System.out.println("----------------------------------------------------------");
   }

   private void isiBarang(String namaPenumpang, String namaBarang, double beratBarang) {
      Penumpang penumpang = findPenumpangByNama(namaPenumpang);
      if (penumpang == null) {
         return;
      }

      if (namaBarang == null || namaBarang.isEmpty()) {
         return;
      }

      // Cari barang di StackBarang
      Barang barangPenumpang = stackBarang.searchBarang(namaBarang);
      if (barangPenumpang == null) {
         // Buat barang baru jika tidak ditemukan
         barangPenumpang = new Barang(namaBarang, beratBarang);
         stackBarang.push(namaBarang, beratBarang);
         System.out.println(namaBarang + " milik " + namaPenumpang + "\nberhasil ditambahkan ke dalam bagasi.");
      } else {
         // Jika barang sudah ada, perbarui beratnya
         barangPenumpang.beratBarang = beratBarang;
         System.out.println(namaBarang + " milik " + namaPenumpang + "\nberhasil ditambahkan ke dalam bagasi.");
      }

      // Hubungkan barang ke penumpang
      penumpang.barang = barangPenumpang;
   }

   // Fungsi untuk mencari penumpang berdasarkan nama
   private Penumpang findPenumpangByNama(String nama) {
      Penumpang currentPenumpang = front;
      while (currentPenumpang != null) {
         if (currentPenumpang.nama.equals(nama)) {
            return currentPenumpang;
         }
         currentPenumpang = currentPenumpang.next;
      }
      return null; // Jika penumpang tidak ditemukan
   }

   public void enqueue(String nama, int uang, String namaBarang, double beratBarang, String label,
         String jenisKendaraan) {
      // Mencari tiket dan kendaraan
      Tiket tiketPenumpang = listTiket.searchTiket(label);
      Kendaraan kendaraan = listKendaraan.searchKendaraan(jenisKendaraan);

      if (tiketPenumpang == null) {
         System.out.println("Tiket dengan label '" + label + "' tidak ditemukan.");
         return;
      }

      if (kendaraan == null) {
         System.out.println("Kendaraan dengan jenis '" + jenisKendaraan + "' tidak ditemukan.");
         return;
      }

      // Cek kapasitas kendaraan untuk penumpang
      if (!kendaraan.tambahPenumpang()) {
         System.out.println("Kendaraan " + jenisKendaraan + " sudah penuh dengan penumpang.");
         return;
      }

      // Cek apakah barang bisa masuk ke kendaraan
      Barang barangPenumpang = null;
      if (namaBarang != null && !namaBarang.isEmpty()) {
         barangPenumpang = stackBarang.searchBarang(namaBarang);
         if (barangPenumpang == null) {
            // Menambahkan barang jika belum ada
            barangPenumpang = new Barang(namaBarang, beratBarang); // Gunakan beratBarang yang diberikan
            stackBarang.push(namaBarang, beratBarang); // Masukkan barang ke dalam stack barang
         }

         // Periksa kapasitas barang di kendaraan
         if (!kendaraan.tambahBarang(barangPenumpang.beratBarang)) {
            System.out
                  .println("\t  Kapasitas bagasi " + jenisKendaraan + " sudah penuh\n\t        gagal menambah barang");
            return;
         }
      }

      // Membuat penumpang baru dan menambahkan ke antrean
      Penumpang newPenumpang = new Penumpang(nama, uang, barangPenumpang);

      if (front == null && rear == null) {
         front = newPenumpang;
      } else {
         rear.next = newPenumpang;
         newPenumpang.prev = rear;
      }

      rear = newPenumpang;

      // Isi barang setelah penumpang terdaftar
      if (namaBarang != null && !namaBarang.isEmpty()) {
         isiBarang(nama, namaBarang, beratBarang); // Di sini berat barang akan ditambahkan ke penumpang
      }
   }

   public void dequeue() {
      if (front == null) {
         System.out.println("Antrian kosong!");
         return;
      }

      front = front.next;

      if (front != null) {
         front.prev = null;
      } else {
         rear = null;
      }
   }

   public void clearQueue() {
      front = null;
      rear = null;
   }

   public void displayPenumpang() {
      System.out.println("==========================================================");
      System.out.println("|                  DAFTAR ANTRIAN PENUMPANG              |");
      System.out.println("==========================================================");
      if (front == null) {
         System.out.println("|                 Antrian Kosong!                  |");
         System.out.println("==========================================================");
      } else {
         System.out.printf("| %-12s | %-12s | %-24s |\n", "Nama", "Cash (Rp)", "Barang (Berat)");
         System.out.println("----------------------------------------------------------");

         Penumpang temp = front;
         while (temp != null) {
            String barangInfo = temp.barang != null
                  ? temp.barang.namaBarang + " (" + temp.barang.beratBarang + " kg)"
                  : "Tidak ada";

            System.out.printf("| %-12s | Rp%-10d | %-24s |\n",
                  temp.nama,
                  temp.uang, // `uang` sekarang berupa int
                  barangInfo);

            temp = temp.next;
         }
         System.out.println("==========================================================");
      }
   }

}
