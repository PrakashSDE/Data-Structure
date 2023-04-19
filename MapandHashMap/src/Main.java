import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> Emp = new HashMap<>();
        Emp.put(1,"Prakash Khatua");
        Emp.put(2,"Rahul Das");
        Emp.put(3,"Subrata Mondal");
        Emp.put(4,"Arindom Kheto");
        System.out.println(Emp);

        System.out.println(Emp.containsKey(3));
        System.out.println(Emp.containsKey(5));

        System.out.println(Emp.containsValue("Prakash Khatua"));
        System.out.println(Emp.containsValue("Hash Table"));

        System.out.println(Emp.get(3));
        System.out.println(Emp.size());
        System.out.println(Emp.clone());
        System.out.println(Emp.entrySet());
    }
}