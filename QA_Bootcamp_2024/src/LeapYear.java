//Tema
// Display the number of days in month February from a year between 1900-2016 that is read from keyboard

public class LeapYear {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        if(year >= 1900 && year <= 2016){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("February has 29 days in the year " + year);
            }
            else{
                System.out.println("February has 28 days in the year " + year);
            }
        }
        else {
            System.out.println("The year " + year + " is not in the range 1900-2016");
        }
    }
}
