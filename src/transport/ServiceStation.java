package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation{

    private Queue<Transport> queueTransport = new LinkedList<>();

    public ServiceStation() {
    }

    public Queue<Transport> getQueueTransport() {
        return queueTransport;
    }

    public void addTransport(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании перед заездом");
        }
        queueTransport.offer(transport);
    }

    public void technicalInspection() {
        Transport transport = queueTransport.poll();
        if (transport != null) {
            System.out.println("Машина " + transport.getBrand() + " " + transport.getModel() + ", прошла техосмотр.");
            technicalInspection();
        } else {
            System.out.println("Нет машин в очереди.");
        }
    }
}
