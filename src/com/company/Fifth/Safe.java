package com.company.Fifth;
import java.util.*;

public class Safe {
    private ArrayList<Item> bestItems = null;
    private double maxW;
    private double bestPrice;
    public Safe(double _maxW)
    {
        maxW = _maxW;
    }

    //вычисляет общий вес набора предметов
    //вычисляет общий вес набора предметов
    private double CalcVolume(List<Item> items)
    {
        double sumVolume = 0;

        for(Item i: items)
        {
            sumVolume += i.volume;
        }

        return sumVolume;
    }

    //вычисляет общую стоимость набора предметов
    private double CalcValue(List<Item> items)
    {
        double sumValue = 0;

        for(Item i: items)
        {
            sumValue += i.value;
        }

        return sumValue;
    }

    private void CheckSet(ArrayList<Item> items)
    {
        if (bestItems == null)
        {
            if (CalcVolume(items) <= maxW)
            {
                bestItems = items;
                bestPrice = CalcValue(items);
            }
        }
        else
        {
            if(CalcVolume(items) <= maxW && CalcValue(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = CalcValue(items);
            }
        }
    }

    //создание всех наборов перестановок значений
    public void MakeAllSets(ArrayList<Item> items)
    {
        if (items.size() > 0)
            CheckSet(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newSet = new ArrayList<Item>(items);

            newSet.remove(i);

            MakeAllSets(newSet);
        }
    }

    //возвращает решение задачи (набор предметов)
    public ArrayList<Item> GetBestSet()
    {
        return bestItems;
    }
}
