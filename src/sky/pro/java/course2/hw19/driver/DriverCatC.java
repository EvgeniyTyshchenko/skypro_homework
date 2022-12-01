package sky.pro.java.course2.hw19.driver;

public class DriverCatC extends Driver {
    public DriverCatC(String fullName, String havingDriverLicense, double experience) {
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
