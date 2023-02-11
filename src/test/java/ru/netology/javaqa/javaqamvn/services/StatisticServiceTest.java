package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.javaqamvn.services.StatisticService;

public class StatisticServiceTest {
    @Test
    public void shouldFindMinSumm() {
        StatisticService service = new StatisticService();
        int[] summs = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSumm = 8;
        int actualMinSumm = service.getMinSumm(summs);


        Assertions.assertEquals(expectedMinSumm, actualMinSumm);

    }
}

