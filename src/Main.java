//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        CarMethod a = new BMW("Black", 240);
        Vehicle aa = new BMW("blue", 300);
        Lada b = new Lada("red",180);
        Nissan c = new Nissan("white", 220);
        a.drive();
        a.pickUpSpeed();
        a.gasoline();
        aa.speed();
        aa.display();
        System.out.println("_______________________________________________");
        b.drive();
        b.pickUpSpeed();
        b.gasoline();
        b.speed();
        b.display();
        System.out.println("______________________________________________");
        c.drive();
        c.pickUpSpeed();
        c.gasoline();
        c.speed();
        c.display();
        }
    }
