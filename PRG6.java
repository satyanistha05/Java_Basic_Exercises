//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;
public class PRG6 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1=sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(num1*(i+1));
        }

        



     }
    
}
