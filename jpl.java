import java.util.*;

// // program 1
// class Test <T> {
//     T obj;
    
//     Test(T obj){this.obj = obj ;}

//     public T getobj(){return obj;}
// }

// class Main{
//     public static void main(String[] args) {
//         Test<Integer> obj1 = new Test<Integer>(15) ;
//         System.out.println(obj1.getobj());

//         Test<String> obj2 = new Test<String>("Hello World");
//         System.out.println(obj2.getobj());
//     }
// }

// // program2
// class Test <T1,T2> {
//     T1 obj1;
//     T2 obj2;

//     Test(T1 obj1,T2 obj2){
//         this.obj1 = obj1 ;
//         this.obj2 = obj2;
//     }

//     void print(){
//         System.out.println(obj1 + " "+obj2);
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Test<Integer,String> obj1 = new Test<Integer,String>(15,"Hello World") ;
//        obj1.print();

//         // Test<String> obj2 = new Test<String>("Hello World");
//         // System.out.println(obj2.getobj());
//     }
// }

// Program3

// class Test{
//     static <T> void genericDisplay(T element){
//         System.out.println(element.getClass().getName()+ " = " + element);
//     }
//     public static void main(String[] args) {
//       genericDisplay(11);  
//       genericDisplay("Geeks For Geeks");
//     }
// }

// // Program4

class Test{
    public static void main(String[] args) {
        List<String> slist = new ArrayList<String>();
        slist.add("Hi");
        slist.add(" my");
        slist.add(" name");
        slist.add(" is");
        slist.add(" Ayush \t\t\t\t\t\t\t");

        System.out.println("Element at position/Index 1: " + slist.get(1));

        Iterator<String> i=slist.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next());
        }
    }
}

// Program 5:

abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class GenericTest{
    public static void drawShapes(List <? extends Shape> list){
        for(Shape s:list){
            s.draw();
        }
    }
    public static void main(String[] args) {
        List<Rectangle>list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle>list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}