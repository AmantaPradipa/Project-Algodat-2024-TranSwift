class Jalur {
    Tempat tempatAsal;
    Tempat tempatTujuan;
    double jarak;
    boolean isDirected;

    public Jalur(Tempat tempatAsal, Tempat tempatTujuan, double jarak, boolean isDirected) {
        this.tempatAsal = tempatAsal;
        this.tempatTujuan = tempatTujuan;
        this.jarak = jarak;
        this.isDirected = isDirected;
    }
}