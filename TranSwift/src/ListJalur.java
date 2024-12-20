public class ListJalur {
    Jalur head;
    ListTempat listTempat;

    public ListJalur(ListTempat listTempat) {
        this.listTempat = listTempat;
        this.head = null;
    }

    public void addJalur(String tempatAsal, String tempatTujuan, double jarak, boolean isDirected) {
        Tempat asal = listTempat.searchTempat(tempatAsal);
        Tempat tujuan = listTempat.searchTempat(tempatTujuan);
        Jalur newJalur = new Jalur(asal, tujuan, jarak, isDirected);
        if (head == null) {
            head = newJalur;
        } else {
            Jalur current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newJalur;
        }
    }

    public Jalur getJalur(Tempat tempatAsal, Tempat tempatTujuan) {
        Jalur current = head;
        while (current != null) {
            if (current.tempatAsal.equals(tempatAsal) && current.tempatTujuan.equals(tempatTujuan)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Jalur searchJalur(String tempatAsal, String tempatTujuan) {
        Tempat asal = listTempat.searchTempat(tempatAsal);
        Tempat tujuan = listTempat.searchTempat(tempatTujuan);
        Jalur current = head;
        while (current != null) {
            if (current.tempatAsal.equals(asal) && current.tempatTujuan.equals(tujuan)) {
                return current;
            }
            current = current.next;
        }
        System.out.println("Jalur dari " + asal.namaTempat + " ke " + tujuan.namaTempat + " tidak ditemukan.");
        return null;
    }

    public void removeJalur(String tempatAsal, String tempatTujuan) {
        Jalur target = searchJalur(tempatAsal, tempatTujuan);
        if (target == null) {
            return;
        }

        if (head == target) {
            head = head.next;
            return;
        }

        Jalur current = head;
        while (current != null && current.next != target) {
            current = current.next;
        }

        if (current != null) {
            current.next = target.next;
        }
    }

    public void displayJalur() {
        System.out.println("==================================================");
        if (head != null && head.isDirected == true) {
            System.out.println("|                DAFTAR JALUR BUS                |");
        } else {
            System.out.println("|               DAFTAR JALUR TAKSI               |");
        }
        System.out.println("==================================================");
        if (head == null) {
            System.out.println("| Tidak ada Jalur                             |");
            System.out.println("==================================================");
            return;
        }
        
        Jalur current = head;
        System.out.println(" Tiket :");
        while (current != null) {
            if (current.isDirected) {
                System.out.println(" " + current.tempatAsal.namaTempat + " -> " + current.tempatTujuan.namaTempat + " Jarak: " + current.jarak);
            } else {
                System.out.println(" " + current.tempatAsal.namaTempat + " -- " + current.tempatTujuan.namaTempat + " Jarak: " + current.jarak); 
            }
            current = current.next;
        }
        System.out.println("==================================================");
    }
}
