public class constructor {

    private int id;
    private String firstname;
    private String lasttname;
    private int age;

    public constructor(int id, String fname, String lname, int age) {
        this.id = id;
        this.firstname = fname;
        this.lasttname = lname;
        this.age = age;
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


    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public String getLasttname() {
        return lasttname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "constructor{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lasttname='" + lasttname + '\'' +
                ", age=" + age +
                '}';
    }
}
