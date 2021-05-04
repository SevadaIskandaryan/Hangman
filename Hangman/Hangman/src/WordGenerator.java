import words.*;

import java.util.ArrayList;
import java.util.List;

public class WordGenerator {

    public static List<Word> filteredWordList;
    private List<Word> wordList;

    public WordGenerator() {
        filteredWordList =  new ArrayList<>();
        wordList  =  new ArrayList<>();
        storeWords();
    }

    public void Generate(Type type, Level level) {
        for(int i = 0; i< wordList.size();i++){
            if(wordList.get(i).getLevel() == level && wordList.get(i).getClassType() == type){
                System.out.println(wordList.get(i));
                filteredWordList.add(wordList.get(i));
            }
        }
    }
    private void storeWords() {
       wordList.addAll(getListOfCars());
        wordList.addAll(getListOfAnimals());
        wordList.addAll(getListOfCity());
        wordList.addAll(getListOfCountry());
        wordList.addAll(getListOfFruit());

    }
    public List<Word> getListOfCars(){
        List<Word> list = new ArrayList<>();
        list.add(new Car("Toyota", Level.EASY,Type.CAR));
        list.add(new Car("KIA", Level.EASY,Type.CAR));
        list.add(new Car("Opel", Level.EASY,Type.CAR));

        list.add(new Car("Nissan", Level.MEDIUM,Type.CAR));
        list.add(new Car("Ferrari", Level.MEDIUM,Type.CAR));
        list.add(new Car("Audi", Level.MEDIUM,Type.CAR));

        list.add(new Car("Lamborghini", Level.HARD,Type.CAR));
        list.add(new Car("Mercedes", Level.HARD,Type.CAR));
        list.add(new Car("Bugatti", Level.HARD,Type.CAR));

        return list;
    }

    public List<Word> getListOfAnimals(){
        List<Word> list = new ArrayList<>();
        list.add(new Animal("Cat", Level.EASY,Type.ANIMAL));
        list.add(new Animal("Dog", Level.EASY,Type.ANIMAL));
        list.add(new Animal("Bird", Level.EASY,Type.ANIMAL));

        list.add(new Animal("Shark", Level.MEDIUM,Type.ANIMAL));
        list.add(new Animal("Eagle", Level.MEDIUM,Type.ANIMAL));
        list.add(new Animal("Whale", Level.MEDIUM,Type.ANIMAL));

        list.add(new Animal("Anaconda", Level.HARD,Type.ANIMAL));
        list.add(new Animal("Elephant", Level.HARD,Type.ANIMAL));
        list.add(new Animal("Python", Level.HARD,Type.ANIMAL));

        return list;
    }
    public List<Word> getListOfCity(){
        List<Word> list = new ArrayList<>();
        list.add(new City("Paris", Level.EASY,Type.CITY));
        list.add(new City("New York", Level.EASY,Type.CITY));
        list.add(new City("Texas", Level.EASY,Type.CITY));

        list.add(new City("Yerevan", Level.MEDIUM,Type.CITY));
        list.add(new City("Tokyo", Level.MEDIUM,Type.CITY));
        list.add(new City("Moscow", Level.MEDIUM,Type.CITY));

        list.add(new City("Damascus", Level.HARD,Type.CITY));
        list.add(new City("Dortmund", Level.HARD,Type.CITY));
        list.add(new City("Berlin", Level.HARD,Type.CITY));

        return list;
    }

    public List<Word> getListOfCountry(){
        List<Word> list = new ArrayList<>();
        list.add(new Country("Syria", Level.EASY,Type.COUNTRY));
        list.add(new Country("Libyan", Level.EASY,Type.COUNTRY));
        list.add(new Country("France", Level.EASY,Type.COUNTRY));

        list.add(new Country("Brazil", Level.MEDIUM,Type.COUNTRY));
        list.add(new Country("Korea", Level.MEDIUM,Type.COUNTRY));
        list.add(new Country("Sudan", Level.MEDIUM,Type.COUNTRY));

        list.add(new Country("Maldive", Level.HARD,Type.COUNTRY));
        list.add(new Country("German", Level.HARD,Type.COUNTRY));
        list.add(new Country("Sutherland", Level.HARD,Type.COUNTRY));

        return list;
    }
    public List<Word> getListOfFruit(){
        List<Word> list = new ArrayList<>();
        list.add(new Fruit("Apple", Level.EASY, Type.FRUIT));
        list.add(new Fruit("Peach", Level.EASY,Type.FRUIT));
        list.add(new Fruit("Orange", Level.EASY,Type.FRUIT));

        list.add(new Fruit("Banana", Level.MEDIUM,Type.FRUIT));
        list.add(new Fruit("Coconut", Level.MEDIUM,Type.FRUIT));
        list.add(new Fruit("Blue Berry", Level.MEDIUM,Type.FRUIT));

        list.add(new Fruit("Pine Apple", Level.HARD,Type.FRUIT));
        list.add(new Fruit("Water Melon", Level.HARD,Type.FRUIT));
        list.add(new Fruit("Dragon Fruit", Level.HARD,Type.FRUIT));

        return list;
    }

}
