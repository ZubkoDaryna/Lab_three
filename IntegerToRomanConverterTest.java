import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanConverterTest {

    @Test public void test1()  { assertEquals("I", IntegerToRomanConverter.intToRoman(1)); }
    @Test public void test2()  { assertEquals("II", IntegerToRomanConverter.intToRoman(2)); }
    @Test public void test3()  { assertEquals("III", IntegerToRomanConverter.intToRoman(3)); }
    @Test public void test4()  { assertEquals("IV", IntegerToRomanConverter.intToRoman(4)); }
    @Test public void test5()  { assertEquals("V", IntegerToRomanConverter.intToRoman(5)); }
    @Test public void test6()  { assertEquals("VI", IntegerToRomanConverter.intToRoman(6)); }
    @Test public void test7()  { assertEquals("VII", IntegerToRomanConverter.intToRoman(7)); }
    @Test public void test8()  { assertEquals("VIII", IntegerToRomanConverter.intToRoman(8)); }
    @Test public void test9()  { assertEquals("IX", IntegerToRomanConverter.intToRoman(9)); }
    @Test public void test10() { assertEquals("X", IntegerToRomanConverter.intToRoman(10)); }

    @Test public void test14() { assertEquals("XIV", IntegerToRomanConverter.intToRoman(14)); }
    @Test public void test19() { assertEquals("XIX", IntegerToRomanConverter.intToRoman(19)); }
    @Test public void test20() { assertEquals("XX", IntegerToRomanConverter.intToRoman(20)); }
    @Test public void test27() { assertEquals("XXVII", IntegerToRomanConverter.intToRoman(27)); }
    @Test public void test39() { assertEquals("XXXIX", IntegerToRomanConverter.intToRoman(39)); }
    @Test public void test40() { assertEquals("XL", IntegerToRomanConverter.intToRoman(40)); }
    @Test public void test44() { assertEquals("XLIV", IntegerToRomanConverter.intToRoman(44)); }
    @Test public void test49() { assertEquals("XLIX", IntegerToRomanConverter.intToRoman(49)); }

    @Test public void test50() { assertEquals("L", IntegerToRomanConverter.intToRoman(50)); }
    @Test public void test58() { assertEquals("LVIII", IntegerToRomanConverter.intToRoman(58)); }
    @Test public void test63() { assertEquals("LXIII", IntegerToRomanConverter.intToRoman(63)); }
    @Test public void test89() { assertEquals("LXXXIX", IntegerToRomanConverter.intToRoman(89)); }
    @Test public void test90() { assertEquals("XC", IntegerToRomanConverter.intToRoman(90)); }

    @Test public void test99()  { assertEquals("XCIX", IntegerToRomanConverter.intToRoman(99)); }
    @Test public void test100() { assertEquals("C", IntegerToRomanConverter.intToRoman(100)); }
    @Test public void test149() { assertEquals("CXLIX", IntegerToRomanConverter.intToRoman(149)); }
    @Test public void test400() { assertEquals("CD", IntegerToRomanConverter.intToRoman(400)); }
    @Test public void test444() { assertEquals("CDXLIV", IntegerToRomanConverter.intToRoman(444)); }
    @Test public void test500() { assertEquals("D", IntegerToRomanConverter.intToRoman(500)); }

    @Test public void test649() { assertEquals("DCXLIX", IntegerToRomanConverter.intToRoman(649)); }
    @Test public void test798() { assertEquals("DCCXCVIII", IntegerToRomanConverter.intToRoman(798)); }
    @Test public void test891() { assertEquals("DCCCXCI", IntegerToRomanConverter.intToRoman(891)); }

    @Test public void test900() { assertEquals("CM", IntegerToRomanConverter.intToRoman(900)); }
    @Test public void test1000() { assertEquals("M", IntegerToRomanConverter.intToRoman(1000)); }
    @Test public void test1453() { assertEquals("MCDLIII", IntegerToRomanConverter.intToRoman(1453)); }
    @Test public void test1987() { assertEquals("MCMLXXXVII", IntegerToRomanConverter.intToRoman(1987)); }
    @Test public void test2023() { assertEquals("MMXXIII", IntegerToRomanConverter.intToRoman(2023)); }
    @Test public void test2421() { assertEquals("MMCDXXI", IntegerToRomanConverter.intToRoman(2421)); }

    @Test public void test3000() { assertEquals("MMM", IntegerToRomanConverter.intToRoman(3000)); }
    @Test public void test3444() { assertEquals("MMMCDXLIV", IntegerToRomanConverter.intToRoman(3444)); }
    @Test public void test3999() { assertEquals("MMMCMXCIX", IntegerToRomanConverter.intToRoman(3999)); }
}
