public class OldPhone implements Phone{

    private String brand = null;
	public OldPhone(String brand){
	    this.brand = brand;
    } 
	
	public String getBrand(){
	    return brand;
	}
	
	public OldPhone(){
	}
	
	public void call(String number){
	    System.out.println("Now calling " + number + "...");
	}
	
}