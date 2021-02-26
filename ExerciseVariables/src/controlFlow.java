public class controlFlow {
    
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
    public static void main(String[] args) {
        prog1();
        prog2();
        prog3();
        prog4();
    }

}
