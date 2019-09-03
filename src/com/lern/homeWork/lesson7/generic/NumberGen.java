package com.lern.homeWork.lesson7.generic;

/*Напишите параметризированный класс с двумя параметрами, ограниченными классом Number и
разработайте метод вычисления суммы двух чисел, любых типов, метод сравнивающий поэлементно
два массива разных типов, метод определяющий наибольший и наименьший элементы в массивах.*/

public class NumberGen<T extends Number, V extends Number> {

    private T ob1;
    private V ob2;

    public NumberGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    public void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public double sumOb() {
        return ob1.doubleValue() + ob2.doubleValue();
    }

    public static <T extends Number, V extends Number> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) {
            return false;
        }

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {  // как привести к double срузу оба??
                return false;
            }
        }
        return true;
    }

    public static <T extends Number> void arrayMaxAndMinElement(T[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i].doubleValue() < x[j].doubleValue()) {
                    T prev = x[i];
                    x[i] = x[j];
                    x[j] = prev;
                }
            }
        }
        System.out.println("max element mas: " + x[0]);
        System.out.println("min element mas: " + x[x.length-1]);
    }
}

