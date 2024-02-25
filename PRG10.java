//Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;
public class PRG10 {
    public static void main (String  []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius=sc.nextInt();
        double area=Math.PI*radius*radius;
        double perimeter=2*Math.PI*radius;
        System.out.println("area of circle is : "+area);
        System.out.println("permieter of circle is: "+perimeter);


        
        



    }
    
}
