package ru.netology.domain;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.repository.MovieRepository;

import static org.mockito.Mockito.*;

public class AfishaManagerTest {
    MovieRepository repo = Mockito.mock(MovieRepository.class);
    AfishaManager manager = new AfishaManager(repo);

    AfishaItem item1 = new AfishaItem(1, 11, "Бладшот", "link 1", "боевик", false);
    AfishaItem item2 = new AfishaItem(2, 22, "Вперёд", "link 2", "мультфильм", false);
    AfishaItem item3 = new AfishaItem(3, 33, "Отель «Белград»", "link 3", "комедия", false);
    AfishaItem item4 = new AfishaItem(4, 44, "Джентельмены", "link 4", "боевик", false);
    AfishaItem item5 = new AfishaItem(5, 55, "Человек-невидимка", "link 5", "ужасы", false);
    AfishaItem item6 = new AfishaItem(6, 66, "Тролли. Мировой тур", "link 6", "мультфильм", true);
    AfishaItem item7 = new AfishaItem(7, 77, "Номер один", "link 7", "комедия", true);


    @Test
    public void shouldFindAll() {                                                     // Вывод всех фильмов в порядке добавления
        AfishaItem[] items = {item1, item2, item3, item4, item5, item6, item7};
        doReturn(items).when(repo).findAll();

        AfishaItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        AfishaItem[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}

