package arrayList.MobileApp;

public class Contacts {
    private String name;
    private String phoneNumber;
    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contacts createContacts(String name,String ph){
        return new Contacts(name,ph);
    }


}