public class PhoneLauncher{
    public static void main(String[] args){
	    PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
	
	    MobilePhone myPhone = new SmartPhone("myPhone");
	    MobilePhone aPhone = new SmartPhone("LISTEN");

		myPhone.call("0044999211558");		
		myPhone.ringAlarm("Camptown Ladies");
		myPhone.printLastNumbers();
		myPhone.playGame("Blast Monkeys");
		myPhone.getBrand();
		(myPhone.testPhone(aPhone)).browseWeb("www.reddit.com");
		(myPhone.testPhone(aPhone)).findPosition();

	}
}