package com.lern.homeWork.lesson3;

import java.util.Arrays;

/* Разработать класс Склад. Два поля: количество единиц товара и стоимость 1 единицы.
Конструктор пустой и конструктор с двумя параметрами. Написать метод позволяющий изменять
количество товара. Написать метод позволяющий изменять стоимость товара. Написать метод
позволяющий  рассчитывать стоимость товара.  Написать метод для сравнения стоимости товаров.
Написать метод с переменным числом параметров определяющий общее количество товаров.*/

public class Stock {

    private int countOfItems;
    private double unitCost;
    private Stock stocks[];
    private static int countGoods = 0;

    public Stock() {
        countGoods++;
    }

    public Stock(int countOfItems, double unitCost) {
        this.countOfItems = countOfItems;
        this.unitCost = unitCost;
        countGoods++;
    }

    public String toString() {
        return "Stock (" + "countOfItems=" + countOfItems + ", unitCost=" + unitCost + ")";
    }

    public void countChange(int i) {
        countOfItems += i;
        System.out.println("Stock (" + "countOfItems=" + countOfItems + ", unitCost=" + unitCost + ")");
    }

    public void unitCostChange(double d) {
        unitCost += d;
        System.out.println("Stock (" + "countOfItems=" + countOfItems + ", unitCost=" + unitCost + ")");
    }

    public double calculationOfUnitCost(double d, double t, double k) {//d-cost price,t-profit,k-extra charges/discounts to the price
        unitCost = d * t * k;
        return unitCost;
    }

    public double equalsCost(Stock stock) {
        double unitValuDifference = this.unitCost - stock.unitCost;
        return unitValuDifference;
    }

    public void addGoods(Stock stock) {
        stocks[countGoods] = stock;
        countGoods++;
    }

    public static int totalQuantityOfGoods(Stock stocks[]) {  // с переменным числом параметров?
        int totalCountGoods = 0;
        for (Stock stock : stocks) {
            totalCountGoods += stock.countOfItems;
            }
        return totalCountGoods;
        }

    public static int countGoods() {
        return countGoods;
    }

    public int getCountOfItems() {
        return countOfItems;
    }

    public void setCountOfItems(int countOfItems) {
        this.countOfItems = countOfItems;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

}
