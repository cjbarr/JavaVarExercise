public class JavaLoops {
    
    public static void main(String[] args) {
    //   prog1();
    //   prog2();
    //   prog3();
      prog4();
      prog5();
    
    }
     
    //Question 1: This loop puts out numbers 1-10
    public static void prog1(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    //Question 2: This loop puts out numbers 1-100 in increments of ten
    public static void prog2(){
        for (int i = 0; i <= 100; i+=10) {
        System.out.println(i);
         
      } 
    }

    //Question 3: This loop uses a do while loop to print numbers 1-10
    public static void prog3(){
        int i =1;
        do{System.out.println(i);
        i++;}
        while(i<=10);
    }

    //Question 4: This for loop loops through 1-100 printing out multiples of five, but does not print between 25-75
    public static void prog4(){
        System.out.println("PROG4");
        for(int i =1; i<=100; i++){
            if(i>25&&i<75){
                continue;
            }
            else if (i%5==0){
                System.out.println(i);
            }
        }

    }

    // Question 5: This for loop loops through 1-100 printing out multiples of five, break at 
    // but does not print between 25-75
    public static void prog5() {
        for (int i = 1; i <= 100; i++) {
            if(i>50){
                break;
            }
            else if (i % 5 == 0) {
                System.out.println(i);
            } 
        }

    }

    //Question 6: Nested for loops 



}


