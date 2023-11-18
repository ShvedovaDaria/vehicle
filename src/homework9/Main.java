package homework9;

class Vehicle {
    double price;
    int speed;
    int year;
    String name;

    public Vehicle(double price, int speed, int year, String name) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.name = name;
    }
}

class Plane extends Vehicle {
    int passengers;

    public Plane(double price, int speed, int year, String name, int passengers) {
        super(price, speed, year, name);
        this.passengers = passengers;
    }
}

class Car extends Vehicle {
    int id;
    String color;
    int doors;

    public Car(double price, int speed, int year, String name, int id, String color, int doors) {
        super(price, speed, year, name);
        this.id = id;
        this.color = color;
        this.doors = doors;
    }
}

class Ship extends Vehicle {
    int passengers;
    String description;

    public Ship(double price, int speed, int year, String name, int passengers, String description) {
        super(price, speed, year, name);
        this.passengers = passengers;
        this.description = description;
    }
}

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(5000000, 800, 2020, "Boeing 747", 416);
        Car car = new Car(25000, 120, 2022, "Toyota Camry", 123, "Blue", 4);
        Ship ship = new Ship(10000000, 30, 2018, "Titanic", 2200, "Luxury passenger ship");

        // Виведення інформації про кожен засіб пересування
        System.out.println("Інформація про літак:");
        System.out.println("Назва: " + plane.name);
        System.out.println("Ціна: $" + plane.price);
        System.out.println("Максимальна швидкість: " + plane.speed + " км/год");
        System.out.println("Рік випуску: " + plane.year);
        System.out.println("Кількість пасажирів: " + plane.passengers);

        System.out.println("\nІнформація про автомобіль:");
        System.out.println("ID: " + car.id);
        System.out.println("Назва: " + car.name);
        System.out.println("Ціна: $" + car.price);
        System.out.println("Максимальна швидкість: " + car.speed + " км/год");
        System.out.println("Рік випуску: " + car.year);
        System.out.println("Колір: " + car.color);
        System.out.println("Кількість дверей: " + car.doors);

        System.out.println("\nІнформація про корабель:");
        System.out.println("Назва: " + ship.name);
        System.out.println("Ціна: $" + ship.price);
        System.out.println("Максимальна швидкість: " + ship.speed + " км/год");
        System.out.println("Рік випуску: " + ship.year);
        System.out.println("Кількість пасажирів: " + ship.passengers);
        System.out.println("Опис: " + ship.description);
    }
}