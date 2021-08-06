public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone phone1 = new Iphone("9", 98, "At&t", "default ringtone");
		
		phone1.displayInfo();
		
		
		Galaxy phone2 = new Galaxy("1", 50, "Sprint", "Daftpunk");
		
//		phone2.displayInfo();
		
		System.out.println(phone1.unlock());
//		System.out.println(phone2.unlock());
//		

	}

}