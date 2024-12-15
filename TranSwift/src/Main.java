public class Main {
   public static void main(String[] args) {
      StackBarang barangAmanta = new StackBarang();
      StackBarang barangKevin = new StackBarang();

      barangAmanta.push("Koper", 2.5);
      barangAmanta.push("Ransel", 1.5);

      barangKevin.push("Tas", 1);
      barangKevin.push("Kardus", 3);

      QueuePenumpang penumpang = new QueuePenumpang();

      penumpang.enqueue("Amanta", 200000, barangAmanta);
      penumpang.enqueue("Kevin", 200000, barangKevin);
      penumpang.print();

      barangKevin.pop();
      penumpang.dequeue();
      System.out.println("\nstlh pop dan dequeue");

      penumpang.print();
   }
}
