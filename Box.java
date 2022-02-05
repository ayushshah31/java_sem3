class Box {
    void area(double length , double breadth)
    {
        System.out.println("Area of Rectangle: " + length*breadth);
    }
    void area(double length )
    {
        System.out.println("Area of Square: " + length*length);
    }
    public static void main(String[] args) {
        //System.out.println("Hello, Ayush here!");
        Box obj = new Box();
        obj.area(5,10);
        obj.area(5);
    }
}

