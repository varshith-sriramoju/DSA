package ArrayList;
import java.util.ArrayList;
public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList<Double>();
        list.add(Double.valueOf(26.33)); //auto boxing
        System.out.println(list);
        System.out.println(list.get(0).doubleValue()); //unboxing
    }
}
