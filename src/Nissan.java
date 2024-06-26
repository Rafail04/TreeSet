public class Nissan extends Vehicle implements CarMethod {
    @Override
    public void drive() {
        System.out.println("Audi drive");

    }

    @Override
    public void gasoline() {
        System.out.println("Nissan gasoline");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("Nissan pick up speed");

    }

    public Nissan(String color, int speed) {
        super(color, speed);

    }

    @Override
    void display() {
        super.display();
    }

    @Override
    void speed() {
        super.speed();
    }
}



