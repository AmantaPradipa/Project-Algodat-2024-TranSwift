class Tiket {
    Tempat tempatAsal;
    Tempat tempatTujuan;
    double hargaTiket;
    Kendaraan kendaraan;
    Tiket next;

    public Tiket(Tempat tempatAsal, Tempat tempatTujuan, double hargaTiket, Kendaraan kendaraan) {
        this.tempatAsal = tempatAsal;
        this.tempatTujuan = tempatTujuan;
        this.hargaTiket = hargaTiket;
        this.kendaraan = kendaraan;
        this.next = null;
    }
}