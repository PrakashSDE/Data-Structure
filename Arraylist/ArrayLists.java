import java.util.ArrayList;
import java.util.Collections;
 
class ArrayLists {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<String> list2 = new ArrayList<String>();
    
       //add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);
 
       //to get an element
       int element = list.get(0); // 0 is the index
       System.out.println(element);
 
       //add element in between
       list.add(1,20); // 1 is the index and 2 is the element to be added
       System.out.println(list);
 
       //set element
       list.set(4,0);
       System.out.println(list);
 
       //delete elements
       list.remove(0); // 0 is the index
       System.out.println(list);
 
       //size of list
       int size = list.size();
       System.out.println(size);
 
       //Loops on lists
       for(int i=0; i<list.size(); i++) {
           System.out.print(list.get(i) + " ");
       }
       System.out.println();
 
       //Sorting the list
       list.add(0);
       Collections.sort(list);
       System.out.println(list);


       
     //String operation in Arraylist
       list2.add("prakash");
       System.out.println(list2);
 
       list2.add(1,"java");
       System.out.println(list2);
       list2.add(2,"jvm");
       System.out.println(list2);

       list2.set(1,"JRE");
       System.out.println(list2);

       System.out.println("First element of the ArrayList: " +list2.get(0));
      
       String test = list2.get(1);
       System.out.println("the Second Element is:" +test);
 
       int test2 = list2.size();
       System.out.println(test2);

       Collections.sort(list2);
       System.out.println(list2);
 

   }
}
