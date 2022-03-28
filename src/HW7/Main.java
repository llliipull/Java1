package HW7;

public class Main {

    public static void main (String[] args) {

        Plate plate = new Plate(2000);

        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Котик", 100);
        catsArray[1] = new Cat("Кот", 200);
        catsArray[2] = new Cat("Котан", 300);
        catsArray[3] = new Cat("Котище", 400);

        for (int i = 0; i < catsArray.length; i++){
            catsArray[i].eat(plate);
        }

        plate.addFood(500);
        System.out.println("Еды в тарелке после добавления: " + plate.getFood());
    }
}
