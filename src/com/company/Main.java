package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner kbInput1 = new Scanner(System.in);
        Scanner kbInput2 = new Scanner(System.in);
        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);

        System.out.println("Would you like to add, subtract, multiply, or divide?");

        String userSignWord = kbInput1.next().toLowerCase();
        String soutWord = "bad";


        if (userSignWord.equals("add")){
            soutWord = "add";
        }

        else if (userSignWord.equals("subtract")){
            soutWord = "subtract";
        }
        else if (userSignWord.equals("multiply")){
            soutWord = "multiply";
        }
        else if (userSignWord.equals("divide")){
            soutWord = "divide";
        }
        else {
            System.out.println("Command not recognized, please enter a legal command");
            System.exit(0);
        }

        System.out.println("Please type your 2 numbers one at a time");

        double userFirstNumber = firstNumber.nextDouble();
        double userSecondNumber = secondNumber.nextDouble();
        double randNumber = Math.random();
        double userAnswer;
        String computerWord;

        if (soutWord.equals("add")){
            userAnswer = userFirstNumber / userSecondNumber * randNumber * 100;
            computerWord = "divided";
        }
        else if (soutWord.equals("subtract")){
            userAnswer = userFirstNumber * userSecondNumber + randNumber * 100;
            computerWord = "multiplied";
        }
        else  if (soutWord.equals("multiply")){
            userAnswer = userSecondNumber - userFirstNumber / randNumber * 100;
            computerWord = "subtracted";
        }
        else if (soutWord.equals("divide"));{
            userAnswer = userSecondNumber + userFirstNumber - randNumber * 100;
            computerWord = "added";
        }

        System.out.println(userFirstNumber + " " +  "and" + " " + userSecondNumber + " = " + userAnswer);
        System.out.println("Are you satisfied with your answer? enter yes or no");
        String userSatisfaction = kbInput1.next();
        String userSatisfactionGuess;

        if (userSatisfaction.equals("yes")){
            System.out.println("hah I didn't" + " " + soutWord + "" + " I " + computerWord + " take that epic games");
            System.exit(0);
        }
        else if (userSatisfaction.equals("no")){
            System.out.println("Can you guess what method I used?");
            userSatisfactionGuess =  kbInput2.next();

            if (userSatisfactionGuess.equals(soutWord)){
                System.out.println("woah you're the next bill gates, goodbye");
            }
            else {
                System.out.println("well you won't be getting a victory royale anytime soon! you were wrong");
            }
        }


















    }
}
