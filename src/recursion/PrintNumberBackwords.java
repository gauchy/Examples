package recursion;

/**
 * Created by ashwini on 13/07/14.
 */
public class PrintNumberBackwords {

    public static void main(String[] args) {
        printBackWords(10);
    }

    private static void printBackWords(int i) {

        if( i   < 1)
            return;

        System.out.println(i);
        printBackWords(i-1);
    }

}
