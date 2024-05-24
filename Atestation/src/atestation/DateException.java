package atestation;

public class DateException extends Exception{
    public DataException () {
    }

    public void dataException(String i) {
        System.out.println("Ошибка: неверный формат даты");
        System.out.printf("Неверный формат даты: %s", i);
        System.out.println();
    }
}
