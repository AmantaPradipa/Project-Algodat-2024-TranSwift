import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListKendaraan Kendaraan = new ListKendaraan();
        ListTempat Tempat = new ListTempat();
        StackBarang Barang = new StackBarang();
        Graph Bus = new Graph();
        Graph Taksi = new Graph();
        ListTiket TiketBus = new ListTiket(Kendaraan, Tempat, Bus);
        ListTiket TiketTaksi = new ListTiket(Kendaraan, Tempat, Taksi);
        QueuePenumpang PenumpangBus = new QueuePenumpang(Barang, TiketBus);
        QueuePenumpang PenumpangTaksi = new QueuePenumpang(Barang, TiketTaksi);
        Scanner scanner = new Scanner(System.in);
        Kendaraan.addKendaraan("Bus", true, 30, 200);
        Kendaraan.addKendaraan("Taksi", false, 4, 50);

        Bus.addVertex("Tokyo");
        Bus.addVertex("Kyoto");
        Bus.addVertex("Osaka");
        Bus.addVertex("Hiroshima");
        Bus.addVertex("Nagoya");
        Bus.addVertex("Sapporo");
        Bus.addVertex("Fukuoka");
        Bus.addVertex("Nara");
        Bus.addVertex("Kobe");
        Bus.addVertex("Hakone");
        Bus.addVertex("Yokohama");
        Bus.addVertex("Sendai");

        Taksi.addVertex("Tokyo");
        Taksi.addVertex("Kyoto");
        Taksi.addVertex("Osaka");
        Taksi.addVertex("Hiroshima");
        Taksi.addVertex("Nagoya");
        Taksi.addVertex("Sapporo");
        Taksi.addVertex("Fukuoka");
        Taksi.addVertex("Nara");
        Taksi.addVertex("Kobe");
        Taksi.addVertex("Hakone");
        Taksi.addVertex("Yokohama");
        Taksi.addVertex("Sendai");

        Bus.addEdge("Tokyo", "Yokohama", 50, true);
        Bus.addEdge("Yokohama", "Nagoya", 350, true);
        Bus.addEdge("Nagoya", "Osaka", 150, true);
        Bus.addEdge("Osaka", "Kyoto", 50, true);
        Bus.addEdge("Kyoto", "Nara", 60, true);
        Bus.addEdge("Nara", "Kobe", 80, true);
        Bus.addEdge("Kobe", "Hiroshima", 300, true);
        Bus.addEdge("Hiroshima", "Fukuoka", 400, true);
        Bus.addEdge("Fukuoka", "Sapporo", 500, true);
        Bus.addEdge("Sapporo", "Sendai", 450, true);
        Bus.addEdge("Sendai", "Hakone", 250, true);
        Bus.addEdge("Hakone", "Tokyo", 200, true);
        Bus.addEdge("Tokyo", "Nagoya", 300, true);
        Bus.addEdge("Nagoya", "Yokohama", 250, true);
        Bus.addEdge("Osaka", "Yokohama", 400, true);
        Bus.addEdge("Kyoto", "Sapporo", 450, true);
        Bus.addEdge("Hiroshima", "Yokohama", 350, true);
        Bus.addEdge("Fukuoka", "Nara", 320, true);
        Bus.addEdge("Sapporo", "Osaka", 450, true);
        Bus.addEdge("Hakone", "Nara", 300, true);
        Bus.addEdge("Kobe", "Nagoya", 200, true);
        Bus.addEdge("Fukuoka", "Sendai", 420, true);
        Bus.addEdge("Hiroshima", "Osaka", 280, true);
        Bus.addEdge("Hiroshima", "Kyoto", 260, true);
        Bus.addEdge("Sendai", "Fukuoka", 440, true);
        Bus.addEdge("Hakone", "Sapporo", 480, true);
        Bus.addEdge("Tokyo", "Osaka", 400, true);
        Bus.addEdge("Nara", "Sapporo", 460, true);
        Bus.addEdge("Sendai", "Kobe", 380, true);
        Bus.addEdge("Kyoto", "Hakone", 300, true);

        Taksi.addEdge("Tokyo", "Yokohama", 50, false);
        Taksi.addEdge("Tokyo", "Nagoya", 300, false);
        Taksi.addEdge("Tokyo", "Hakone", 200, false);
        Taksi.addEdge("Yokohama", "Nagoya", 350, false);
        Taksi.addEdge("Yokohama", "Osaka", 400, false);
        Taksi.addEdge("Yokohama", "Hakone", 250, false);
        Taksi.addEdge("Nagoya", "Osaka", 150, false);
        Taksi.addEdge("Nagoya", "Kyoto", 50, false);
        Taksi.addEdge("Nagoya", "Kobe", 200, false);
        Taksi.addEdge("Nagoya", "Nara", 320, false);
        Taksi.addEdge("Osaka", "Kyoto", 50, false);
        Taksi.addEdge("Osaka", "Kobe", 300, false);
        Taksi.addEdge("Osaka", "Hiroshima", 400, false);
        Taksi.addEdge("Kyoto", "Nara", 60, false);
        Taksi.addEdge("Kyoto", "Kobe", 150, false);
        Taksi.addEdge("Kyoto", "Osaka", 50, false);
        Taksi.addEdge("Nara", "Kobe", 80, false);
        Taksi.addEdge("Nara", "Hiroshima", 320, false);
        Taksi.addEdge("Kobe", "Hiroshima", 300, false);
        Taksi.addEdge("Kobe", "Fukuoka", 500, false);
        Taksi.addEdge("Hiroshima", "Fukuoka", 400, false);
        Taksi.addEdge("Hiroshima", "Sapporo", 450, false);
        Taksi.addEdge("Fukuoka", "Sapporo", 500, false);
        Taksi.addEdge("Fukuoka", "Sendai", 420, false);
        Taksi.addEdge("Fukuoka", "Nagoya", 350, false);
        Taksi.addEdge("Sapporo", "Sendai", 450, false);
        Taksi.addEdge("Sapporo", "Hakone", 480, false);
        Taksi.addEdge("Sapporo", "Tokyo", 500, false);
        Taksi.addEdge("Sendai", "Tokyo", 250, false);
        Taksi.addEdge("Sendai", "Yokohama", 380, false);
        Taksi.addEdge("Sendai", "Hakone", 300, false);
        Taksi.addEdge("Hakone", "Nagoya", 250, false);
        Taksi.addEdge("Hakone", "Kyoto", 300, false);
        Taksi.addEdge("Hakone", "Tokyo", 200, false);
        Taksi.addEdge("Nagoya", "Hiroshima", 280, false);
        Taksi.addEdge("Nagoya", "Fukuoka", 420, false);
        Taksi.addEdge("Kyoto", "Sapporo", 450, false);
        Taksi.addEdge("Osaka", "Sendai", 400, false);
        Taksi.addEdge("Kobe", "Sapporo", 500, false);
        Taksi.addEdge("Kobe", "Sendai", 380, false);

        while (true) {
            System.out.println("-------------WELCOME TO TRANSWIFT---------------");
            System.out.println("Masuk sebagai:");
            System.out.println("1. Pelanggan");
            System.out.println("2. Pegawai");
            System.out.print("Pilih opsi: ");
            int userType = scanner.nextInt();
            
            if (userType == 1) {
                // Pelanggan menu
                while (true) {
                    System.out.println("-------------WELCOME TO TRANSWIFT OUR BELOVED PELANGGAN---------------");
                    System.out.println("\n--- Menu Pelanggan ---");
                    System.out.println("1. Beli tiket");
                    System.out.println("2. Cek daftar kendaraan");
                    System.out.println("3. Cek rute");
                    System.out.println("4. Keluar");
                    System.out.print("Pilih opsi: ");
                    int pelangganOption = scanner.nextInt();
                    scanner.nextLine();
                    if (pelangganOption == 1) {
                        // Beli tiket
                        System.out.println("Fitur beli tiket...");
                        System.out.println("Masukkan Nama Anda");
                        String namapenumpang = scanner.nextLine();
                        System.out.println("Masukkan Jumlah Uang Anda");
                        int Uang = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Masukkan Nama Barang Anda");
                        String namaBarang = scanner.nextLine();
                        System.out.println("Masukkan Berat Barang Anda");
                        int beratBarang = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Masukkan Label");
                        String label = scanner.nextLine();
                        Barang b = new Barang(namaBarang,beratBarang);
                        Penumpang p = new Penumpang(namapenumpang,Uang,b);
                        PenumpangBus.enqueue(namapenumpang, Uang, namaBarang, label);

                        
                    } else if (pelangganOption == 2) {
                        // Cek daftar kendaraan
                        System.out.println("Fitur cek daftar kendaraan...");
                        // Add your logic for checking vehicles here
                    } else if (pelangganOption == 3) {
                        // Cek rute
                        System.out.println("Fitur cek rute...");
                        // Add your logic for checking routes here
                    } else if (pelangganOption == 4) {
                        // Keluar
                        System.out.println("Terima kasih, sampai jumpa!");
                        break; // Exit to main menu
                    } else {
                        System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                    }
                }
            } else if (userType == 2) {
                // Pegawai menu
                while (true) {
                    System.out.println("-------------WELCOME TO TRANSWIFT OUR BELOVED PEGAWAI---------------");
                    System.out.println("\n--- Menu Pegawai ---");
                    System.out.println("1. Cek daftar penumpang");
                    System.out.println("2. Cek daftar kendaraan");
                    System.out.println("3. Cek bagasi");
                    System.out.println("4. Cek tiket");
                    System.out.println("5. Keluar");
                    System.out.print("Pilih opsi: ");
                    int pegawaiOption = scanner.nextInt();
                    
                    if (pegawaiOption == 1) {
                        // Cek daftar penumpang
                        System.out.println("Fitur cek daftar penumpang...");
                        // Add your logic for checking passengers here
                    } else if (pegawaiOption == 2) {
                        // Cek daftar kendaraan
                        System.out.println("Fitur cek daftar kendaraan...");
                        // Add your logic for checking vehicles here
                    } else if (pegawaiOption == 3) {
                        // Cek bagasi
                        System.out.println("Fitur cek bagasi...");
                        // Add your logic for checking luggage here
                    } else if (pegawaiOption == 4) {
                        // Cek tiket
                        System.out.println("Fitur cek tiket...");
                        // Add your logic for checking tickets here
                    } else if (pegawaiOption == 5) {
                        // Keluar
                        System.out.println("Terima kasih, sampai jumpa!");
                        break; // Exit to main menu
                    } else {
                        System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                    }
                }
            } else {
                System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
