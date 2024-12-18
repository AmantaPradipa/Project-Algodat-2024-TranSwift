public class QueuePenumpang {
   Penumpang front, rear;

   public QueuePenumpang() {
      front = null;
      rear = null;
   }

   public void enqueue(String nama, double uang, String namaBarang, double beratBarang) {
      Barang newBarang = new Barang(namaBarang, beratBarang);
      Penumpang newPenumpang = new Penumpang(nama, uang, newBarang);

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
      System.out.println("--------------------------------------------");
      if (front == null) {
         System.out.println("Antrian Kosong!");
         System.out.println("--------------------------------------------");
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
            System.out.println("--------------------------------------------");
         }
      }
   }
}
