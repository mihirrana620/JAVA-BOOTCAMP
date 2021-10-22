package leet_code;

class Static_var
{
    int var1;
    static int var2;
    public static void main(String[] args)
    {
        String s1 = "oop";
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);
        s1 = "java";
        System.out.println(s1);
        System.out.println(s2);
    }
}
    