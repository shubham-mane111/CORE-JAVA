//Q program for reverse a string 

public class ReverseStr {
    public static void main(String[] args) {
        String s1 = "shubham";
        String s2 = "";
        int len = s1.length();
        for(int i=len-1 ; i>=0; i--)
        {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}
