package com.bnmit;

public class AppTest {
    Calculator calc = new Calculator();
    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }
}
