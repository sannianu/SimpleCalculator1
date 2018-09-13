package simplecalculator;

/**
 *
 * @author WALIU
 */

import java.util.Scanner;
public class SimpleCalculator1 {
   
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        String  userChoice;
        int firstNum;
        int secondNum;
        double Answer;
        boolean quit= false;
        do{



            System.out.println(" 1. Operation (+)");
            System.out.println("2. Operation (-)");
            System.out.println("3. Operation (/)");
            System.out.println("4. Operation (*)");
            
            System.out.print(" Your Choice, 0 to quit: ");
            userChoice = input.next();
            
            
            
            switch ( userChoice)
            {
                case "+":
                    //addition
                    
                    System.out.print("+");
                    System.out.print("  Enter the first number :");
                    firstNum = input.nextInt();
                    System.out.print("  Enter the second number :");
                    secondNum = input.nextInt();
                   Answer = (firstNum + secondNum);
                   System.out.println("Answer"+   Answer); 
                   
                  break;

                  
                    case "-":
                    //subtraction
                    
                    System.out.print("-");
                    System.out.print("  Enter the first number :");
                    firstNum = input.nextInt();
                    System.out.print("  Enter the second number :");
                    secondNum = input.nextInt();
                    Answer = (firstNum - secondNum);
                    System.out.println("Answer"+   Answer); 
                   
                  break;                    
                    case "/":
                    //division
                    
                    System.out.print("/");
                    System.out.print("  Enter the first number :");
                    firstNum = input.nextInt();
                    System.out.print("  Enter the second number :");
                    secondNum = input.nextInt();
                   Answer = (firstNum / secondNum);
                   System.out.println("Answer"+   Answer); 
                   
                  break;
                  
                  case "*":
                    //multiplication
                    
                    System.out.print("*");
                    System.out.print("   Enter the first number :");
                    firstNum = input.nextInt();
                    System.out.print("  Enter the second number :");
                    secondNum = input.nextInt();
                   Answer = (firstNum * secondNum);
                   System.out.println("Answer"+   Answer); 
                   
                  break;
                  
                  
                    case "0":
                    System.out.print("Thanks for your time. Bye for now.");
                    quit = true;
                    break;
                default:
                    System.out.print("Not implemented yet, choose an operator ");
                    break;
            }
            
            System.out.println();
 }

        while( !quit ); 
}
}






