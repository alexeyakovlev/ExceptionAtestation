package atestation;

public class SexException extends Exception{
    public SexException () {
    }

    public void sexException(String i) {
        System.out.println("Ошибка: некорректный пол");
        System.out.printf("Введены некоректные данные: %s", i);
        System.out.println();
    }
}
