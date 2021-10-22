

public class Shadowing {
    static int x = 90;
    public static void main(String[] args){
      System.out.println(x);  // 90
      int x ;  // declaring
      //System.out.println(x); // Scope will actually begin after initializing
      x = 40;   //intializing   // the class variable at line 4 is shadowed by this
      System.out.println(x);   // 40
      fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
