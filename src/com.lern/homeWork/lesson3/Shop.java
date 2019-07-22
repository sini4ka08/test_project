package com.lern.homeWork.lesson3;

import java.util.Scanner;

/* Создать класс Shop с товарами, покупателями , с методами для входа покупателя в (Login)
регистраци, методы для покупки товара и прочее . Данное приложение далжно быть графическое
Консольное приложение) также предусмотреть возможные ошибки пользователя для ввода (когда
пользователя просят ввести год рождения а он вводит буквы приложение должно корректно
отрабытывать эти ситуации и не упасть). В этом задании следует проевить творчески подход.
Для понимания логики приложения за основу можно взять некоторый функционал который есть
в реальных онлайн магазинах , также не следует делать приложение слишком большим.*/

public class Shop {

    private Product prod[];
    private Customer cust[];
    private int countProd = 0;
    private int countCust = 0;

    public Shop() {
    }

    public Shop(String product, String customer) {
        this.prod = new Product[countProd];
        this.cust = new Customer[countCust];
    }


}
