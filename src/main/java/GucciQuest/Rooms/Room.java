package GucciQuest.Rooms;

public abstract class Room {

    protected String name;

    public Room(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
