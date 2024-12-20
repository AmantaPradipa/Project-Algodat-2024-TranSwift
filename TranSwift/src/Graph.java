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
            System.out.println("Tempat asal tidak ditemukan!");
            return;
        }
        if (tujuan == null) {
            System.out.println("Tempat tujuan tidak ditemukan!");
            return;
        }
    
        // Inisialisasi jarak tempat asal
        asal.jarak = 0;
        listTempat.resetVisited();
    
        while (true) {
            // Ambil tempat dengan jarak terpendek yang belum dikunjungi
            Tempat current = listTempat.getNextUnvisitedTempat();
            if (current == null) {
                break; // Tidak ada tempat lagi yang bisa dikunjungi
            }
    
            current.visited = true;
    
            // Perbarui jarak untuk tempat yang terhubung dengan tempat saat ini
            Jalur jalur = listJalur.head;
            while (jalur != null) {
                if (jalur.tempatAsal.equals(current)) {
                    Tempat tujuanTemp = jalur.tempatTujuan;
                    if (!tujuanTemp.visited && current.jarak + jalur.jarak < tujuanTemp.jarak) {
                        tujuanTemp.jarak = current.jarak + jalur.jarak;
                        tujuanTemp.prev = current; // Catat tempat sebelumnya
                    }
                }
                jalur = jalur.next;
            }
    
            // Jika tujuan telah ditemukan, hentikan pencarian
            if (current.equals(tujuan)) {
                break;
            }
        }
    
        // Menampilkan hasil jarak ke tempat tujuan
        if (tujuan.jarak == Double.POSITIVE_INFINITY) {
            System.out.println("Jarak ke " + tujuan.namaTempat + " tidak dapat dijangkau.");
        } else {
            System.out.println("Jarak terpendek ke " + tujuan.namaTempat + " adalah " + tujuan.jarak);
    
            // Menampilkan jalur yang dilalui untuk mencapai tujuan
            System.out.print("Tempat-tempat yang dilalui: ");
            
            // Mulai dari tempat tujuan dan berjalan mundur
            Tempat current = tujuan;
            Jalur jalurCurrent = listJalur.head;
            StringBuilder path = new StringBuilder();
    
            while (current != null) {
                path.insert(0, current.namaTempat); // Menambahkan tempat ke jalur
                current = current.prev; // Pindah ke tempat sebelumnya
                if (current != null) {
                    if(jalurCurrent.isDirected) path.insert(0, " -> "); // Menambahkan pemisah antar tempat
                    else path.insert(0, " -- ");
                }
            }
    
            // Menampilkan jalur yang dilalui
            System.out.println(path);
        }
    }
    
    public void resetGraph() {
        // Mereset semua tempat
        Tempat currentTempat = listTempat.head;
        while (currentTempat != null) {
            currentTempat.jarak = Double.POSITIVE_INFINITY;  // Reset jarak
            currentTempat.visited = false;  // Reset status visited
            currentTempat.prev = null;  // Reset tempat sebelumnya
            currentTempat = currentTempat.next;
        }
    }
    
}

