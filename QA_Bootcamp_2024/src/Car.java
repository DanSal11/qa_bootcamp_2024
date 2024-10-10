import lombok.Getter;
import lombok.Setter;

public class Car {

    @Getter @Setter

    private String model;
    private String color;
    private String carType;
    private final double MAX_SPEED = 180;
    private double currentSpeed;
    private float cylinderCapacity;
    private float currentMileage;
    private double carPosition; //compared to magnetic north
    private int MAX_GEAR = 6;
    private int currentGear;

    public Car(String model, String color, String carType, double currentSpeed, float cylinderCapacity, float currentMileage, double carPosition, int currentGear) {
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.currentSpeed = currentSpeed;
        this.cylinderCapacity = cylinderCapacity;
        this.currentMileage = currentMileage;
        this.carPosition = carPosition;
        this.currentGear = currentGear;
    }

    public Car(String model, String color, String carType, float cylinderCapacity, double carPosition) {
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.cylinderCapacity = cylinderCapacity;
        this.carPosition = carPosition;
    }

    public Car() {
    }

    public void startCar() {
        currentGear = 1;
        currentSpeed = 5;
    }

    public void stearLeft(float angle) {
        carPosition -= angle;
    }

    public void stearRight(float angle) {
        carPosition += angle;
    }

    public void  stopCar() {
        currentSpeed = 0;
        currentGear = 0;
    }

    public void increaseMileage(float mileage) {
        currentMileage += mileage;
    }

    public void  accelerate(double speedDelta) {
        if(currentSpeed + speedDelta >= MAX_SPEED){
            currentSpeed = MAX_SPEED;
        }
        else {
            currentSpeed += speedDelta;
        }
    }

    public void decelerate(double speedDelta) {
        if( currentSpeed - speedDelta < 0){
            currentSpeed = 0;
        }
        else {
            currentSpeed -= speedDelta;
        }
    }

    public void gearUp() {
        if(currentGear < MAX_GEAR){
            currentGear++;
        }
    }

    public void gearDown() {
        if( currentGear > 0) {
            currentGear--;
        }
    }

    public void printCar() {
        System.out.println("--------------------------");
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car type: " + carType);
        System.out.println("Car position (based on North): " + carPosition);
        System.out.println("Car mileage: " + currentMileage);
        System.out.println("Car gear: " + currentGear);
        System.out.println("Car current speed: " + currentSpeed);
    }

    public void setSpeed(double currentSpeed) {
        if (currentSpeed > MAX_SPEED) {
            System.out.println("Invalid speed " + currentSpeed);
        }
        else {
            this.currentSpeed = currentSpeed;
        }
    }

    public double getSpeed() {
        return this.currentSpeed;
    }

//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getCarType() {
//        return carType;
//    }
//
//    public void setCarType(String carType) {
//        this.carType = carType;
//    }
}
