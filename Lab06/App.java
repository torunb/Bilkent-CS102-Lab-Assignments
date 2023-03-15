import java.io.*;

/**
 * This is recursion lab6
 * @author boran
 * @version 26.07.2021
 */ 
public class App 
{
    // main method
    public static void main( String[] args)
    {
        System.out.println(recursiveLength("Boran Torun")); // Question 1
        System.out.println();
        System.out.println(nonVowels("Find the number of non-vowels")); // Question 2
        System.out.println();
        stringToBinary(3,0,""); // Question 3
        System.out.println();

        // Question 4
        File newFile = new File("C:\\Windows\\Help");
        File[] files = newFile.listFiles();
        if(newFile.isDirectory())
        {
            System.out.println(numberOfFiles(files, 0));
        }
    }
    
    // question 1
    
    /**
     * This method finds the length of the string by recursion
     * @param str
     * @return recursiveLength(str.substring(0, str.length()-1)) + counter 
     */ 
    public static int recursiveLength( String str)
    {
        int counter = 0;
        // base case
        if( str.length() == 0)
        {
            return 0;
        }
        counter = counter + 1;
        // recursive part
        return recursiveLength(str.substring(0, str.length()-1)) + counter;
    }
    
    // question 2
    
    /**
     * This method finds the number of non-vowels in a string by using recursion
     * @param str
     * @return num of non-vowels 
     */ 
    public static int nonVowels(String str)
    {
        String nonVowels = "BbCcDdFfGgHhJjKkLlMmNnPpRrSsTtVvYyXxZzWwQq"; 
        if( str.length() == 0) // base case
        {
            return 0;
        }
        
        else if( str.length() == 1) // base case
        {
            if(nonVowels.contains(String.valueOf(str.charAt(0))))
            {
                return 1;
            }
            else
                return 0;
        }
        
        // recursive part
        else
        {
            if( nonVowels.contains(String.valueOf(str.charAt(0))))
            {
                return 1 + nonVowels(str.substring(1 , str.length()));
            }
            else
            {
                return 0 + nonVowels(str.substring(1 , str.length()));
            }
        }
    }
    
    // question 3
    
    /**
     * This method creates binaries without 1's together
     * @param n, digits, str
     * @return binaries
     */ 
    public static void stringToBinary(int n, int digits, String str)
    {
        //base case
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
        
        // recursive part
        stringToBinary((n - 1), 0, str + '0');
        if(digits == 0)
        {
            stringToBinary((n - 1), 1, str + '1');
        }
    }
    
    // question 4
    
    /**
     * This method finds number of files at a given path
     * @param files, i(index)
     * @return number of files
     */ 
    public static int numberOfFiles(File[] files, int i)
    {
        int directoryCounter = 0;
        int fileCounter = 0;
        
        //base condition
        if(i == files.length)
        {
            return 0;
        }
        if(files[i].isDirectory())
        {
            directoryCounter = numberOfFiles(files[i].listFiles(), 0);
        }
        if(files[i].isFile())
        {
            fileCounter = 1 + numberOfFiles(files, (i + 1));
        }
        else
        {
            fileCounter = numberOfFiles(files, (i + 1));
        }
        
        int counters = directoryCounter + fileCounter;
            
        return counters;
            
    }
}
