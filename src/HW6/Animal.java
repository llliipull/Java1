package HW6;

public abstract class Animal {

    private String name;
    private int maxRunRange;
    private int maxSwimRange;



    public Animal(String name) {
        this.name = name;
    }


    public int getMaxRunRange() {
        return maxRunRange;
    }

    public String getName(){
        return name;
    }


    public abstract void swim(int maxSwimRange);

    public void run (int runRange) {
            if (runRange <= getMaxRunRange()){
                System.out.println(this.name + " пробегает " + runRange + " метров");
            } else {
                System.out.println("Животное так далеко не бегает");
            }

    }


}
