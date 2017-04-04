/**
 * Created by sunny on 04/04/17.
 */
public class TestBoats {
    public static void main(String[] args) {
        Boat boat = new Boat();
        SailBoat sailBoat = new SailBoat();
        RowBoat rowBoat = new RowBoat();
        sailBoat.setLenght(32);
        boat.move();
        rowBoat.move();
        sailBoat.move();
    }
}
