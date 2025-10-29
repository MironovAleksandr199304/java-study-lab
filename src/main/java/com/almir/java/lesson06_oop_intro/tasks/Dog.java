package lesson06_oop_intro.tasks;

public class Dog {
    String name;
    int age;

    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.printf("%s лает! Гав-гав!%n",name);
    }

    public void celebrateBirthday(){
        age += 1;
        System.out.printf("С днем рождения, %s ! Теперь тебе %d лет!",name,age);
    }

}
