public class BusinessContact extends Contact {
    private String phoneNumber;

    public BusinessContact(String name, String emailAddress, String phoneNumber) {
        super(name, emailAddress);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", Phone Number=" + getPhoneNumber());
    }
}
