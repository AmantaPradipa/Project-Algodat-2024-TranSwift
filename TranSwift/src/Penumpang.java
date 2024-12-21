class Penumpang {
    String nama;
    int uang;
    Barang barang;
    Penumpang next;
    Penumpang prev;

    public Penumpang(String nama, int uang, Barang barang) {
        this.nama = nama;
        this.uang = uang;
        this.barang = barang;
        this.next = null;
        this.prev = null;
    }
}