public class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    void display() {
        System.out.println("Color: " +color);
    }
    void speed(){
        System.out.println("Speed: " +speed);
    }

}


