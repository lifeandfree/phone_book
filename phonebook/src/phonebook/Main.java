/**
 * 
 */
package phonebook;

import java.util.ArrayList;
import phonebook.PhoneBookSet;

/**
 * @author lifeandfree
 *
 */
public class Main {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello Java");
		ArrayList<PhoneBookSet> phoneBookSets = new ArrayList<PhoneBookSet>();
		phoneBookSets.add(new PhoneBookSet(1, "Иванов", "+71234567890", "ivanov@abcde.com"));
		phoneBookSets.add(new PhoneBookSet(2, "Петров", "+70123456789", "petrov@abcde.com"));
		phoneBookSets.add(new PhoneBookSet(3, "Сидоров", "+72345678901", "sidorov@abcde.com"));
		phoneBookSets.add(new PhoneBookSet(4, "Марчук", "+73456789012", ""));
		phoneBookSets.add(new PhoneBookSet(5, "Маркова", "+74567890123", "markova@abcde.com"));
		System.out.println("NAME\tPHONE NUMBER\tEMAIL");
		for (int i = 0; i < phoneBookSets.size(); i++) {
			PhoneBookSet set = phoneBookSets.get(i);
			System.out.println(set.getSerialNumber() + "\t" + set.getName() + "\t" + set.getPhoneNumber() + "\t" + set.getEMail() );
			}
		}

}
