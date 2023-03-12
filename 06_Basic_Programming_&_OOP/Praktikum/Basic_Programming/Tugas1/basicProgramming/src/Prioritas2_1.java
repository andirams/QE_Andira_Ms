class Prioritas2_1 {
    public static void drawXYZ(int n) {
        String[] huruf = { "X", "Y", "Z" };

        // TODO: complete this code
        int count = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {

                if (count % 3 == 0) {
                    System.out.print(huruf[0] + " ");
                } else if (count % 2 == 0) {
                    System.out.print(huruf[2] + " ");
                } else if (count % 2 == 1) {
                    System.out.print(huruf[1] + " ");
                }

                count++;
            }
        }

    }

    public static void main(String[] args) {
        drawXYZ(5);
    }
}