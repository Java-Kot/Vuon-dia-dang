public class Human {
    String name;
    int age;
    boolean gender;

    public Human() {
    }

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void say(String words) {
        System.out.println(this.name + ": " + words);
    }

    public void eat(Apple apple) {
        if (apple.isEmpty()) {
            System.out.println("Hết táo");
        } else {
            apple.weight -= 1;
            System.out.println(this.name + " ăn 1 quả táo");
        }
    }

    public void sleep() {
        System.out.println(this.name + " đi ngủ");
    }
}
