package week2.homework.cats_static_practice;

import java.util.ArrayList;

/**
 * Created by Andriy on 27.10.2016.
 */
class Cat {

    private String name;
    //1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat(String name) {
        this.name = name;
        cats.add(this);
    }

    //3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
    public static void printCats(){
        String result = "";
        for(int i = 0; i < cats.size(); i++){
            result += cats.get(i).name + "\n";
        }
        System.out.println(result);
    }
}
