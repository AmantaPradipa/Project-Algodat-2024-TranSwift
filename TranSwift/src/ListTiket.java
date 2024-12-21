public class ListTiket {
    Tiket head;
    ListKendaraan listKendaraan;
    Graph graph;

    public ListTiket(ListKendaraan listKendaraan, Graph graph) {
        this.listKendaraan = listKendaraan;
        this.graph = graph;
        this.head = null;
    }

    public void addTiket(String label, String tempatAsal, String tempatTujuan, double hargaTiket,
            String jenisKendaraan) {
        if (jenisKendaraan == null || tempatAsal == null || tempatTujuan == null) {
            System.out.println("Informasi tidak lengkap.");
            return;
        }

        Kendaraan kendaraan = listKendaraan.searchKendaraan(jenisKendaraan);
        Tempat asal = graph.listTempat.searchTempat(tempatAsal);
        Tempat tujuan = graph.listTempat.searchTempat(tempatTujuan);

        if (kendaraan == null) {
            System.out.println("Kendaraan tidak valid.");
            return;
        }

        if (asal == null || tujuan == null) {
            System.out.println("Tempat tidak valid.");
            return;
        }

        Tiket newTiket = new Tiket(label, asal, tujuan, hargaTiket, kendaraan);
        if (head == null) {
            head = newTiket;
        } else {
            Tiket current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTiket;
        }
    }

    public Tiket searchTiket(String label) {
        Tiket current = head;
        while (current != null) {
            if (current.label.equals(label)) {
                return current;
            }
            current = current.next;
        }
        System.out.println("Tiket dengan label " + label + " tidak ditemukan.");
        return null;
    }

    public void removeTiket(String label) {
        Tiket target = searchTiket(label);
        if (target == null) {
            System.out.println("----------------------------------------------------------");
            System.out.println("|                    NOTIFIKASI TIKET                    |");
            System.out.println("----------------------------------------------------------");
            System.out.println("Tiket dengan label " + label + " tidak ditemukan.");
            return;
        }

        if (head == target) {
            head = head.next;
            System.out.println("----------------------------------------------------------");
            System.out.println("|                    NOTIFIKASI TIKET                    |");
            System.out.println("----------------------------------------------------------");
            System.out.println("Tiket dengan label " + label + " dihapus.");
            return;
        }

        Tiket current = head;
        while (current != null && current.next != target) {
            current = current.next;
        }

        if (current != null) {
            current.next = target.next;
            System.out.println("----------------------------------------------------------");
            System.out.println("|                    NOTIFIKASI TIKET                    |");
            System.out.println("----------------------------------------------------------");
            System.out.println("Tiket dengan label " + label + " dihapus.");
        }
    }

    public void displayAllTicket(String jenisKendaraan) {
        // Kendaraan kendaraan = listKendaraan.searchKendaraan(jenisKendaraan);
        sortHargaTiket();
        System.out.println("==========================================================");
        if (jenisKendaraan.equalsIgnoreCase("Bus"))
            System.out.println("|                 DAFTAR HARGA TIKET BUS                 |");
        else
            System.out.println("|                DAFTAR HARGA TIKET TAKSI                |");
        System.out.println("==========================================================");
        System.out.printf("| %-17s | %-17s | %-14s |\n", "Asal", "Tujuan", "Harga");
        System.out.println("|--------------------------------------------------------|");

        if (head == null) {
            System.out.println("|                Tidak ada tiket tersedia                |");
            System.out.println("==========================================================");
            return;
        }

        Tiket current = head;
        while (current != null) {
            // Menggunakan Dijkstra untuk mendapatkan jalur terpendek
            double hargaTiketFinal = hitungHargaTiket(current.tempatAsal.namaTempat, current.tempatTujuan.namaTempat,
                    current.hargaTiket);
            System.out.printf("| %-17s | %-17s | Rp%-12.0f |\n",
                    current.tempatAsal.namaTempat,
                    current.tempatTujuan.namaTempat,
                    hargaTiketFinal);
            current = current.next;
        }
        System.out.println("==========================================================");
    }

    public double hitungHargaTiket(String tempatAsal, String tempatTujuan, double hargaTiket) {
        graph.dijkstra(tempatAsal, tempatTujuan, true); // Jalankan Dijkstra untuk menghitung jarak

        Tempat asal = graph.listTempat.searchTempat(tempatAsal);
        Tempat tujuan = graph.listTempat.searchTempat(tempatTujuan);
        if (tujuan == null || tujuan.jarak == Double.POSITIVE_INFINITY) {
            return hargaTiket;
        }

        double jarakTempat = graph.listJalur.searchJalur(asal.namaTempat, tujuan.namaTempat).jarak;

        Tempat current = tujuan;
        while (current != null && current.prev != null) {
            jarakTempat += graph.listJalur.searchJalur(current.prev.namaTempat, current.namaTempat).jarak;
            current = current.prev;
        }

        return hargaTiket + jarakTempat / 2 * 100;
    }

    public void sortHargaTiket() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Tiket current = head;
            while (current.next != null) {
                // Hitung harga tiket final untuk kedua tiket
                double hargaTiketFinalCurrent = hitungHargaTiket(current.tempatAsal.namaTempat,
                        current.tempatTujuan.namaTempat, current.hargaTiket);
                double hargaTiketFinalNext = hitungHargaTiket(current.next.tempatAsal.namaTempat,
                        current.next.tempatTujuan.namaTempat, current.next.hargaTiket);

                // Bandingkan harga tiket final dua tiket berturut-turut
                if (hargaTiketFinalCurrent > hargaTiketFinalNext) {
                    // Tukar tempat mereka jika harga tiket final dalam urutan yang salah
                    double tempHarga = current.hargaTiket;
                    current.hargaTiket = current.next.hargaTiket;
                    current.next.hargaTiket = tempHarga;

                    String tempLabel = current.label;
                    current.label = current.next.label;
                    current.next.label = tempLabel;

                    Tempat tempAsal = current.tempatAsal;
                    current.tempatAsal = current.next.tempatAsal;
                    current.next.tempatAsal = tempAsal;

                    Tempat tempTujuan = current.tempatTujuan;
                    current.tempatTujuan = current.next.tempatTujuan;
                    current.next.tempatTujuan = tempTujuan;

                    Kendaraan tempKendaraan = current.kendaraan;
                    current.kendaraan = current.next.kendaraan;
                    current.next.kendaraan = tempKendaraan;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped); // Jika ada pertukaran, lakukan iterasi lagi
    }
}
