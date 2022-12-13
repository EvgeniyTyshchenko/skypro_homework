package sky.pro.java.course2.hw22.task3;

public class Test {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.addInfo("str1", 2);
        task3.addInfo("str2", 1);
//        task3.addInfo("str1",2);
        task3.addInfo("str1", 5);

        System.out.println(task3.map);
    }
}
