package sky.pro.java.course1.hw3;

public class Main {
    public static void main(String[] args) {

/* Задача 1.
Объявите переменные типа int, byte, short, long, float, double.
Название переменных может быть любым, но если состоит из двух слов и более, должно придерживаться правила camelCase.
Выведите в консоль значение каждой переменной в формате “Значение переменной … с типом … равно …”
*/
        System.out.println("Задание 1");
        int apples = 354;
        byte pears = 7;
        short orange = 209;
        long redTomato = 42156;
        float distanceOne = 0.3563563f;
        double distanceTwo = 0.562562562562;

        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной pears с типом byte равно " + pears);
        System.out.println("Значение переменной orange с типом short равно " + orange);
        System.out.println("Значение переменной redTomato с типом long равно " + redTomato);
        System.out.println("Значение переменной distanceOne с типом float равно " + distanceOne);
        System.out.println("Значение переменной distanceTwo с типом double равно " + distanceTwo);

/* Задача 2.
Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
Значения: 27.12, 987 678 965 549, 2, 786, false, 569, -159, 27897, 67.
*/
        System.out.println("Задание 2");
        double s = 27.12;
        long b = 987_678_965_549l;
        byte c = 2;
        int g = 786;
        boolean f = false;
        int h = 569;
        short l = -159;
        short m = 27897;
        byte z = 67;

        System.out.print(s + ", ");
        System.out.print(b + ", ");
        System.out.print(c + ", ");
        System.out.print(g + ", ");
        System.out.print(f + ", ");
        System.out.print(h + ", ");
        System.out.print(l + ", ");
        System.out.print(m + ", ");
        System.out.println(z + ".");

/* Задача 3.
Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
Результат задачи выведите в консоль в формате “На каждого ученика рассчитано … листов бумаги”.
Для объявления переменных не используйте тип var.
*/
        System.out.println("Задание 3");
        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        short paper = 480;

        int allClasses = classOne+classTwo+classThree; // Общее кол-во учеников
        int paperToTheStudent = paper/allClasses;

        System.out.println("На каждого ученика рассчитано " + paperToTheStudent + " листов бумаги.");

/* Задача 4.
Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
- за 20 минут
- в сутки
- за 3 дня
- за 1 месяц
Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
Результаты подсчетов выведите в консоль в формате “За … машины произвела бутылок … штук “
Для объявления переменных не используйте тип var.
 */
        System.out.println("Задание 4");
        byte machinePerformance = 16; // кол-во бутылок
        byte time = 2; // минуты

        int oneMinute = machinePerformance/time; // кол-во бутылок за 1 минуту
        int machinePerformance1 = oneMinute * 20;
        int machinePerformance2 = oneMinute * (60 * 24);
        int machinePerformance3 = machinePerformance2 * 3;
        int machinePerformance4 = machinePerformance3 * 10;

        System.out.println("За 20 минут машины произвела бутылок " + machinePerformance1 + " штук");
        System.out.println("За сутки машины произвела бутылок " + machinePerformance2 + " штук");
        System.out.println("За 3 дня машины произвела бутылок " + machinePerformance3 + " штук");
        System.out.println("За 1 месяц машины произвела бутылок " + machinePerformance4 + " штук");

/* Задача 5.
На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски.
Сколько банок каждой краски было куплено?
Выведите результат задачи в консоль в формате “В школе, где … классов, нужно … банок белой краски и … банок коричневой краски”.
*/
        System.out.println("Задание 5");
        byte whitePaint = 2; // кол-во банок
        byte brownPaint = 4; // кол-во банок
        byte totalСans = 120;

        int whiteAndBrown = whitePaint+brownPaint;
        int classesAtSchool = totalСans/whiteAndBrown;
        int allWhitePaint = classesAtSchool*whitePaint;
        int allBrownPaint = classesAtSchool*brownPaint;

        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

/* Задача 6.
Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции.
То же делают и спортсмены, которые сидят на правильном питании и тщательно относятся к тому, что и сколько они едят.
Вот один из рецептов, который использует наш спортсмен перед тренировкой:
– Бананы – 5 штук (1 банан - 80 грамм);
– Молоко – 200 мл (100 мл = 105 грамм);
– Мороженое пломбир – 2 брикета по 100 грамм;
– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
Смешать всё в блендере и готово.
Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
Результат напечатайте в консоль.
Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то нужно умножать количество единиц на вес в граммах.
Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.
*/
        System.out.println("Задание 6");
        byte numberOfBananas = 5;
        byte bananaWeight = 80;
        byte amountOfMilk = 2;
        byte milkWeight = 105;
        byte amountOfIceCream = 2;
        byte iceCreamWeight = 100;
        byte numberOfEggs = 4;
        byte eggWeight = 70;
        int totalWeightOfBananas = numberOfBananas+bananaWeight;
        int totalWeightOfMilk = amountOfMilk*milkWeight;
        int totalWeightOfIceCream = amountOfIceCream*iceCreamWeight;
        int totalWeightOfEggs = numberOfEggs+eggWeight;

        double sportsBreakfastWeight1 = totalWeightOfBananas+totalWeightOfMilk+totalWeightOfIceCream+totalWeightOfEggs;
        double sportsBreakfastWeight2 = sportsBreakfastWeight1/1000;

        System.out.println("Вес спорт-завтрака " + sportsBreakfastWeight1 + " грамм (" + sportsBreakfastWeight2 + " килограмм)");

/* Задача 7.
Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
Результаты всех подсчетов выведите в консоль.
*/
        System.out.println("Задание 7");
        short excessWeight = 7*1000;
        short minWeightLoss = 250;
        short maxWeightLoss = 500;

        int resultMinExcessWeight = excessWeight/minWeightLoss;
        int resultMaxExcessWeight = excessWeight/maxWeightLoss;
        int resultMiddleExcessWeight = (resultMinExcessWeight+resultMaxExcessWeight) / 2;

        System.out.println("Если спортсмен будет терять каждый день по " + minWeightLoss + " грамм, то " + resultMinExcessWeight + " дней уйдёт на похудение.");
        System.out.println("Если спортсмен будет терять каждый день по " + maxWeightLoss + " грамм, то " + resultMaxExcessWeight + " дней уйдёт на похудение.");
        System.out.println("В среднем, может потребоваться " + resultMiddleExcessWeight + " день, чтобы добиться результата похудения.");

/* Задача 8.
Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
Маша получает 67 760 рублей в месяц
Денис получает 83 690 рублей в месяц
Кристина получает 76 230 рублей в месяц
Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
Выведите в консоль информацию по каждому сотруднику.
Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
*/
        System.out.println("Задание 8");
        int incomeM = 67760;
        int incomeD = 83690;
        int incomeK = 76230;
        double percent = 0.1;

        int annualIncomeM1 = incomeM*12;
        int annualIncomeD1 = incomeD*12;
        int annualIncomeK1 = incomeK*12;

        double incomeIncreaseM = incomeM*percent+incomeM;
        double incomeIncreaseD = incomeD*percent+incomeD;
        double incomeIncreaseK = incomeK*percent+incomeK;

        double annualIncomeM2 = incomeIncreaseM*12;
        double annualIncomeD2 = incomeIncreaseD*12;
        double annualIncomeK2 = incomeIncreaseK*12;

        double incomeDifferenceM = annualIncomeM2-annualIncomeM1;
        double incomeDifferenceD = annualIncomeD2-annualIncomeD1;
        double incomeDifferenceK = annualIncomeK2-annualIncomeK1;

        System.out.println("Маша теперь получает " + incomeIncreaseM + " рублей. Годовой доход вырос на " + incomeDifferenceM + " рублей");
        System.out.println("Денис теперь получает " + incomeIncreaseD + " рублей. Годовой доход вырос на " + incomeDifferenceD + " рублей");
        System.out.println("Кристина теперь получает " + incomeIncreaseK + " рублей. Годовой доход вырос на " + incomeDifferenceK + " рублей");
    }
}