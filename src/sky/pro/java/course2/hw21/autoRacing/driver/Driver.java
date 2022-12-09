package sky.pro.java.course2.hw21.autoRacing.driver;

import sky.pro.java.course2.hw21.autoRacing.Moving;
import sky.pro.java.course2.hw21.autoRacing.ValidateUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Driver implements Moving {
    private String fullName;
    private String havingDriverLicense;
    private double experience;

    public Driver(String fullName, String havingDriverLicense, double experience) {
        this.fullName = ValidateUtil.validateString(fullName);
        setHavingDriverLicense(havingDriverLicense);
        if (experience <= 0.0) {
            this.experience = 0.6;
        } else {
            this.experience = experience;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = ValidateUtil.validateString(fullName);
    }

    public String getHavingDriverLicense() {
        return havingDriverLicense;
    }

    public void setHavingDriverLicense(String havingDriverLicense) {
        Pattern pattern = Pattern.compile("^[BCD]$");
        Matcher matcher = pattern.matcher(havingDriverLicense);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Необходимо указать корректную категорию прав!");
        } else {
            this.havingDriverLicense = havingDriverLicense;
        }
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience <= 0.0) {
            this.experience = 0.6;
        } else {
            this.experience = experience;
        }
    }

    @Override
    public String toString() {
        return "Водитель: " + fullName + ", категория прав: " + havingDriverLicense + ", опыт: " + experience + " лет";
    }
}
