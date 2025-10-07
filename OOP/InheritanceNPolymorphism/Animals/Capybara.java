package Animals;

public class Capybara extends Animal{
    static int capyQuantity;

    public Capybara(String name, String color, String mood, int height) {
        super(name, color, mood, height);
        capyQuantity ++;
    }

    @Override
    public String toString() {
        return "Capybara{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void noise() {
        System.out.println("Barg");
    }
}
