import javax.swing.text.Segment;

public class main {
    public static void main(String[] args) {
       
        int x  = 1;

        x += 5;

        System.out.println(x+ (x++)+x);

        char[] cArray = new char[]{'a','b','t'};

        CharSequence cs = new Segment(cArray, 0, 3);
        System.out.println(cs.toString());

        
        StringBuilder sb = new StringBuilder(cs);
        sb.append(cArray);
        

        System.out.println(sb.capacity());

        System.out.println(sb.toString());
        
    }
}



