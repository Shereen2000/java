import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.text.Segment;

public class main {
    public static void main(String[] args) {


        

        // StringBuilder sb = new StringBuilder();
        // sb.append("Tumiso");
        // sb.append("Mokautu");
        // sb.replace(1,5,"XXX");
        // sb.reverse();
        // System.out.println(sb.toString());

        // char[] x = new char[]{
        //     'a','g'
        // };

        // CharSequence cs = new Segment(x,0,1);

        Collection<String> c = new LinkedList<>();
        c.add("Tumiso");
        c.add("Mokautu");

        c.forEach(item -> System.out.println(item));;
    

        Iterator<String> iter = c.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

    

    
        

        
    }
}

