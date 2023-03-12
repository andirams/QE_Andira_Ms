public class Main {

    public static void main(String[] args) {
        int hasilTambah = add(3, 4);
        int hasilPengurangan = subtract(15, 4);
        int hasilKali = multiply(10, 10);
        int hasilBagi = divide(12, 3);

        System.out.println("Penjumlahan: " + hasilTambah);
        System.out.println("Pengurangan: " + hasilPengurangan);
        System.out.println("Perkalian: " + hasilKali);
        System.out.println("Pembagian: " + hasilBagi);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}