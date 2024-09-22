package practice_03_string;

public class exchange_name {

	public static void main(String[] args) {
		// exchange_name is james to  james is name.
		
		//Write a Java Program to Exchange Name is James to James is Name?
		
		   // Input string
        String sentence = "Name is James";
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Rearrange the words to form "James is Name"
        String newSentence = words[2] + " " + words[1] + " " + words[0];
        
        // Output the new sentence
        System.out.println("Original: " + sentence);
        System.out.println("Exchanged: " + newSentence);
    }


	

}
