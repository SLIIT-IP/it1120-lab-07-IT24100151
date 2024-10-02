import java.util.Scanner ;
   public class IT24100151Lab7Q1B {
   public static void main (String[] args) {

   Scanner scanner = new Scanner(System.in) ;
  
   for(int student = 1; student<=3; student++) {
      System.out.println("Student:" + student);

      System.out.println("Enter mrks for 4 subs (separated by spaces): ");
      int mark1 = scanner.nextInt();
      int mark2 = scanner.nextInt();
      int mark3 = scanner.nextInt();
      int mark4 = scanner.nextInt();

      double avg = (mark1+mark2+mark3+mark4)/4.0;

      System.out.println("Enter marks: "+mark1+" "+mark2+" "+mark3+" "+mark4);
      System.out.println("Average is: " + avg);
     
      if (avg>=75) {
      System.out.println("Overall Grade is: Distinction");
   } else if (avg>=50) {
       System.out.println("Overall Grade is: Credit");
   } else {
        System.out.println("Overall Grade is: Fail");
   } 
        
        System.out.println();
       }
   
   scanner.close();

   }
}
