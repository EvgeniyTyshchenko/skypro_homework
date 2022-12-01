package sky.pro.java.course2.hw19.enums;

public enum BodyType {
    SEDAN("седан"),
    HATCHBACK("хетчбек"),
    COUPE("купе"),
    STATION_WAGON("универсал"),
    SUV("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");

    private String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }


    @Override
    public String toString() {
        return "тип кузова: " + bodyType;
    }
}
