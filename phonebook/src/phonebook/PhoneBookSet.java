package phonebook;

public class PhoneBookSet {
	
	private String serialNumber;
	private String name;
	private String phoneNumber;
	private String eMail;
	
	// constructor
    public PhoneBookSet(String d, String a, String b, String c) {
    	
    	serialNumber = d;
        name = a;
        phoneNumber = b;
        eMail = c;
        }

    // getters
    public String getSerialNumber() {
        return serialNumber;
        }
    
    public String getName() {
        return name;
        }

    public String getPhoneNumber() {
        return phoneNumber;
        }

    public String getEMail() {
        return eMail;
        }

    // setters
    
    public void setSerialNumber(String d) {
    	serialNumber = d;
        }
    
    public void setName(String a) {
        name = a;
        }

    public void setPhoneNumber(String b) {
        phoneNumber = b;
        }

    public void setEMail(String c) {
        phoneNumber = c;
        }	
}
