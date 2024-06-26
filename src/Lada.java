public class Lada extends Vehicle implements CarMethod{
    @Override
    public void pickUpSpeed() {
        System.out.println("Lada 2107 picked up speed");

    }

    @Override
    public void gasoline() {
        System.out.println("Lada 2107 gasoline");

    }

    @Override
    public void drive() {
        System.out.println("Lada 2107 drive");

    }

    public Lada(String color, int speed) {
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
