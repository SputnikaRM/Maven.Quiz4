package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int x = values.length/2;
        return values[x];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> arr = new ArrayList<>();
        int x= values.length/2;

        for(int y=0; y< values.length;y++)
            arr.add(values[y]);
        arr.remove(values[x]);
        return Arrays.stream(arr.toArray()).toArray(String[]::new);
    }

    public static String getLastElement(String[] values) {
       return values[values.length-1];

    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> arr = new ArrayList<>();
        for(int x =0; x< values.length;x++)
            arr.add(values[x]);
        arr.remove(values.length-1);
        return Arrays.stream(arr.toArray()).toArray(String[]::new);
    }
}