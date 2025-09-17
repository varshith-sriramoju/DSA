package Stack;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> num=new Stack<>();
        num.push(22); //  index 0 element 5
        num.push(45); //element 4   index 1
        num.push(88); //element 3   index 2
        num.push(225); //element 2  index 3
        num.push(222); //element 1 as LIFO  index 4
        System.out.println(num);
        System.out.println("the first element is "+num.getFirst());
        System.out.println("the 0th element is "+num.get(0));
        System.out.println("the 1th element is "+num.get(1));
        System.out.println(num.isEmpty()); //method to test empty or not
        System.out.println("index at : "+num.search(22)); //return index
        System.out.println("index at : "+num.search(100)); //-1 if not found
        System.out.println(num.pop());
        System.out.println(num);

    }
}
