class Penumpang {
    String nama;
    int uang;

    StackBarang barang;
    Tiket tiket;

    Penumpang next;

    public Penumpang(String nama, int uang, StackBarang barang) {
        this.nama = nama;
        this.uang = uang;
        this.barang = barang;

        this.tiket = null;

        this.next = null;

    }
}