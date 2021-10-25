package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300,3",
            "100,400,11"})
    void takeTheRoot(int border1, int border2, int expected) {
        SQRService service = new SQRService();
        int actual = service.takeTheRoot(border1, border2);
        assertEquals(expected, actual);
    }
}
