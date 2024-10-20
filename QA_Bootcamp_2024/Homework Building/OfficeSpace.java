public class OfficeSpace extends Room {

    int desks;

    public OfficeSpace(int desks) {
        this.desks = desks;
    }

    public int getDesks() {
        return desks;
    }

    public void printDetails() {
        System.out.println("------------------ Office space has " + desks + " desks");
    }
}
