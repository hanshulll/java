import java.util.Scanner;
public class vowels{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Alphabet : ");
    String vowel = input.next();
    switch(vowel){
        case "a":System.out.println("Vowel");
        break;
        case "e":System.out.println("Vowel");
        break;
        case "i":System.out.println("Vowel");
        break;
        case "o":System.out.println("Vowel");
        break;
        case "u":System.out.println("Vowel");
        break;
        case "A":System.out.println("Vowel");
        break;
        case "E":System.out.println("Vowel");
        break;
        case "I":System.out.println("Vowel");
        break;
        case "O":System.out.println("Vowel");
        break;
        case "U":System.out.println("Vowel");
        break;
        
        default:System.out.println("Consonant");
    }
    
}}
