public class Graph {
    ListTempat listTempat;
    ListJalur listJalur;

    public Graph() {
        listTempat = new ListTempat();
        listJalur = new ListJalur(listTempat);
    }

    public void addVertex(String namaTempat) {
        listTempat.addTempat(namaTempat);
    }

    public void searchVertex(String namaTempat) {
        listTempat.searchTempat(namaTempat);
    }

    public void addEdge(String tempatAsal, String tempatTujuan, double jarak, boolean isDirected) {
        listJalur.addJalur(tempatAsal, tempatTujuan, jarak, isDirected);

        if (!isDirected) {
            listJalur.addJalur(tempatTujuan, tempatAsal, jarak, false);
        }
    }

    public void removeVertex(String namaTempat) {
        Tempat tempat = listTempat.searchTempat(namaTempat);
        if (tempat == null) {
            return;
        }

        Jalur current = listJalur.head;
        while (current != null) {
            if (current.tempatAsal == tempat || current.tempatTujuan == tempat) {
                listJalur.removeJalur(current.tempatAsal.namaTempat, current.tempatTujuan.namaTempat);
            }
            current = current.next;
        }

        listTempat.removeTempat(namaTempat);
    }

    public void removeEdge(String tempatAsal, String tempatTujuan) {
        listJalur.removeJalur(tempatAsal, tempatTujuan);
    }

    public void displayVertices() {
        listTempat.displayTempat();
    }

    public void displayEdges() {
        listJalur.displayJalur();
    }

    public boolean hasEdge(String tempatAsal, String tempatTujuan) {
        Jalur jalur = listJalur.searchJalur(tempatAsal, tempatTujuan);
        return jalur != null;
    }

    public boolean hasVertex(String namaTempat) {
        Tempat tempat = listTempat.searchTempat(namaTempat);
        return tempat != null;
    }
    
    public void dijkstra(String tempatAsal, String tempatTujuan, boolean isDirected) {
        Tempat asal = listTempat.searchTempat(tempatAsal);
        Tempat tujuan = listTempat.searchTempat(tempatTujuan);
    
        if (asal == null) {
            return;
        }
        if (tujuan == null) {
            return;
        }
    
        asal.jarak = 0;
        listTempat.resetVisited();
    
        while (true) {
            Tempat current = listTempat.getNextUnvisitedTempat();
            if (current == null) {
                break;
            }
    
            current.visited = true;
    
            Jalur jalur = listJalur.head;
            while (jalur != null) {
                if (jalur.tempatAsal.equals(current)) {
                    Tempat tujuanTemp = jalur.tempatTujuan;
                    if (!tujuanTemp.visited && current.jarak + jalur.jarak < tujuanTemp.jarak) {
                        tujuanTemp.jarak = current.jarak + jalur.jarak;
                        tujuanTemp.prev = current;
                    }
                }
                jalur = jalur.next;
            }
    
            if (current.equals(tujuan)) {
                break;
            }
        }
    }

    public void sortJarak(String tempatAsal) {
        Tempat asal = listTempat.searchTempat(tempatAsal);
        if (asal == null) {
            System.out.println("Tempat asal tidak ditemukan!");
            return;
        }

        dijkstra(tempatAsal, null, true); // Jalankan Dijkstra untuk menghitung jarak

        // Membuat linked list sementara untuk menyimpan semua tempat dan jarak
        NodeSementara tempListHead = null; // Head untuk linked list sementara
        Tempat current = listTempat.head;
        while (current != null) {
            NodeSementara newNode = new NodeSementara(current);
            if (tempListHead == null) {
                tempListHead = newNode;
            } else {
                NodeSementara temp = tempListHead;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            current = current.next;
        }

        // Sorting linked list berdasarkan jarak menggunakan bubble sort
        boolean swapped;
        do {
            swapped = false;
            NodeSementara temp = tempListHead;
            while (temp != null && temp.next != null) {
                if (temp.tempat.jarak > temp.next.tempat.jarak) {
                    // Swap tempat
                    Tempat tempPlace = temp.tempat;
                    temp.tempat = temp.next.tempat;
                    temp.next.tempat = tempPlace;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);

        // Menampilkan hasil setelah disorting
        NodeSementara temp = tempListHead;
        while (temp != null) {
            Tempat tempat = temp.tempat;
            if (tempat.jarak == Double.POSITIVE_INFINITY) {
                System.out.println("Tempat: " + tempat.namaTempat + " tidak dapat dijangkau.");
            } else {
                displayPath(tempat);
                System.out.print(", Jarak: " + tempat.jarak + " Km ");
                System.out.println();
            }
            temp = temp.next;
        }
    }

    // Linked list node untuk tempat, untuk digunakan dalam proses sorting
    private class NodeSementara {
        Tempat tempat;
        NodeSementara next;

        NodeSementara(Tempat tempat) {
            this.tempat = tempat;
            this.next = null;
        }
    }

    private void displayPath(Tempat tujuan) {
        Jalur jalurCurrent = listJalur.head;
        StringBuilder path = new StringBuilder();
        Tempat current = tujuan;
    
        while (current != null) {
            path.insert(0, current.namaTempat);
            current = current.prev;
            if (current != null) {
                if(jalurCurrent.isDirected) path.insert(0, " -> ");
                else path.insert(0, " -- ");
            }
        }
    
        System.out.print(path);
    }   
    
    public void resetGraph() {
        Tempat currentTempat = listTempat.head;
        while (currentTempat != null) {
            currentTempat.jarak = Double.POSITIVE_INFINITY;
            currentTempat.visited = false;
            currentTempat.prev = null;
            currentTempat = currentTempat.next;
        }
    }
}