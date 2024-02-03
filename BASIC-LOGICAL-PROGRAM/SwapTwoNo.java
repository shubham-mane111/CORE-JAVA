// Q Swap two number using third variable

public class SwapTwoNo {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c;
        c =a;
        a=b;
        b=c;
        System.out.println("a :"+a );
        System.out.println("b :"+b );

        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a :"+a );
        System.out.println("b :"+b );
    }
}
