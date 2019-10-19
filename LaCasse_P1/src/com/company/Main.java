package com.company;
import java.security.SecureRandom;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        int answer = 0;
        int userAnswer;
        int correct;
        int incorrect;
        int i = 0;
        int correctQuestions = 0;
        int incorrectQuestions = 0;
        int dificulty = 1;
        int type;
        int repeat = 1;
        String stringMath = "times";

        Scanner scnr = new Scanner(System.in);

        dificulty = challengeLevel(dificulty);



        System.out.println("Please select 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, and five for a random mixture.");
        type = scnr.nextInt();


 while(i < 10) {

     while (i < 10) {

     SecureRandom random = new SecureRandom();
     byte[] value = new byte[30];
     random.nextBytes(value);
     num1 = random.nextInt(dificulty);
     num2 = random.nextInt(dificulty);



    i++;
       questions(num1, num2, stringMath, dificulty);
       userAnswer = scnr.nextInt();


       double randomDouble = Math.random();
       randomDouble = 4 * randomDouble + 1;

       if (userAnswer == answer) {
           correctQuestions = correctQuestions + 1;
           correct = (int) randomDouble;
           correctResponse(correct);

       } else {
           incorrect = (int) randomDouble;
           incorrectQuestions = incorrectQuestions + 1;
           incorrectResponse(incorrect);
       }
   }//Question Loop


            //Correct Answers
                 if(i == 10){
         if(correctQuestions > 8){

             System.out.println("You got " + correctQuestions + "0%");
             System.out.println("You got " + correctQuestions + " correct and " + incorrectQuestions + " wrong");
             System.out.println("Congratulations, you are ready to go to the next level!");
         } else {
             System.out.println("You got " + correctQuestions + "0%");
             System.out.println("You got " + correctQuestions + " correct and " + incorrectQuestions + " wrong");
             System.out.println("Please ask your teacher for extra help.");
         }




         //New Session
         System.out.println("Do you wish to start a new session? Press 1 for yes and 0 for no.");
         repeat = scnr.nextInt();
         if(repeat == 1){
             i = 0;

             dificulty = challengeLevel(dificulty);

             System.out.println("Please select 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, and five for a random mixture.");
             type = scnr.nextInt();


         } else{
             System.out.println("Goodbye!");
                   }

                 }


        }
    }


    public static void questions(int num1, int num2, String stringMath, int dificulty) {

        System.out.println("How much is " + num1 + " " + stringMath +" " + num2 + "?");
    }


    public static void correctResponse(int correct){

        switch (correct) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    public static void incorrectResponse(int incorrect){

        switch (incorrect) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don’t give up!");
                break;
            case 4:
                System.out.println("No. Keep trying.");
                break;
        }

    }

    public static int challengeLevel(int dificulty){
        Scanner sr = new Scanner(System.in);

        System.out.println("Please select your dificulty from 1 to 4!");
        dificulty = sr.nextInt();
        switch (dificulty){
            case 1: dificulty = 10;
                break;
            case 2: dificulty = 100;
                break;
            case 3: dificulty = 1000;
                break;
            case 4: dificulty = 10000;
                break;
        }
        return dificulty;
    }
    public static int problemType(int answer, int num1, int num2, String stringMath, int type){

        switch (type){
            case 1: answer = num1 + num2;
                stringMath = "plus";
                break;
            case 2: answer = num1 * num2;
                stringMath = "times";
                break;
            case 3: answer = num1 - num2;
                stringMath = "minus";
                break;
            case 4: answer = num1 / num2;
                stringMath = "divided by";
                break;
        }
        return answer;
       // return stringMath;
    }
}

