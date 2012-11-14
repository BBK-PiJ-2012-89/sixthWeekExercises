public class PhoneLauncher{
    public static void main(String[] args){
	    PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
	
	    MobilePhone myPhone = new SmartPhone("myPhone");
	    SmartPhone myGoodPhone = (SmartPhone) myPhone;
		

		myGoodPhone.call("0044999211558");		
		myGoodPhone.ringAlarm("Camptown Ladies");
		myPhone.printLastNumbers();
		myGoodPhone.playGame("Blast Monkeys");
		myGoodPhone.browseWeb("www.reddit.com");
		myGoodPhone.findPosition();
		myPhone.getBrand();

	}
}