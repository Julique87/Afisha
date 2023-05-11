package ru.netology.repository;

import ru.netology.domain.AfishaItem;

public class MovieRepository {
    private AfishaItem[] items = new AfishaItem[0];

    private int limit;

    public MovieRepository() {                                      // Конструктор 1, без параметра
        this.limit = 10;

    }


    public MovieRepository(int limit) {                            // Конструктор 2, с параметром
        this.limit = limit;
    }


    public AfishaItem[] findAll() {                                // Возвращение всех элементов в массиве
        return items;
    }

    public void save(AfishaItem item) {                            // Добавление объекта в массив
        AfishaItem[] tmp = new AfishaItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public AfishaItem[] findById(int id) {                                 // Нахождение объекта по идентификатору
        AfishaItem[] tmp = new AfishaItem[1];
        int copyToIndex = 0;
        for (AfishaItem item : items) {
            if (item.getId() == id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            } else {
                items = null;
            }
        }
        items = tmp;
        return items;
    }

    public AfishaItem[] removeById(int id) {                               // Удаление объекта по идентификатору
        AfishaItem[] tmp = new AfishaItem[items.length - 1];
        int copyToIndex = 0;
        for (AfishaItem item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
        return items;
    }

    public AfishaItem[] removeAll() {                               // Удаление всех элементов из массива
        AfishaItem[] tmp = new AfishaItem[0];

        items = tmp;
        return items;
    }

}