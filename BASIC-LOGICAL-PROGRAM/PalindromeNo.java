// Palindrome number

public class PalindromeNo {
    public static void main(String[] args) {
        int no = 121;
        int no1=no;
        int rev = 0;
        int rem;
        while(no1 != 0)
        {
            rem = no1%10;
            rev=rev*10+rem;
            no1=no1/10;
        }
        if(no==rev)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
