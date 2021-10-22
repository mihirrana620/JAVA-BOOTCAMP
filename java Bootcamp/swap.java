
public class swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

     //  swap(a,b);
       System.out.println(a + " " + b);

       String name = "Mihir Rana";
       changename(name);
       System.out.println(name);

       
    }
    
    static void changename(String naam) {
        naam = "Akshar Rana"; //creating a new object
    }

   //static void swap(int a, int b){
   //    
   //    int temp = a;
   //    a = b;
   //    b = temp;
   //   // This change will only be valid in this function scope only
   //}
}
