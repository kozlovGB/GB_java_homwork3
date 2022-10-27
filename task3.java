package prakt3.GB_java_homwork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.logging.Logger;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);
        Logger log = Logger.getAnonymousLogger();
        Optional<Integer> max = list.stream().max(Integer::compare);
        Optional<Integer> min = list.stream().min(Integer::compare);
        float sred = 0;
        for (int i = 0; i<list.size(); i++){
            sred = sred + list.get(i);
        }
        sred = sred/(list.size());
        log.info(String.valueOf(sred));
        log.info(String.valueOf(max.get()));
        log.info(String.valueOf(min.get()));

    }
}
