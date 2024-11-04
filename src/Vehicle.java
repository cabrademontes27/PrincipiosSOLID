public abstract class Vehicle {
    protected int power;
    protected int year;
    protected String brand;

    public Vehicle(int power, int year, String brand){
        this.brand = brand;
        this.power = power;
        this.year = year;
    }
    public abstract String description();
}
