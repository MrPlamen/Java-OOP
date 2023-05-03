public class Car {
    private String make;
    private String model;
    private int year;
    private int horsepower;
    private int topSpeed;

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private int horsepower;
        private int topSpeed;

        public Builder(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Builder withHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Builder withTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.horsepower = builder.horsepower;
        this.topSpeed = builder.topSpeed;
    }

    // Getters and setters here...
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder("Ford", "Mustang", 2021)
                .withHorsepower(460)
                .withTopSpeed(155)
                .build();
    }
}
