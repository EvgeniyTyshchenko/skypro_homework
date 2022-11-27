package sky.pro.java.course2.hw17;

public class DriverCatD extends Driver {
    public DriverCatD(String fullName, String havingDriverLicense, double experience) {
        super(fullName, havingDriverLicense, experience);
    }
    @Override
    public void startMoving() {
        System.out.println(getFullName() + " движется");
    }

    @Override
    public void stay() {
        System.out.println(getFullName() + " остановился");
    }

    @Override
    public void refuel() {
        System.out.println(getFullName() + " заправляется");
    }
}
