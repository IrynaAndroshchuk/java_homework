package Lesson08_SOLID;

public class Lesson08Task1 {
    public static void main(String[] args) {
        SU27 su27 = new SU27(2500, "blue", new AirplaneControl());

        su27.startingEngines();
        su27.airplaneTakeOff();
        System.out.println(su27.getAirplaneControl().down());
        System.out.println(su27.getAirplaneControl().up());
        System.out.println(su27.getAirplaneControl().left());
        System.out.println(su27.getAirplaneControl().right());
        su27.stealth();
        su27.nuclearStrike();
        su27.turbo();
        su27.planeLanding();
    }
}