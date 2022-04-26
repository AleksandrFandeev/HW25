package org.itstep.step02;

// TODO: Реализуйте здесь обобщенный класс Pari

public class Pair<T,U> {

    private  T first ;
    private  U second;
    private Pair<T,U>[] pairs;
      /**
     * Создаем объект ObjectTuple на базе двух объектов.
     *
     * @param first  первый объект
     * @param second второй объект
     */
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }


    public Pair() {pairs=new Pair[3];}

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}