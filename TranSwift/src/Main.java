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

        Kendaraan.addKendaraan("Bus", true, 30, 200);
        Kendaraan.addKendaraan("Taksi", false, 4, 50);
        Kendaraan.displayKendaraan();

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
        Bus.displayEdges();

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
        Taksi.displayEdges();

        Bus.dijkstra("Nagoya", "Kobe", true);
        Bus.resetGraph();
        Bus.dijkstra("Tokyo", "Sapporo", true);
        Taksi.dijkstra("Tokyo", "Sapporo", false);

        TiketBus.addTiket("Bus", "Tokyo", "Sapporo", 100000, "Bus");

        Barang.push("Koper", 20);
        PenumpangBus.enqueue("Kevin", 200000, "Koper", "Bus");
    }
}
