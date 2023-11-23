import java.util.Scanner;


public class LineComparison {
    public static class Line implements Comparable<Line>
    {
        //Coordinates of Point A
       private double x1;
       private double y1;

       //Coordinates of Point B
        private double x2;
        private double y2;

        public double calculateLength()
        {
            return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        }

        public void printLength(double len)
        {
            System.out.println("The length of the line is "+len);
        }
        public Line(double x1,double y1,double x2,double y2)
        {
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }


        @Override
        public int compareTo(Line l) {

            double l1=this.calculateLength();
            double l2=l.calculateLength();

            return Double.compare(l1,l2);
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Problem");
        Scanner sc=new Scanner(System.in);

        //Taking 1st coordinate (x1,y1) as input
        System.out.println("Enter the coordinates (x1,y1) of 1st line");
        double x1=sc.nextInt();
        double y1=sc.nextInt();

        //Taking 2nd coordinate (x2,y2) as input
        System.out.println("Enter the coordinates (x2,y2) of 1st line");
        double x2=sc.nextInt();
        double y2=sc.nextInt();

        //Forming object of class Line
       Line l1=new Line(x1,y1,x2,y2);

       //Calculating and printing length of Line 1
       double len1= l1.calculateLength();
       l1.printLength(len1);

        System.out.println("Enter the coordinates of (x3,y3) of 2nd line");
        int x3=sc.nextInt();
        int y3=sc.nextInt();


        System.out.println("Enter the coordinates (x4,y4) of the 2nd line");
        int x4=sc.nextInt();
        int y4=sc.nextInt();

        //Calculating and printing length of Line 2
        Line l2=new Line(x3,y3,x4,y4);

        //Calculating and printing the length of second line
       double len2=l2.calculateLength();
       l2.printLength(len2);



        //Comparing both the lengths
        int result = l1.compareTo(l2);

        if (result < 0) {
            System.out.println("Line1 is smaller in length than Line2");
        } else if (result > 0) {
            System.out.println("Line1 is greater in length than Line2");
        } else {
            System.out.println("Line1 is equal in length to Line2");
        }





    }

}