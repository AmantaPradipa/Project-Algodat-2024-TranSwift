class Tiket {
    String label;
    Tempat tempatAsal;
    Tempat tempatTujuan;
    double hargaTiket;
    Kendaraan kendaraan;
    Tiket next;

    public Tiket(String label, Tempat tempatAsal, Tempat tempatTujuan, double hargaTiket, Kendaraan kendaraan) {
        this.label = label;
        this.tempatAsal = tempatAsal;
        this.tempatTujuan = tempatTujuan;
        this.hargaTiket = hargaTiket;
        this.kendaraan = kendaraan;
        this.next = null;
    }
}