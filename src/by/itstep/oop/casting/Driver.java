package by.itstep.oop.casting;

import by.itstep.oop.Cat;

import java.util.SortedMap;

public class Driver {

    private  char[] types;// 'A' , 'B'....

    public void drive(){
        System.out.println("driving....");
    }

    public void  shareDocs(){
        System.out.println("Sharing docs...." );
        for (char type : types){
            System.out.println(type);
        }

    }

    public char[] getTypes() {
        return types;
    }

    public void setTypes(char[] types) {
        this.types = types;
    }

    public Driver(char[] types) {
        this.types = types;
    }
}

class Programmer extends Driver{

    public Programmer(char[] types) {
        super(types);
    }
    public  void Code(){
        System.out.println("Coding....");
    }
}
class Student extends Driver{

    public Student(char[] types) {
        super(types);
    }
    public void Study(){
        System.out.println("Studying....");
    }
}
class Test{

    public static void testDriver(Driver driver){
        driver.shareDocs();
        driver.drive();
        if(driver instanceof  Programmer) {
            Programmer p = (Programmer) driver;
            p.Code();
        }else if (driver instanceof Student){
            Student s = (Student) driver;
            s.Study();
        }
    }

    public static void main(String[] args) {
        char[] types = {'A', 'B'};
        Driver d = new Driver(types);

        d.drive();
        d.shareDocs();

        char[] types2 = {'B'};
        Programmer p1 = new Programmer(types2);
        p1.drive();
        p1.Code();
        p1.drive();
        p1.shareDocs();

        //IS - A rel
        Driver d1 = p1;
        d1.drive();
        d1.shareDocs();

        Object o1 = p1;
        //o1.

        Object o2 = new int[5];
        //o2[2] = 44
        Object o3 = new Cat();
        Object o4 = 12;

        Programmer p10 = (Programmer)d1;
        p10.Code();

        //
        Driver d10 = new Programmer(types);
        //Student st10 = (Student) d10;
        //st10.Study();


        //Проверка класса
        if(d10 instanceof Student){
            Student st10 = (Student) d10;
            st10.Study();
        } else{
            System.out.println("d10 class is not a Student");
        }

//Проверка на совпедение класса с указанным. Проверка на вложенность отсутствует
        if(d10.getClass()== Student.class){
            Student st10 = (Student) d10;
            st10.Study();
        } else{
            System.out.println("d10 class is not a Student.class");
        }

        Triangle o100 = new Triangle(2,5,6);
        Shape sh100 =  o100;

        Object o200 = sh100;

        System.out.println(((Triangle)o200).getC());



        testDriver(p1);




    }
}
