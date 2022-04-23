import java.util.Scanner;

public class Cbseboardpertg {
     public static void main(String[] args)
     {
          // check that marks does not up to 100 
          float total = 0;
          try (Scanner input = new Scanner(System.in)) {
               System.out.println("Enter total marks per subject:");
               int total_marks= input.nextInt();
               System.out.println("Enter marks of Sub 1:");
               float s1 = input.nextFloat();
               total = total + s1;
               System.out.println("Enter marks of Sub 2:");
               float s2 = input.nextFloat();
               total = total + s2; 
               System.out.println("Enter marks of Sub 3:");
               float s3 = input.nextFloat();   
               total = total + s3;      
               System.out.println("Enter marks of Sub 4:");
               float s4 = input.nextFloat();  
               total = total + s4;  
               System.out.println("Enter marks of Sub 5:");
               float s5 = input.nextFloat();
               total = total + s5; 
               float grandtotal = total * 100 / (total_marks*5); 
               System.out.println("Percentage= " + grandtotal + " %");
          }    
     }

}
