public class PhoneLauncher{
    public static void main(String[] args){
	    PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
	
	    SmartPhone galaxyS3 = new SmartPhone("dolomite");
		
		galaxyS3.call("07710912996");
		galaxyS3.call("07710912956");
		galaxyS3.call("077135912996");
		galaxyS3.call("074564561299");
		galaxyS3.call("999");
		galaxyS3.call("0044999211558");		
		galaxyS3.ringAlarm("Camptown Ladies");
		galaxyS3.printLastNumbers();
		galaxyS3.playGame("Blast Monkeys");
		galaxyS3.browseWeb("www.reddit.com");
		galaxyS3.findPosition();
		galaxyS3.getBrand();

	}
}