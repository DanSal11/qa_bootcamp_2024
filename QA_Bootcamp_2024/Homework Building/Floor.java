import java.util.ArrayList;
import java.util.List;

public class Floor{

    ArrayList<Room> rooms = new ArrayList<Room>();

//    public void newFloor() {
//        rooms = new ArrayList<Room>();
//    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void printDetails() {
        int conferenceRooms = 0;
        int officeSpaces = 0;
        int kitchens = 0;
        int toilets = 0;

        for(Room r : rooms) {
            if(r instanceof ConferenceRoom) conferenceRooms++;
            else if(r instanceof OfficeSpace) officeSpaces++;
                else if(r instanceof Kitchen) kitchens++;
                    else if(r instanceof Toilet) toilets++;
        }

        if(conferenceRooms > 0) {
            System.out.println("--------- Conference rooms: " + conferenceRooms);
            for(Room r : rooms) {
                if(r instanceof ConferenceRoom) {
                    r.printDetails();
                }
            }
        }
        if(officeSpaces > 0) {
            System.out.println("--------- Office spaces: " + officeSpaces);
            for(Room r : rooms) {
                if(r instanceof OfficeSpace) {
                    r.printDetails();
                }
            }
        }
        if(kitchens > 0) {
            System.out.println("--------- Kitchens: " + kitchens);
            for(Room r : rooms) {
                if(r instanceof Kitchen) {
                    r.printDetails();
                }
            }
        }
        if(toilets > 0) {
            System.out.println("--------- Toilets: " + toilets);
            for(Room r : rooms) {
                if(r instanceof Toilet) {
                    r.printDetails();
                }
            }
        }

//        for(Room r : rooms) {
//            r.printDetails();
//        }
    }
}
