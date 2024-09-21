import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


        public static void main(String[] args) {
            //Instance de BufferedReader and the IO class needed an special Exeption IO (IOException)
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String opc = "";

            try{

                while(!opc.equalsIgnoreCase("n")){
                    System.out.println("Do you Want to continue y/n");
                    opc = reader.readLine();

                    if(opc.equalsIgnoreCase("n")){
                        System.out.println("Exiting program");
                        break;
                    }

                    //An principal word to evaluete
                    System.out.println("Evaluate the word: ");
                    String wordToEvaluate = reader.readLine();

                    //LowercaseWord to compare
                    String lowerCaseWord = wordToEvaluate.toLowerCase();

                    //Reversed Word
                    String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();

                    //Evaluate if the word it's a palindrome or not
                    if(reversedWord.equals(lowerCaseWord)){
                        System.out.println("It's a palindrome \n");
                    }else{
                        System.out.println("It's not a palindrome \n");
                    }


                }
            }catch (IOException e) {
                System.out.println("An error occurred while reading input: " + e.getMessage());
            }

        }
}
