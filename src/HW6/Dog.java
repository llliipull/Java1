package HW6;

public class Dog extends Animal {

    final int maxRunRange = 500;
    final int maxSwimRange = 10;

    public Dog (String name){
        super(name);
    }

    @Override
    public void swim(int swimRange){
        if (swimRange <= maxSwimRange) {
            System.out.println(getName() + " проплывает " + swimRange + " метров");
        } else {
            System.out.println("Животное так далеко не плавает");
        }
    }

    @Override
    public void run(int runRange){
        if (runRange <= maxRunRange){
            System.out.println(getName() + " пробегает " + runRange + " метров");
        } else {
            System.out.println("Животное так далеко не бегает");
        }
    }

}
