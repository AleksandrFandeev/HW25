package org.itstep.step04;

import org.itstep.step02.Pair;

/**
 * Обобщения. Вопросы о компиляции
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class CompileDriver {

    public static void main(String[] args) {

        // TODO: перед удалением комментариев отметьте каждую строчку, где есть присвоение - сокмпилируется ли код или нет
        Pair<String, Integer> p1;
        Pair<String, Number> p2;
        Pair<Object, Object> p3;
        Pair<?, ?> p4;
        Pair<?, ? extends Number> p5;

        p1 = new Pair<String, Integer>("A", 7);    // присвоение
        int a = p1.getSecond();

//        p1 = new Pair<Integer, Double>(23, 12.0);   //net
//
//        p2 = new Pair<String, Integer>("B", 8);     //net

//        p3 = new Pair<String, Integer>("C", 9);     //net
//
        p4 = new Pair<String, String>("House", "Car");
        p4 = new Pair<String, Integer>("D", 10);     //присвоение
//
//        Integer b = p4.getSecond();                  //net
        Integer c = (Integer) p4.getSecond();
//
//        p5 = new Pair<String, String>("E", "G");
        p5 = new Pair<String, Double>("E", 11.0);
        p5 = new Pair<String, Integer>("E", 11);   //присвоение
//
//        Integer d = p5.getSecond();
        Integer e = (Integer) p5.getSecond();
    }
}
