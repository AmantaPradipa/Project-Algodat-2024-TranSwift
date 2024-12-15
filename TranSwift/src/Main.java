public class Main {
    public static void main(String[] args) {
        QueuePenumpang tranSwiftLL = new QueuePenumpang();
        tranSwiftLL.enqueue("Amanta", 200000, "Koper", 2);
        tranSwiftLL.enqueue("Kevin", 200000, "Koper", 2);
        
        tranSwiftLL.print();
    }
}
