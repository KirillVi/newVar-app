package by.itstep.oop.inh.task;

public class SuperClient extends Client {
    private String Private;

    public SuperClient(){
        this.setRole("Admin");

    }

    public String getPrivate() {
        return Private;
    }

    public void setPrivate(String aPrivate) {
        Private = aPrivate;
    }
}
