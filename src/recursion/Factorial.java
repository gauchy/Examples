package recursion;

/**
 * Created by ashwini on 13/07/14.
 */
public class Factorial {
    public static void main(String[] args) {
        
        int i = getFactorial(3);
        System.out.println(i);
    }

    private static int getFactorial(int i) {

        if(i < 2)
            return i;

        return i * getFactorial(i-1);

    }
}

