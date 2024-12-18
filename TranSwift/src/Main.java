public class Main {
    public static void main(String[] args) {
        ListKendaraan Kendaraan = new ListKendaraan();
        ListTempat Tempat = new ListTempat();
        ListTiket Tiket = new ListTiket(Kendaraan, Tempat);

        Kendaraan.addKendaraan("Kereta A1", true, 100, 200);
        Kendaraan.addKendaraan("Kereta A2", true, 100, 200);
        Kendaraan.addKendaraan("Bus B1", true, 30, 80);
        Kendaraan.addKendaraan("Bus B2", true, 30, 80);
        Kendaraan.addKendaraan("Bus B3", true, 30, 80);
        Kendaraan.addKendaraan("Taksi C1", false, 4, 30);
        Kendaraan.addKendaraan("Taksi C2", false, 4, 30);
        Kendaraan.addKendaraan("Taksi C3", false, 4, 30);
        Kendaraan.addKendaraan("Taksi C4", false, 4, 30);
        Kendaraan.addKendaraan("Taksi C5", false, 4, 30);
        Kendaraan.displayKendaraan();

        Tempat.addTempat("Tokyo");
        Tempat.addTempat("Kyoto");
        Tempat.addTempat("Osaka");
        Tempat.addTempat("Hiroshima");
        Tempat.addTempat("Nagoya");
        Tempat.addTempat("Sapporo");
        Tempat.addTempat("Fukuoka");
        Tempat.addTempat("Nara");
        Tempat.addTempat("Kobe");
        Tempat.addTempat("Hakone");
        Tempat.addTempat("Yokohama");
        Tempat.addTempat("Sendai");
        Tempat.displayTempat();

        Tiket.addTiket("A11", "Tokyo", "Kyoto", 200000, "Kereta A1");
        Tiket.addTiket("A12", "Tokyo", "Kyoto", 200000, "Kereta A1");
        Tiket.addTiket("A13", "Tokyo", "Kyoto", 200000, "Kereta A1");
        Tiket.addTiket("A14", "Tokyo", "Kyoto", 200000, "Kereta A1");
        Tiket.addTiket("A15", "Tokyo", "Kyoto", 200000, "Kereta A1");
        Tiket.addTiket("A21", "Osaka", "Kyoto", 100000, "Kereta A2");
        Tiket.addTiket("A22", "Osaka", "Kyoto", 100000, "Kereta A2");
        Tiket.addTiket("A23", "Osaka", "Kyoto", 100000, "Kereta A2");
        Tiket.addTiket("A24", "Osaka", "Kyoto", 100000, "Kereta A2");
        Tiket.addTiket("A25", "Osaka", "Kyoto", 100000, "Kereta A2");
        Tiket.displayTiket();
    }
}
