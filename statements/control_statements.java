public class control_statements {
    public static void main(String[] args) {


        
    }

    //if else
    private static void ifElse() {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }

    //switch case
    private static void switchCase() {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    //nested switch
    private static void nestedSwitch() {
        int day = 3;
        int month = 2;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                switch (day) {
                    case 1:
                        System.out.println("February 1st");
                        break;
                    case 2:
                        System.out.println("February 2nd");
                        break;
                    default:
                        System.out.println("Invalid date in February");
                }
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}