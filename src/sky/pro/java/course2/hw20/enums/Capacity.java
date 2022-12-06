package sky.pro.java.course2.hw20.enums;

public enum Capacity {
    ESPECIALLY_SMALL(null, 10),
    SMALL(10, 25),
    AVERAGE(25, 50),
    BIG(50, 80),
    EXTRA_LARGE(80, 120);

    private Integer bottomLine;
    private Integer upperBound;

    Capacity(Integer bottomLine, Integer upperBound) {
        this.bottomLine = bottomLine;
        this.upperBound = upperBound;
    }
    public String toString() {
        String info;
        if (bottomLine == null) {
            info = "вместимость: до " + upperBound.intValue() + " мест";
        } else if (upperBound == null) {
            info = "вместимость: от " + bottomLine.intValue() + " мест";
        } else {
            info = "вместимость: " + bottomLine.intValue() + " - " + upperBound.intValue() + " мест";
        }
        return info;
    }
}
