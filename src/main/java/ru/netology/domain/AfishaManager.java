package ru.netology.domain;

public class AfishaManager {
    private String[] afisha = new String[0];
    private int limit;

    public AfishaManager() {                               // Конструктор 1, без параметра
        this.limit = 10;

    }

    public AfishaManager(int limit) {                     // Конструктор 2, с параметром
        this.limit = limit;

    }

    public void add(String movie) {                       // Добавление фильма
        String[] tmp = new String[afisha.length + 1];
        for (int i = 0; i < afisha.length; i++) {
            tmp[i] = afisha[i];
        }
        tmp[tmp.length - 1] = movie;
        afisha = tmp;
    }

    public String[] findAll() {                       // Вывод всех фильмов в порядке добавления
        return afisha;

    }

    public String[] findLast() {                       // Вывод последних фильмов в побратном порядке
        int resultLenth;
        if (afisha.length < limit) {
            resultLenth = afisha.length;
        } else {
            resultLenth = limit;
        }
        String[] result = new String[resultLenth];
        for (int i = 0; i < result.length; i++) {
            result[i] = afisha[afisha.length - 1 - i];
        }
        return result;
    }
}