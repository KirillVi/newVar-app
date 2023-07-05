package by.itstep.oop.inh.task;

public class Client {
    private int id;
    private String name;
    private String Email;
    private String pwd1;
    private String pwd2;
    private String role;

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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPwd1() {
        return pwd1;
    }

    public void setPwd1(String pwd1) {
        this.pwd1 = pwd1;
    }

    public String getPwd2() {
        return pwd2;
    }

    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Client() {
        this.role = "Default user";
    }

    public Client(int id, String name, String email, String pwd1, String pwd2, String role) {
        this.id = id;
        this.name = name;
        Email = email;
        this.pwd1 = pwd1;
        this.pwd2 = pwd2;
        this.role = role;
    }

    public Client(int id, String name, String Email) {
        this(id,name, Email,null,null,null);

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", pwd='*******'" +
                ", role='" + role + '\'' +
                '}';
    }
}
