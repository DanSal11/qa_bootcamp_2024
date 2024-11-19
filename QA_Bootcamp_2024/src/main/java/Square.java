import lombok.NoArgsConstructor;

@NoArgsConstructor //@AllArgsConstructor

public class Square extends Rectangle {

//    @Getter @Setter
//    private double side;

//    public Square(double side) {  ///lombok
//        this.side = side;
//    }

//    public Square(){
//
//    }

//    public void setSide(double squareSide)
//    {
//        this.side = squareSide;
//    }

    public Square(double side) {
        super(side,side);
    }

    public double getArea() {
//        return side * side;
//        return Math.pow(side, 2);
        return super.getArea();
    }

    public void printCurrentSquare() {
        System.out.println("Square with side " + getLength() + " has area of "+ getArea());
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public String toString() {
        return "MY square has 4 sides each " + this.getLength();
    }

    public void setSide(double i) {
        super.setLength(i);
        super.setWidth(i);
    }
}
