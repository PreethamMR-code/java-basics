class InvitationCard {
    String eventType;
    int quantity;
    String color;
    String fontStyle;
    String paperType;

    InvitationCard(){
        System.out.println("InvitationCard constructor is invoked");
    }

    InvitationCard(String eventType, String color, String paperType, String fontStyle, int quantity){
        System.out.println("InvitationCard parameterized constructor is invoked");
        this.eventType = eventType;
        this.color = color;
        this.paperType = paperType;
        this.fontStyle = fontStyle;
        this.quantity = quantity;
    }

    public void getInvitationCardInfo() {
        System.out.println("\nInvitation Card Details:");
        System.out.println("Event Type: " + eventType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
        System.out.println("Font Style: " + fontStyle);
        System.out.println("Paper Type: " + paperType);
    }
}