package Vector;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> list=new Vector<>(5);
        System.out.println("intial capacity "+list.capacity()); //5
        list.add("zerothElement");
        list.add("aaaff");
        list.add("aaazx");
        list.add("aaadw");
        list.add("aasa");
        list.add("aas");
        System.out.println("the 0th element is "+list.get(0));
        System.out.println("exceeding capacity "+list.capacity()); //10
        System.out.println(list);
        list.add(0,"varsh");  // add by index
        System.out.println(list);
        System.out.println(list.get(0)); //varsh
        System.out.println(list.remove("aaagg"));
        System.out.println("after removing 1 element "+list);
        System.out.println(list.contains("varsh")); //True
        System.out.println("size is "+list.size()); //
        System.out.println(list.set(0,"varshi"));
        System.out.println(list);
        //System.out.println(list.clear());
    }
}
