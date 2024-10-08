public class JavaMethods {

    public static void main(String[] args) {
        System.out.println("Heelo 2!");

        float myFloat = myFirstMethod(50,70);
        System.out.println(myFloat);
        System.out.println("Number is odd ? " + isOddNumber(100));
        printMessage(100);

        drewFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("------------------");
        drewShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("------------------");
        drewShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("------------------");

        drewFullShape(Integer.parseInt(args[0]));
        System.out.println("------------------");
        drewShapeOutline(Integer.parseInt(args[0]));
        System.out.println("------------------");
        drewShapeCorners(Integer.parseInt(args[0]));


        addNumbers(1, 100);
        addNumbers(500f, 600f);
        addNumbers(105.6, 88.45);
    }

    private static void addNumbers(int i, int j) {
        System.out.println("adding 2 int numbers with sum "+ (i+j));
    }

    private static void addNumbers(float i, float j) {
        System.out.println("adding 2 float numbers with sum "+ (i+j));
    }

    private static void addNumbers(double i, double j) {
        System.out.println("adding 2 double numbers with sum "+ (i+j));
    }


    private static void drewShapeCorners(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0 && j == 0) ||
                        (i == 0 && j == width - 1) ||
                        (i == height -1 && j==0) ||
                        (i == height -1 && j == width - 1)) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    private static void drewShapeCorners(int lenght){
        drewShapeCorners(lenght, lenght);
    }

    private static void drewShapeOutline(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    private static void drewShapeOutline(int lenght){
        drewShapeOutline(lenght, lenght);
    }

    private static void drewFullShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    private static void drewFullShape(int lenght){
        drewFullShape(lenght, lenght);
    }


    public static float myFirstMethod(float input1, float input2) {
        return input1 + input2;
    }

    public static boolean isOddNumber(int number) {
        if (number % 2 != 0) {                       // return number % 2 !=0;
            return true;
        }
        return false;
    }

    public static void printMessage(int number) {
//        if(isOddNumber(number)) {
//            System.out.println("Number " + number + " is odd !");
//        }
//        else System.out.println("Number " + number + " is even !");
        String type = isOddNumber(number) ? "odd" : "even";
        System.out.println("number " + number + " is " + type + " !");
    }

}