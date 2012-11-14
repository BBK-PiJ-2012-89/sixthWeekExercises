public class OldPhone implements Phone{
    private String brand;
	
	public OldPhone(String brand){
	    this.brand = brand;
    } 
	
	public String getBrand(){
	    System.out.println("The brand of your phone is: " + brand);
	    return brand;
	}
	
	public void call(String number){
	    System.out.println("Now calling " + number + "...");
	}
	
}