package by.itstep.oop.casting;

import javax.print.attribute.standard.SheetCollate;

public class ShapesTester {
    public static void shapeTest(Shape shape){
        shape.calculateP();
        shape.calculateS();
        shape.print();
        shape.showInfo();



    }



    public static void main(String[] args) {
        Triangle t1 = new Triangle(11, 9, 6);
        t1.setColor("Red");
        t1.calculateP();
        t1.calculateS();
        t1.print();
        t1.showInfo();

        Rectangle r1 = new Rectangle(23, 32);
        r1.setColor("Red");
        r1.calculateP();
        r1.calculateS();
        r1.print();
        r1.showInfo();

        Circle c1 = new Circle(45);
        c1.setColor("Red");
        c1.calculateP();
        c1.calculateS();
        c1.print();
        c1.showInfo();

        //casting не меняет состояние объектов

        //upcasting(Конкретный объект рассматриваем ссылкой родительского класса), тем самым функционал конкретного класса становится недоступен
        Shape sh1 = new Triangle(3,7,6);

        //(<Super Type>) instance
        Shape sh2 = (Shape) new Rectangle(54,54);

        //DownCasting(всегда явная форма)(из более общего объекта в более конкретный)
        Shape sh3 = new Triangle(26,43,22);
        Triangle tr2 = (Triangle) sh3;
        tr2.setC(9);
        Rectangle rectangle = new Rectangle(22,22);
        Triangle triangle = new Triangle(4,5,19);

        shapeTest(rectangle);
        shapeTest(triangle);







    }
}
