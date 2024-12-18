public class StackBarang {
   Barang top;

   public StackBarang() {
      top = null;
   }

   public void push(String namaBarang, double beratBarang) {
      Barang newBarang = new Barang(namaBarang, beratBarang);

      newBarang.next = top;
      top = newBarang;
   }

   public void pop() {

      if (top == null) {
         return;
      }

      top = top.next;
   }

   public Barang searchBarang(String namaBarang) {
      Barang temp = top;

      while (temp != null) {
         if (temp.namaBarang.equalsIgnoreCase(namaBarang)) {
            return temp;
         }
         temp = temp.next;
      }

      System.out.println("Barang dengan nama '" + namaBarang + "' tidak ditemukan.");
      return null;
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

   public void displayBarang() {
      Barang temp = top;

      if (top == null) {
         System.out.println("Tidak ada barang!");
         return;
      }

      while (temp != null) {
         System.out.println("   " + temp.namaBarang + " " + temp.beratBarang + " kg");
         temp = temp.next;
      }

      System.out.println("   Berat Total: " + totalBerat() + " kg");
   }
}
