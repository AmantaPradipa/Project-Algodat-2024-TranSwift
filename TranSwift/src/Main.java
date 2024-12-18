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

        tempat.addTempat("Tokyo");
        tempat.addTempat("Kyoto");
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

        tiket.addTiket("A11", "Tokyo", "Kyoto", 200000, "Kereta A1");
        tiket.addTiket("A12", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A13", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A14", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A15", "Tokyo", "Kyoto", 200000, "Kereta A1");
        // tiket.addTiket("A21", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A22", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A23", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A24", "Osaka", "Kyoto", 100000, "Kereta A2");
        // tiket.addTiket("A25", "Osaka", "Kyoto", 100000, "Kereta A2");
        tiket.displayTiket();

        barang.push("Tas", 1.5);
        barang.push("Koper", 3.5);
        penumpang.enqueue("Budi", 250000, "Tas");
        penumpang.enqueue("Rudi", 300000, "Koper");
        penumpang.displayPenumpang();

        penumpang.pesanTiket("Budi", "A11");
        penumpang.pesanTiket("Rudi", "A12");

        penumpang.pesanTiket("Rano", "A11");

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

        // Tambahkan edges (source, destination, weight, isDirected)
        graph.addEdge("Tokyo", "Osaka", 513, true);
        graph.addEdge("Tokyo", "Kyoto", 457, true);
        graph.addEdge("Osaka", "Hiroshima", 330, true);
        graph.addEdge("Osaka", "Kobe", 30, true);
        graph.addEdge("Hiroshima", "Sapporo", 1100, true);
        graph.addEdge("Kobe", "Tokyo", 511, true);
        graph.addEdge("Osaka", "Nara", 42, true);
        graph.addEdge("Kyoto", "Nagoya", 136, true);
        graph.addEdge("Kyoto", "Sapporo", 1000, true);
        graph.addEdge("Nagoya", "Yokohama", 290, true);
        graph.addEdge("Nagoya", "Sapporo", 1010, true);
        graph.addEdge("Yokohama", "Tokyo", 29, true);
        graph.addEdge("Sapporo", "Nara", 1160, true);
        graph.addEdge("Sapporo", "Kobe", 1100, true);
        graph.addEdge("Nara", "Hakone", 500, true);
        graph.addEdge("Hakone", "Sendai", 350, true);
        graph.addEdge("Sendai", "Kyoto", 550, true);

        // Buat graph baru berdasarkan vertex yang sama tetapi tanpa edges
        Graph newGraph = new Graph(graph); // Graph baru tidak menyalin edges
        newGraph.addEdge("Tokyo", "Osaka", 513, false); // Undirected (false)
        newGraph.addEdge("Tokyo", "Kyoto", 457, false); // Undirected (false)
        newGraph.addEdge("Osaka", "Hiroshima", 330, false); // Undirected (false)
        newGraph.addEdge("Osaka", "Kobe", 30, false); // Undirected (false)
        newGraph.addEdge("Hiroshima", "Sapporo", 1100, false); // Undirected (false)
        newGraph.addEdge("Kobe", "Tokyo", 511, false); // Undirected (false)
        newGraph.addEdge("Osaka", "Nara", 42, false); // Undirected (false)
        newGraph.addEdge("Kyoto", "Nagoya", 136, false); // Undirected (false)
        newGraph.addEdge("Kyoto", "Sapporo", 1000, false); // Undirected (false)
        newGraph.addEdge("Nagoya", "Yokohama", 290, false); // Undirected (false)
        newGraph.addEdge("Nagoya", "Sapporo", 1010, false); // Undirected (false)
        newGraph.addEdge("Yokohama", "Tokyo", 29, false); // Undirected (false)
        newGraph.addEdge("Sapporo", "Nara", 1160, false); // Undirected (false)
        newGraph.addEdge("Sapporo", "Kobe", 1100, false); // Undirected (false)
        newGraph.addEdge("Nara", "Hakone", 500, false); // Undirected (false)
        newGraph.addEdge("Hakone", "Sendai", 350, false); // Undirected (false)
        newGraph.addEdge("Sendai", "Kyoto", 550, false); // Undirected (false)

        // Jalankan Dijkstra dari vertex sumber ke tujuan
        // graph.dijkstra("Osaka", "Yokohama");
        // graph.dijkstra("Yokohama", "Osaka");
        // newGraph.dijkstra("Osaka", "Yokohama");
        // newGraph.dijkstra("Yokohama", "Osaka");

    }
}
