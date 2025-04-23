import java.util.Arrays;
import java.util.stream.Stream;
import org.apache.commons.collections4.ListUtils;

public class main {
    
    public static void main(String[] args)
    {

        Integer[] numbers = {1,2,5,5,6,};
        String[] pupils = null;

        //  Stream.of(numbers, pupils)
        //       .forEach(arr -> System.out.println(arr == null ? "null" : arr.length));

        
       

List<String> myList = null; // or some list

List<String> safeList = ListUtils.emptyIfNull(myList);

        
    }
}
