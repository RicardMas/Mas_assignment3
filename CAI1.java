package mas_p1;

import java.security.SecureRandom;
import java.util.*;

public class CAI1 {

	   public static void main(String[] args) {
	   
	   quiz();
	   }
	  

	   public static void quiz()
	   {
	   
	   SecureRandom secureRandom = new SecureRandom();
	   int int1 = secureRandom.nextInt(10);
	   int int2 = secureRandom.nextInt(10);
	   int product = int1 * int2;
	   int input =-1;
	
	   	while(true)
	   	{
	   	  askQuestion(int1,int2);
	      input = readResponse();
	
	   		if (isAsnwerCorrect(product,input))
	   		{
	   		  displayCorrectResponse();
	   		  break;
	   		}
	   		else
	   		{
	   		  displayInorrectResponse();
	   		}
	  
	   	}
	  
	   }
	  
	   public static void askQuestion(int num1, int num2){
	   System.out.print("How much " + num1 + " times " + num2 + "? ");
	   }
	  
	   public static int readResponse(){
	   Scanner scan = new Scanner(System.in);
	   int answer = scan.nextInt();
	   return answer;
	   }
	  
	   public static boolean isAsnwerCorrect(int actualAnswer, int currentAnswer){
	   return actualAnswer == currentAnswer;
	   }
	  
	   public static void displayCorrectResponse(){
	   System.out.println("Very good!");
	   }
	  
	   public static void displayInorrectResponse(){
	   System.out.println("No. Please try again.");
	   }
	}