public class Prioritas1_1 {
    public static void main(String[] args) throws Exception {
        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        float hasilSegitiga = (alas * tinggi) / 2;
        System.out.printf("%.0f", hasilSegitiga);

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        // TODO: hitung luas persegi panjang
        float hasilPersegi = panjang * lebar;
        System.out.printf("\n%.0f", hasilPersegi);

        // lingkaran
        double jari2 = 7;

        // TODO: hitung luas lingkaran
        double phi = 3.14;
        double hasilLingkaran = phi * Math.pow(jari2, 2);

        System.out.printf("\n%.2f", hasilLingkaran);
    }
}
