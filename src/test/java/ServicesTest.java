import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.Services;

public class ServicesTest {

    @Test
    void first_case() {
        Services services = new Services();

        // подготавливаем данные:
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int expected = 2;

        // вызываем целевой метод:
        int actual = services.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void second_case() {
        Services services = new Services();

        // подготавливаем данные:
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int expected = 3;

        // вызываем целевой метод:
        int actual = services.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
