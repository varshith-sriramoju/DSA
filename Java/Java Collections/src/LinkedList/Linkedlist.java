package LinkedList;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("varshi");
        names.add("lmop");
        names.add("hijk");
        names.add("efdg");
        names.add("abcd");
        //System.out.println(names[0]); ERROR
        System.out.println(names);
        System.out.println(names.indexOf("varshi"));
        names.add(0,"sriramoju"); //not within SOP
        System.out.println(names);
        names.set(2,"Varshith");
        System.out.println(names);
        names.remove(3);


    }
}
