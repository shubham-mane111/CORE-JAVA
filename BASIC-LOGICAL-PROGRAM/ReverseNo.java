//Program for reverse a number

public class ReverseNo {
    public static void main(String[] args) {
        int no = 12345678;
        int rev = 0;
        int rem;
        while(no != 0)
        {
            rem = no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
    }
}
