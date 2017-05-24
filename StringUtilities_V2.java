class StringUtilities_V2
{
  public static void main (String []args)
  {
    utilList();
    while (true != false)
    {
      menu();
    }
  }
  
  // Method to print out the list of utilities for string manipulation
  public static void utilList () {
    System.out.println("Welcome to Nabeel, Yassine and Denzel's String Utility Program.\nSelect the utitlity you would like to use.\n");
    System.out.println("1: Count Letters");
    System.out.println("2: Count Words");
    System.out.println("3: Capitalize Every Word");
    System.out.println("4: Reverse Statement");
    System.out.println("5: Reverse Letters");
    System.out.println("6: Reverse Words");
    System.out.println("7: Alternate Case");
    System.out.println("8: Letter Frequency");
    System.out.println("9: Consonants vs Vowels");
    System.out.println("10: Letters Only");
    System.out.println("11: Search");
    System.out.println("12: Search & Replace");
    System.out.println("\nIf you want descriptions of these utilities, input \"des (number)\" for the description of a utility.");
    System.out.println("If you want to see the list again, input \"list\" for the list of utilites.");
  }
  
  public static void menu ()
  {
    System.out.println("Select a utility. Enter list for the list.");
    String utilityChoice;
    utilityChoice = In.getString();
    try
    {
      utilityChoice = utilityChoice.trim();
      String[] commandFind = utilityChoice.split("\\s+");
      if (commandFind[0].contains("des"))
      {
        descriptionShow(Integer.parseInt(commandFind[1])); 
      }
      else if (commandFind[0].contains("list"))
      {
        utilList();
      }
      else if (commandFind[0].matches("\\d+"))
      {
        utilitySelect(Integer.parseInt(commandFind[0]));
      }
      else
      {
        System.out.println("Invalid Command.");
      }
    }
    catch (Exception e)
    {
      System.out.println("Invalid choice, command or number.");
    }
    
  }
  
  public static void utilitySelect(int sel)
  {
    if (sel == 1)
    {
      // run count letters method
      countLetters(userInput());
    }
    else if (sel == 2)
    {
      // run count words method
      countWords(userInput());
    }
    else if (sel == 3)
    {
      // run capitalize every word method
      capitalizeWords(userInput());
    }
    else if (sel == 4)
    {
      // run reverse statement method
      reverseStatement(userInput());
    }
    else if (sel == 5)
    {
      // run reverse letters method
      reverseLetters(userInput());
    }
    else if (sel == 6)
    {
      // run reverse words method
      reverseWords(userInput());
    }
    else if (sel == 7)
    {
      // run alternate case method
      alternateCase(userInput());
    }
    else if (sel == 8)
    {
      // run letter frequency method
      letterFrequency(userInput());
    }
    else if (sel == 9)
    {
      // run consonants vs vowels method
      consOrVowel(userInput());
    }
    else if (sel == 10)
    {
      // run letters only method
      lettersOnly(userInput());
    }
    else if (sel == 11)
    {
      // run search method
      search(userInput());
    }
    else if (sel == 12)
    {
      // run search & replace method
      searchAndReplace(userInput());
    }
  }
  
  public static void descriptionShow(int des)
  {
    if (des == 1)
    {
      System.out.println("Count Letters\nCounts the total number of letters (no spaces, punctuation) in the statement(s).");
    }
    else if (des == 2)
    {
      System.out.println("Count Words\nCounts the total number of words in the statement(s).");
    }
    else if (des == 3)
    {
      System.out.println("Capitalize Every Word\nChanges the first letter of each word to uppercase.");
    }
    else if (des == 4)
    {
      System.out.println("Reverse Statement\nOutputs the statement(s) completely in reverse. The first character is now last, the last character is now first.");
    }
    else if (des == 5)
    {
      System.out.println("Reverse Letters\nOutputs the statement(s) so the words are in the correct order, but the letters from each word are reversed.");
    }
    else if (des == 6)
    {
      System.out.println("Reverse Words\nOutputs the statement(s) so the words are in the correct order, but the letters from each word are still in the correct order.");
    }
    else if (des == 7)
    {
      System.out.println("Alternate Case\nOutputs the statement so the first letter is uppercase, the 2nd is lowercase, the 3rd is uppercase, etc.");
    }
    else if (des == 8)
    {
      System.out.println("Letter Frequency\nAnalyzes the statement(s) to determine which letters are present, and outputs a summary of the count for each letter that's present.");
    }
    else if (des == 9)
    {
      System.out.println("Consonants vs Vowels\nAnalyses the statement(s) to determine the number of consonants and vowels in the word and determines the number of spaces and punctuation.");
    }
    else if (des == 10)
    {
      System.out.println("Letters Only\nDisplays the statement(s) with no spaces or punctuation.");
    }
    else if (des == 11)
    {
      System.out.println("Search\nFinds a letter or substring in the statement(s), then outputs the full statements indicating where the letter or substring may be found.");
    }
    else if (des == 12)
    {
      System.out.println("Search & Replace\nFinds a letter or substring and replace them with a new substring specified by the user.");
    }
    else
    {
      System.out.println("Invalid Number.");
    }
  }
  
  // Method to search for a users input
  public static String userInput () {
    String userInput;
    
    System.out.println("Enter your statemement.");
    userInput = In.getString();
    
    return userInput.trim();
  }
  
  // Method to count letters in a string (excluding spaces and punctuation) (Completed, Yassine)
  public static void countLetters (String userInput) {
    System.out.println("Running count letters utility...");
    userInput = userInput.trim(); // Trimming the entered input
    userInput = userInput.replaceAll("\\W+",""); // "\\W" takes out anything that is not a word character including punctuation.
    System.out.println ("The statement is " + userInput.length() + " characters without spaces or punctuation.\n");
  }
  
  // Method to count words in a string (Compeleted, Denzel)
  public static void countWords (String userInput) {
      int wordCount = 0;
      System.out.println("Running count words utility...");
      String[] wordCounter = userInput.split("\\s+");
      for (int c = 0; c <= wordCounter.length - 1; c++)
      {
        if (wordCounter[c].matches("[a-zA-Z]{2,}|[aA]{1}|[a-zA-Z]{2,}[!.()-&]"))
        {
          wordCount++; 
        }
      }
      System.out.println("This String contains " + wordCount + " possible words.");
  
  
  }
  
  // Method to capitalize all words in a string (Completed, Yassine)
  public static void capitalizeWords (String userInput) {
    String [] userStatement = userInput.split("\\s"); //the statement will only split when there's a space because of "\\s"
    userInput = "";
    for (int i=0; i<userStatement.length; i++){ //For loop created to read the length of each word in the statement.
    char capLetter = Character.toUpperCase(userStatement[i].charAt(0)); // giving capLetter the function of capitalizing the first letter of a word.
    userInput+=" "+ capLetter + userStatement[i].substring(1); //This will look at the length of each word
    }
    userInput = userInput.trim();
    System.out.print(userInput+"\n");
  }
  
  // Method to reverse the statement entirely (Completed, Yassine)
  public static void reverseStatement (String userInput) {
     String inputReversed;
    inputReversed = "";
    for (int i=(userInput.length()-1); i>=0; i--) {
      inputReversed = inputReversed+userInput.charAt(i); //Appending inputReversed with userInput so there can be an output.
    }
    System.out.println (inputReversed); //Outputs the reversed statement
  }
  
  // Method to reverse the letters in each word entirely but keep the words in the right order (Completed, Nabeel)
  public static void reverseLetters (String userInput) {
    int arrayLength = userInput.split("\\W").length; // Integer for the number of words that are in the statement
    System.out.println("The reversed letters in each word for the statement would be.");
    for (int i=0; i<arrayLength; i++) {
      for (int x=(userInput.split("\\W")[i].length() - 1); x>=0; x--) {
        System.out.print(userInput.split("\\W")[i].charAt(x)); // Prints the character at index x of string, goes from back to front to reverse it
        // This can also be done by using .substring method to print out each letter.
      }
      System.out.print(" "); // After reversing every letter in the word, adds a space for the next word
    }
    System.out.println("\n\n");
  }
  
  // Method to reverse the words in each statement but keep the words' letters in the right order (Completed, Nabeel)
  public static void reverseWords (String userInput) {
    int arrayLength = userInput.split("\\W").length; // Integer for the number of words that are in the statement
    System.out.println("The reversed words for the statement would be.");
    for (int i=(arrayLength - 1); i>=0; i--) {
      System.out.print(userInput.split("\\W")[i]);
      System.out.print(" "); // After reversing a word, adds a space for the next word
    }
    System.out.println("\n\n");
  }
  
  // Method to capitalize every 2nd letter, alternate casing ex.HeLlO (Completed, Nabeel)
  public static void alternateCase (String userInput) {
    int arrayLength = userInput.split("\\W").length; // Integer for the number of words that are in the statement
    for (int i=0; i<userInput.length(); i++) {
      if (userInput.charAt(i) >= 97 && userInput.charAt(i) <= 122 || userInput.charAt(i) >= 65 && userInput.charAt(i) <= 90) {
        if ((i%2)==0) {
          System.out.print(userInput.substring(i,i+1).toUpperCase());
        }
        else {
          System.out.print(userInput.substring(i,i+1));
        }
      }
      else {
        System.out.print(userInput.substring(i,i+1));
      }
    }
      System.out.println("\n"); // Printing blank lines
  }
  
  // Method to analyze the statement and output the number of times a letter is a present (Completed, Nabeel)
  public static void letterFrequency (String userInput) {
    int lowerLetterFreq[] = new int[26]; // Array of ints for the number of times a lowercase letter is seen (0=a,...,etc)
    int upperLetterFreq[] = new int[26]; // Array of ints for the number of times an uppercase letter is seen (0=A,...,etc)
    // For loop for uppercase letters with selection statements to find freq
    for (int i=0; i<userInput.length(); i++) {
      if (userInput.charAt(i) == 65) {
        upperLetterFreq[0]++;
      }
      else if (userInput.charAt(i) == 66) {
        upperLetterFreq[1]++;
      }
      else if (userInput.charAt(i) == 67) {
        upperLetterFreq[2]++;
      }
      else if (userInput.charAt(i) == 68) {
        upperLetterFreq[3]++;
      }
      else if (userInput.charAt(i) == 69) {
        upperLetterFreq[4]++;
      }
      else if (userInput.charAt(i) == 70) {
        upperLetterFreq[5]++;
      }
      else if (userInput.charAt(i) == 71) {
        upperLetterFreq[6]++;
      }
      else if (userInput.charAt(i) == 72) {
        upperLetterFreq[7]++;
      }
      else if (userInput.charAt(i) == 73) {
        upperLetterFreq[8]++;
      }
      else if (userInput.charAt(i) == 74) {
        upperLetterFreq[9]++;
      }
      else if (userInput.charAt(i) == 75) {
        upperLetterFreq[10]++;
      }
      else if (userInput.charAt(i) == 76) {
        upperLetterFreq[11]++;
      }
      else if (userInput.charAt(i) == 77) {
        upperLetterFreq[12]++;
      }
      else if (userInput.charAt(i) == 78) {
        upperLetterFreq[13]++;
      }
      else if (userInput.charAt(i) == 79) {
        upperLetterFreq[14]++;
      }
      else if (userInput.charAt(i) == 80) {
        upperLetterFreq[15]++;
      }
      else if (userInput.charAt(i) == 81) {
        upperLetterFreq[16]++;
      }
      else if (userInput.charAt(i) == 82) {
        upperLetterFreq[17]++;
      }
      else if (userInput.charAt(i) == 83) {
        upperLetterFreq[18]++;
      }
      else if (userInput.charAt(i) == 84) {
        upperLetterFreq[19]++;
      }
      else if (userInput.charAt(i) == 85) {
        upperLetterFreq[20]++;
      }
      else if (userInput.charAt(i) == 86) {
        upperLetterFreq[21]++;
      }
      else if (userInput.charAt(i) == 87) {
        upperLetterFreq[22]++;
      }
      else if (userInput.charAt(i) == 88) {
        upperLetterFreq[23]++;
      }
      else if (userInput.charAt(i) == 89) {
        upperLetterFreq[24]++;
      }
      else if (userInput.charAt(i) == 90) {
        upperLetterFreq[25]++;
      }
    }
    // For loop for lowercase letters with selection statements to find freq
    for (int i=0; i<userInput.length(); i++) {
      if (userInput.charAt(i) == 97) {
        lowerLetterFreq[0]++;
      }
      else if (userInput.charAt(i) == 98) {
        lowerLetterFreq[1]++;
      }
      else if (userInput.charAt(i) == 99) {
        lowerLetterFreq[2]++;
      }
      else if (userInput.charAt(i) == 100) {
        lowerLetterFreq[3]++;
      }
      else if (userInput.charAt(i) == 101) {
        lowerLetterFreq[4]++;
      }
      else if (userInput.charAt(i) == 102) {
        lowerLetterFreq[5]++;
      }
      else if (userInput.charAt(i) == 103) {
        lowerLetterFreq[6]++;
      }
      else if (userInput.charAt(i) == 104) {
        lowerLetterFreq[7]++;
      }
      else if (userInput.charAt(i) == 105) {
        lowerLetterFreq[8]++;
      }
      else if (userInput.charAt(i) == 106) {
        lowerLetterFreq[9]++;
      }
      else if (userInput.charAt(i) == 107) {
        lowerLetterFreq[10]++;
      }
      else if (userInput.charAt(i) == 108) {
        lowerLetterFreq[11]++;
      }
      else if (userInput.charAt(i) == 109) {
        lowerLetterFreq[12]++;
      }
      else if (userInput.charAt(i) == 110) {
        lowerLetterFreq[13]++;
      }
      else if (userInput.charAt(i) == 111) {
        lowerLetterFreq[14]++;
      }
      else if (userInput.charAt(i) == 112) {
        lowerLetterFreq[15]++;
      }
      else if (userInput.charAt(i) == 113) {
        lowerLetterFreq[16]++;
      }
      else if (userInput.charAt(i) == 114) {
        lowerLetterFreq[17]++;
      }
      else if (userInput.charAt(i) == 115) {
        lowerLetterFreq[18]++;
      }
      else if (userInput.charAt(i) == 116) {
        lowerLetterFreq[19]++;
      }
      else if (userInput.charAt(i) == 117) {
        lowerLetterFreq[20]++;
      }
      else if (userInput.charAt(i) == (118)) {
        lowerLetterFreq[21]++;
      }
      else if (userInput.charAt(i) == 119) {
        lowerLetterFreq[22]++;
      }
      else if (userInput.charAt(i) == 120) {
        lowerLetterFreq[23]++;
      }
      else if (userInput.charAt(i) == 121) {
        lowerLetterFreq[24]++;
      }
      else if (userInput.charAt(i) == 122) {
        lowerLetterFreq[25]++;
      }
    }
    char upperCase = 65; // char variable to print out which characters are present (upperCase letters)
    char lowerCase = 97; // char variable to print out which characters are present (lowerCase letters)
    System.out.printf("%-10s%s%n", "Letter", "Number of times present"); // Printf to print the headers of the table
    for (int i=0; i<26; i++) { // Loop that outputs the frequency of upperCase letters
      if (upperLetterFreq[i]>0) {
        System.out.printf("%-10c%d%n", upperCase + i, upperLetterFreq[i]);
      }
    }
    for (int i=0; i<26; i++) { // Loop that outputs the frequency of lowerCase letters
      if (lowerLetterFreq[i]>0) {
        System.out.printf("%-10c%d%n", lowerCase + i, lowerLetterFreq[i]);
      }
    }
    
    
  }
  
  // Method to analyze the statement and determine how many consonants and how many vowels there are (Completed, Denzel)
  public static void consOrVowel (String userInput) {
    int spaceCount = 0;
    int punCount = 0;
    int consCount = 0;
    int vowelsCount = 0;
    for (int i = 0; i <= userInput.length() - 1; i++)
    {
      if (userInput.substring(i,i+1).matches("\\s+"))
      {
        spaceCount++;
      }
      else if (userInput.substring(i,i+1).matches("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]"))
      {
        consCount++;
      }
      else if (userInput.substring(i,i+1).matches("[AEIOU]||[aeiou]"))
      {
        vowelsCount++;
      }
      else if (userInput.substring(i,i+1).matches("['():,-_!.?\"';/*@~#]"))
      {
        punCount++;
      }
    }
    
    System.out.println("Spaces Found: " + spaceCount);
    System.out.println("Punctuation Found: " + punCount);
    System.out.println("Consonants Found: " + consCount);
    System.out.println("Vowels Found: " + vowelsCount);

  
  
  
  }
  
  // Method to display the inputted statement whithout any spaces or punctuation. (Completed, Yassine)
  public static void lettersOnly (String userInput) {
        String userStatement;
    
        userStatement = userInput.replaceAll("\\W+",""); // "\\W" takes out anything that is not a word character
      // including punctuation.
      System.out.println ("Statement is: "+userStatement.length()+" characters without spaces or punctuation.");
  }
  
  // Method to find a specific letter or substring and output the full statement, indicating where that specific substring is (Completed, Denzel)
  public static void search (String userInput) {
    String searchFor;
    String foundPlaces = "";
    int foundSub = -1;
    System.out.println("What would you like to find in the subsring?");
    searchFor = In.getString();
    foundSub = userInput.indexOf(searchFor);
    
    if (foundSub > -1)
    {
      System.out.println("An \"~\" was marked at the correct location(s).");
      String[] splitFound = userInput.split(searchFor);
      for (int c = 0; c <= splitFound.length - 1; c++)
      {
          foundPlaces = foundPlaces.concat(splitFound[c] + searchFor + "~ ");
          foundPlaces = foundPlaces.trim();
      }  
      foundPlaces = foundPlaces.substring(0,(foundPlaces.length() - (searchFor.length() + 1)));
      System.out.println(foundPlaces);
    }
    else
    {
      System.out.println(searchFor + " was not found.");
    }
  }
  
  // Method to find a specific letter or substring and replace it with the a desired input and print out the statement with what was replaced (Completed, Denzel)
  public static void searchAndReplace (String userInput) {
    String searchFor;
    String replaceWith;
    String newStatement;
    System.out.println("What would you like to find in the string?");
    searchFor = In.getString();
    System.out.println("What would you like to replace it with?");
    replaceWith = In.getString();
    newStatement = userInput.replaceAll(searchFor,replaceWith);
    
    if (userInput.equals(newStatement))
    {
      System.out.println("\"" + searchFor + "\" was not found." );
    }
    else
    {
      System.out.println("Old Statement: " + userInput);
      System.out.println("New Statement: " + newStatement + "\n");
    }
    
  }
}
