class Graph {
    int vertices = 12;  // Jumlah vertex tetap
    LinkedList[] adjacencyList;
    String[] vertexNames;
    int vertexCount;

    public Graph(int initialVertexCount) {
        adjacencyList = new LinkedList[initialVertexCount];
        vertexNames = new String[initialVertexCount];
        vertexCount = 0;
        for (int i = 0; i < initialVertexCount; i++) {
            adjacencyList[i] = new LinkedList();  // Setiap linked list kosong untuk edges
        }
    }

    // Konstruktor untuk membuat Graph baru berdasarkan vertex yang sudah ada (tanpa edges)
    public Graph(Graph existingGraph) {
        this(existingGraph.vertices);  // Inisialisasi adjacencyList dengan jumlah vertex yang ada pada graph yang sudah ada
        this.vertexCount = existingGraph.vertexCount;

        // Menyalin vertex
        for (int i = 0; i < vertexCount; i++) {
            this.vertexNames[i] = existingGraph.vertexNames[i];  // Salin nama vertex tanpa menyalin edges
        }
    }

    public void addVertex(String name) {
        if (vertexCount >= vertices) {
            System.out.println("Error: Tidak dapat menambah vertex, batas maksimum tercapai.");
            return;
        }
        vertexNames[vertexCount++] = name;
    }

    private int getVertexIndex(String name) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertexNames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addEdge(String source, String destination, int weight, boolean isDirected) {
        int srcIndex = getVertexIndex(source);
        int destIndex = getVertexIndex(destination);
        if (srcIndex == -1 || destIndex == -1) {
            System.out.println("Error: Nama vertex tidak ditemukan.");
            return;
        }
        adjacencyList[srcIndex].add(destination, weight);
        if (!isDirected) {
            adjacencyList[destIndex].add(source, weight);
        }
    }

    public void dijkstra(String startVertex, String endVertex) {
        int startIndex = getVertexIndex(startVertex);
        int endIndex = getVertexIndex(endVertex);
        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Error: Vertex tidak ditemukan.");
            return;
        }

        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];
        int[] previous = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            distances[i] = Integer.MAX_VALUE;
            visited[i] = false;
            previous[i] = -1;
        }
        distances[startIndex] = 0;

        for (int i = 0; i < vertexCount - 1; i++) {
            int u = getMinimumVertex(distances, visited);
            visited[u] = true;

            Tempat temp = adjacencyList[u].getHead();
            while (temp != null) {
                int v = getVertexIndex(temp.namaTempat);
                int weight = temp.weight;

                if (!visited[v] && distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    previous[v] = u;
                }
                temp = temp.next;
            }
        }

        printShortestPath(distances, previous, startIndex, endIndex);
    }

    private int getMinimumVertex(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;

        for (int i = 0; i < vertexCount; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    private void printShortestPath(int[] distances, int[] previous, int startIndex, int endIndex) {
        if (distances[endIndex] == Integer.MAX_VALUE) {
            System.out.println("Tidak ada jalur dari " + vertexNames[startIndex] + " ke " + vertexNames[endIndex]);
            return;
        }

        System.out.println("Jarak terpendek dari " + vertexNames[startIndex] + " ke " + vertexNames[endIndex] + ": " + distances[endIndex]);
        System.out.print("Jalur: ");
        printPath(previous, endIndex);
        System.out.println();
    }

    private void printPath(int[] previous, int vertexIndex) {
        if (vertexIndex == -1) {
            return;
        }
        printPath(previous, previous[vertexIndex]);
        System.out.print(vertexNames[vertexIndex] + " ");
    }
}