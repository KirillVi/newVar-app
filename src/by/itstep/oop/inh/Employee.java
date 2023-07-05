package by.itstep.oop.inh;

public class Employee extends Person {
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    //прежде всего запускается конструктор базового класса, дабы обеспечить инициализацию полей
    public Employee(){
        super();
    }
public Employee(int id,String name, String LastName){

    //вызов суперкоструктора с пораметрами. Эта конструкция должна существовать с таки ми же параметрами
    super(id, name);
    this.setLastName(LastName);

}
public Employee(int id, String name, String LastName,char gender,long salary){
        super(id, name, LastName, gender);
        this.salary = salary;
}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", LastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", salary=" + salary +
                '}';
    }
}
