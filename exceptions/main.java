import java.io.Console;
import java.io.StringReader;
import java.util.*;

public class main {
    public static void main(String[] args) {

  
    
    }



    public static void divideByZero(int number)
    {
        try
        {
            double answer = number/0;
        }
        catch(Exception mistake)
        {
            System.out.println("Arithmetic exception was thrown and cought");
        }
    }



    //You can also use the catch to correct mistake.
    public static void divideByZeroFixMistakeInCatch()
    {
        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        double result;
        try
        {
            System.out.println("Enter numerator");
            numerator = sc.nextInt();
            System.out.println("Enter denomenator");
            denominator = sc.nextInt();
            double answer = numerator/denominator;
        }
        catch(Exception mistake)
        {
            System.out.println("You made a logical error try entering the details again");
  
        }
    }


    public static void array()
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = {0,0,0,0,0,0};
        int num;

        for(int i = 0; i < nums.length+1; ++i)
        {
            try
            {
                System.out.println("Enter an enterger");
                nums[i] = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Exception occured");
                sc.nextLine();

            }
        }
    }

    public static void arithmeticExceprion()
    {
        int x;
        Scanner sc = new Scanner(System.in);

        try
        {


        }
        catch(ArithmeticException arithmeticException)
        {

        }

    }

    public static void multipleExceptions()
    {
        int num1;
        int num2;
        double ans;
        Scanner sc = new Scanner(System.in);


        try{
            System.out.print("Enter num1 >> "); num1 = sc.nextInt();
            System.out.println("");
            System.out.print("Enter num2 >> "); num2 = sc.nextInt();
            ans = num1/num2;
            System.out.println("Answer is "+ans);


        }catch(InputMismatchException InputMismatchException)
        {
            System.out.println("InputMismatchException");
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("arithmetic exceprion");
        }

        //order matters, the most specific catches must be at the top and the most general at the botton, for a example catch(Exception) must be at the bottom
    
    }

    public static void usingFinally()
    {
        try{
              
        }
        catch(Exception e)
        {

        }
        finally
        {
            
        }
        

    }
    //finally is used to write code you want to happen even even an exception happens, the code happens before the excution closes


    public static void specifyExceptioninMethodHeader()//throws ArithmeticException
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num >> "); int num = sc.nextInt();
        int g = num/0;
    }


}

//A try catch only catch errors the accure during runtime but will not catch those that exist before runtime, syntax errors

