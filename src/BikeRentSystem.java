public class BikeRentSystem {
    public static void main(String[] args) {
        Bicycle bmx = new Bicycle();
        bmx.setBrand("Devron");
        bmx.setSpeed(15);
        bmx.gearUp();
        bmx.setColor("White");
        bmx.printState();
    }

}
