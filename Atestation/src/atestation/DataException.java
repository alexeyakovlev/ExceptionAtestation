package atestation;

public class DataException extends Exception {
    public DataException() {

    }

    public void dataException (String i) {
        System.out.println("Ошибка: Неверный формат данных");
        System.out.printf("Неверный формат данных: %s", i);
        System.out.println();
    }
}
