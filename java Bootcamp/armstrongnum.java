public class armstrongnum {
    public static void main(String[] args) {
       // boolean ans = isArmstrong(153);
       // System.out.println(ans);

       for(int i = 100; i<= 999 ; i++){
           boolean ans2 = isArmstrong(i);
           boolean s  = true;
           if(ans2 == s){
               System.out.println(i);
           }
       }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n =n /10;
            sum = sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }else{
            return false;
        }
    }
    
}
