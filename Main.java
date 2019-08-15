public class Main {
	public static void main (String[] args){

		if(args.length > 0){		
			HelloWorld helloWorld = new HelloWorld(args[0]);
			helloWorld.setPhrase("Hello");
			System.out.println(helloWorld.getPhrase() + " " + helloWorld.getNoun());
		}else{
			System.out.println("Please input your name as first argument");
		}

	}
}
