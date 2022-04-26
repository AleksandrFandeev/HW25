package org.itstep.step02;

// TODO: Пишите ваш код здесь




/**
 * Класс для тестирования кортежа ObjectPair
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class PairDriver{

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
        public static void main(String[] args) {

        Pair<String, Integer> []stadiums = new Pair[3];
        stadiums[0] = new Pair("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair("Michigan Stadium", 109901);
        stadiums[2] = new Pair("Lane Stadium", 66233);
        System.out.println(largestStadium(stadiums));

    }
       public static Object largestStadium (Pair<String, Integer>[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями
           int i;
           int max=0;
           int j=0;
           for ( i = 0; i <stadiums.length ; i++) {
               if(stadiums[i].getSecond()>max){
                   max=stadiums[i].getSecond();
                   j=i;
               }
           }
           return  stadiums[j].getFirst();
       }
}