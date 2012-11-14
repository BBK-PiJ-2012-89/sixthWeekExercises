public class SmartPhone extends MobilePhone{
    private String position = "0238738478, 34728934729384";
	private String brand;

    public SmartPhone(String brand){
	    super(brand);
	}
	
	@Override
	public void call(String number){
	    if(number.charAt(0) == '0' && number.charAt(1) == '0'){
		    System.out.println("Calling " + number + " throught the internet to save money");
		} else {
		    super.call(number);
		}
	}
	
    public void browseWeb(String Address){
	    System.out.println("Now searching for " + Address);
	}
	
	public String findPosition(){
	    System.out.println("Your location is " + position);
	    return position;
	}

}