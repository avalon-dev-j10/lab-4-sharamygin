package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.randomizers.RandomDate;
import ru.avalon.java.dev.j10.labs.randomizers.RandomPersona;
import ru.avalon.java.dev.j10.labs.randomizers.RandomString;
import static ru.avalon.java.dev.j10.labs.randomizers.RandomString.getStr;
import ru.avalon.java.dev.j10.labs.sort.SortClass;

public class Main {
    
    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
            
	    String[] strings = new String[20];
            for(int i=0; i<strings.length; i++){
            strings[i] = getStr();
            }
            System.out.println("Сгенерированные пароли в случайном порядке:");
            RandomString.dispRandString(strings);
            
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Persona[20];
            for (int i=0; i < persons.length; i++) {
            persons[i] = new RandomPersona().getPersona();
            }
            System.out.println("Персонажи в случайном порядке:");
            RandomPersona.dispRandPersona(persons);
 
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortClass();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new MyComparator.Reverse();
        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        System.out.println("Сортировка персонажей:");
        RandomPersona.dispRandPersona(persons);
        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        System.out.println("Сортированные пароли:");
        RandomString.dispRandString(strings);
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println("Обратная сортировка паролей:");
        RandomString.dispRandString(strings);
    }
}