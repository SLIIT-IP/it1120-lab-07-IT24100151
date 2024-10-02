import java.util.Scanner ;
   public class IT24100151Lab7Q1A {
   public static void main (String[] args) {

   Scanner scanner = new Scanner(System.in) ;
   
   int mrk1, mrk2, mrk3, mrk4;
   double avg;

   System.out.println("Enter mrks for 4 subs: ");
   
   System.out.print("Enter sub Mark 1:  ");
   mrk1 = scanner.nextInt();
   System.out.print("Enter sub Mark 2:  ");
   mrk2 = scanner.nextInt();
   System.out.print("Enter sub Mark 3:  ");
   mrk3 = scanner.nextInt();
   System.out.print("Enter sub Mark 4:  ");
   mrk4 = scanner.nextInt();

   avg = (mrk1+mrk2+mrk3+mrk4)/4.0;
   System.out.println("Average is: " + avg);

   if (avg>=75) {
      System.out.println("Overall Grade is: Distinction");
   } else if (avg>=50) {
       System.out.println("Overall Grade is: Credit");
   } else {
        System.out.println("Overall Grade is: Fail");
   }
   
   scanner.close();

   }
}
 
     

   
 
  