package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    @Test
    public void shouldAdd() {                                 // Добавление фильма и вывод всех фильмов в порядке добавления

        AfishaManager manager = new AfishaManager();

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель «Белград»");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");


        String[] expected = {"Бладшот", "Вперёд", "Отель «Белград»", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOne() {                                 // Добавление одного фильма, граничное значение

        AfishaManager manager = new AfishaManager();

        manager.add("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFind10LastConstructor1() {                    //   Вывести 10 последних в обратном порядке, Конструктор 1

        AfishaManager manager = new AfishaManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastConstructor2() {                    //   Вывести последние фильмы в обратном поряке, Конструктор 2

        AfishaManager manager = new AfishaManager(5);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");


        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldТNotFindLastAboveLimitConstructor1() {                    //   Не вывести  последни фильмы более лимита, Конструктор 1

        AfishaManager manager = new AfishaManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");
        manager.add("Film13");
        manager.add("Film14");
        manager.add("Film15");

        String[] expected = {"Film15", "Film14", "Film13", "Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldТNotFindLastAboveLimitConstructor2() {                    //   Не вывести  последни фильмы более лимита, Конструктор 1

        AfishaManager manager = new AfishaManager(5);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");


        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldТNotFindLastAboveBorderHighConstructor1() {                    //   Не вывести  последни фильмы на 1 выше граничного значения, Конструктор 1

        AfishaManager manager = new AfishaManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");


        String[] expected = {"Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldТNotFindLastAboveBorderHighConstructor2() {                    //   Не вывести  последние фильмы на 1 выше граничного значения, Конструктор 1

        AfishaManager manager = new AfishaManager(5);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");


        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
