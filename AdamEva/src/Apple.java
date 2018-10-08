public class Apple {
    public int weight = (int)Math.floor(Math.random() * 90);

    public boolean isEmpty() {
        if (this.weight <= 0) {
            return true;
        }
        return false;
    }
}
