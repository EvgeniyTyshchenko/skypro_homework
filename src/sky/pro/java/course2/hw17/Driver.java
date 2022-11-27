package sky.pro.java.course2.hw17;

public abstract class Driver implements Moving {
    private String fullName;
    private String havingDriverLicense;
    private double experience;

    public Driver(String fullName, String havingDriverLicense, double experience) {
        this.fullName = ValidateUtil.validateString(fullName);
        this.havingDriverLicense = ValidateUtil.validateString(havingDriverLicense);
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
        this.havingDriverLicense = ValidateUtil.validateString(havingDriverLicense);
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
}
