public class University{
    public static void main(String[] args){
        University launcher = new University();
        launcher.launch();
    }	
    public void launch(){

    	Lecturer mrBrodie = new Lecturer("Charlie Brodie");

    	mrBrodie.getName();
    	mrBrodie.teach("Advanced Female Anatomy");
    	mrBrodie.doResearch("Female Anatomy");

    }

}