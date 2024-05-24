package atestation;

import java.util.Scanner;

public class InputData {
    public String[] enterData () {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через пробел (строка должна содержать Ф.И.О., дату рождения - dd.mm.yyyy, номер телефона, пол м/ж): ");
            String data = sc.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные, дополните строрку");
            } else System.out.println("Вы ввели лишние данные, удалите лишнее");
        }
    }
}
