public class StackBarang {
   Barang top;

   public StackBarang() {
      top = null;
   }

   public void push(String namaBarang, double beratBarang) {
      Barang newNode = new Barang(namaBarang, beratBarang);

      newNode.next = top;
      top = newNode;
   }

   public void pop() {

      if (top == null) {
         return;
      }

      top = top.next;
   }

   public void clearStack() {
      if (top == null) {
         return;
      }

      top = null;
   }

   private double totalBerat() {
      Barang temp = top;
      double beratTotal = 0;

      while (temp != null) {
         beratTotal = temp.beratBarang + beratTotal;
         temp = temp.next;
      }

      return beratTotal;
   }

   public void print() {
      Barang temp = top;

      if (top == null) {
         System.out.println("Empty!");
         return;
      }

      while (temp != null) {
         System.out.println("   " + temp.namaBarang + " " + temp.beratBarang + " kg");
         temp = temp.next;
      }

      System.out.println("   Berat Total: " + totalBerat() + " kg");
   }
}
