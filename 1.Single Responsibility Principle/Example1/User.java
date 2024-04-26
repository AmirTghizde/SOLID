public class User {
    private String firstname;
    private String surname;
    private String email;
    private String password;

    public User(String firstname, String surname, String email, String password) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void printInfoInConsole(){
        System.out.println("Firstname: " + firstname);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    public void sendEmail(String subject, String message) {
        // implementation code to send the email
        System.out.println("Email sent to " + email + ": " + subject + " - " + message);
    }

    public String generateProfilePictureUrl() {
        // implementation code to generate the profile picture URL
        return "https://example.com/profile/" + email + ".jpg";
    }
}
