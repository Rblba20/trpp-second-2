package ru.mirea.trpp.second2;

import io.micronaut.runtime.Micronaut;

/** Класс - точка входа в приложение. */
public class Application {

    /**
     * Точка входа.
     * @param args аргументы
     */
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
