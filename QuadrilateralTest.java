import java.text.DecimalFormat;


 class Point {
   private double x;
   private double y;

   Point()
   {
       x=0;
       y=0;
   }

   public Point(double x, double y) {
       this.x = x;
       this.y = y;
   }


   public double getX() {
       return x;
   }


   public void setX(double x) {
       this.x = x;
   }


   public double getY() {
       return y;
   }


   public void setY(double y) {
       this.y = y;
   }


   @Override
   public String toString() {
       return "(" + x + "," + y + ")";
   }

}


// Quadrilateral.java

class Quadrilateral extends Point{
   private Point p1;
   private Point p2;
   private Point p3;
   private Point p4;

   public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3,
           double x4, double y4) {
       this.p1 = new Point(x1, y1);
       this.p2 = new Point(x2, y2);
       this.p3 = new Point(x3, y3);
       this.p4 = new Point(x4, y4);
   }
  
   public Point getP1() {
       return p1;
   }

   public void setP1(Point p1) {
       this.p1 = p1;
   }

   public Point getP2() {
       return p2;
   }

   public void setP2(Point p2) {
       this.p2 = p2;
   }

   public Point getP3() {
       return p3;
   }

   public void setP3(Point p3) {
       this.p3 = p3;
   }

   public Point getP4() {
       return p4;
   }

   public void setP4(Point p4) {
       this.p4 = p4;
   }

   @Override
   public String toString() {
       return p1 + ", " + p2 + ", " + p3 + ", " + p4;
   }

}


class Rectangle extends Quadrilateral {
private double width;
private double height;
  
   public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3,
           double x4, double y4) {
       super(x1, y1, x2, y2, x3, y3, x4, y4);
       width = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2)
               + Math.pow((getP2().getY() - getP1().getY()), 2));
       height = Math.sqrt(Math.pow((getP4().getX() - getP1().getX()), 2)
               + Math.pow((getP4().getY() - getP1().getY()), 2));
   }


   public double area() {
      
       return width*height;
   }
   @Override
   public String toString() {
       // DecimalFormat class is used to format the output
               DecimalFormat df = new DecimalFormat(".0");
              
       return "\nCoordinates of Rectangle are:\n" + super.toString()
               + "\nWidth is :" + df.format(width) + "\nHeight is :" + df.format(height)
               + "\nArea is :" + df.format(area());
   }


}



 class Square extends Quadrilateral {

   private double side;

   public Square(double x1, double y1, double x2, double y2, double x3, double y3,
           double x4, double y4) {
       super(x1, y1, x2, y2, x3, y3, x4, y4);
       side = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2)
               + Math.pow((getP2().getY() - getP1().getY()), 2));
   }


   public double area() {

       return 4 * side;
   }

   @Override
   public String toString() {
       // DecimalFormat class is used to format the output
       DecimalFormat df = new DecimalFormat(".0");
       return "\nCoordinates of Square are:\n" + super.toString()
               + "\nSide is :" + df.format(side)+"\nArea is :" + df.format(area());
   }

}


// Parallelogram.java


 class Parallelogram extends Quadrilateral {
   private double width;
   private double height;

   public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3,
           double x4, double y4) {
       super(x1, y1, x2, y2, x3, y3, x4, y4);
       width = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2)
               + Math.pow((getP2().getY() - getP1().getY()), 2));
       height = Math.sqrt(Math.pow((getP4().getX() - getP1().getX()), 2)
               + Math.pow((getP4().getY() - getP1().getY()), 2));
   }

   public double area() {

       return width * height;
   }

   @Override
   public String toString() {
       // DecimalFormat class is used to format the output
       DecimalFormat df = new DecimalFormat(".0");
       return "\nCoordinates of Parallelogram are:\n" + super.toString()
               + "\nWidth is :" + df.format(width) + "\nHeight is :" + df.format(height)
               + "\nArea is :" + df.format(area());
   }

}
// QuadrilateralTest.java

class QuadrilateralTest {
public static void main(String[] args) {
// NOTE: All coordinates are assumed to form the proper shapes
// A quadrilateral is a four-sided polygon
Quadrilateral quadrilateral =
new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);

// A parallelogram is a quadrilateral with opposite sides parallel
Parallelogram parallelogram =
new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);

// A rectangle is an equiangular parallelogram
Rectangle rectangle =
new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);

// A square is an equiangular and equilateral parallelogram
Square square =
new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);

System.out.printf(
"%s %s %s %s\n", quadrilateral, parallelogram,
rectangle, square);
}}