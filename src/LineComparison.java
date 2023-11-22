import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Problem");
        Scanner sc=new Scanner(System.in);

        //Take 1st coordinate (x1,y1) as input

        //Taking 1st coordinate as input
        System.out.println("Enter the coordinates (x1,y1) of the line");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        //Taking 2nd coordinate as input
        System.out.println("Enter the coordinates (x2,y2) of the line");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        //Calculating and printing the length of line
        double length=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        System.out.println("The length of the line between two coordinates is: "+length);




        }

}