import java.io.Console;
import java.io.FileInputStream;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.Thread;

public class exception_handling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println
        (   "choose which method to run\n"+
            "a) try_catch\n"+
            "b) try_catch_finally\n"+
            "c) multiple_catch\n"+
            "d) nested_try_catch\n"+
            "e) unchecked_exception\n"+
            "f) HandleUncheckedException\n"+
            "g) HandleCheckedException\n"+
            "h) LowBalanceException\n"+
            "i) throwsException\n"+
            "j) tryWithResources\n"

        );
        var input = sc.next();

        switch (input) {
            case "a":
                try_catch();
                break;
            case"b":
                try_catch_finally();
                break;
            case "c":
                multiple_catch();
                break;
            case "d":
                nested_try_catch();
                break;
            case "e":
                unchecked_exception();
                break;
            case "f":
                HandleUncheckedException();
                break;
            case "g":
                HandleCheckedException();
                break;
            case "h":
                try 
                {
                    int balance = 500;
                    if(balance < 1000) throw new LowBalanceException();
                }
                catch(LowBalanceException e)
                {
                    System.out.println(e);
                }
                break;
            case "i":
                try
                {
                    thowsException();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                break;
            case "j":
                tryWithResources();
                break;
                      
            default:
                break;
        }
    }


/* a) _________________________________________________________________________________ */
    public static void try_catch()
    {
        try
        {
            String[] students = {"Tumiso", "Pitso", "George"};

            for(int i = 0; i <= students.length; i++)
            {
                System.out.println(students[i]);
            }

        }
        catch(RuntimeException e)
        {   
            System.out.println(e.getMessage());
        }

    }

/* b) _________________________________________________________________________________ */
    public static void try_catch_finally()
    {
         
        String[] students = {"Tumiso", "Pitso", "George"};

        int j = students.length;

        try
            {
    
                for(int i = 0; j <= students.length; i++)
                {
                    System.out.println(students[i]);
                }

    
    
            }
            catch(RuntimeException e)
            {   
                System.out.println(e.getMessage());
            }
            finally
            {
               System.out.println("finally done");
               j -= 1;
              
            }
    }

    /* c) _________________________________________________________________________________ */
    
        public  static void multiple_catch()
        {
         
            int[] numbers = {10,0,5,3};

            try
            {
                    double result = numbers[0] / numbers[1];
                    System.out.println("result: " + result);

                    System.out.println(numbers[4]);

            }catch(ArithmeticException e)
            {   
                System.out.println("ArithmeticException: " + e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
            

        }
    
/* d) _________________________________________________________________________________ */ 
    
    public static void nested_try_catch()
    {
        int[] numbers = {10,0,5,3};

        try
        {
            double result = numbers[0] / numbers[1];
            System.out.println("result: " + result);

                try
                {
                    System.out.println(numbers[4]);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
                }   

        }catch(ArithmeticException e)
        {   
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

/* e) _________________________________________________________________________________ */

    public static void unchecked_exception()
    {
        System.out.println(10/0);  //This is an unchecked exception because you don't need to handle it
    }

/* f) _________________________________________________________________________________ */
    public static void HandleUncheckedException()
    {
        try
        {
            System.out.println(10/0);  //This is an unchecked exception because you don't need to handle it
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }

/* g _________________________________________________________________________________ */
    public static void HandleCheckedException()
    {
       //FileInputStream fi  = new FileInputStream("file.txt"); //This is a checked exception because you need to handle it


    }

/* i _________________________________________________________________________________ */
    public static void thowsException() throws Exception
    {
            throw new Exception("This is a checked exception");
            //This exception will be handled by the caller method, in this case main method
    }

    public static void tryWithResources()
    {
        try (FileInputStream fis = new FileInputStream("file.txt"))
        {
            throw new RuntimeException();
            //Do something with the file
        }
        catch (Exception e)
        {
            System.out.println("x");

        }
     
    }

}   

/* j _________________________________________________________________________________ */
 
    

/* h _________________________________________________________________________________ */
class LowBalanceException extends Exception
{
    //This is a checked exception because you need to handle it
    //Why is it a checked exception?
        //Because it is a subclass of Exception and not RuntimeException

    public String toString()
    {
        return "Blance should not be less than 1000";
    }
   
}













