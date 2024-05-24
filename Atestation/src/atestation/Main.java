package atestation;

import java.io.IOException;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        DataPars dataPsrs = new DataPars();
        String newFileName = null;
        WriteFile writeFile = new WriteFile(); // Создается объект класса WriteFile

        HashMap<String, Object> data = dataPsrs.parsInputData(); // Иннициализация словаря
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = dataPsrs.parsInputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);
    }
}
