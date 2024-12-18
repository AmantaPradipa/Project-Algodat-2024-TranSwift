public class ListTempat {
    Tempat head;

    public void addTempat(String namaTempat) {
        Tempat newTempat = new Tempat(namaTempat);
        if (head == null) {
            head = newTempat;
        } else {
            Tempat current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTempat;
        }
    }

    public Tempat searchTempat(String namaTempat) {
        Tempat current = head;
        while (current != null) {
            if (current.namaTempat.equals(namaTempat)) {
                return current;
            }
            current = current.next;
        }
        System.out.println(namaTempat + " tidak ditemukan.");
        return null;
    }

    public void removeTempat(String namaTempat) {
        Tempat target = searchTempat(namaTempat);
        if (target == null) {
            System.out.println(namaTempat + " tidak ditemukan.");
            return;
        }

        if (head == target) {
            head = head.next;
            System.out.println(namaTempat + " dihapus.");
            return;
        }

        Tempat current = head;
        while (current != null && current.next != target) {
            current = current.next;
        }

        if (current != null) {
            current.next = target.next;
            System.out.println(namaTempat + " dihapus.");
        }
    }

    public void displayTempat() {
        System.out.println("==================================================");
        System.out.println("|                  DAFTAR TEMPAT                 |");
        System.out.println("==================================================");
        if (head == null) {
            System.out.println("| Tidak ada Tempat Tujuan                    |");
            System.out.println("==================================================");
            return;
        }

        Tempat current = head;
        while (current != null) {
            System.out.println("- " + current.namaTempat);
            current = current.next;
        }
        System.out.println("==================================================");
    }
}
