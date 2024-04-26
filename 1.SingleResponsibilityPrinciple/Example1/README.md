Okay let's say we have this simple user class which is supposed to hold user data.



    public class User { 
     
    private String firstname;  
    private String surname;  
    private String email;  
    private String password;  
      
    // getters, setters and constructors  
    }

The SRP suggests that the User class should have only one reason to change. In this case, the User class should be responsible for managing user information such as name, email, and password.

Now what if we wanted to add a way to print this info in console?