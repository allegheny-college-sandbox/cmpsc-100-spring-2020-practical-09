package practicalnine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Performs an analysis of a list of words.
 *
 * @author Solutions Repository
 */
public class WordAnalysis {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) { 
    // Set up and load data source
    File file = null;
    Scanner fileInput = null;
    try {
      file = new File("inputs/common_words.csv");
      fileInput = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    // Read only a subset of the list - EXTRA CREDIT
    Scanner keyInput = new Scanner(System.in);
    System.out.print("Enter number of words to read (0 to read all): ");
    int limit = keyInput.nextInt();
    
    // Initialize integers used in loop
    int valueLen;
    int count = 0;
    int maxLen = 0;
    int totalLen = 0;
    
    // Initialize strings used in loop
    String value;
    String longestWord = new String();
    
    // Loop
    while (fileInput.hasNextLine()) {
      // Read value
      value = fileInput.nextLine();
      // Store value's length
      valueLen = value.length();
      // Compare to see if it's the longest
      if (valueLen > maxLen) {
        maxLen = valueLen;
        longestWord = value;
      }
      
      // Add to running total for average
      totalLen += valueLen;
      // Increment words seen
      count++;
      
      // Limit to subset of words - EXTRA CREDIT
      if (count == limit) {
        break;
      }
    }
    
    // Print data
    System.out.println("Total words read: " + count);
    System.out.println("The longest word is: " + longestWord 
                       + " (" + maxLen + ") letters long");
    System.out.print("The average word length is: " 
                       + totalLen / count + " letters");
  }
}