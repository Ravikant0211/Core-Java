package accessmodifiers.test.zoo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, "bark");
    }

    public void wagTail() {
        System.out.println(getName() + " is wagging its tail");
    }

    private String getName() {
        return getClass().getSimpleName();
    }

    public void setDogSound(String newSound) {
        changeSound(newSound);
    }
}
