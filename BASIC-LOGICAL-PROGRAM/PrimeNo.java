// Q check number is prime or not

public class PrimeNo {
    public static void main(String[] args) {
        int no = 271;
        int count=0;
        for(int i=2 ; i<no; i++)
        {
            if(no%i==0)
            {
                System.out.println(no + " is NOT Prime");
                count++;
                break;
            }
        }
        if(count==0)
        {
          System.out.println(no + " is Prime");
        }
    }
}
