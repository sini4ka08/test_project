package com.lern.homeWork.lesson3;

public class MainStock {

    public static void main(String[] args) {

        Stock pants = new Stock(100, 10.0);
        Stock shirt = new Stock(200, 5.7);
        Stock shoes = new Stock(300, 2.5);

        Stock[] stocks = new Stock[]{pants, shirt, shoes};

        for (int i = 0; i < stocks.length; i++) {
            System.out.println(stocks[i].toString());
        }

        pants.countChange(-5);

        shoes.unitCostChange(2.8);

        Stock belt = new Stock();
        System.out.println("unitCost belt = " + belt.calculationOfUnitCost(3.1,1.5, 1.2));

        System.out.println("unit value difference = " + pants.equalsCost(belt));
        System.out.println("unit value difference = " + shoes.equalsCost(pants));

        System.out.println("total quantity of goods = " + Stock.totalQuantityOfGoods(stocks));
    }
}
