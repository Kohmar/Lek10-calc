
public class Calculator {

    public Calculator() {
    }

    public  int max (Integer[] arr){


        int tek = Integer.MIN_VALUE;


            for (Integer i : arr) {
                if (i > tek) {
                    tek = i;
                }
            }

        return tek;
    }
}
