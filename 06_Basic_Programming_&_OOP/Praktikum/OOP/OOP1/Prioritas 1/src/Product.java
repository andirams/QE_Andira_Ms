public class Product {
    String nama, deskripsi;
    int harga, jumlah_stok;

    public void Product(String nama, String deskripsi, int harga, int jumlah_stok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlah_stok = jumlah_stok;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getName() {
        return nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getInfo() {
        System.out.println("===");
        System.out.println("INFO PRODUK");
        System.out.println("nama: " + nama);
        System.out.println("deskripsi: " + deskripsi);
        System.out.println("harga: " + harga);
        System.out.println("jumlah stock: " + jumlah_stok);
        System.out.println("===");
        return deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setStock(int jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }

    public int getStock() {
        return jumlah_stok;
    }

}
