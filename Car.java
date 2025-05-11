public class Car {
    public String brand;
    public String year;

    public Car(String brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public void showCars() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "2020");
        Car c2 = new Car("Honda", "2025");
        Car c3 = new Car("Ford", "2021");

        c1.showCars();
        c2.showCars();
        c3.showCars();
    }
}
