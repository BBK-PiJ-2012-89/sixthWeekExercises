public class MobilePhone extends OldPhone{
	private String[] calledNumbers;
	private int numberCounter = 0;
	private String alarmTone;
	private String number;
	
	public MobilePhone(){
	    this.calledNumbers = new String[100];
	}

	public String ringAlarm(String alarmTone){
	    this.alarmTone = alarmTone;
		System.out.println("Your alarm tone is now: " + alarmTone);
		return alarmTone;
	}
	
	@Override
	public void call(String number){
	    this.number = number;
	    System.out.println("Now calling " + number + "...");
		this.numberList(number);
	}
	

	public void numberList(String newNumber){
	    if(numberCounter == 0){
			calledNumbers[numberCounter] = number;
			numberCounter++;
		} else {
	        calledNumbers[numberCounter] = number;
		    numberCounter++;
		}
	}
	
	public void printLastNumbers(){
	    String numberList = "";
		int i = 0;
		if(numberCounter > 10){
		   i = numberCounter - 10;
		}
		
	    while( i < numberCounter){
		    numberList += calledNumbers[i] + " ";
			i++;
		}
		System.out.println("The numbers you have called are: " + numberList);
	}
	
	public void playGame(String theGame){
	    System.out.println("You are now playing " +theGame);
	}
}
	