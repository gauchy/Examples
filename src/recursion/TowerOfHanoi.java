package recursion;

/**
 * Created by ashwini on 13/07/14.
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        towerOfHanoi(3 , 1,2,3);
    }

    private static void towerOfHanoi(int i, int fromPeg, int toPeg, int auxPeg) {

        if(i == 1)
        {
            System.out.println("Moving " + i + " from " + fromPeg + " to " + toPeg);
            return;
        }

        towerOfHanoi(i-1 , fromPeg,auxPeg,toPeg);
        System.out.println("Moving " + i + " from " + fromPeg + " to " + toPeg);
        towerOfHanoi(i-1 , auxPeg,toPeg,fromPeg);


    }

}
