// Q get digit from last 

public class GetNoFromLast {
    public static void main(String[] args) {
        int no = 1234;
        // int rem;
        while (no != 0) {
            while (true) {
                int rem = no % 10;
                System.out.println(rem);
                break;
            }
            no = no / 10;
        }

    }
}
