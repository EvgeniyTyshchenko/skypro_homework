package sky.pro.java.course2.hw15.flower;

public class Main {
    public static void main(String[] args) {

        Flower roza = new Flower("Роза обыкновенная",null, "Голландия", 35.59);
        Flower hrizantema = new Flower("Хризантема", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", null, "Турция", 19.5, 10);

        System.out.println(gipsofila);
        System.out.println();
        calculateCostBouquet(roza, roza, roza, hrizantema, hrizantema, hrizantema, hrizantema, hrizantema, gipsofila);
    }
    public static void calculateCostBouquet(Flower ... flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        System.out.println("Состав букета:");
        for (Flower flower : flowers) {
            if(flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            System.out.println(flower);
            totalCost += flower.getCost();
        }
        totalCost = totalCost * 1.1;
        System.out.printf("%s: %.2f %s \n", "Стоимость букета", totalCost, "руб.");
        System.out.printf("Срок стояния: " + minLifeSpan + " суток");
    }
}
