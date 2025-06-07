package List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        LinkedList<String> list1=new LinkedList<>();
        list1.add("otis");
        list1.add("rubt");
        list1.add("mavae");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("professor");
        list2.add("Raquel");
        list2.add("Berlin");

        System.out.println(list1);
        System.out.println(list2);

        List1 l1=new List1();
        l1.printList(list1);
        l1.printList(list2);

    }
    void printList(List<String> list){
        for(String i: list){
            System.out.println(i);
        }
    }
}
