public class QueuePenumpang {
   Penumpang front, rear;
   StackBarang stackBarang;
   ListTiket listTiket;

   public QueuePenumpang(StackBarang stackBarang, ListTiket listTiket) {
      this.stackBarang = stackBarang;
      this.listTiket = listTiket;
      this.front = null;
      this.rear = null;
   }

   public void pesanTiket(String namaPenumpang, String labelTiket) {
      if (front == null) {
         System.out.println("Tidak ada penumpang dalam antrean.");
         return;
      }

      Penumpang currentPenumpang = front;
      while (currentPenumpang != null) {
         if (currentPenumpang.nama.equals(namaPenumpang)) {
            Tiket tiket = listTiket.searchTiket(labelTiket);

            if (tiket == null) {
               // System.out.println("Tiket dengan label " + labelTiket + " tidak ditemukan.");
               return;
            }

            if (currentPenumpang.uang >= tiket.hargaTiket) {
               currentPenumpang.uang -= tiket.hargaTiket;

               System.out.println("--------------------------------------------------");
               System.out.println("|                NOTIFIKASI TIKET                |");
               System.out.println("--------------------------------------------------");
               System.out.println(namaPenumpang + " berhasil memesan tiket dengan label " + labelTiket);
               System.out.println("Sisa uang: Rp" + currentPenumpang.uang);
               System.out.println("--------------------------------------------------\n");
            } else {
               System.out.println("Uang penumpang " + namaPenumpang + " tidak mencukupi untuk membeli tiket.");
               System.out.println("--------------------------------------------------");
            }
            return;
         }
         currentPenumpang = currentPenumpang.next;
      }

      System.out.println("Penumpang dengan nama '" + namaPenumpang + "' tidak ditemukan.");
      System.out.println("--------------------------------------------------");
   }

   public void enqueue(String nama, int uang, String namaBarang) {
      Barang barangPenumpang = stackBarang.searchBarang(namaBarang);

      // if (barangPenumpang == null) {
      //    System.out.println("Barang tidak ditemukan.");
      //    return;
      // }

      Penumpang newPenumpang = new Penumpang(nama, uang, barangPenumpang);

      if (front == null && rear == null) {
         front = newPenumpang;
      } else {
         rear.next = newPenumpang;
         newPenumpang.prev = rear;
      }

      rear = newPenumpang;
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
      System.out.println("\n--------------------------------------------------");
      System.out.println("|                DAFTAR PENUMPANG                |");
      System.out.println("--------------------------------------------------");
      if (front == null) {
         System.out.println("Antrian Kosong!");
         System.out.println("--------------------------------------------------");
         return;
      } else {
         Penumpang temp = front;
         while (temp != null) {
            System.out.println("Nama: " + temp.nama + ", Cash: Rp" + temp.uang);
            if (temp.barang != null) {
               System.out.println("Barang: " + temp.barang.namaBarang + " (" + temp.barang.beratBarang + " kg)");
            } else {
               System.out.println("Barang: Tidak ada");
            }
            temp = temp.next;
            System.out.println("--------------------------------------------------");
         }
      }
      System.out.println();
   }
}
