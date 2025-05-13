public class MethodCall {
    public static void main(String[] args) {
        int value=10;
        MethodCall m1=new MethodCall();
        m1.displayValue(value);
        System.out.println("value from main "+value);
    }
    void displayValue(int value){
        System.out.println("value is "+value);
        value=20;
        System.out.println("value is "+value);

    }
}
