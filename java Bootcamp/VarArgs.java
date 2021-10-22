import java.util.Arrays;

public class VarArgs {
    
    public static void main(String[] args){
     fun(2,4,56,87,45,65);
     multiple(2,3, "Mihir","Rana");
     demo(2,3,5,8,6,4);
     demo("Kunal","Rahul");
     //demo(); // Error it will not know which one to run
    }

    static void multiple(int a, int b,String ...v){
        System.out.println(a) ;
        System.out.println(b) ;
        System.out.println(Arrays.toString(v)) ;

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));


    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));


    }
}
