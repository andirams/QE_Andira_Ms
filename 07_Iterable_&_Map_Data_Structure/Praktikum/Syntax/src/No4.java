
public class No4 {
    public static void main(String[] args) {
        int intArr[] = { 1, 2, 3, 4 }; // edit array
        int intArrSec[] = { 1, 3, 5, 10, 16 }; // edit array2

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArrSec.length; j++) {
                if (intArr[i] == intArrSec[j]) {
                    intArr[i] = 0;
                }
            }
        }

        for (int i : intArr) {
            if (i != 0) {
                System.out.println("[" + i + "]");
            }
        }

    }
}