package myprojects.json.prjjason;

import java.util.ArrayList;

public class Person {
    public String name;
    public String lastname;
    public int age;
    public String email;
    public ArrayList<String> hobbies;

    @SuppressWarnings("CollectionWithoutInitialCapacity")
    public Person() {
        this.hobbies = new ArrayList<>();
    }
}