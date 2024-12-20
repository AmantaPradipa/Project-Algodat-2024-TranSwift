public class Main {
    public static void main(String[] args) {
        ListKendaraan kendaraan = new ListKendaraan();
        ListTempat tempat = new ListTempat();
        ListTiket tiket = new ListTiket(kendaraan, tempat);
        Graph graph = new Graph(12);
        StackBarang barang = new StackBarang();
        QueuePenumpang penumpang = new QueuePenumpang(barang, tiket);

        kendaraan.addKendaraan("Kereta A1", true, 100, 200);
        // kendaraan.addKendaraan("Kereta A2", true, 100, 200);
        // kendaraan.addKendaraan("Bus B1", true, 30, 80);
        // kendaraan.addKendaraan("Bus B2", true, 30, 80);
        // kendaraan.addKendaraan("Bus B3", true, 30, 80);
        // kendaraan.addKendaraan("Taksi C1", false, 4, 30);
        // kendaraan.addKendaraan("Taksi C2", false, 4, 30);
        // kendaraan.addKendaraan("Taksi C3", false, 4, 30);
        // kendaraan.addKendaraan("Taksi C4", false, 4, 30);
        // kendaraan.addKendaraan("Taksi C5", false, 4, 30);
        // kendaraan.displaykendaraan();

        // tempat.addTempat("Tokyo");
        // tempat.addTempat("Kyoto");
        // tempat.addTempat("Osaka");
        // tempat.addTempat("Hiroshima");
        // tempat.addTempat("Nagoya");
        // tempat.addTempat("Sapporo");
        // tempat.addTempat("Fukuoka");
        // tempat.addTempat("Nara");
        // tempat.addTempat("Kobe");
        // tempat.addTempat("Hakone");
        // tempat.addTempat("Yokohama");
        // tempat.addTempat("Sendai");
        // tempat.displayTempat();

        // tiket.addTiket("A11", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A12", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A13", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A14", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A15", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A21", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A22", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A23", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A24", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A25", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.displayTiket();

        // barang.push("Tas", 1.5);
        // barang.push("Koper", 3.5);
        // penumpang.enqueue("Budi", 250000, "Tas");
        // penumpang.enqueue("Rudi", 300000, "Koper");
        // penumpang.displayPenumpang();

        // penumpang.pesanTiket("Budi", "A11");
        // penumpang.pesanTiket("Rudi", "A12");

        // penumpang.pesanTiket("Rano", "A11");

        graph.addVertex("Tokyo");
        graph.addVertex("Kyoto");
        graph.addVertex("Osaka");
        graph.addVertex("Hiroshima");
        graph.addVertex("Nagoya");
        graph.addVertex("Sapporo");
        graph.addVertex("Fukuoka");
        graph.addVertex("Nara");
        graph.addVertex("Kobe");
        graph.addVertex("Hakone");
        graph.addVertex("Yokohama");
        graph.addVertex("Sendai");

        // JALUR KERETA
        graph.addEdge("Tokyo", "Yokohama", 4, true);
        graph.addEdge("Yokohama", "Nagoya", 6, true);
        graph.addEdge("Nagoya", "Osaka", 8, true);
        graph.addEdge("Osaka", "Kyoto", 10, true);
        graph.addEdge("Kyoto", "Nara", 12, true);
        graph.addEdge("Nara", "Kobe", 14, true);
        graph.addEdge("Kobe", "Hiroshima", 16, true);
        graph.addEdge("Hiroshima", "Fukuoka", 18, true);
        graph.addEdge("Fukuoka", "Sapporo", 20, true);
        graph.addEdge("Sapporo", "Sendai", 22, true);
        graph.addEdge("Sendai", "Hakone", 24, true);
        graph.addEdge("Hakone", "Tokyo", 26, true);
        graph.addEdge("Tokyo", "Nagoya", 28, true);
        graph.addEdge("Nagoya", "Yokohama", 30, true);
        graph.addEdge("Osaka", "Yokohama", 32, true);
        graph.addEdge("Kyoto", "Sapporo", 34, true);
        graph.addEdge("Hiroshima", "Yokohama", 36, true);
        graph.addEdge("Fukuoka", "Nara", 38, true);
        graph.addEdge("Sapporo", "Osaka", 40, true);
        graph.addEdge("Hakone", "Nara", 42, true);
        graph.addEdge("Kobe", "Nagoya", 44, true);
        graph.addEdge("Fukuoka", "Sendai", 46, true);

        // JALUR BIS
        Graph newGraph = new Graph(graph); // Graph baru tidak menyalin edges
        newGraph.addEdge("Tokyo", "Yokohama", 4, true);
        newGraph.addEdge("Yokohama", "Nagoya", 6, true);
        newGraph.addEdge("Nagoya", "Osaka", 8, true);
        newGraph.addEdge("Osaka", "Kyoto", 10, true);
        newGraph.addEdge("Kyoto", "Nara", 12, true);
        newGraph.addEdge("Nara", "Kobe", 14, true);
        newGraph.addEdge("Kobe", "Hiroshima", 16, true);
        newGraph.addEdge("Hiroshima", "Fukuoka", 18, true);
        newGraph.addEdge("Fukuoka", "Sapporo", 20, true);
        newGraph.addEdge("Sapporo", "Sendai", 22, true);
        newGraph.addEdge("Sendai", "Hakone", 24, true);
        newGraph.addEdge("Hakone", "Tokyo", 26, true);
        newGraph.addEdge("Tokyo", "Nagoya", 28, true);
        newGraph.addEdge("Nagoya", "Yokohama", 30, true);
        newGraph.addEdge("Osaka", "Yokohama", 32, true);
        newGraph.addEdge("Kyoto", "Sapporo", 34, true);
        newGraph.addEdge("Hiroshima", "Yokohama", 36, true);
        newGraph.addEdge("Fukuoka", "Nara", 38, true);
        newGraph.addEdge("Sapporo", "Osaka", 40, true);
        newGraph.addEdge("Hakone", "Nara", 42, true);
        newGraph.addEdge("Kobe", "Nagoya", 44, true);
        newGraph.addEdge("Fukuoka", "Sendai", 46, true);
        newGraph.addEdge("Hiroshima", "Osaka", 48, true);
        newGraph.addEdge("Hiroshima", "Kyoto", 50, true);
        newGraph.addEdge("Sendai", "Fukuoka", 52, true);
        newGraph.addEdge("Hakone", "Sapporo", 54, true);
        newGraph.addEdge("Tokyo", "Osaka", 56, true);
        newGraph.addEdge("Nara", "Sapporo", 58, true);
        newGraph.addEdge("Sendai", "Kobe", 60, true);
        newGraph.addEdge("Kyoto", "Hakone", 62, true);

        Graph taksi = new Graph(graph);

        taksi.addEdge("Tokyo", "Yokohama", 4, false);
        taksi.addEdge("Tokyo", "Nagoya", 6, false);
        taksi.addEdge("Tokyo", "Hakone", 8, false);
        taksi.addEdge("Yokohama", "Nagoya", 10, false);
        taksi.addEdge("Yokohama", "Osaka", 12, false);
        taksi.addEdge("Yokohama", "Hakone", 14, false);
        taksi.addEdge("Nagoya", "Osaka", 16, false);
        taksi.addEdge("Nagoya", "Kyoto", 18, false);
        taksi.addEdge("Nagoya", "Kobe", 20, false);
        taksi.addEdge("Nagoya", "Nara", 22, false);
        taksi.addEdge("Osaka", "Kyoto", 24, false);
        taksi.addEdge("Osaka", "Kobe", 26, false);
        taksi.addEdge("Osaka", "Hiroshima", 28, false);
        taksi.addEdge("Kyoto", "Nara", 30, false);
        taksi.addEdge("Kyoto", "Kobe", 32, false);
        taksi.addEdge("Kyoto", "Osaka", 34, false);
        taksi.addEdge("Nara", "Kobe", 36, false);
        taksi.addEdge("Nara", "Hiroshima", 38, false);
        taksi.addEdge("Kobe", "Hiroshima", 40, false);
        taksi.addEdge("Kobe", "Fukuoka", 42, false);
        taksi.addEdge("Hiroshima", "Fukuoka", 44, false);
        taksi.addEdge("Hiroshima", "Sapporo", 46, false);
        taksi.addEdge("Fukuoka", "Sapporo", 48, false);
        taksi.addEdge("Fukuoka", "Sendai", 50, false);
        taksi.addEdge("Fukuoka", "Nagoya", 52, false);
        taksi.addEdge("Sapporo", "Sendai", 54, false);
        taksi.addEdge("Sapporo", "Hakone", 56, false);
        taksi.addEdge("Sapporo", "Tokyo", 58, false);
        taksi.addEdge("Sendai", "Tokyo", 60, false);
        taksi.addEdge("Sendai", "Yokohama", 62, false);
        taksi.addEdge("Sendai", "Hakone", 64, false);
        taksi.addEdge("Hakone", "Nagoya", 66, false);
        taksi.addEdge("Hakone", "Kyoto", 68, false);
        taksi.addEdge("Hakone", "Tokyo", 70, false);
        taksi.addEdge("Nagoya", "Hiroshima", 72, false);
        taksi.addEdge("Nagoya", "Fukuoka", 74, false);
        taksi.addEdge("Kyoto", "Sapporo", 76, false);
        taksi.addEdge("Osaka", "Sendai", 78, false);
        taksi.addEdge("Kobe", "Sapporo", 80, false);
        taksi.addEdge("Kobe", "Sendai", 82, false);
        // Jalankan Dijkstra dari vertex sumber ke tujuan
        graph.dijkstra("Osaka", "Yokohama");
        newGraph.dijkstra("Osaka", "Yokohama");
        taksi.dijkstra("Osaka","Yokohama");

    }
}
