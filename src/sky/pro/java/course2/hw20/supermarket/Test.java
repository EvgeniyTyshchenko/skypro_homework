package sky.pro.java.course2.hw20.supermarket;

public class Test {
    public static void main(String[] args) {

        Supermarket supermarket = new Supermarket();
        String vladimir = "Владимир";
        String petr = "Пётр";
        String evgeniy = "Евгений";
        String yuliya = "Юлия";
        String oleg = "Олег";
        String maksim = "Максим";
        String vitaliy = "Виталий";
        String anton = "Антон";
        String artem = "Артем";
        String olga = "Ольга";
        String marina = "Марина";
        String valentin = "Валентин";
        String egor = "Егор";
        String yuriy = "Юрий";
        String stanislav = "Станислав";
        String alla = "Алла";

        supermarket.add(vladimir);
        supermarket.add(petr);
        supermarket.add(evgeniy);
        supermarket.add(yuliya);
        supermarket.add(oleg);
        supermarket.add(maksim);
        supermarket.add(vitaliy);
        supermarket.add(anton);
        supermarket.add(artem);
        supermarket.add(olga);
        supermarket.add(marina);
        supermarket.add(valentin);
        supermarket.add(egor);
        supermarket.add(yuriy);
        supermarket.add(stanislav);
        supermarket.add(alla);
        System.out.println();
        System.out.println(supermarket.queue1);
        System.out.println(supermarket.queue2);
        System.out.println(supermarket.queue3);
        supermarket.delete();
//        supermarket.delete();
//        supermarket.delete();
//        supermarket.delete();
//        supermarket.delete();
        System.out.println();
        System.out.println(supermarket.queue1);
        System.out.println(supermarket.queue2);
        System.out.println(supermarket.queue3);
    }
}
