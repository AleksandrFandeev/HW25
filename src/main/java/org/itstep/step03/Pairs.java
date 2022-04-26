package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

///**
// * Итерируемая коллекция объектов Pair.
// *
// * @author Michael S. Kirkpatrick and Nathan Sprague
// * @version V1, 8/2017
// */
public class Pairs<K, V> extends Pair<K, V> implements Iterable<Pair<K, V>> {

    /* TODO: Объявить массив фиксированного размера (максимум 10 элементов) объектов Pair */

    private Pair<K,V>[] pairs;
    private int count =0;

    /**
     * Создайте коллекцию, в которой будут храниться элементы, добавленные парами.
     * @param first
     * @param second
     */

    @SuppressWarnings("unchecked")
    public Pairs() {
        pairs=new Pair[10];
    }

    /**
     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
     *
     * @param first  Первый объект
     * @param second Второй объект
     * @return true - если пара была добавлена, false - в противном случае
     */
    public boolean addPair(K first, V second) {
            if(count>=pairs.length){
                return  false;
            }
        pairs[count++]=new Pair<>(first,second);
        return true;
    }


    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }

    /*
     * TODO: Реализуйте итератор здесь на основе документации API по адресу
     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
     * specified
     */
    private class PairIterator implements Iterator<Pair<K, V>> {
        int i;
        boolean invokedHasNext = true;
        /**
         * TODO: Проверить наличие следующего элемента в итераторе
         */
        @Override
        public boolean hasNext() {
            invokedHasNext = false;
//            if(count>=pairs.length){
//                throw new UnsupportedOperationException();
//            }
               return i < count;
        }
    private  boolean isLast(){
            return i==0 && count==1;
    }

        /**
         * TODO: Вернуть следующую пару в итератор.
         * @throws NoSuchElementException - если больше нет элементов для итерации
         */
        @Override
        public Pair<K, V> next() {
            invokedHasNext = true;
            if(count<=i){
                throw new NoSuchElementException("Error");
//            throw new UnsupportedOperationException();
            }
            return pairs[i++];
        }

        /**
         * TODO: Удалите предыдущую пару, возвращенную функцией next()
         */
        @Override
        public void remove() {

            if (!invokedHasNext) {
                throw new IllegalStateException("Method hasNext() should be invoked before method remove()");
            }
            invokedHasNext = false;
            boolean removed=false;
            for (int j =i+1; j <count ; j++) {
                pairs[j-1]=pairs[j];
                removed=true;
            }
            if (isLast()||removed){
                count--;
            }

        }
    }
}
