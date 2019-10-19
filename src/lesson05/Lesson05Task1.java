package lesson05;

public class Lesson05Task1 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();

        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCooker robotCooker = new RobotCooker();
        robotCooker.work();

        Robot[] robots = {robot, coffeeRobot, robotDancer, robotCooker};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }

    }
}