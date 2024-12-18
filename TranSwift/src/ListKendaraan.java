public class ListKendaraan {
    Kendaraan head;

    public void addKendaraan(String jenis, boolean isDirected, int kapasitasPenumpang, int kapasitasBarang) {
        Kendaraan newKendaraan = new Kendaraan(jenis, isDirected, kapasitasPenumpang, kapasitasBarang);
        if (head == null) {
            head = newKendaraan;
        } else {
            Kendaraan current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newKendaraan;
        }
    }

    public Kendaraan searchKendaraan(String jenis) {
        Kendaraan current = head;
        while (current != null) {
            if (current.jenis.equals(jenis)) {
                return current;
            }
            current = current.next;
        }
        System.out.println(jenis + " tidak ditemukan.");
        return null;
    }

    public void removeKendaraan(String jenis) {
        Kendaraan target = searchKendaraan(jenis);
        if (target == null) {
            System.out.println(jenis + " tidak ditemukan.");
            return;
        }

        if (head == target) {
            head = head.next;
            System.out.println(jenis + " dihapus.");
            return;
        }

        Kendaraan current = head;
        while (current != null && current.next != target) {
            current = current.next;
        }

        if (current != null) {
            current.next = target.next;
            System.out.println(jenis + " dihapus.");
        }
    }

    public void displayKendaraan() {
        System.out.println("==================================================");
        System.out.println("|                DAFTAR KENDARAAN                |");
        System.out.println("==================================================");
        if (head == null) {
            System.out.println("| Tidak ada kendaraan tersedia                   |");
            System.out.println("==================================================");
            return;
        }

        Kendaraan current = head;
        while (current != null) {
            System.out.println("| Jenis: " + current.jenis);
            System.out.println("| Kapasitas Penumpang: " + current.kapasitasPenumpang + " Orang");
            System.out.println("| Kapasitas Barang: " + current.kapasitasBarang + " kg");
            System.out.println("==================================================");
            current = current.next;
        }
    }
}
