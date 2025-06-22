package utils;

import com.github.javafaker.Faker;
import java.util.Locale;

public class TestData {

    public static final Faker faker = new Faker(new Locale("en-GB"));
    public String   firstName = getRandomFirstName(),
                    lastName = getRandomLastName(),
                    email = getRandomEmail(),
                    gender = getRandomGender(),
                    numberMobile = getRandomNumberMobile(),
                    day = getRandomDay(),
                    month = getRandomMonth(),
                    year = getRandomYear(),
                    hobbies = getRandomHobbies(),
                    subjects = getRandomSubjects(),
                    image = getRandomImage(),
                    currentAddress = getRandomCurrentAddress(),
                    state = getRandomState(),
                    city = getRandomCity(state);

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return faker.options().option(genders);
    }

    public static String getRandomNumberMobile() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String getRandomDay() {
        return String.valueOf(faker.number().numberBetween(1,28));
    }

    public static String getRandomMonth() {
        String[] month = {"December", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November"};

        return faker.options().option(month);
    }

    public static String getRandomYear() {
        return String.valueOf(faker.number().numberBetween(1950, 2000));
    }

    public static String getRandomSubjects() {
        return faker.options().option("English");
    }

    public static String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};

        return faker.options().option(hobbies);
    }

    public static String getRandomImage() {
        return faker.options().option("src/test/resources/kim.jpeg");
    }

    public static String getRandomCurrentAddress() {
        return faker.address().fullAddress();
    }

    public static String getRandomState() {
        String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return faker.options().option(state);
    }

    public static String getRandomCity(String state) {
        String city = "";

        if (state.equals("NCR")) city = faker.options().option("Delhi", "Gurgaon", "Noida");
        if (state.equals("Uttar Pradesh")) city  = faker.options().option("Agra", "Lucknow", "Merrut");
        if (state.equals("Haryana")) city  = faker.options().option("Karnal", "Panipat");
        if (state.equals("Rajasthan")) city  = faker.options().option("Jaipur", "Jaiselmer");

        return city;
    }


}
