class Penumpang {
    String nama;
    int uang;
    Barang barang;
    Tiket tiket;
    Penumpang next;
    Penumpang prev;

    public Penumpang(String nama, int uang, Barang barang) {
        this.nama = nama;
        this.uang = uang;
        this.barang = barang;
        this.tiket = null;
        this.next = null;
        this.prev = null;
    }
}