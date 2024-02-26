//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
public class PRG11 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3=sc.nextInt();
        int average=(num1+num2+num3)/3;
        System.out.println("The average of three numbers is: "+average);

        




    
}
}

