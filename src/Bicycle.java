public class Bicycle {
    private String brand;
    private String color;
    // max broj brzina
    private int maxGear;
    private int speed;
    //trenutna brzina na mjenjaču
    private int gear;

    void setSpeed(int value) {
    speed = value;
    }

    void gearUp () {
        gear++;
    }

    void gearDown () {
        gear--;
    }
    void setBrand (String mark) {
        brand = mark;
    }

    void setGear (int value){
        gear = 10;
    }

    void setColor(String boja){
        color = boja;
    }

   public void printState () {
        System.out.println("Moje ime je " + brand +
                ", brzina: " + speed +
                ", gear: " + gear +
                ", maxGear: " + maxGear +
                ", speed: " + speed +
                ", color: " + color);
    }

}
