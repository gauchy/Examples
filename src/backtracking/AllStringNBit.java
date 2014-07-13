package backtracking;

/**
 * Created by ashwini on 13/07/14.
 */
public class AllStringNBit {

    public static void main(String[] args) {

        generateAllNBitString(new String[]{"a","b","c","d"} ,"");
    }

    private static void generateAllNBitString(String[] str,String prefix) {

        if (str.length == 0) {
            System.out.println(prefix);
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
