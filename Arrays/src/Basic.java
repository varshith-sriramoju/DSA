public class Basic {
    public static void main(String[] args) {

        //basic array initlization
        String[] s1={"one","two"};
        System.out.println(s1[1]);

        //array declaration and initlize with size
        String[] s2;
        s2=new String[10]; //[] means length of array
        s2[1]="Varshith";
        System.out.println(s2[2]); //java gives it null
        System.out.println(s2[1]);

        int[] i;
        i=new int[5];
        System.out.println(i[4]);  //java gives 0

        double[] d={1.1,2,3.666};
        System.out.println(d[1]);
        float[] f={1.1f,2.22f}; // 'f' madetory
        System.out.println(f[0]);

        String[] str={"abc","def","xyz","qwe"};
        for (String name:str){
            System.out.println(name);
        }
    }
}
