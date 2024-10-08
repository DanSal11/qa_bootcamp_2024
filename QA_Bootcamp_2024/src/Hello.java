public class Hello {
    //psvm, sout
    public static void main(String[] args) {

//        int myFirstVariable = 100;
//        int mySecondVariable = 0;
//        final int MAX_SIZE = 10;
//        final double PI = Math.PI;
//
//        System.out.println("Hello world !");
//
//        System.out.println("Seconds variable value is " + mySecondVariable);
//
//        System.out.println(args[0] + args[1]);
//
//        int operandLeft = Integer.parseInt(args[0]);
//        int operandRight = Integer.parseInt(args[1]);
//
//        System.out.println(operandLeft + operandRight);
//        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//
//        String currentDay = "Monday";
//
//        switch (currentDay) {
//            case "Monday": {
//                System.out.println("Noo Monday!");
//                break;
//            }
//            case "Friday": {
//                System.out.println("Yeee Friday !!");
//                break;
//            }
//            default: {
//                System.out.println("Meeeh");
//            }
//        }
//
//        int currentNumber = 1;
//        while ((currentNumber <= MAX_SIZE)){
//            System.out.println("Current number is " + currentNumber);
//            currentNumber++;
//        }
//
//        for (int i = 0; i <= MAX_SIZE ; i++) {
//            System.out.println("Current number is " + i);
//        }
//
//        for (String arg: args){
//            System.out.println(arg);
//        }
//
//        for (int i = 2; i <= 1000000 ; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= i/2; j++) {
//                if(i % j == 0){
//                    isPrime = false;
//                }
//                if(isPrime) {
//                    System.out.println("Number " + i + " is prime.");
//                }
//            }
//        }

        //Tema
        // Display the number of days in month February from a year between 1900-2016 that is read from keyboard

        int year = Integer.parseInt(args[0]);

        if(year >= 1900 && year <= 2016){
            if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 != 0)){
                System.out.println("February has 29 days");
            }
            else{
                System.out.println("February has 28 days");
            }
        }
        else {
            System.out.println("The year is not in the range 1900-2016");
        }

    }
}
