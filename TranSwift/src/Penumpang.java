class Penumpang {
    String nama;
    double uang;
    Barang barang;
    Tiket tiket;
    Penumpang next, prev;

    public Penumpang(String nama, double uang, Barang barang) {
        this.nama = nama;
        this.uang = uang;
        this.barang = barang;
        this.tiket = null;
        this.next = null;
        this.prev = null;
    }
}