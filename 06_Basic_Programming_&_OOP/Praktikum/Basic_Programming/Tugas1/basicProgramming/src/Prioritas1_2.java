import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Prioritas1_2 {
    public static void main(String[] args) {
        // Sampel 1
        int hargaBeli1 = 15000;
        int hargaJual1 = 30000;
        int hasil1 = hargaJual1 - hargaBeli1;

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        if (hargaJual1 > hargaBeli1) {
            System.out.println("Untung sebesar : " + hasil1);
        } else if (hargaJual1 < hargaBeli1) {
            System.out.println("Rugi Sebesar : " + hasil1);
        } else {
            System.out.println("Sama Saja");
        }

        // Sampel 2
        int hargaBeli2 = 12000;
        int hargaJual2 = 9000;
        int hasil2 = hargaJual2 - hargaBeli2;

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        if (hargaJual2 > hargaBeli2) {
            System.out.println("Untung sebesar : " + hasil2);
        } else if (hargaJual2 < hargaBeli2) {
            System.out.println("Rugi Sebesar : " + hasil2);
        } else {
            System.out.println("Sama Saja");
        }

        // Sampel 3
        int hargaBeli3 = 12000;
        int hargaJual3 = 12000;
        int hasil3 = hargaJual3 - hargaBeli3;

        // TODO: cek apakah hasil penjualan mengalami keuntungan / kerugian
        if (hargaJual3 > hargaBeli3) {
            System.out.println("Untung sebesar : " + hasil3);
        } else if (hargaJual3 < hargaBeli3) {
            System.out.println("Rugi Sebesar : " + hasil3);
        } else {
            System.out.println("Sama Saja");
        }

    }
}
