import java.util.ArrayList;
import java.util.Arrays;

public class No4 {
    public static void main(String[] args) {
        // int intArr[] = { 1, 2, 3, 4 }; // edit array
        // int intArrSec[] = { 1, 3, 5, 10, 16 }; // edit array2

        ArrayList<Integer> intArr = new ArrayList<Integer>();
        ArrayList<Integer> intArrSec = new ArrayList<Integer>();

        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArrSec.add(1);
        intArrSec.add(3);
        intArrSec.add(5);
        intArrSec.add(10);
        intArrSec.add(16);

        for (int i = 0; i < intArr.size() - 1; i++) {
            for (int j = 0; j < intArrSec.size() - 1; j++) {
                if (intArr.get(i) == intArrSec.get(j)) {
                    intArr.remove(i);
                }
            }
        }

        System.out.println(intArr);
    }
}