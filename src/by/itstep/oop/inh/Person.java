package by.itstep.oop.inh;

public class Person {
    private int id;
    private String name;
    private String LastName;
    private char gender;

    //конструктор - единственный способ в джаве создать объект
    public Person(){
        System.out.println("person + 1");
        this.name = "Stranger";
    }
    //constructor using object fields
    public Person(int id,String name,String LastName, char gender){
        System.out.println("person + 1");
        this.id = id;
        this.name = name;
        this.LastName = LastName;
        this.gender = gender;
    }
    public Person(int id, String name){
        this(id, name, null,' ');
    }
    public Person(String LastName){
        this.LastName = LastName;


    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(134);
        p.setName("Garic");
        p.setLastName("Berber");
        p.setGender('m');

        System.out.println(p.toString());

        Employee e1 = new Employee();
        e1.setId(154);
        e1.setName("Poul");
        e1.setLastName("Biber");
        e1.setGender('m');
        e1.setSalary(200000);
        System.out.println(e1);
        Person p3 = new Person(55,"Robert","Lendon",'m');
        System.out.println(p3);

        Person p4 = new Person(32,"Ben");
        System.out.println(p4);
        Employee e2 =new Employee();
        System.out.println(e2);
        Employee e3 =new Employee(23,"Bob","Piderson",'f',20000);
        System.out.println(e3);
        Person s1 = new Student(22,"Ferd","Nerson",'m',56);
        System.out.println(s1);
        Person s2 = new Student(22,"Max","Belob");
        System.out.println(s2);





    }
}
