class User {
    // Fields
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String city;
    private String country;

    // Constructor
    public User(int id, String firstname, String lastname, String email, String city, String country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Method to get full name
    public String getFullname() {
        return firstname + " " + lastname;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a User object
        User user = new User(1, "John", "Doe", "john.doe@example.com", "New York", "USA");

        // Accessing User details using getters
        System.out.println("ID: " + user.getId());
        System.out.println("First Name: " + user.getFirstname());
        System.out.println("Last Name: " + user.getLastname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("City: " + user.getCity());
        System.out.println("Country: " + user.getCountry());

        // Getting full name
        System.out.println("Full Name: " + user.getFullname());

        // Modifying User details using setters
        user.setFirstname("Jane");
        user.setLastname("Smith");

        // Getting updated full name
        System.out.println("Updated Full Name: " + user.getFullname());
    }
}