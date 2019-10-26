package Lesson08_SOLID;

public class SU27 extends Airplane implements SpecialFunctions {
    private AirplaneControl airplaneControl;
    private int maxSpeed;
    String color;

    public SU27(int maxSpeed, String color, AirplaneControl airplaneControl) {
        super(100, 100, 100);
        this.airplaneControl = airplaneControl;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public AirplaneControl getAirplaneControl() {
        return airplaneControl;
    }

    public void turbo() {
        System.out.println("Turbo speed " + Random.randomInt(maxSpeed + 1, maxSpeed + 1000));
    }

    public void stealth() {
        for (int i = 0; i < Random.randomInt(1, 10); i++) {
            System.out.println("The airplane is invisible");
        }
    }

    public void nuclearStrike() {
        System.out.println("Numbers of nuclear warheads " + Random.randomInt(1, 10));
    }


}
