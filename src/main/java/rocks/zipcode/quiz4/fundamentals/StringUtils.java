package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int x= str.length()/2;
        char c= Character.toUpperCase(getMiddleCharacter(str));
        return str.substring(0,x)+c+str.substring(x+1,str.length());

    }

    public static String lowerCaseMiddleCharacter(String str) {
        char c= Character.toLowerCase(getMiddleCharacter(str));

        return str=str.substring(0,str.length()/2) + c+ str.substring(str.length()/2+1,str.length());
    }

    public static Boolean isIsogram(String str) {
        char[]arr = str.toCharArray();
        Arrays.sort(arr);
        for(int x=0;x<arr.length-1;x++)
            if(arr[x] == arr[x+1])
                return false;
            return true;

    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}