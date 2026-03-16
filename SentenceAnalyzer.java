/**
   SentenceAnalyzer.java      

   This program analyzes and provides statistics of a given sentence. 

   @Author: Caitlin Duquette

   @Version: 03/06/2026
**/


//import necessary classes
import java.util.Scanner;
import java.util.StringTokenizer;


public class SentenceAnalyzer
{
   public static void main (String[] args)
   {


      // Declare variables
      String sentence;
      String letter;
      int letterNum = 0; // # of times
      int shortWords = 0; // 1 - 4 letters
      int medWords = 0; // 5 - 7 letters
      int lrgWords = 0; // 8+ words
      final int SHORT = 4; // limit for short words 
      final int MED = 7; // limit for medium words 
      String word;
      int wordLength;
      
      
  
    
      // Create the Scanner object for input
      Scanner input = new Scanner(System.in);
    
    
      // Display the program's purpose or introduction
      System.out.println("THE SENTENCE ANALYZER"); 
      System.out.println("This program will analyze any sentence you input. ");
      System.out.println("You will receive statistics about your sentence. ");
      System.out.println();


      // Prompt the user to enter a sentence and store in a variable
      System.out.print("Please enter a sentence: ");
      sentence = input.nextLine();
    

      // Initialize a String Tokenizer object with string sentence
      StringTokenizer tokenizer = new StringTokenizer(sentence);


      //Prompt the user to enter a character and store in a variable
      System.out.print("Please enter a letter (case sensitive): ");
      letter = input.nextLine();
      
      
      final int WORDS = tokenizer.countTokens(); // Determine how many words are in the sentence
      final int CHARACTERS = sentence.length(); // Determine how many characters are in the sentence


      // (LOOP) Analyze each token (word) in the string
      while (tokenizer.hasMoreTokens())
      {
          word = tokenizer.nextToken();
          wordLength = word.length();
              
              if (word.contains(letter)) // counts if the word contains the character selected by user
              {
                  letterNum++; 
              }

            
              if (wordLength <= SHORT) // counts if the word is a short word (1-4 characters)
              {
                  shortWords++;
              } 

            
              if (wordLength <= MED) // counts if the word is a medium word (5-7 characters)
              {
                  medWords++;
              }

            
              else // counts if the word is a long word (8 or more characters)
              {
                 lrgWords++; 
              }
      
      }
      
      
      // Display sentence statistics
      System.out.println("Here are statistics on your sentence: ");
      System.out.println();
      
      System.out.println("\tYour sentence contains a total of " + WORDS + " words and " + CHARACTERS + " characters, including spaces and punctuation." );
      System.out.println("\tNumber of words containing the letter '" + letter + "': " + letterNum); 
      System.out.println(); 
      System.out.println("\tNumber of short words (1-4 letters): " + shortWords);  
      System.out.println("\tNumber of medium words (5-7 letters): " + medWords);  
      System.out.println("\tNumber of long words (8 or more letters): " + lrgWords); 
    
       
    } 
}
