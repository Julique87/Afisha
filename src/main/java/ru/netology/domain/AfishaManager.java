package ru.netology.domain;

import ru.netology.repository.MovieRepository;

public class AfishaManager {
    private MovieRepository repo;

    public AfishaManager(MovieRepository repo) {
        this.repo = repo;
    }

    public void add(AfishaItem item) {                              // Добавление фильма
        repo.save(item);
    }

    public AfishaItem[] findAll() {
        AfishaItem[] all = repo.findAll();                          // Вывод всех фильмов
        return all;
    }

    public AfishaItem[] findById() {
        int i = 5;
        AfishaItem[] movie = repo.findById(i);                      // Нахождение объекта по идентификатору

        return movie;

    }
    public AfishaItem[] removeById() {
        int i = 3;
        AfishaItem[] afterRemove = repo.removeById(i);              // Удаление объекта по идентификатору
        return afterRemove;

    }

    public AfishaItem[] removeAll() {
        AfishaItem[] zero = repo.removeAll();                      // Удаление всех элементов из массива
        return zero;
    }


}