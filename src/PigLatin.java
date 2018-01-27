import java.util.Scanner;


public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String phrase;
		String letter = "y";
		
		
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println("\n");
		
		// calls the method transPl and makes every letter in the phrase lower case
		while(letter.equalsIgnoreCase("y")){
			System.out.println("Enter a line to be translated: ");
			System.out.println("\n");
			phrase = scan.nextLine();
			System.out.println(transPl(phrase).toLowerCase());
			System.out.println("would you like to continue? (y/n)");
			letter = scan.nextLine();
			
		}
		
		System.out.println("Goodbye");
	
	}
	// method takes the user word and if starts with a vowel will add way to the end. 
	//if it starts with a consonant it will call method plCon
	public static String transPl(String pl){
		char startLetter = pl.charAt(0);
		if(startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o' || startLetter == 'u'){
			pl = pl.concat("way");
		}
		else{
			pl = plCon(pl);
		}
		return pl;
	}
	//if word starts with consonant it will loop through each letter of the word until a vowel appears
	//once it finds it it will take the word and print from the vowel to the end adding the letters before the vowel 
	//to the end of the word and adding ay at the end
	public static String plCon(String con){
		int counter = 0;
		char startLetter = con.charAt(0);
		
		while(startLetter != 'a' && startLetter != 'e' && startLetter != 'i' && startLetter != 'o' && startLetter != 'u'){
			
			startLetter = con.charAt(counter);
			counter ++;
				
		}
		String start = con.substring(counter -1);
		String finish = con.substring(0, counter - 1);
		
		return start + finish + "ay";
}
	

}

			
		
		
		
		
		

		


