package chapter8;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment1 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment.volume();
        System.out.println("Oбъeм shipment равен " + vol);
        System.out.println("Bec shipment равен " + shipment.weight);
        System.out.println("Cтoимocть доставки: $" + shipment.cost);
        System.out.println();

        vol = shipment1.volume();
        System.out.println("Oбъeм shipment1 равен " + vol);
        System.out.println("Bec shipment1 равен " + shipment1.weight);
        System.out.println("Cтoимocть доставки: $" + shipment1.cost);
        System.out.println();



    }
}
