package HW7;

public class Cat {

    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        fullness = false;
        countOfCats++;
    }

    public void eat (Plate plate){
        if (plate.getFood() - appetite >= 0){
            plate.setFood(plate.getFood() - appetite);
            setFullness(true);
            System.out.println("Кот " + name + " поел, в тарелке осталось еды: " + plate.getFood());
        } else {
            System.out.println("В тарелке недостаточно еды для кота " + name);
        }

    }


    private static int countOfCats = 0;
    private String name;
    private int appetite;
    private boolean fullness;

    public String getName() {
        return name;
    }

    public int getAppetite () {
        return appetite;
    }

    public static int getCountOfCats() {
        return countOfCats;
    }

    public boolean getFullness () {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }
}
