import java.util.Scanner;
public class Main {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        // System.out.println("Enter a character to find its Occurence: ");
        // char ch = in.next().charAt(0);
        // System.out.println("Occurence of " + ch + " is: " + findOccurence(s, ch));
        // System.out.println("Enter the start and end points to find the Substring: ");
        // int start = in.nextInt();
        // int end = in.nextInt();
        // ReturnSubstring(s, start, end);
        // System.out.println("Enter a stirng pattern to check if string one contains it or not: ");
        // String pattern = in.nextLine();
        // if(hasPattern(s, pattern))
        //     System.out.println("yes....");
        // else
        //     System.out.println("No!!!!");
        // System.out.println("Enter a character to check whether each word contain it or not: ");
        // char character = in.next().charAt(0);
        // if(allWordsContainsChar(s, character))
        //     System.out.println("Yes....");
        // else
        //     System.out.println("NO.......");
        //reverseString(s);
        System.out.println("Reversed String: " + reverseString(s));
        System.out.println("Reversed Vowels String: " + reverseVowels(s));
        
    }
    public static int findOccurence(String s, char ch) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ch)
                count++;
        }
        return count;
    }
    
    public static void ReturnSubstring(String s, int start, int end) {
        for(int i = start-1; i < end; i++)
            System.out.print(s.charAt(i));
    }
    
    public static boolean hasPattern(String string, String pattern) {
        int stringLength = string.length();
        int patternLength = pattern.length();
        if(patternLength > stringLength)
            return false;
        else
        {
            for(int i = 0; i <= stringLength - patternLength; i++)
            {
                int j;
                for(j = 0; j < patternLength; j++)
                {
                    if(string.charAt(i+j) != pattern.charAt(j))
                        break;
                }
                if(j == patternLength)
                    return true;
            }
            return false;
        }
    }
    
    // public static boolean allWordsContainsChar(String s, char ch) {
    //     int n = s.length();
    //     char string[];
    //     string = s.toCharArray();
    //     boolean characterPresent = true;
    //     int lastIndex = 0;
    //     int firstIndex = 0; 
    //     for(int i = 0; i < n; i++)
    //     {
    //         if(string[i] == ' ')
    //         {
    //             lastIndex = i-1;
    //             //System.out.println(i);
    //             for(int j = firstIndex; j <= lastIndex; j++)
    //             {
    //                 if(string[j] == ch)
    //                   characterPresent = true; 
    //                 else
    //                 {
    //                     characterPresent = false;
    //                     break;
    //                 }    
                    
    //             }
    //             firstIndex = lastIndex +1;
                
    //         }
    //         else 
    //           characterPresent = false;
    //     }
    //     return characterPresent;
    // }
    public static String reverseString(String string)
    {
        int l = string.length();
        int middle = middle(l);
        char s[] = string.toCharArray();
        int i = 0;
        int last = l-1;
        while(i < l)
        {
            if(i == middle)
                break;
            swap(s, i, last);
            i++;
            last--;
        }
        String reversedString = new String(s);
        return reversedString;
    }
    public static String reverseVowels(String str){
        int l = str.length();
        char s[] = str.toCharArray();
        int left = 0;
        int right = l-1;
        
        while(left < right)
        {
            while(left < right && isVowel(s, left) == false)
                left++;
            while(left < right && isVowel(s, right) == false)
                right--;
            swap(s, left, right);
            left++;
            right--;
        }
        String reversedVowStr = new String(s);
        return reversedVowStr;
        
        
    }
    public static boolean isVowel(char s[], int k){
        if(s[k] == 'a' || s[k] == 'i' || s[k] == 'o' || s[k] == 'e' || s[k] == 'u' || s[k] == 'A' || s[k] == 'E' || s[k] == 'I' || s[k] == 'O' || s[k] == 'U')
            return true;
        return false;
    }
    public static int middle(int l){
        int middle;
        if(l % 2 == 0)
            return middle = l/2;
        else
            return middle = (l/2) + 1;
    }
    public static void swap(char s[], int i, int j)
    {
        char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
    }
}