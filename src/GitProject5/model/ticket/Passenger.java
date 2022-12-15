package GitProject5.model.ticket;

public class Passenger {

    private String name;
    private String surname;
    private int age;
    private String passId;

    public Passenger(String name, String surname, String passId) {
        this.name = name;
        this.surname = surname;
        this.passId = passId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getPassId() {
        return passId;
    }


}
