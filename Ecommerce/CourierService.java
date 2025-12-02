class CourierService {
    public static void dispatch() {
        System.out.println("Courier dispatch in progress...");

        DeliveryTrack.trackStatus();

        System.out.println("Item dispatched");
    }
}