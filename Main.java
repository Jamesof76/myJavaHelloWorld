public class Main {
	public static void main (String[] args){

		if(args.length > 0){	// check if arg exists	
						
			HelloWorld helloWorld = new HelloWorld(args[0]); // Create object with 1st arg
			helloWorld.setPhrase("Hello"); // set "Hello"
			System.out.println(helloWorld.getPhrase() + " " + helloWorld.getSubject()); // Concat Phrase and Subject and print output

		}else{
			System.out.println("Subject must be entered as first argument."); // Print info if no first arg
		}

	}
}
