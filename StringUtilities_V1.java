class StringUtilities_V1
{
  public static void main (String []args)
  {
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
    while (true != false)
    {
      menu();
    }
  }
  
  public static void menu ()
  {
    String utilityChoice;
    utilityChoice = In.getString();
    try
    {
      utilityChoice = utilityChoice.trim();
      String[] commandFind = utilityChoice.split("\\s+");
      if (commandFind[0].contains("des"))
      {
        if (Integer.parseInt(commandFind[1]) == 1)
        {
          System.out.println("Count Letters\nCounts the total number of letters (no spaces, punctuation) in the statement(s).");
        }
        else if (Integer.parseInt(commandFind[1]) == 2)
        {
          System.out.println("Count Words\nCounts the total number of words in the statement(s).");
        }
        else if (Integer.parseInt(commandFind[1]) == 3)
        {
          System.out.println("Capitalize Every Word\nChanges the first letter of each word to uppercase.");
        }
        else if (Integer.parseInt(commandFind[1]) == 4)
        {
          System.out.println("Reverse Statement\nOutputs the statement(s) completely in reverse. The first character is now last, the last character is now first.");
        }
        else if (Integer.parseInt(commandFind[1]) == 5)
        {
          System.out.println("Reverse Letters\nOutputs the statement(s) so the words are in the correct order, but the letters from each word are reversed.");
        }
        else if (Integer.parseInt(commandFind[1]) == 6)
        {
          System.out.println("Reverse Words\nOutputs the statement(s) so the words are in the correct order, but the letters from each word are still in the correct order.");
        }
        else if (Integer.parseInt(commandFind[1]) == 7)
        {
          System.out.println("Alternate Case\nOutputs the statement so the first letter is uppercase, the 2nd is lowercase, the 3rd is uppercase, etc.");
        }
        else if (Integer.parseInt(commandFind[1]) == 8)
        {
          System.out.println("Letter Frequency\nAnalyzes the statement(s) to determine which letters are present, and outputs a summary of the count for each letter that's present.");
        }
        else if (Integer.parseInt(commandFind[1]) == 9)
        {
          System.out.println("Consonants vs Vowels\nAnalyses the statement(s) to determine the number of consonants and vowels in the word and determines the number of spaces and punctuation.");
        }
        else if (Integer.parseInt(commandFind[1]) == 10)
        {
          System.out.println("Letters Only\nDisplays the statement(s) with no spaces or punctuation.");
        }
        else if (Integer.parseInt(commandFind[1]) == 11)
        {
          System.out.println("Search\nFinds a letter or substring in the statement(s), then outputs the full statements indicating where the letter or substring may be found.");
        }
        else if (Integer.parseInt(commandFind[1]) == 12)
        {
          System.out.println("Search & Replace\nFinds a letter or substring and replace them with a new substring specified by the user.");
        }
        else
        {
          System.out.println("Invalid Number.");
        }
      }
      else if (commandFind[0].contains("list"))
      {
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
  
}
