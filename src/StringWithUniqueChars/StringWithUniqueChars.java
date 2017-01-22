package StringWithUniqueChars;


/**
 * Created by Sabab on 1/20/2017.
 */
import Utility.Util;

import java.util.Scanner;

public class StringWithUniqueChars {

    boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println("val at " + i + " : " + val);
            if (char_set[val]) { // Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public void uniqueCharString() {

        System.out.println("Enter String : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean isUniqueChars = isUniqueChars(str);

        if(isUniqueChars)
            System.out.println("Unique character string.");
        else
            System.out.println("Not unique character string");
    }
}
