import java.math.BigInteger;

public class Employee {
    int id;
    private String firstname;
    private String lastname;
    private String club;
    private BigInteger contact;
    private String gender;

//    constructor

    public Employee(){}
    public Employee(int id, String firstname, String lastname, String club, BigInteger contact, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.club = club;
        this.contact = contact;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public BigInteger getContact() {
        return contact;
    }

    public void setContact(BigInteger contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", club='" + club + '\'' +
                ", contact=" + contact +
                ", gender='" + gender + '\'' +
                '}';
    }
}

