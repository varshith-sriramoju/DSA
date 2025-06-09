package List;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.*;
import java.util.Collection;


public class Iterator1 {
    public static void main(String[] args) {
        List<String> l1=new LinkedList<>();
        l1.add("jhon");
        l1.add("mary");
        l1.add("david");
        l1.iterator();
        l1.sort(null);
        System.out.println("increasing order");
        System.out.println(l1);
        System.out.println("decreasing order");
        Collections.reverse(l1);
        System.out.println(l1);


    }
}
