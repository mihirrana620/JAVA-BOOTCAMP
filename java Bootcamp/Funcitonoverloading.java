public class Funcitonoverloading {
    public static void main(String[] args) {
        fun(5);
        fun("Mihir");
        int ans  = sum(1,2,3) ;
        System.out.println(ans);
        //int ans2 = sum(1,2);
        System.out.println(sum(1,2));
    }
    
    static int sum(int a,int b,int c){
        return a + b + c;
    }

    static int sum(int a,int b){
        return a + b ;
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
    
}
