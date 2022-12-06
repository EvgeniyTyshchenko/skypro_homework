package sky.pro.java.course2.hw20.enums;

public enum LoadCapacity {
    N1(null, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null);

    private Double bottomLine;
    private Double upperBound;

    LoadCapacity(Double bottomLine, Double upperBound) {
        this.bottomLine = bottomLine;
        this.upperBound = upperBound;
    }

    public String toString() {
        String info;
        if (bottomLine == null) {
            info = "грузоподъемность: до " + upperBound + " тонн";
        } else if (upperBound == null) {
            info = "грузоподъемность: от " + bottomLine + " тонн";
        } else {
            info = "грузоподъемность: от " + bottomLine + " до " + upperBound + " тонн";
        }
        return info;
    }
}
