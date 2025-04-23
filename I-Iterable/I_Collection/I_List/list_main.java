//DEALING WITH A --- LIST ---- INTERFACE

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection; // interface
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;  //interface

public class list_main {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        List<String> list = new ArrayList<>();

        // collection = list;           // no compilation error
        
        // list = collection;            // compilation error

        List<String> convertedList = new ArrayList<>(collection);  // to set a collection to a list you have to convert

    
        
        /*Methods
         * 
         *  List specific methods not in collection
         *      get(int index)
         *      set(int index, E element)
         *      add(int index. E elemet)
         *      remove(int index)
         *      indexOf(Object o)
         *      LastIndexOf(Object o)
         *      ListIterator()
         *      sublist(index fromIndex, int toIndex)  
         */

            //clear
            list.clear(); // removes all objects in a list

            //Add 
            list.add("apple");
            list.addAll(new LinkedList<String>(Arrays.asList(new String[]{"banana", "watermelon", "orange", "grapes", "kiwi", 
                "mango", "pineapple", "strawberry", "blueberry"}))); // takes a collection as parameter
            list.add(0,"Appricot");  // adds object at index of string

            //Remove
            list.remove(0);  //removes from list at index
            list.remove("banana"); // removes object from list
            list.removeAll(Arrays.asList(new String[]{"blueberry","mango"})); // accepts an collection and removes those items
            list.removeIf(n -> n.contains("apple")); //lambda expression as predicate

            //Size
            System.out.println("list Size: "+ list.size());

            //Contains
            System.out.println("list contains Apple? :"+list.contains("apple"));  // checks if a list contains an object
            System.out.println("list contains Blueberry & Kiwi? :"+list.containsAll(
                Arrays.asList(new String[]{"grapes","kiwi"})));  // checks if all items in collection are in the list

            //Iterator
            Iterator<String> iterator = list.iterator();  //returns an Iterable called iterator
            
            //Foreach
            list.forEach(item -> System.out.println(item)); //takes a lambda, replaces the for(item:list) loop
            list.forEach(item -> {if(item.length()==4)System.out.println("Fruit with length equal to 4 is: "+item);}); //using lambda

            //IsEmpty
            System.out.println("Is list empty: "+list.isEmpty());

            //IndexOf
            System.out.println("index of kiwi: "+list.indexOf("kiwi")); // returns index of item
            System.out.println("Last index of kiwi: "+list.lastIndexOf("kiwi")); // returns last index of item, if there is more than
                                                                                    // occurence of the item, it returns that index of the last occurence

            //Get
            System.out.println("Item at index = 0: "+list.get(0)); //returns item at index

            //Sort
            list.sort((a,b)-> a.length()-b.length()); //accending order
            list.sort((a,b)-> b.length()-a.length()); //descending order


            //sublits
            List<String> sublist = list.subList(0,3); //from index 0 take 3 elements
            System.out.println("sublist of list: "+sublist);

            



            
            




        

            
            



        

        
            
        

            System.out.println(list);


       

    }
}
