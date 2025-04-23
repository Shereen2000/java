public class iteration_statements {

    public static void main(String[] args) {
        
    }

    //while loop
    private static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println("i is: " + i);
            i++;
        }
    }

    //do while loop
    private static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("i is: " + i);
            i++;
        } while (i < 5);
    }

    //for loop
    private static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }
    }

    //for loop using comma
    private static void forLoopUsingComma() {
        for (int i = 0, j = 0; i < 5 && j < 5; i++, j++) {
            System.out.println("i is: " + i + ", j is: " + j);
        }
    }

    //for loop using boolean to stop
    private static void forLoopUsingBoolean() {
        boolean stop = false;
        for (int i = 0; !stop && i < 5; i++) {
            System.out.println("i is: " + i);
            if (i == 3) {
                stop = true;
            }
        }
    }

    //for loop using boolean to stop and parts of the loop are empty
    private static void forLoopUsingBooleanEmpty() {
        boolean stop = false;
        for (; !stop;) {

            int i = 0;
            if (i == 3) {
                stop = true;
                i++;
            }
        }
    }

    //for each loop
    private static void forEachLoop() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println("num is: " + num);
        }
    }

    //for each loop with break
    private static void forEachLoopWithBreak() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            if (num == 3) {
                break;
            }
            System.out.println("num is: " + num);
        }
    }

    //Iteration over multidimensional array
    private static void multiDimensionalArrayIteration() {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] innerArr : arr) {
            for (int num : innerArr) {
                System.out.println("num is: " + num);
            }
        }
    }
    
}


