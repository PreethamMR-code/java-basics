public class InvitationCard {
    String eventType;
    int quantity;
    String color;
    String fontStyle;
    String paperType;

    public void getInvitationCardInfo() {
        System.out.println("\nInvitation Card Details:");
        System.out.println("Event Type: " + eventType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
        System.out.println("Font Style: " + fontStyle);
        System.out.println("Paper Type: " + paperType);
    }
}