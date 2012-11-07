public class stringExtension extends String{
    private String newString;

	public stringExtension(String newString){
		this.newString = newString;
	}

	public void printEven(){
		int i = 0;
		while(i < newString.length()){
			if(i%2 == 0){
				System.out.println(stringExtension.charAt(i));
			}
			i++;
		}
	}
}