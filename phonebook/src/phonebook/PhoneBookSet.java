package phonebook;

public class PhoneBookSet {
	
	private int serialNumber;
	private String name;
	private String phoneNumber;
	private String eMail;
	
	// constructor
    public PhoneBookSet(int d, String a, String b, String c) {
    	
    	serialNumber = d;
        name = a;
        phoneNumber = b;
        eMail = c;
        }

    // getters
    public int getSerialNumber() {
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
    
    public void setSerialNumber(int d) {
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
