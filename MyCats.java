package week2.homework.cats_static_practice;

import static week2.homework.cats_static_practice.Cat.cats;

/**
 * Created by Andriy on 27.10.2016.
 */
public class MyCats {
    public static void main(String[] args){

        //Создать 10 объектов Cat.
        for(int i = 0; i < 10; i++){
            //2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
            cats.add(new Cat("cat" + (i + 1)));
        }

        Cat.printCats();
    }
}
