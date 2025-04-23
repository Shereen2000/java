

public class String_Builder{
    public static void main(String[] args) {
        /**
         * String builder has a contructor that takes in the following arguments
         * 1) empty 
         * 2) String str
         * 3) int Capacity
         * 4) CharacterSequence seq
         */
        StringBuilder sb1  = new StringBuilder();

        StringBuilder sb2  = new StringBuilder(50);

        CharSequence cs = "Hello";
        StringBuilder sb3 = new StringBuilder(cs);

        StringBuilder sb4 = new StringBuilder("Hello, world!");
        

        sb1.append("Joseph"); 
     

        System.out.println(sb1);

        int y = 1;
        byte x = (byte)y;
     


    }
    
}
