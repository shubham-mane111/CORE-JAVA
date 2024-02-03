// Q.   program to find greater between three numbers .

class GreaterNo1 {
   public static void main(String[] args) {
      int n1 = 3, n2 = 15, n3 = 8;
      if (n1 > n2) {
         if (n1 > n3) {
            System.out.println("Greatest Number is :" + n1);
         } else {
            System.out.println("Greatest Number is :" + n3);
         }
      } else if (n2 > n3) {
         System.out.println("Greatest Number is :" + n2);
      } else {
         System.out.println("Greatest Number is :" + n3);
      }

      // Second Way

      if (n1 > n2 && n1 > n3) {
         System.out.println("Greatest Number is :" + n1);
      } else if (n2 > n1 && n2 > n3) {
         System.out.println("Greatest Number is :" + n2);
      } else {
         System.out.println("Greatest Number is :" + n3);
      }

   }
}