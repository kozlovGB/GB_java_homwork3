package prakt3.GB_java_homwork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Logger log = Logger.getAnonymousLogger();
        for (int i = 0; i<list.size(); i++){
            if (list.get(i) % 2==0){
                list.remove(i);
            }
        }
        log.info(String.valueOf(list));
    }
}
