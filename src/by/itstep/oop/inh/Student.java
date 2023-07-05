package by.itstep.oop.inh;

public class Student extends Person {
    private double avg;

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    public Student(int id, String name, String LastName,char gender,long avg){
        super(id, name, LastName, gender);
        this.setAvg(avg);
    }
    public Student(int id, String name, String LastName){
        super(id, name);
        this.setLastName(LastName);
    }
    public Student(String LastName,double avg){
        super(LastName);
        this.setAvg(avg);

    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", LastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", avg=" + avg +
                '}';
    }

}
