package sky.pro.java.course2.hw21.autoRacing;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> queue;

    public ServiceStation() {
        queue = new LinkedList<>();
    }

    private void add(Transport transport) {
        queue.add(transport);
    }

    public void addCar(Car car) {
        add(car);
    }

    public void addTruck (Truck truck) {
        add(truck);
    }

    public void carryOutMaintenance() {
        Transport transport = queue.poll();
        if (transport != null) {
            System.out.println(transport.getBrand() + " " + transport.getModel() + " проходит техобслуживание");
        }
    }
}
