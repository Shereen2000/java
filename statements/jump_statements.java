public class jump_statements {

    public static void main(String[] args) {
        
    }

    //break statement
    //The break statement is used to exit from a loop or a switch statement.
    //In the case of a for loop, it is used to exit from the loop and return to the calling method.
    //In the case of a while loop, it is used to exit from the loop and return to the calling method.
    //In the case of a do while loop, it is used to exit from the loop and return to the calling method.
    //In the case of a switch statement, it is used to exit from the switch statement and return to the calling method.
    //The break statement can also be used to exit from a nested loop or a nested switch statement.
    private static void breakStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i is: " + i);
        }
    }

    //continue statement
    //The continue statement is used to skip the current iteration of a loop and continue with the next iteration.
    //In the case of a for loop, it is used to skip the current iteration and continue with the next iteration.
    //In the case of a while loop, it is used to skip the current iteration and continue with the next iteration.   
    //In the case of a do while loop, it is used to skip the current iteration and continue with the next iteration.
    //In the case of a switch statement, it is used to skip the current iteration and continue with the next iteration.
    private static void continueStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i is: " + i);
        }
    }

    //return statement
    //The return statement is used to exit from a method and return a value.
    //In the case of a void method, it is used to exit from the method without returning any value.
    //The return statement can also be used to exit from a loop or a switch statement.
    //In the case of a loop, it is used to exit from the loop and return to the calling method.
    //In the case of a switch statement, it is used to exit from the switch statement and return to the calling method.
    private static void returnStatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.println("i is: " + i);
        }
    }

    
}
