public class MethodCall {
    public static void main(String[] args) {

        //call by value
        int value=10;
        MethodCall m1=new MethodCall();
        m1.displayValue(value);
        System.out.println("value from main "+value);

        //call by reference
        String[] name={"ab","cd","ef,","zx"}; //this is used in ref of disRef()
        System.out.println(name); //[Ljava.lang.String;@1d81eb93 same address
        System.out.println(name[0]);
        MethodCall m2= new MethodCall();
        m2.disRef(name);      //[Ljava.lang.String;@1d81eb93 same address
        System.out.println("new value is "+name[0]);
    }
    //call by value
    void displayValue(int value){
        System.out.println("value is "+value);
        value=20;
        System.out.println("value is "+value);
    }

    //call by reference
    void disRef(String[] name){ //here string name is used the ref of main method sting
        System.out.println(name[0]);
        name[0]="xy";
    }
}
