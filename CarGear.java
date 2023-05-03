public class CarGear extends CarType {
    @Override
    public String carType() {
        // System.out.println("Car type is SUV");
        String type = "It";
        return type;
    }

    public void noOfGears() {
        System.out.println(carType() + " has 5 gears");
    }

    public void showActualCarType() {
        System.out.println("Actual Car Type is " + super.carType());
    }
}
