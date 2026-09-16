/*******************************
 * Name: Nicholas
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		System.out.println("Give me a plural noun: ");
		String pn1 = in.nextLine();
		System.out.println("Give me an adjective: ");
		String adj1 = in.nextLine();
		System.out.println("A recent survey informs us that one out of every "+pn1+" owns a/an "+adj1+" phone. ");
		
		System.out.println("Give me a verb: ");
		String vrb1 = in.nextLine();
		System.out.println("Give me a noun: ");
		String n1 = in.nextLine();
		System.out.println("Give me an adverb: ");
		String avrb1 = in.nextLine();
		System.out.println("Fortunately, "+vrb1+"ing over a mobile "+n1+" in recent years has improved "+avrb1+"");
		System.out.println("Give me a body part: ");
		String bp1 = in.nextLine();
		System.out.println("Give me another plural noun: ");
		String pn2 = in.nextLine();
		System.out.println("Today, "+bp1+"-held "+pn2+" are all the rage.");
		System.out.println("Give me another another plural noun: ");
		String pn3 = in.nextLine();
		System.out.println("Give me another adverb: ");
		String avrb2 = in.nextLine();
		System.out.println("Give me another adjective: ");
		String adj2 = in.nextLine();
		System.out.println("Give me another noun: ");
		String n2 = in.nextLine();
		System.out.println("In restaurants, you find many "+pn3+" talking "+avrb2+" into their "+adj2+" phones as they eat their "+n2+"");
		System.out.println("Give me your favorite number: ");
		String nr1 = in.nextLine();
		System.out.println("Give me another another another another plural noun: ");
		String pn4 = in.nextLine();
		System.out.println("Give me another another noun: ");
		String n3 = in.nextLine();
		System.out.println("Give an action you do when you play a sport: ");
		String vrb2 = in.nextLine();
		System.out.println("Give me place you stay a longtime in: ");
		String n4 = in.nextLine();
		System.out.println(""+nr1+" percent of American "+pn4+" place their "+n3+" calls from their cars as they are "+vrb2+"ing to and from their home, office, or "+n4+". ");
		System.out.println("Give me a good noun: ");
		String n5 = in.nextLine();
		System.out.println("Walking and talking are now the “in” "+n5+" to do. ");
		System.out.println("Give me a number: ");
		String n2 = in.nextLine();

		

		in.close();//Don't forget to clean up after yourselves!
	}

}
