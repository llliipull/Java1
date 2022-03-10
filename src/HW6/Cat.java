package HW6;

public class Cat extends Animal {

    final int maxRunRange = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int maxSwimRange){
        System.out.println("Коты не плавают");
    }




}

