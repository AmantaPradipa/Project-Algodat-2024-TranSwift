public class ListTiket {
    Tiket head;
    ListKendaraan listKendaraan;
    ListTempat listTempat;

    public ListTiket(ListKendaraan listKendaraan, ListTempat listTempat) {
        this.listKendaraan = listKendaraan;
        this.listTempat = listTempat;
        this.head = null;
    }

    public void addTiket(String label, String tempatAsal, String tempatTujuan, double hargaTiket, String jenisKendaraan) {
        if (jenisKendaraan == null || tempatAsal == null || tempatTujuan == null) {
            System.out.println("Informasi tidak lengkap.");
            return;
        }

        Kendaraan kendaraan = listKendaraan.searchKendaraan(jenisKendaraan);
        Tempat asal = listTempat.searchTempat(tempatAsal);
        Tempat tujuan = listTempat.searchTempat(tempatTujuan);

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

    private Tiket searchTiket(String label) {
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
            System.out.println("Tiket dengan label " + label + " tidak ditemukan.");
            return;
        }

        if (head == target) {
            head = head.next;
            System.out.println("Tiket dengan label " + label + " dihapus.");
            return;
        }

        Tiket current = head;
        while (current != null && current.next != target) {
            current = current.next;
        }

        if (current != null) {
            current.next = target.next;
            System.out.println("Tiket dengan label " + label + " dihapus.");
        }
    }

    public void displayTiket() {
        System.out.println("==================================================");
        System.out.println("|                  DAFTAR TIKET                  |");
        System.out.println("==================================================");
        if (head == null) {
            System.out.println("| Tidak ada tiket tersedia                   |");
            System.out.println("==================================================");
            return;
        }

        Tiket current = head;
        while (current != null) {
            System.out.println("| Label: " + current.label);
            System.out.println("| Asal: " + current.tempatAsal);
            System.out.println("| Tujuan: " + current.tempatTujuan);
            System.out.println("| Harga Tiket: Rp" + current.hargaTiket);
            System.out.println("| Kendaraan: " + current.kendaraan.jenis);
            System.out.println("==================================================");
            current = current.next;
        }
    }
}
