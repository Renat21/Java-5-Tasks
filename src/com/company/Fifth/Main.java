package com.company.Fifth;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Протестировать:\nсо своими продуктами - 1\nс готовым тестированием - 2\n");
        Integer help = myScanner.nextInt();

        if (help == 1) {
            System.out.print("Введите вместимость сейфа - ");
            Integer vol = myScanner.nextInt();

            System.out.print("Введите количество предметов - ");
            Integer intCount = myScanner.nextInt();
            Integer volume, value;
            String name;
            ArrayList<Item> array = new ArrayList<>();
            for (int i = 0; i < intCount; i++) {
                System.out.print("Введите название предмета - ");
                name = myScanner.next();
                System.out.print("Введите обьем предмета - ");
                volume = myScanner.nextInt();
                System.out.print("Введите ценнсоть предмета- ");
                value = myScanner.nextInt();
                array.add(new Item(name, volume, value));
            }

            Safe safeCurrent = new Safe(vol);
            safeCurrent.MakeAllSets(array);
            ArrayList<Item> ar = safeCurrent.GetBestSet();
            for (Item elem : ar)
                System.out.println(elem.name);
        }
        else {
            System.out.print("Введите вместимость сейфа - ");
            Integer vol = myScanner.nextInt();

            ArrayList<Item> items = new ArrayList<>();
            items.add(new Item("Kubik", 300, 1));
            items.add(new Item("Notebook", 50, 3));
            items.add(new Item("Window", 100, 11));
            items.add(new Item("Milk", 10, 2));
            items.add(new Item("Mirror", 20, 5));

            Safe safeCurrent = new Safe(vol);
            safeCurrent.MakeAllSets(items);
            ArrayList<Item> ar = safeCurrent.GetBestSet();
            for (Item elem : ar)
                System.out.println(elem.name);
        }
    }
}