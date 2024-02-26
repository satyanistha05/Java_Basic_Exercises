//Write a Java program to print the area and perimeter of a rectangle
import java.util.Scanner;
public class PRG12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length=sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth=sc.nextInt();
        int perimeter=2*(length+breadth);
        int area=length*breadth;
        System.out.println("The perimeter is: "+perimeter);
        System.out.println("The area is: "+area);
        

        
        
    }
}
