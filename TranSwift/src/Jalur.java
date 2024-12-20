class Jalur {
    Tempat tempatAsal;
    Tempat tempatTujuan;
    double jarak;
    boolean isDirected;
    Jalur next;

    public Jalur(Tempat tempatAsal, Tempat tempatTujuan, double jarak, boolean isDirected) {
        this.tempatAsal = tempatAsal;
        this.tempatTujuan = tempatTujuan;
        this.jarak = jarak;
        this.isDirected = isDirected;
        this.next = null;
    }
}