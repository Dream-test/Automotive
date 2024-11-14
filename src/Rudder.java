public class Rudder {
    private int size = 60;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void turnLeft() {
        System.out.println("Turn rudder to left");
    }

    public void turnRight() {
        System.out.println("Turn rudder to right");
    }
}
