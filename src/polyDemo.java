public class polyDemo {
    public String userRegistration(long id, String email, String password) {
        return "Your details are as follows \nId: "+id+"\nEmail:"+email+"\nPassword: "+password;
    }

    public String userRegistration(Long id, String email, String password, String firstName, String lastName) {
        return "Your details are as follows \nId: "+id+"\nEmail:"+email+"\nPassword: "+password + "\nFirstname: "+firstName + "\nLastname "+lastName;
    }

    public void userRegistration(String email, String password) {
        if (email.equals("Sophia") && password.equals("Onyeka")) {
            System.out.println("congratulations on your wedding aniversary");
        }else {
            System.out.println("Not found");
        }
    }
}
