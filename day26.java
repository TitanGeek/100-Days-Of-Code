class Users {
    private String firstname;
    private String lastname;
    private String email;

    // Constructor with firstname and lastname
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = ""; // Default to an empty string or handle as needed
    }

    // Constructor with email
    public User(String email) {
        this.email = email;
        this.firstname = ""; // Default to an empty string or handle as needed
        this.lastname = ""; // Default to an empty string or handle as needed
    }

    // Constructor with firstname, lastname, and email
    public User(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    // Getter and Setter methods for firstname
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter and Setter methods for lastname
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getter and Setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Instantiate User objects using different constructors
        User user1 = new User("John", "Doe");
        User user2 = new User("john.doe@example.com");
        User user3 = new User("Jane", "Smith", "jane.smith@example.com");

        // Print User objects to see their states
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
