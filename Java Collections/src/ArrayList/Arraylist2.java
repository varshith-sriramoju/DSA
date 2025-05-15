package ArrayList;

import java.util.ArrayList;

class IntWrapper{
    public int num;
    public IntWrapper(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public int setNum(int num){
       return this.num=num;
    }
}
//Auto boxing/unboxing & boxing/unboxing
//boxing pri to wrapper unboxing is reverse
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(20); //autoboxing
        numList.add(200);
        numList.add(2000);
        System.out.println(numList.get(0)); //auto unboxing
        System.out.println(numList);

        ArrayList<IntWrapper> numList2 =new ArrayList<>();
        numList2.add(new IntWrapper(30)); //boxing
        System.out.println(numList2.get(0));  //unboxing
        System.out.println(numList2.get(0).getNum());  //unboxing
    }
}
