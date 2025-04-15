package finalKeyword;

public final class Car extends Vehicle {

    private final int speedLimit = 200;

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags() {
        System.out.println("4 Air Bags");
    }
}

// Final keyword: Final keyword is used to freeze a variable, method or a class.
// Final keyword does not apply to constructor.
// -  If applied to variable, the variable can not be reassigned a new value;
// -  If applied to a method, the method can not be overridden by the extending class.
// -  If applied to a class, the class can not be extended by any other class.
