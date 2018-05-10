package enterToDo;

public class trialPost {

	public static void main(String args[]){
		System.out.println("Testing adding addtional files to the repository");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println("They are the arguments passed to the main function in trialPost");
	}
	

	public  String display(){
		String name : "Rogger with his friend" ;
		return name + "is " + "Displaying TRIAL POST JUST FOR A TRIAL";
	}
	
}


// can add a normal java file which can have the main(), to the servlet and call the all the functions of the file inside 
//the servlet. The output shows up in the console . The servlet is displayed in the main window.
//To call the main(), from the servlet, a string array has to be created and passed to the call like eg 
//String[] array = {"this", "that"};
//tp.main(array);
//output again is found in the console
