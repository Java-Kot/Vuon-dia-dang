public class World {
    public static void main(String[] args) {
        Human adam = new Human("adam", true);
        System.out.println("Adam được sinh ra");
        Human eva = new Human("eva", false);
        System.out.println("Eva được sinh ra");
        God.say("không được ăn táo, nếu ăn sẽ chết!");
        Snake.say("Ăn táo đi ngon lắm, không chết đâu");
        Apple apple = new Apple();
        while (apple.weight > 0) {
            eva.eat(apple);
            adam.eat(apple);
        }
        eva.sleep();
        adam.sleep();
        God.say("Eva! Bà sẽ phải vâng lời chồng và đau đớn khi sinh con");
        God.say("Adam! người sẽ phải cuốc đất trồng cây mà ăn");
        System.out.println("End !");
    }
}
