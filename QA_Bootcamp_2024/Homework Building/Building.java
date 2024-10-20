import java.util.ArrayList;
import java.util.List;

public class Building {

    int nrBuilding;
    ArrayList<Floor> floors;


    public Building(int nrBuilding) {
        this.nrBuilding = nrBuilding;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void printDetails() {
        System.out.println("Building: " + nrBuilding + " has " + floors.size() + " floors");
        for (int i = 0; i < floors.size() ; i++) {
            System.out.println("Floor " + (i+1) + ":");
            floors.get(i).printDetails();
        }
    }

    public static void main(String[] args) {

        Building building1 = new Building(1);

        //floor 1
        Floor floor1 = new Floor();
        building1.addFloor(floor1);
        floor1.addRoom(new OfficeSpace(20));
        floor1.addRoom(new Toilet());
        floor1.addRoom(new Toilet());
        floor1.addRoom(new Kitchen(true,true,true));
        floor1.addRoom(new ConferenceRoom(10,true, false, false));
        floor1.addRoom(new ConferenceRoom(10,true, false, false));
        floor1.addRoom(new ConferenceRoom(10,true, false, false));


        //floor 2
        Floor floor2 = new Floor();
        building1.addFloor(floor2);
        floor2.addRoom(new OfficeSpace(10));
        floor2.addRoom(new OfficeSpace(10));
        floor2.addRoom(new Toilet());
        floor2.addRoom(new Toilet());
        floor2.addRoom(new Kitchen(true,true,true));
        floor2.addRoom(new ConferenceRoom(8,true, false, false));
        floor2.addRoom(new ConferenceRoom(8,true, false, false));
        floor2.addRoom(new ConferenceRoom(8,true, false, false));
        floor2.addRoom(new ConferenceRoom(8,true, false, false));

        //floor 3
        Floor floor3 = new Floor();
        building1.addFloor(floor3);
        floor3.addRoom(new Toilet());
        floor3.addRoom(new Toilet());
        floor3.addRoom(new ConferenceRoom(30,false, true, true));
        floor3.addRoom(new ConferenceRoom(20,true, false, true));
        floor3.addRoom(new ConferenceRoom(10,true, false, true));
        floor3.addRoom(new ConferenceRoom(10,true, false, true));
        floor3.addRoom(new ConferenceRoom(10,true, false, true));
        floor3.addRoom(new ConferenceRoom(10,true, false, true));

        building1.printDetails();

    }

}
