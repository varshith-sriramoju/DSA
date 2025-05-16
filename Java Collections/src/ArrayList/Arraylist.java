package ArrayList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> listName=new ArrayList<>(); //syntax
        listName.add("varsh");
        listName.add("abc");
        listName.add("asd");
        listName.add("asee");
        listName.add("qwww");
        System.out.println(listName); //print all elements
//       // System.out.println(listName[0]);  ERROR
//        for(String temp: listName){
//            System.out.println(temp);
//        }
        System.out.println("the first element is :"+listName.get(0)); //print separate
        System.out.println("the second element is :"+listName.get(1)); //print separate
        listName.remove(1); //remove by index
        listName.remove("varsh"); //remove by value
        System.out.println(listName);
        System.out.println(listName.set(2,"xyz")); //replace value
        System.out.println(listName);
        System.out.println(listName.indexOf("xyz")); //tells index

      }
}
