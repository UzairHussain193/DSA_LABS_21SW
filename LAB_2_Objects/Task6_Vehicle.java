public class Task6_Vehicle {
    public int check(int wheels) {
        if (wheels == 2) {
            System.out.println("the vehicle is bike");
        } else if (wheels == 3) {
            System.out.println("the vehicle is rikshaw");
        } else System.out.println("Enter correct");
        return wheels;
    }

    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int year;
    String manufacture;

    public int accelerate(int speed) {
        for (int i = 1; i <= 5; i++) {
            speed += 5;
            System.out.println("The accelerate is now " + speed);
        }
        return speed;
    }

    public int brake() {
        for (int i = 1; i <= 5; i++) {
            speed -= 5;
            System.out.println("The brake is now " + speed);
        }
        return 0;
    }

    public static void main(String[] args) {
        Task6_Vehicle v = new Task6_Vehicle();
        System.out.println(v.accelerate(30));
        System.out.println(v.check(4));
    }

}