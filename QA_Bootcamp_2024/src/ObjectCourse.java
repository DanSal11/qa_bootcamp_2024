public class ObjectCourse {

    public static void main(String[] args) {
        Car vwPasat = new Car();

//        Car dacia1310 = new Car();
//        dacia1310.printCar();
//
//        dacia1310.color = "RED";
//        dacia1310.carType = "Sedan";
//        dacia1310.cylinderCapacity = 1300;
//        dacia1310.model = "dacia 1300";
//        dacia1310.carPosition = 45;

        Car dacia1310 = new Car("sedan","RED", "dacia1310", 1300, 45);


        dacia1310.startCar();
        dacia1310.accelerate(20);
        dacia1310.gearUp();
        dacia1310.stearRight(45);
        dacia1310.increaseMileage(5);
        dacia1310.stopCar();

        dacia1310.setSpeed(5000);
        System.out.println(dacia1310.getSpeed());

        dacia1310.printCar();



        Square squareabcd = new Square();
        squareabcd.setSide(5);
        System.out.println("Square with side " + squareabcd.squareSide + " has area of "+ squareabcd.getArea());


//        for (int i = 0; i < args.length ; i++) {
//            System.out.println(args[i]);
//        }
        for(String value : args) {
            Square cmdSquare = new Square();
            cmdSquare.setSide(Double.parseDouble(value));
            cmdSquare.printCurrentSquare();
            Utils.printSquare(cmdSquare); ///static method
        }


        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("area is " + rectangle.getArea() + " diagonal is " + rectangle.getDiagonal() +
                " perimeter is " + rectangle.getPerimeter());


    }

}
