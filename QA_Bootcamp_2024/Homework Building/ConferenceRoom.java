public class ConferenceRoom extends Room {

    int seats;
    boolean TV;
    boolean videoProjector;
    boolean conferenceEquipment;

    public ConferenceRoom(int seats, boolean TV, boolean videoProjector, boolean conferenceEquipment) {
        this.seats = seats;
        this.TV = TV;
        this.videoProjector = videoProjector;
        this.conferenceEquipment = conferenceEquipment;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTV() {
        return TV;
    }

    public boolean isVideoProjector() {
        return videoProjector;
    }

    public boolean isConferenceEquipment() {
        return conferenceEquipment;
    }

    public void printDetails() {
        System.out.println("------------------  Conference room has: " + seats + " seats" + ", TV: " + TV
                + ", video projector: " + videoProjector + ", conference equipment: " + conferenceEquipment);
    }

}
