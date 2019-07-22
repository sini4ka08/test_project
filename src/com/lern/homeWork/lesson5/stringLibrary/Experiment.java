package com.lern.homeWork.lesson5.stringLibrary;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Experiment {

    public static void main(String[] args) {
        int i = 0;
        short sh = 0;
        double d = 0;
        Integer kl = new Integer(55);
        Integer k2 = new Integer(100);
        Double dl = new Double(3.14);
        args = new String[]{"55", "100"};
        i = Integer.parseInt(args[0]);
        sh = Short.parseShort(args[0]);
        d = Double.parseDouble(args[1]);
        dl = new Double(args[1]);
        kl = new Integer(args[0]);
        double u = 1.0 / 0.0;
        System.out.println("i = " + i);
        System.out.println("sh = " + sh);
        System.out.println("d = " + d);
        System.out.println("kl.intValue() = " + kl.intValue());
        System.out.println("dl.intValue() = " + dl.intValue());
        System.out.println("kl > k2? " + kl.compareTo(k2));
        System.out.println("u = " + u);
        System.out.println("u isNaN? " + Double.isNaN(u));
        System.out.println("u islnfinite? " + Double.isInfinite(u));
        System.out.println("u == Infinity? " + (u == Double.POSITIVE_INFINITY));
        System.out.println("d = " + Double.doubleToLongBits(d));
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("i = " + Integer.toHexString(i));
        System.out.println("i = " + Integer.toOctalString(i));

        char ch = '9';
        Character c = new Character(ch);
        System.out.println("ch = " + ch);
        System.out.println("cl.charValue() = " + c.charValue());
        System.out.println("number of 'A' = " + Character.digit('A', 16));
        System.out.println("digit for 12 = " + Character.forDigit(12, 16));
        System.out.println("cl = " + c.toString());
        System.out.println("ch isDefined? " + Character.isDefined(ch));
        System.out.println("ch isDigit? " + Character.isDigit(ch));
        System.out.println("ch isldentifierlgnorable? " + Character.isIdentifierIgnorable(ch));
        System.out.println("ch isISOControl? " + Character.isISOControl(ch));
        System.out.println("ch isJavaldentifierPart? " + Character.isJavaIdentifierPart(ch));
        System.out.println("ch isJavaldentifierStart? " + Character.isJavaIdentifierStart(ch));
        System.out.println("ch isLetter? " + Character.isLetter(ch));
        System.out.println("ch isLetterOrDigit? " + Character.isLetterOrDigit(ch));
        System.out.println("ch isLowerCase? " + Character.isLowerCase(ch));
        System.out.println("ch isSpaceChar? " + Character.isSpaceChar(ch));
        System.out.println("ch isTitleCase? " + Character.isTitleCase(ch));
        System.out.println("ch isUnicodeldentifierPart? " + Character.isUnicodeIdentifierPart(ch));
        System.out.println("ch isUnicodeldentifierStart? " + Character.isUnicodeIdentifierStart(ch));
        System.out.println("ch isUpperCase? " + Character.isUpperCase(ch));
        System.out.println("ch isWhitespace? " + Character.isWhitespace(ch));

        BigInteger a = new BigInteger("99999999999999999");
        BigInteger b = new BigInteger("88888888888888888888");
        System.out.println("bits in a = " + a.bitLength());
        System.out.println("bits in b = " + b.bitLength());
        System.out.println("a + b = " + a.add(b));
        System.out.println("a & b = " + a.and(b));
        System.out.println("a & ~b = " + a.andNot(b));
        System.out.println("a / b = " + a.divide(b));
        BigInteger[] r = a.divideAndRemainder(b);
        System.out.println("a / b: q = " + r[0] + ", r = " + r[1]);
        System.out.println("gcd(a, b) = " + a.gcd(b));
        System.out.println("max(a, b) = " + a.max(b));
        System.out.println("min(a, b) = " + a.min(b));
        System.out.println("a mod b = " + a.mod(b));
        System.out.println("I/a mod b = " + a.modInverse(b));
        System.out.println("а^ a mod b = " + a.modPow(a, b));
        System.out.println("a * b = " + a.multiply(b));
        System.out.println("-a = " + a.negate());
        System.out.println("~a = " + a.not());
        System.out.println("a | b = " + a.or(b));
        System.out.println("а ^ 3 = " + a.pow(3));
        System.out.println("a % b = " + a.remainder(b));
        System.out.println("a « 3 = " + a.shiftLeft(3));
        System.out.println("a » 3 = " + a.shiftRight(3));
        System.out.println("sign(a) = " + a.signum());
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("а ^ b = " + a.xor(b));

        BigDecimal x = new BigDecimal("-12345.67890123456789");
        BigDecimal y = new BigDecimal("345.7896e-4");
        BigDecimal z = new BigDecimal(new BigInteger("123456789"), 8);
        System.out.println("|x| = " + x.abs());
        System.out.println("x + у = " + x.add(y));
        System.out.println("x / у = " + x.divide(y, BigDecimal.ROUND_DOWN));
        System.out.println("х / у = " + x.divide(y, 6, BigDecimal.ROUND_HALF_EVEN));
        System.out.println("max(x, y) = " + x.max(y));
        System.out.println("min(x, y) = " + x.min(y));
        System.out.println("x « 3 = " + x.movePointLeft(3));
        System.out.println("x » 3 = " + x.movePointRight(3));
        System.out.println("x * у = " + x.multiply(y));
        System.out.println("-x = " + x.negate());
        System.out.println("scale of x = " + x.scale());
        System.out.println("increase scale of x to 20 = " + x.setScale(20));
        System.out.println("decrease scale of x to 10 = " + x.setScale(10, BigDecimal.ROUND_HALF_UP));
        System.out.println("sign(x) = " + x.signum());
        System.out.println("x - у = " + x.subtract(y));
        System.out.println("round x = " + x.toBigInteger());
        System.out.println("mantissa of x = " + x.unscaledValue());
        System.out.println("mantissa of 0.1 =\n= " + new BigDecimal(0.1).unscaledValue());

        Integer objI;
        i = 100;
        objI = Integer.valueOf(i); // пример ручной упаковки и распаковки
        System.out.println("1: " + objI.intValue()); // пример автоматической упаковки/распаковки
        objI = 2000;
        i = objI;
        System.out.println("2: objI=" + objI + "  i=" + i);
        d = 2.345;  // автоматическая упаковка/распаковка в методы
        System.out.println("3: d=" + d);
        objI++;  // автоматическая упаковка/распаковка в выражении
        i = objI / 2 + 10;
        System.out.println("4: objI=" + objI + " i=" + i);
        Boolean bool;  // упаковка/распаковка булевского типа
        bool = true;
        if (bool) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        ch = 'd'; // упаковка/ распаковка символьного типа
        c = ch;
        System.out.println(c);

        String str1, str2;
        str1 = String.valueOf('f');  // преобразование символа в строку
        char s[] = {'a', 'D', 'S', 'a', 'q', 'w'};
        System.out.println(str1);
        str2 = String.valueOf(s, 0, s.length);  // преобразование массива символов в строку
        System.out.println(str2);
        System.out.println(str2.charAt(4));  // вывод  5-го элемента строки
        System.out.println(str2.endsWith("aqw"));  //проверяет чем заканчивается строка
        System.out.println(str2.toLowerCase());
        String ar[] = str2.split("a");  //разделение строки на массив строк
        for (String q : ar) {
            System.out.println(q);
        }

        str1 = "When it comes to Web programming, Java is #1.";
        str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        System.out.println("Length of str1: " + str1.length());
        for (i = 0; i < str1.length(); i++) {  // Отображение str1 по одному символу
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 does not equal str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 equals str3");
        } else {
            System.out.println("str1 does not equal str3");
        }
        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 and str3 are equal");
        } else if (result < 0) {
            System.out.println("str1 is less than str3");
        } else {
            System.out.println("str1 is greater than str3");
        }
        str2 = "One Two Three One";  // Присвоение переменной str2 ссылки на новую строку
        idx = str2.indexOf("One");
        System.out.println("Index of first occurence of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurence of One: " + idx);

        String strs[] = {"This", "is", "a", "test."};
        System.out.println("Original array: ");
        for (String st : strs) {
            System.out.print(st + " ");
        }
        System.out.println(" ");
        strs[1] = "was";  // Внесение изменений
        strs[3] = "test, too!";
        System.out.println("Modified array: ");
        for (String st : strs) {
            System.out.print(st + " ");
        }
        System.out.println(" ");

        String orgstr = "Java makes the Web move.";
        String substr = orgstr.substring(5, 18);  // Формирование подстроки
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

        String strInt = "123";
        String strDouble = "123.456";
        i = Integer.parseInt(strInt);
        d = Double.parseDouble(strDouble);
        System.out.println("i=" + i);
        System.out.println("d=" + d);
        strInt = String.valueOf(i + 1);
        strDouble = String.valueOf(d + 1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "num=" + 345;
        System.out.println(str);

        System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));

        str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку из 4-х символов: ");
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        if (str.length() != 4) {
            System.err.println("Строка не содержит четырех символов."); //обработчик системной ошибки
            return;
        }
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {//взять символ
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");

        StringBuffer sb = new StringBuffer();
        System.out.println("длина ->" + sb.length());
        System.out.println("размер ->" + sb.capacity());
        sb.append("Java");  // sb = "Java" - ошибка, только для класса String!!
        System.out.println("строка ->" + sb);
        System.out.println("длина ->" + sb.length());
        System.out.println("размер ->" + sb.capacity());
        System.out.println("реверс ->" + sb.reverse());

        StringBuffer str5 = new StringBuffer("Sun");
        str5.append(" Microsystems");
        System.out.println(str5);

        StringBuffer sb1 = new StringBuffer("Sun");
        StringBuffer sb2 = new StringBuffer("Sun");
        System.out.print(sb1.equals(sb2));
        System.out.print(sb1.hashCode() == sb2.hashCode());
    }
}
