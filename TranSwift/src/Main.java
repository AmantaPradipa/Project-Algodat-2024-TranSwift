import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListKendaraan Kendaraan = new ListKendaraan();
        // ListTempat Tempat = new ListTempat();
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

        // GraphTaksi.addVertex("Tokyo");
        // GraphTaksi.addVertex("Kyoto");
        // GraphTaksi.addVertex("Osaka");
        // GraphTaksi.addVertex("Hiroshima");
        // GraphTaksi.addVertex("Nagoya");
        // GraphTaksi.addVertex("Sapporo");
        // GraphTaksi.addVertex("Fukuoka");
        // GraphTaksi.addVertex("Nara");
        // GraphTaksi.addVertex("Kobe");
        // GraphTaksi.addVertex("Hakone");
        // GraphTaksi.addVertex("Yokohama");
        // GraphTaksi.addVertex("Sendai");

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

        // GraphTaksi.addEdge("Tokyo", "Yokohama", 50, false);
        // GraphTaksi.addEdge("Tokyo", "Nagoya", 300, false);
        // GraphTaksi.addEdge("Tokyo", "Hakone", 200, false);
        // GraphTaksi.addEdge("Yokohama", "Nagoya", 350, false);
        // GraphTaksi.addEdge("Yokohama", "Osaka", 400, false);
        // GraphTaksi.addEdge("Yokohama", "Hakone", 250, false);
        // GraphTaksi.addEdge("Nagoya", "Osaka", 150, false);
        // GraphTaksi.addEdge("Nagoya", "Kyoto", 50, false);
        // GraphTaksi.addEdge("Nagoya", "Kobe", 200, false);
        // GraphTaksi.addEdge("Nagoya", "Nara", 320, false);
        // GraphTaksi.addEdge("Osaka", "Kyoto", 50, false);
        // GraphTaksi.addEdge("Osaka", "Kobe", 300, false);
        // GraphTaksi.addEdge("Osaka", "Hiroshima", 400, false);
        // GraphTaksi.addEdge("Kyoto", "Nara", 60, false);
        // GraphTaksi.addEdge("Kyoto", "Kobe", 150, false);
        // GraphTaksi.addEdge("Kyoto", "Osaka", 50, false);
        // GraphTaksi.addEdge("Nara", "Kobe", 80, false);
        // GraphTaksi.addEdge("Nara", "Hiroshima", 320, false);
        // GraphTaksi.addEdge("Kobe", "Hiroshima", 300, false);
        // GraphTaksi.addEdge("Kobe", "Fukuoka", 500, false);
        // GraphTaksi.addEdge("Hiroshima", "Fukuoka", 400, false);
        // GraphTaksi.addEdge("Hiroshima", "Sapporo", 450, false);
        // GraphTaksi.addEdge("Fukuoka", "Sapporo", 500, false);
        // GraphTaksi.addEdge("Fukuoka", "Sendai", 420, false);
        // GraphTaksi.addEdge("Fukuoka", "Nagoya", 350, false);
        // GraphTaksi.addEdge("Sapporo", "Sendai", 450, false);
        // GraphTaksi.addEdge("Sapporo", "Hakone", 480, false);
        // GraphTaksi.addEdge("Sapporo", "Tokyo", 500, false);
        // GraphTaksi.addEdge("Sendai", "Tokyo", 250, false);
        // GraphTaksi.addEdge("Sendai", "Yokohama", 380, false);
        // GraphTaksi.addEdge("Sendai", "Hakone", 300, false);
        // GraphTaksi.addEdge("Hakone", "Nagoya", 250, false);
        // GraphTaksi.addEdge("Hakone", "Kyoto", 300, false);
        // GraphTaksi.addEdge("Hakone", "Tokyo", 200, false);
        // GraphTaksi.addEdge("Nagoya", "Hiroshima", 280, false);
        // GraphTaksi.addEdge("Nagoya", "Fukuoka", 420, false);
        // GraphTaksi.addEdge("Kyoto", "Sapporo", 450, false);
        // GraphTaksi.addEdge("Osaka", "Sendai", 400, false);
        // GraphTaksi.addEdge("Kobe", "Sapporo", 500, false);
        // GraphTaksi.addEdge("Kobe", "Sendai", 380, false);

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

        // TiketTaksi.addTiket("Taksi", "Tokyo", "Yokohama", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Tokyo", "Nagoya", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Tokyo", "Hakone", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Yokohama", "Nagoya", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Yokohama", "Osaka", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Yokohama", "Hakone", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nagoya", "Osaka", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nagoya", "Kyoto", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nagoya", "Kobe", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nagoya", "Nara", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Osaka", "Kyoto", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Osaka", "Kobe", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Osaka", "Hiroshima", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kyoto", "Nara", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kyoto", "Kobe", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kyoto", "Osaka", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nara", "Kobe", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nara", "Hiroshima", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kobe", "Hiroshima", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kobe", "Fukuoka", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Hiroshima", "Fukuoka", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Hiroshima", "Sapporo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Fukuoka", "Sapporo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Fukuoka", "Sendai", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Fukuoka", "Nagoya", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Sapporo", "Sendai", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Sapporo", "Hakone", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Sapporo", "Tokyo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Sendai", "Tokyo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Sendai", "Yokohama", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Sendai", "Hakone", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Hakone", "Nagoya", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Hakone", "Kyoto", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Hakone", "Tokyo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nagoya", "Hiroshima", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Nagoya", "Fukuoka", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kyoto", "Sapporo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Osaka", "Sendai", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kobe", "Sapporo", 30000, "Taksi");
        // TiketTaksi.addTiket("Taksi", "Kobe", "Sendai", 30000, "Taksi");

        // GraphBus.dijkstra("Tokyo", "Tokyo", true);
        GraphBus.dijkstra("Tokyo", "Kyoto", true);
        GraphBus.dijkstra("Tokyo", "Osaka", true);
        GraphBus.dijkstra("Tokyo", "Hiroshima", true);
        GraphBus.dijkstra("Tokyo", "Nagoya", true);
        GraphBus.dijkstra("Tokyo", "Sapporo", true);
        GraphBus.dijkstra("Tokyo", "Fukuoka", true);
        GraphBus.dijkstra("Tokyo", "Nara", true);
        GraphBus.dijkstra("Tokyo", "Kobe", true);
        GraphBus.dijkstra("Tokyo", "Hakone", true);
        GraphBus.dijkstra("Tokyo", "Yokohama", true);
        GraphBus.dijkstra("Tokyo", "Sendai", true);
        GraphBus.sortJarak("Tokyo");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Kyoto", "Tokyo", true);
        // GraphBus.dijkstra("Kyoto", "Kyoto", true);
        // GraphBus.dijkstra("Kyoto", "Osaka", true);
        // GraphBus.dijkstra("Kyoto", "Hiroshima", true);
        // GraphBus.dijkstra("Kyoto", "Nagoya", true);
        // GraphBus.dijkstra("Kyoto", "Sapporo", true);
        // GraphBus.dijkstra("Kyoto", "Fukuoka", true);
        // GraphBus.dijkstra("Kyoto", "Nara", true);
        // GraphBus.dijkstra("Kyoto", "Kobe", true);
        // GraphBus.dijkstra("Kyoto", "Hakone", true);
        // GraphBus.dijkstra("Kyoto", "Yokohama", true);
        // GraphBus.dijkstra("Kyoto", "Sendai", true);
        // GraphBus.sortJarak("Kyoto");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Osaka", "Tokyo", true);
        // GraphBus.dijkstra("Osaka", "Kyoto", true);
        // GraphBus.dijkstra("Osaka", "Osaka", true);
        // GraphBus.dijkstra("Osaka", "Hiroshima", true);
        // GraphBus.dijkstra("Osaka", "Nagoya", true);
        // GraphBus.dijkstra("Osaka", "Sapporo", true);
        // GraphBus.dijkstra("Osaka", "Fukuoka", true);
        // GraphBus.dijkstra("Osaka", "Nara", true);
        // GraphBus.dijkstra("Osaka", "Kobe", true);
        // GraphBus.dijkstra("Osaka", "Hakone", true);
        // GraphBus.dijkstra("Osaka", "Yokohama", true);
        // GraphBus.dijkstra("Osaka", "Sendai", true);
        // GraphBus.sortJarak("Osaka");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Hiroshima", "Tokyo", true);
        // GraphBus.dijkstra("Hiroshima", "Kyoto", true);
        // GraphBus.dijkstra("Hiroshima", "Osaka", true);
        // GraphBus.dijkstra("Hiroshima", "Hiroshima", true);
        // GraphBus.dijkstra("Hiroshima", "Nagoya", true);
        // GraphBus.dijkstra("Hiroshima", "Sapporo", true);
        // GraphBus.dijkstra("Hiroshima", "Fukuoka", true);
        // GraphBus.dijkstra("Hiroshima", "Nara", true);
        // GraphBus.dijkstra("Hiroshima", "Kobe", true);
        // GraphBus.dijkstra("Hiroshima", "Hakone", true);
        // GraphBus.dijkstra("Hiroshima", "Yokohama", true);
        // GraphBus.dijkstra("Hiroshima", "Sendai", true);
        // GraphBus.sortJarak("Hiroshima");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Nagoya", "Tokyo", true);
        // GraphBus.dijkstra("Nagoya", "Kyoto", true);
        // GraphBus.dijkstra("Nagoya", "Osaka", true);
        // GraphBus.dijkstra("Nagoya", "Hiroshima", true);
        // GraphBus.dijkstra("Nagoya", "Nagoya", true);
        // GraphBus.dijkstra("Nagoya", "Sapporo", true);
        // GraphBus.dijkstra("Nagoya", "Fukuoka", true);
        // GraphBus.dijkstra("Nagoya", "Nara", true);
        // GraphBus.dijkstra("Nagoya", "Kobe", true);
        // GraphBus.dijkstra("Nagoya", "Hakone", true);
        // GraphBus.dijkstra("Nagoya", "Yokohama", true);
        // GraphBus.dijkstra("Nagoya", "Sendai", true);
        // GraphBus.sortJarak("Nagoya");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Sapporo", "Tokyo", true);
        // GraphBus.dijkstra("Sapporo", "Kyoto", true);
        // GraphBus.dijkstra("Sapporo", "Osaka", true);
        // GraphBus.dijkstra("Sapporo", "Hiroshima", true);
        // GraphBus.dijkstra("Sapporo", "Nagoya", true);
        // GraphBus.dijkstra("Sapporo", "Sapporo", true);
        // GraphBus.dijkstra("Sapporo", "Fukuoka", true);
        // GraphBus.dijkstra("Sapporo", "Nara", true);
        // GraphBus.dijkstra("Sapporo", "Kobe", true);
        // GraphBus.dijkstra("Sapporo", "Hakone", true);
        // GraphBus.dijkstra("Sapporo", "Yokohama", true);
        // GraphBus.dijkstra("Sapporo", "Sendai", true);
        // GraphBus.sortJarak("Sapporo");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Fukuoka", "Tokyo", true);
        // GraphBus.dijkstra("Fukuoka", "Kyoto", true);
        // GraphBus.dijkstra("Fukuoka", "Osaka", true);
        // GraphBus.dijkstra("Fukuoka", "Hiroshima", true);
        // GraphBus.dijkstra("Fukuoka", "Nagoya", true);
        // GraphBus.dijkstra("Fukuoka", "Sapporo", true);
        // GraphBus.dijkstra("Fukuoka", "Fukuoka", true);
        // GraphBus.dijkstra("Fukuoka", "Nara", true);
        // GraphBus.dijkstra("Fukuoka", "Kobe", true);
        // GraphBus.dijkstra("Fukuoka", "Hakone", true);
        // GraphBus.dijkstra("Fukuoka", "Yokohama", true);
        // GraphBus.dijkstra("Fukuoka", "Sendai", true);
        // GraphBus.sortJarak("Fukuoka");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Nara", "Tokyo", true);
        // GraphBus.dijkstra("Nara", "Kyoto", true);
        // GraphBus.dijkstra("Nara", "Osaka", true);
        // GraphBus.dijkstra("Nara", "Hiroshima", true);
        // GraphBus.dijkstra("Nara", "Nagoya", true);
        // GraphBus.dijkstra("Nara", "Sapporo", true);
        // GraphBus.dijkstra("Nara", "Fukuoka", true);
        // GraphBus.dijkstra("Nara", "Nara", true);
        // GraphBus.dijkstra("Nara", "Kobe", true);
        // GraphBus.dijkstra("Nara", "Hakone", true);
        // GraphBus.dijkstra("Nara", "Yokohama", true);
        // GraphBus.dijkstra("Nara", "Sendai", true);
        // GraphBus.sortJarak("Nara");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Kobe", "Tokyo", true);
        // GraphBus.dijkstra("Kobe", "Kyoto", true);
        // GraphBus.dijkstra("Kobe", "Osaka", true);
        // GraphBus.dijkstra("Kobe", "Hiroshima", true);
        // GraphBus.dijkstra("Kobe", "Nagoya", true);
        // GraphBus.dijkstra("Kobe", "Sapporo", true);
        // GraphBus.dijkstra("Kobe", "Fukuoka", true);
        // GraphBus.dijkstra("Kobe", "Nara", true);
        // GraphBus.dijkstra("Kobe", "Kobe", true);
        // GraphBus.dijkstra("Kobe", "Hakone", true);
        // GraphBus.dijkstra("Kobe", "Yokohama", true);
        // GraphBus.dijkstra("Kobe", "Sendai", true);
        // GraphBus.sortJarak("Kobe");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Hakone", "Tokyo", true);
        // GraphBus.dijkstra("Hakone", "Kyoto", true);
        // GraphBus.dijkstra("Hakone", "Osaka", true);
        // GraphBus.dijkstra("Hakone", "Hiroshima", true);
        // GraphBus.dijkstra("Hakone", "Nagoya", true);
        // GraphBus.dijkstra("Hakone", "Sapporo", true);
        // GraphBus.dijkstra("Hakone", "Fukuoka", true);
        // GraphBus.dijkstra("Hakone", "Nara", true);
        // GraphBus.dijkstra("Hakone", "Kobe", true);
        // GraphBus.dijkstra("Hakone", "Hakone", true);
        // GraphBus.dijkstra("Hakone", "Yokohama", true);
        // GraphBus.dijkstra("Hakone", "Sendai", true);
        // GraphBus.sortJarak("Hakone");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Yokohama", "Tokyo", true);
        // GraphBus.dijkstra("Yokohama", "Kyoto", true);
        // GraphBus.dijkstra("Yokohama", "Osaka", true);
        // GraphBus.dijkstra("Yokohama", "Hiroshima", true);
        // GraphBus.dijkstra("Yokohama", "Nagoya", true);
        // GraphBus.dijkstra("Yokohama", "Sapporo", true);
        // GraphBus.dijkstra("Yokohama", "Fukuoka", true);
        // GraphBus.dijkstra("Yokohama", "Nara", true);
        // GraphBus.dijkstra("Yokohama", "Kobe", true);
        // GraphBus.dijkstra("Yokohama", "Hakone", true);
        // GraphBus.dijkstra("Yokohama", "Yokohama", true);
        // GraphBus.dijkstra("Yokohama", "Sendai", true);
        // GraphBus.sortJarak("Yokohama");

        // GraphBus.resetGraph();
        // GraphBus.dijkstra("Sendai", "Tokyo", true);
        // GraphBus.dijkstra("Sendai", "Kyoto", true);
        // GraphBus.dijkstra("Sendai", "Osaka", true);
        // GraphBus.dijkstra("Sendai", "Hiroshima", true);
        // GraphBus.dijkstra("Sendai", "Nagoya", true);
        // GraphBus.dijkstra("Sendai", "Sapporo", true);
        // GraphBus.dijkstra("Sendai", "Fukuoka", true);
        // GraphBus.dijkstra("Sendai", "Nara", true);
        // GraphBus.dijkstra("Sendai", "Kobe", true);
        // GraphBus.dijkstra("Sendai", "Hakone", true);
        // GraphBus.dijkstra("Sendai", "Yokohama", true);
        // GraphBus.dijkstra("Sendai", "Sendai", true);
        // GraphBus.sortJarak("Sendai");

        // GraphTaksi.dijkstra("Tokyo", "Tokyo", false);
        // GraphTaksi.dijkstra("Tokyo", "Kyoto", false);
        // GraphTaksi.dijkstra("Tokyo", "Osaka", false);
        // GraphTaksi.dijkstra("Tokyo", "Hiroshima", false);
        // GraphTaksi.dijkstra("Tokyo", "Nagoya", false);
        // GraphTaksi.dijkstra("Tokyo", "Sapporo", false);
        // GraphTaksi.dijkstra("Tokyo", "Fukuoka", false);
        // GraphTaksi.dijkstra("Tokyo", "Nara", false);
        // GraphTaksi.dijkstra("Tokyo", "Kobe", false);
        // GraphTaksi.dijkstra("Tokyo", "Hakone", false);
        // GraphTaksi.dijkstra("Tokyo", "Yokohama", false);
        // GraphTaksi.dijkstra("Tokyo", "Sendai", false);
        // GraphTaksi.sortJarak("Tokyo");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Kyoto", "Tokyo", false);
        // GraphTaksi.dijkstra("Kyoto", "Kyoto", false);
        // GraphTaksi.dijkstra("Kyoto", "Osaka", false);
        // GraphTaksi.dijkstra("Kyoto", "Hiroshima", false);
        // GraphTaksi.dijkstra("Kyoto", "Nagoya", false);
        // GraphTaksi.dijkstra("Kyoto", "Sapporo", false);
        // GraphTaksi.dijkstra("Kyoto", "Fukuoka", false);
        // GraphTaksi.dijkstra("Kyoto", "Nara", false);
        // GraphTaksi.dijkstra("Kyoto", "Kobe", false);
        // GraphTaksi.dijkstra("Kyoto", "Hakone", false);
        // GraphTaksi.dijkstra("Kyoto", "Yokohama", false);
        // GraphTaksi.dijkstra("Kyoto", "Sendai", false);
        // GraphTaksi.sortJarak("Kyoto");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Osaka", "Tokyo", false);
        // GraphTaksi.dijkstra("Osaka", "Kyoto", false);
        // GraphTaksi.dijkstra("Osaka", "Osaka", false);
        // GraphTaksi.dijkstra("Osaka", "Hiroshima", false);
        // GraphTaksi.dijkstra("Osaka", "Nagoya", false);
        // GraphTaksi.dijkstra("Osaka", "Sapporo", false);
        // GraphTaksi.dijkstra("Osaka", "Fukuoka", false);
        // GraphTaksi.dijkstra("Osaka", "Nara", false);
        // GraphTaksi.dijkstra("Osaka", "Kobe", false);
        // GraphTaksi.dijkstra("Osaka", "Hakone", false);
        // GraphTaksi.dijkstra("Osaka", "Yokohama", false);
        // GraphTaksi.dijkstra("Osaka", "Sendai", false);
        // GraphTaksi.sortJarak("Osaka");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Hiroshima", "Tokyo", false);
        // GraphTaksi.dijkstra("Hiroshima", "Kyoto", false);
        // GraphTaksi.dijkstra("Hiroshima", "Osaka", false);
        // GraphTaksi.dijkstra("Hiroshima", "Hiroshima", false);
        // GraphTaksi.dijkstra("Hiroshima", "Nagoya", false);
        // GraphTaksi.dijkstra("Hiroshima", "Sapporo", false);
        // GraphTaksi.dijkstra("Hiroshima", "Fukuoka", false);
        // GraphTaksi.dijkstra("Hiroshima", "Nara", false);
        // GraphTaksi.dijkstra("Hiroshima", "Kobe", false);
        // GraphTaksi.dijkstra("Hiroshima", "Hakone", false);
        // GraphTaksi.dijkstra("Hiroshima", "Yokohama", false);
        // GraphTaksi.dijkstra("Hiroshima", "Sendai", false);
        // GraphTaksi.sortJarak("Hiroshima");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Nagoya", "Tokyo", false);
        // GraphTaksi.dijkstra("Nagoya", "Kyoto", false);
        // GraphTaksi.dijkstra("Nagoya", "Osaka", false);
        // GraphTaksi.dijkstra("Nagoya", "Hiroshima", false);
        // GraphTaksi.dijkstra("Nagoya", "Nagoya", false);
        // GraphTaksi.dijkstra("Nagoya", "Sapporo", false);
        // GraphTaksi.dijkstra("Nagoya", "Fukuoka", false);
        // GraphTaksi.dijkstra("Nagoya", "Nara", false);
        // GraphTaksi.dijkstra("Nagoya", "Kobe", false);
        // GraphTaksi.dijkstra("Nagoya", "Hakone", false);
        // GraphTaksi.dijkstra("Nagoya", "Yokohama", false);
        // GraphTaksi.dijkstra("Nagoya", "Sendai", false);
        // GraphTaksi.sortJarak("Nagoya");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Sapporo", "Tokyo", false);
        // GraphTaksi.dijkstra("Sapporo", "Kyoto", false);
        // GraphTaksi.dijkstra("Sapporo", "Osaka", false);
        // GraphTaksi.dijkstra("Sapporo", "Hiroshima", false);
        // GraphTaksi.dijkstra("Sapporo", "Nagoya", false);
        // GraphTaksi.dijkstra("Sapporo", "Sapporo", false);
        // GraphTaksi.dijkstra("Sapporo", "Fukuoka", false);
        // GraphTaksi.dijkstra("Sapporo", "Nara", false);
        // GraphTaksi.dijkstra("Sapporo", "Kobe", false);
        // GraphTaksi.dijkstra("Sapporo", "Hakone", false);
        // GraphTaksi.dijkstra("Sapporo", "Yokohama", false);
        // GraphTaksi.dijkstra("Sapporo", "Sendai", false);
        // GraphTaksi.sortJarak("Sapporo");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Fukuoka", "Tokyo", false);
        // GraphTaksi.dijkstra("Fukuoka", "Kyoto", false);
        // GraphTaksi.dijkstra("Fukuoka", "Osaka", false);
        // GraphTaksi.dijkstra("Fukuoka", "Hiroshima", false);
        // GraphTaksi.dijkstra("Fukuoka", "Nagoya", false);
        // GraphTaksi.dijkstra("Fukuoka", "Sapporo", false);
        // GraphTaksi.dijkstra("Fukuoka", "Fukuoka", false);
        // GraphTaksi.dijkstra("Fukuoka", "Nara", false);
        // GraphTaksi.dijkstra("Fukuoka", "Kobe", false);
        // GraphTaksi.dijkstra("Fukuoka", "Hakone", false);
        // GraphTaksi.dijkstra("Fukuoka", "Yokohama", false);
        // GraphTaksi.dijkstra("Fukuoka", "Sendai", false);
        // GraphTaksi.sortJarak("Fukuoka");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Nara", "Tokyo", false);
        // GraphTaksi.dijkstra("Nara", "Kyoto", false);
        // GraphTaksi.dijkstra("Nara", "Osaka", false);
        // GraphTaksi.dijkstra("Nara", "Hiroshima", false);
        // GraphTaksi.dijkstra("Nara", "Nagoya", false);
        // GraphTaksi.dijkstra("Nara", "Sapporo", false);
        // GraphTaksi.dijkstra("Nara", "Fukuoka", false);
        // GraphTaksi.dijkstra("Nara", "Nara", false);
        // GraphTaksi.dijkstra("Nara", "Kobe", false);
        // GraphTaksi.dijkstra("Nara", "Hakone", false);
        // GraphTaksi.dijkstra("Nara", "Yokohama", false);
        // GraphTaksi.dijkstra("Nara", "Sendai", false);
        // GraphTaksi.sortJarak("Nara");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Kobe", "Tokyo", false);
        // GraphTaksi.dijkstra("Kobe", "Kyoto", false);
        // GraphTaksi.dijkstra("Kobe", "Osaka", false);
        // GraphTaksi.dijkstra("Kobe", "Hiroshima", false);
        // GraphTaksi.dijkstra("Kobe", "Nagoya", false);
        // GraphTaksi.dijkstra("Kobe", "Sapporo", false);
        // GraphTaksi.dijkstra("Kobe", "Fukuoka", false);
        // GraphTaksi.dijkstra("Kobe", "Nara", false);
        // GraphTaksi.dijkstra("Kobe", "Kobe", false);
        // GraphTaksi.dijkstra("Kobe", "Hakone", false);
        // GraphTaksi.dijkstra("Kobe", "Yokohama", false);
        // GraphTaksi.dijkstra("Kobe", "Sendai", false);
        // GraphTaksi.sortJarak("Kobe");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Hakone", "Tokyo", false);
        // GraphTaksi.dijkstra("Hakone", "Kyoto", false);
        // GraphTaksi.dijkstra("Hakone", "Osaka", false);
        // GraphTaksi.dijkstra("Hakone", "Hiroshima", false);
        // GraphTaksi.dijkstra("Hakone", "Nagoya", false);
        // GraphTaksi.dijkstra("Hakone", "Sapporo", false);
        // GraphTaksi.dijkstra("Hakone", "Fukuoka", false);
        // GraphTaksi.dijkstra("Hakone", "Nara", false);
        // GraphTaksi.dijkstra("Hakone", "Kobe", false);
        // GraphTaksi.dijkstra("Hakone", "Hakone", false);
        // GraphTaksi.dijkstra("Hakone", "Yokohama", false);
        // GraphTaksi.dijkstra("Hakone", "Sendai", false);
        // GraphTaksi.sortJarak("Hakone");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Yokohama", "Tokyo", false);
        // GraphTaksi.dijkstra("Yokohama", "Kyoto", false);
        // GraphTaksi.dijkstra("Yokohama", "Osaka", false);
        // GraphTaksi.dijkstra("Yokohama", "Hiroshima", false);
        // GraphTaksi.dijkstra("Yokohama", "Nagoya", false);
        // GraphTaksi.dijkstra("Yokohama", "Sapporo", false);
        // GraphTaksi.dijkstra("Yokohama", "Fukuoka", false);
        // GraphTaksi.dijkstra("Yokohama", "Nara", false);
        // GraphTaksi.dijkstra("Yokohama", "Kobe", false);
        // GraphTaksi.dijkstra("Yokohama", "Hakone", false);
        // GraphTaksi.dijkstra("Yokohama", "Yokohama", false);
        // GraphTaksi.dijkstra("Yokohama", "Sendai", false);
        // GraphTaksi.sortJarak("Yokohama");

        // GraphTaksi.resetGraph();
        // GraphTaksi.dijkstra("Sendai", "Tokyo", false);
        // GraphTaksi.dijkstra("Sendai", "Kyoto", false);
        // GraphTaksi.dijkstra("Sendai", "Osaka", false);
        // GraphTaksi.dijkstra("Sendai", "Hiroshima", false);
        // GraphTaksi.dijkstra("Sendai", "Nagoya", false);
        // GraphTaksi.dijkstra("Sendai", "Sapporo", false);
        // GraphTaksi.dijkstra("Sendai", "Fukuoka", false);
        // GraphTaksi.dijkstra("Sendai", "Nara", false);
        // GraphTaksi.dijkstra("Sendai", "Kobe", false);
        // GraphTaksi.dijkstra("Sendai", "Hakone", false);
        // GraphTaksi.dijkstra("Sendai", "Yokohama", false);
        // GraphTaksi.dijkstra("Sendai", "Sendai", false);
        // GraphTaksi.sortJarak("Sendai");

        GraphBus.resetGraph();
        TiketBus.displayAllTicket("Bus");

        GraphTaksi.resetGraph();
        TiketTaksi.displayAllTicket("Taksi");

        PenumpangBus.enqueue("Amanta", 200000, "Koper Pakaian", 2, "Bus", "Bus");
        PenumpangBus.pesanTiket("Amanta", "Bus", "Tokyo", "Nagoya");
        PenumpangBus.displayPenumpang();

        // PenumpangTaksi.enqueue("Kevin", 200000, null, "Taksi", "Taksi");
        // PenumpangTaksi.pesanTiket("Kevin", "Taksi", "Tokyo", "Nagoya");

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

                    if (pelangganOption == 1) {
                        // Beli tiket
                        System.out.println("Fitur beli tiket...");
                        System.out.println("Masukkan Nama Anda");
                        String namapenumpng = scanner.nextLine();
                        System.out.println("Masukkan Jumlah Uang Anda");
                        int uang = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Masukkan Nama Barang Anda ");
                        String namaBarang = scanner.nextLine();
                        System.out.println("Masukkan Berat Barang");
                        int beratBarang = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Kendaraan yang ingin digunkan");
                        String label = scanner.nextLine();
                        Barang b = new Barang(namaBarang, beratBarang);
                        Penumpang p = new Penumpang(namapenumpng, uang, b);
                        if (label == "Bus") {
                            PenumpangBus.enqueue(namapenumpng, uang, namaBarang, beratBarang, label, label)
                        }

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
            scanner.close();
        }

    }
}
