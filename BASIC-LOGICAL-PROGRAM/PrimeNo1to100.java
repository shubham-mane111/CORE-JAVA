// Print Prime number from 1 to 100

public class PrimeNo1to100 {
    public static void main(String[] args) {
        int no;
        int count = 0;
        for (no = 1; no <= 100; no++) {
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    // System.out.println(no + " is NOT Prime");
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(no + " is Prime");
            }
            count = 0;
        }

    }
}
