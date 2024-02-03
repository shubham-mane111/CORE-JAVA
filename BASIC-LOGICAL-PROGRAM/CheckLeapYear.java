// Q program for leap Check Leap Year
//   There are Two Conditions :--
//    1] year is divisible by 400;
//    2] year is divisible by 4 but not divisible by 100

public class CheckLeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if((year%400 == 0) || ((year%4==0) &&(year%100 !=0)))
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
