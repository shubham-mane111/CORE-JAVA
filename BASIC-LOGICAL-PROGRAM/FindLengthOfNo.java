// Q Find Length of a number

public class FindLengthOfNo {
    public static void main(String[] args) {
        int no = 123789;
        int length = 0;
        while(no != 0)
        {
            no=no/10;
            length=length+1;
        }
        System.out.println(length);
    }
}
