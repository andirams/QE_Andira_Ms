class Prioritas2_1 {
    public static void drawXYZ(int n) {
        String[] huruf = { "X", "Y", "Z" };

        // TODO: complete this code
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    System.out.print(huruf[2] + " ");
                } else if (j % 3 == 0) {
                    System.out.print(huruf[0] + " ");
                } else {
                    System.out.print(huruf[1] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}