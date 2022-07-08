package page.tags;


import com.github.javafaker.Faker;
import com.github.javafaker.Number;

import java.util.Locale;
import java.util.Random;


public class TagsFaker {
    private static Faker faker = new Faker(new Locale("ru"));

    private TagsFaker(){};



    public static String name (){
        return faker.name().name();
    }

    public static String pockemonName (){
        return faker.pokemon().name();
    }

    public static String  city(){
        return faker.address().cityName();
    }

    public static String phone(){
        return faker.phoneNumber().phoneNumber();
    }

    public static String randomEmail() {

        return faker.internet().emailAddress();
    }

}