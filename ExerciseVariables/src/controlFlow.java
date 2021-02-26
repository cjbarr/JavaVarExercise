import java.util.Scanner;

public class controlFlow {
    
    public static void main(String[] args) {
        prog1();
        prog2();
        prog3();
        prog4();
        prog5();
        prog6();
    
    }
        //Question 1
    public static void prog1(){
       int x = 7;
       if(x<10){
           System.out.println("X is less than 10");
       }
    }
    //Question 2
    public static void prog2() {
        int x = 15;
        if (x < 10) {
            System.out.println("X is less than 10");
        } else{
            System.out.println("X is greater than 10");
        }
    }

    //Question 3
    public static void prog3(){
        int x =50;
        if (x < 10) {
            System.out.println("X is less than 10");
        } 
        else if(10<x && x<20) {
            System.out.println("X is between 10 and 20");
        }
        else if (x>=20){
            System.out.println("X is greater than or equal to 20");
        }
    }

    //Question 4
    public static void prog4(){
        int x = 20;
        if(x<10 || x>20){
            System.out.println("Out of Range");
        }
        else if(x>=10 && x<=20){
            System.out.println("In range");
        }
    }

    //Question 5
    public static void prog5(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter score:");
        int x = input.nextInt();
        String grade = "";
        if(x>=90 && x<=100){
            grade = "A";
            System.out.println("Grade: " + grade);
        }
        else if (x >= 80 && x < 90) {
            grade = "B";
            System.out.println("Grade: " + grade);
        }
         else if(x>=70 && x<80){
            grade = "C";
            System.out.println("Grade: " + grade);
        }
       else if (x >= 60 && x < 70) {
            grade = "D";
            System.out.println("Grade: " + grade);
        }
        else if (x < 60) {
            grade = "F";
            System.out.println("Grade: "+ grade);
        }
        else{
            System.out.println("Score out of Range");
        }
  
    }

    //Question 6
    public static void prog6(){
        String weekDay="";
        Scanner dayScan = new Scanner(System.in);
        System.out.println("Enter number 1-7:");
        int x = dayScan.nextInt();
        if(x<1||x>7){
            System.out.println("Reenter a correct number");
            prog6();
        }
        else if(x>=1 && x<=7 ){
            switch (x){
                case 1: weekDay="Sunday";
                break;
                case 2:
                weekDay = "Monday";
                break;
                case 3:
                weekDay = "Tuesday";
                break;
                 case 4: weekDay="Wednesday";
                break;

                 case 5: weekDay="Thursday";
                break;

                 case 6: weekDay="Friday";
                break;

                case 7:
                weekDay = "Saturday";
                break;



            }
        }

        System.out.println(weekDay);
        dayScan.close();
    }

}


