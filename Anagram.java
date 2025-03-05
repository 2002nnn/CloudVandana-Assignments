package assignmentcloudvandana;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\n", "").toLowerCase();
        str2 = str2.replaceAll("\\n", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.println("input: "+str1+","+str2);
        System.out.println( isAnagram(str1, str2));
        
    }
}



