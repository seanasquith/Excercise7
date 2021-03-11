public class Contact {
    private String name;
    private String emailAddress;

    public Contact(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void display() {
        System.out.print("Contact Info: " +
                "Name=" + getName() +
                ", Email Address=" + getEmailAddress());
    }
}
