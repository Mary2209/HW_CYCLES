package ru.netology;

public class Services {
    public static int calculate(int income, int expenses, int threshold) {
        int result = 0;
        int money = 0;
        for (int i = 1; i < 13; i++) {
            if (money >= threshold) {
                int vocationsExpenses = (money - expenses) * 2 / 3;
                System.out.printf("Месяц %d. Денег %d. Буду отдыхать. Потратил -%d, затем ещё -%d\n",
                                    i, money, expenses, vocationsExpenses);
                result++;
                money = money - expenses - vocationsExpenses;
            } else {
                System.out.printf("Месяц %d. Денег %d. Придётся работать. Заработал +%d, потратил -%d\n",
                                    i, money, income, expenses);
                money = money + income - expenses;
            }
        }
        return result;
    }
}
