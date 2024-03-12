// Access Modifiers and Inheritance
public class ElectricCar extends Car {

    @Override
    public final String drive() {
        return "Driving an electric car";
    }

    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        final Car car1 = new ElectricCar();
        System.out.print(car.drive());


    }
}
    class Automobile {
        private String drive() {
            return "Driving vehicle";
        }
    }

    class Car extends Automobile {
        protected String drive() {
            return "Driving car";
        }
    }



