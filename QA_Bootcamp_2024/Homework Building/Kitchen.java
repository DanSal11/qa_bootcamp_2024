public class Kitchen extends Room {

    boolean coffeMachine = true;
    boolean waterDispanser;
    boolean fridge;

    public Kitchen(boolean coffeMachine, boolean waterDispanser, boolean fridge) {
        this.coffeMachine = coffeMachine;
        this.waterDispanser = waterDispanser;
        this.fridge = fridge;
    }

    public boolean isCoffeMachine() {
        return coffeMachine;
    }

    public boolean isWaterDispanser() {
        return waterDispanser;
    }

    public boolean isFridge() {
        return fridge;
    }

    public void printDetails() {
        System.out.println("------------------ The kitchen has " + "coffe machine: " + coffeMachine +
                ", water dispanser: " + waterDispanser + ", fridge: " + fridge);
    }

}
