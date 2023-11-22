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

        //Calculating and printing the length of first line
        Double length1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

        System.out.println("The length of the first line : "+length1);

        System.out.println("Enter the coordinates of (x3,y3) of 2nd line");
        int x3=sc.nextInt();
        int y3=sc.nextInt();


        System.out.println("Enter the coordinates (x4,y4) of the line");
        int x4=sc.nextInt();
        int y4=sc.nextInt();

        //Calculating and printing the length of second line
        Double length2=Math.sqrt(Math.pow(x3-x4,2)+Math.pow(y3-y4,2));

        System.out.println("The length of the second line : "+length2);

        //Comparing both the lengths
        int result = length1.compareTo(length2);

        if (result < 0) {
            System.out.println("Line1 is smaller in length than Line2");
        } else if (result > 0) {
            System.out.println("Line1 is greater in length than Line2");
        } else {
            System.out.println("Line1 is equal in length to Line2");
        }





    }

}