package backtracking;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ashwini on 13/07/14.
 */
public class AllStringOfNBitOfKBit {

    public static Set<String> uniqueVals = new HashSet<String>();
    public static void main(String[] args) {
        generateAllNBitString(new String[]{"a","b","c","d"} ,"");

        for(String str : uniqueVals)
        {
            System.out.println(str);
        }
    }

    private static void generateAllNBitString(String[] str, String prefix)
    {

        if (str.length == 0) {
            uniqueVals.add(prefix.substring(0,3));

           // System.out.println(prefix);
            return;
        }

        for (int j = 0; j < str.length; j++) {
            //Copy all elements in to new array except jth element
            String[] strNew = new String[str.length - 1];
            for (int k = 0; k < str.length; k++) {
                if (k < j) {
                    strNew[k] = str[k];
                } else if (k > j) {
                    strNew[k - 1] = str[k];
                }
            }
            generateAllNBitString(strNew, prefix + str[j]);
        }

    }

}
