import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListKendaraan Kendaraan = new ListKendaraan();
        StackBarang Barang = new StackBarang();
        Graph GraphBus = new Graph();
        Graph GraphTaksi = new Graph();
        ListTiket TiketBus = new ListTiket(Kendaraan, GraphBus);
        ListTiket TiketTaksi = new ListTiket(Kendaraan, GraphTaksi);
        QueuePenumpang PenumpangBus = new QueuePenumpang(Barang, TiketBus, Kendaraan, GraphBus);
        QueuePenumpang PenumpangTaksi = new QueuePenumpang(Barang, TiketTaksi, Kendaraan, GraphTaksi);
        Scanner scanner = new Scanner(System.in);

        Kendaraan.addKendaraan("Bus", true, 30, 200);
        Kendaraan.addKendaraan("Taksi", false, 4, 50);

        GraphBus.addVertex("Tokyo");
        GraphBus.addVertex("Kyoto");
        GraphBus.addVertex("Osaka");
        GraphBus.addVertex("Hiroshima");
        GraphBus.addVertex("Nagoya");
        GraphBus.addVertex("Sapporo");
        GraphBus.addVertex("Fukuoka");
        GraphBus.addVertex("Nara");
        GraphBus.addVertex("Kobe");
        GraphBus.addVertex("Hakone");
        GraphBus.addVertex("Yokohama");
        GraphBus.addVertex("Sendai");

        GraphTaksi.addVertex("Tokyo");
        GraphTaksi.addVertex("Kyoto");
        GraphTaksi.addVertex("Osaka");
        GraphTaksi.addVertex("Hiroshima");
        GraphTaksi.addVertex("Nagoya");
        GraphTaksi.addVertex("Sapporo");
        GraphTaksi.addVertex("Fukuoka");
        GraphTaksi.addVertex("Nara");
        GraphTaksi.addVertex("Kobe");
        GraphTaksi.addVertex("Hakone");
        GraphTaksi.addVertex("Yokohama");
        GraphTaksi.addVertex("Sendai");

        GraphBus.addEdge("Tokyo", "Yokohama", 50, true);
        GraphBus.addEdge("Yokohama", "Nagoya", 350, true);
        GraphBus.addEdge("Nagoya", "Osaka", 150, true);
        GraphBus.addEdge("Osaka", "Kyoto", 50, true);
        GraphBus.addEdge("Kyoto", "Nara", 60, true);
        GraphBus.addEdge("Nara", "Kobe", 80, true);
        GraphBus.addEdge("Kobe", "Hiroshima", 300, true);
        GraphBus.addEdge("Hiroshima", "Fukuoka", 400, true);
        GraphBus.addEdge("Fukuoka", "Sapporo", 500, true);
        GraphBus.addEdge("Sapporo", "Sendai", 450, true);
        GraphBus.addEdge("Sendai", "Hakone", 250, true);
        GraphBus.addEdge("Hakone", "Tokyo", 200, true);
        GraphBus.addEdge("Tokyo", "Nagoya", 300, true);
        GraphBus.addEdge("Nagoya", "Yokohama", 250, true);
        GraphBus.addEdge("Osaka", "Yokohama", 400, true);
        GraphBus.addEdge("Kyoto", "Sapporo", 450, true);
        GraphBus.addEdge("Hiroshima", "Yokohama", 350, true);
        GraphBus.addEdge("Fukuoka", "Nara", 320, true);
        GraphBus.addEdge("Sapporo", "Osaka", 450, true);
        GraphBus.addEdge("Hakone", "Nara", 300, true);
        GraphBus.addEdge("Kobe", "Nagoya", 200, true);
        GraphBus.addEdge("Fukuoka", "Sendai", 420, true);
        GraphBus.addEdge("Hiroshima", "Osaka", 280, true);
        GraphBus.addEdge("Hiroshima", "Kyoto", 260, true);
        GraphBus.addEdge("Sendai", "Fukuoka", 440, true);
        GraphBus.addEdge("Hakone", "Sapporo", 480, true);
        GraphBus.addEdge("Tokyo", "Osaka", 400, true);
        GraphBus.addEdge("Nara", "Sapporo", 460, true);
        GraphBus.addEdge("Sendai", "Kobe", 380, true);
        GraphBus.addEdge("Kyoto", "Hakone", 300, true);

        GraphTaksi.addEdge("Tokyo", "Yokohama", 50, false);
        GraphTaksi.addEdge("Tokyo", "Nagoya", 300, false);
        GraphTaksi.addEdge("Tokyo", "Hakone", 200, false);
        GraphTaksi.addEdge("Yokohama", "Nagoya", 350, false);
        GraphTaksi.addEdge("Yokohama", "Osaka", 400, false);
        GraphTaksi.addEdge("Yokohama", "Hakone", 250, false);
        GraphTaksi.addEdge("Nagoya", "Osaka", 150, false);
        GraphTaksi.addEdge("Nagoya", "Kyoto", 50, false);
        GraphTaksi.addEdge("Nagoya", "Kobe", 200, false);
        GraphTaksi.addEdge("Nagoya", "Nara", 320, false);
        GraphTaksi.addEdge("Osaka", "Kyoto", 50, false);
        GraphTaksi.addEdge("Osaka", "Kobe", 300, false);
        GraphTaksi.addEdge("Osaka", "Hiroshima", 400, false);
        GraphTaksi.addEdge("Kyoto", "Nara", 60, false);
        GraphTaksi.addEdge("Kyoto", "Kobe", 150, false);
        GraphTaksi.addEdge("Kyoto", "Osaka", 50, false);
        GraphTaksi.addEdge("Nara", "Kobe", 80, false);
        GraphTaksi.addEdge("Nara", "Hiroshima", 320, false);
        GraphTaksi.addEdge("Kobe", "Hiroshima", 300, false);
        GraphTaksi.addEdge("Kobe", "Fukuoka", 500, false);
        GraphTaksi.addEdge("Hiroshima", "Fukuoka", 400, false);
        GraphTaksi.addEdge("Hiroshima", "Sapporo", 450, false);
        GraphTaksi.addEdge("Fukuoka", "Sapporo", 500, false);
        GraphTaksi.addEdge("Fukuoka", "Sendai", 420, false);
        GraphTaksi.addEdge("Fukuoka", "Nagoya", 350, false);
        GraphTaksi.addEdge("Sapporo", "Sendai", 450, false);
        GraphTaksi.addEdge("Sapporo", "Hakone", 480, false);
        GraphTaksi.addEdge("Sapporo", "Tokyo", 500, false);
        GraphTaksi.addEdge("Sendai", "Tokyo", 250, false);
        GraphTaksi.addEdge("Sendai", "Yokohama", 380, false);
        GraphTaksi.addEdge("Sendai", "Hakone", 300, false);
        GraphTaksi.addEdge("Hakone", "Nagoya", 250, false);
        GraphTaksi.addEdge("Hakone", "Kyoto", 300, false);
        GraphTaksi.addEdge("Hakone", "Tokyo", 200, false);
        GraphTaksi.addEdge("Nagoya", "Hiroshima", 280, false);
        GraphTaksi.addEdge("Nagoya", "Fukuoka", 420, false);
        GraphTaksi.addEdge("Kyoto", "Sapporo", 450, false);
        GraphTaksi.addEdge("Osaka", "Sendai", 400, false);
        GraphTaksi.addEdge("Kobe", "Sapporo", 500, false);
        GraphTaksi.addEdge("Kobe", "Sendai", 380, false);

        TiketBus.addTiket("Bus", "Tokyo", "Yokohama", 25000, "Bus");
        TiketBus.addTiket("Bus", "Yokohama", "Nagoya", 25000, "Bus");
        TiketBus.addTiket("Bus", "Nagoya", "Osaka", 25000, "Bus");
        TiketBus.addTiket("Bus", "Osaka", "Kyoto", 25000, "Bus");
        TiketBus.addTiket("Bus", "Kyoto", "Nara", 25000, "Bus");
        TiketBus.addTiket("Bus", "Nara", "Kobe", 25000, "Bus");
        TiketBus.addTiket("Bus", "Kobe", "Hiroshima", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hiroshima", "Fukuoka", 25000, "Bus");
        TiketBus.addTiket("Bus", "Fukuoka", "Sapporo", 25000, "Bus");
        TiketBus.addTiket("Bus", "Sapporo", "Sendai", 25000, "Bus");
        TiketBus.addTiket("Bus", "Sendai", "Hakone", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hakone", "Tokyo", 25000, "Bus");
        TiketBus.addTiket("Bus", "Tokyo", "Nagoya", 25000, "Bus");
        TiketBus.addTiket("Bus", "Nagoya", "Yokohama", 25000, "Bus");
        TiketBus.addTiket("Bus", "Osaka", "Yokohama", 25000, "Bus");
        TiketBus.addTiket("Bus", "Kyoto", "Sapporo", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hiroshima", "Yokohama", 25000, "Bus");
        TiketBus.addTiket("Bus", "Fukuoka", "Nara", 25000, "Bus");
        TiketBus.addTiket("Bus", "Sapporo", "Osaka", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hakone", "Nara", 25000, "Bus");
        TiketBus.addTiket("Bus", "Kobe", "Nagoya", 25000, "Bus");
        TiketBus.addTiket("Bus", "Fukuoka", "Sendai", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hiroshima", "Osaka", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hiroshima", "Kyoto", 25000, "Bus");
        TiketBus.addTiket("Bus", "Sendai", "Fukuoka", 25000, "Bus");
        TiketBus.addTiket("Bus", "Hakone", "Sapporo", 25000, "Bus");
        TiketBus.addTiket("Bus", "Tokyo", "Osaka", 25000, "Bus");
        TiketBus.addTiket("Bus", "Nara", "Sapporo", 25000, "Bus");
        TiketBus.addTiket("Bus", "Sendai", "Kobe", 25000, "Bus");
        TiketBus.addTiket("Bus", "Kyoto", "Hakone", 25000, "Bus");

        TiketTaksi.addTiket("Taksi", "Tokyo", "Yokohama", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Tokyo", "Nagoya", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Tokyo", "Hakone", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Yokohama", "Nagoya", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Yokohama", "Osaka", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Yokohama", "Hakone", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nagoya", "Osaka", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nagoya", "Kyoto", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nagoya", "Kobe", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nagoya", "Nara", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Osaka", "Kyoto", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Osaka", "Kobe", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Osaka", "Hiroshima", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kyoto", "Nara", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kyoto", "Kobe", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kyoto", "Osaka", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nara", "Kobe", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nara", "Hiroshima", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kobe", "Hiroshima", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kobe", "Fukuoka", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Hiroshima", "Fukuoka", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Hiroshima", "Sapporo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Fukuoka", "Sapporo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Fukuoka", "Sendai", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Fukuoka", "Nagoya", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Sapporo", "Sendai", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Sapporo", "Hakone", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Sapporo", "Tokyo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Sendai", "Tokyo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Sendai", "Yokohama", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Sendai", "Hakone", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Hakone", "Nagoya", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Hakone", "Kyoto", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Hakone", "Tokyo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nagoya", "Hiroshima", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Nagoya", "Fukuoka", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kyoto", "Sapporo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Osaka", "Sendai", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kobe", "Sapporo", 30000, "Taksi");
        TiketTaksi.addTiket("Taksi", "Kobe", "Sendai", 30000, "Taksi");

        while (true) {
            clearScreen();
            System.out.println(
            "████████╗██████╗  █████╗ ███╗   ██╗███████╗██╗    ██╗██╗███████╗████████╗\r\n" + //
                    "╚══██╔══╝██╔══██╗██╔══██╗████╗  ██║██╔════╝██║    ██║██║██╔════╝╚══██╔══╝\r\n" + //
                    "   ██║   ██████╔╝███████║██╔██╗ ██║███████╗██║ █╗ ██║██║█████╗     ██║   \r\n" + //
                    "   ██║   ██╔══██╗██╔══██║██║╚██╗██║╚════██║██║███╗██║██║██╔══╝     ██║   \r\n" + //
                    "   ██║   ██║  ██║██║  ██║██║ ╚████║███████║╚███╔███╔╝██║██║        ██║   \r\n" + //
                    "   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝ ╚══╝╚══╝ ╚═╝╚═╝        ╚═╝   \r\n" + //
                    "                                                                         ");
            System.out.println("\n--- Menu Pelanggan ---");
            System.out.println("1. Beli tiket");
            System.out.println("2. Cek daftar kendaraan");
            System.out.println("3. Cek rute");
            System.out.println("4. Cek penumpang");
            System.out.println("5. Cek harga tiket");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            int pelangganOption = scanner.nextInt();
            scanner.nextLine();
            if (pelangganOption == 1) {
                // Beli tiket
                System.out.println("Fitur beli tiket...");
                System.out.println("Masukkan Nama Anda");
                System.out.print("=> ");
                String namapenumpang = scanner.nextLine();
                System.out.println("Masukkan Jumlah Uang Anda");
                System.out.print("=> ");
                int uang = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Nama Barang Anda ");
                System.out.print("=> ");
                String namaBarang = scanner.nextLine();
                System.out.println("Masukkan Berat Barang");
                System.out.print("=> ");
                int beratBarang = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Kendaraan yang ingin digunakan");
                System.out.print("=> ");
                String label = scanner.nextLine();
                System.out.println("Masukkan Kota Asal");
                System.out.print("=> ");
                String TempatAsal = scanner.nextLine();
                System.out.println("Masukkan Kota Tujuan");
                System.out.print("=> ");
                String TempatTujuan = scanner.nextLine();
                System.out.println();
        
                if (label.equalsIgnoreCase("Bus")) {
                    PenumpangBus.pesanTiket(namapenumpang, label, TempatAsal, TempatTujuan);
                    PenumpangBus.enqueue(namapenumpang, uang, namaBarang, beratBarang, label);
                    PenumpangBus.displayPenumpang("Bus");
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    System.out.println();
                } else if (label.equalsIgnoreCase("Taksi")){
                    PenumpangTaksi.pesanTiket(namapenumpang, label, TempatAsal, TempatTujuan);
                    PenumpangTaksi.enqueue(namapenumpang, uang, namaBarang, beratBarang, label);
                    PenumpangTaksi.displayPenumpang("Taksi");
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    System.out.println();
                }
            } else if (pelangganOption == 2) {
                    Kendaraan.displayKendaraan();
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
            } else if (pelangganOption == 3) {
                    System.out.println("Masukkan Tempat Asal Anda");
                    System.out.print("=> ");
                    String tempatAsal = scanner.nextLine();
                    System.out.println("Masukkan Tempat Tujuan Anda");
                    System.out.print("=> ");
                    String tempatTujuan = scanner.nextLine();
                    System.out.println("Pilih Jenis Kendaraan Anda");
                    System.out.print("=> ");
                    String kendaraan = scanner.nextLine();
                    if (kendaraan.equalsIgnoreCase("Bus")){
                        GraphBus.displayRoute(tempatAsal, tempatTujuan, true);
                        System.out.println("Press Enter to continue...");
                        scanner.nextLine();
                        System.out.println();
                    } else if (kendaraan.equalsIgnoreCase("Taksi")){
                        GraphTaksi.displayRoute(tempatAsal, tempatTujuan, false);
                        System.out.println("Press Enter to continue...");
                        scanner.nextLine();
                        System.out.println();
                    }
            } else if (pelangganOption == 4) {
                PenumpangBus.displayPenumpang("Bus");
                PenumpangTaksi.displayPenumpang("Taksi");
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
                System.out.println();
            } else if (pelangganOption == 5){
                System.out.println("Pilih Jenis Tiket (Bus/Taksi)");
                    System.out.print("=> ");
                    String kendaraan = scanner.nextLine();
                    if (kendaraan.equalsIgnoreCase("Bus")){
                        TiketBus.displayAllTicket(kendaraan);
                        System.out.println("Press Enter to continue...");
                        scanner.nextLine();
                        System.out.println();
                    } else if (kendaraan.equalsIgnoreCase("Taksi")){
                        TiketBus.displayAllTicket(kendaraan);
                        System.out.println("Press Enter to continue...");
                        scanner.nextLine();
                        System.out.println();
                    }
            } else if (pelangganOption == 6) {
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;
            } else {
                System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
    public static void clearScreen() {
        // ANSI escape code untuk membersihkan layar
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}