public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 500;
    }

    public int getVolume() {
        return volume;
    }

    public void drinkWater() {
        this.volume -= 50;
    }

    public void emptyBottle() {
        this.volume = 0;
    }

    public void fillUp() {
        this.volume = 500;
    }
}
