public class QueuePenumpang {
   Penumpang front, rear;

   public QueuePenumpang() {
      front = null;
      rear = null;
   }

   public void enqueue(String nama, int uang, StackBarang barang) {
      Penumpang newNode = new Penumpang(nama, uang, barang);

      if (front == null && rear == null) {
         front = newNode;

      } else {
         rear.next = newNode;
      }

      rear = newNode;
   }

   public void dequeue() {
      if (front == null && rear == null) {
         return;
      }

      front = front.next;

      if (front == null) {
         rear = null;
      }
   }

   public void clearQueue() {
      if (front == null && rear == null) {
         return;
      }

      front = null;
      rear = null;
   }

   public void print() {
      System.out.println("--------------------------------------------");
      if (front == null && rear == null) {

         System.out.println("Empty!");
         System.out.println("--------------------------------------------");
         return;

      } else {
         Penumpang temp = front;

         while (temp != null) {
            System.out.println(temp.nama + ", cash: Rp" + temp.uang);
            temp.barang.print();

            temp = temp.next;

            System.out.println("--------------------------------------------");
         }

      }
   }
}
