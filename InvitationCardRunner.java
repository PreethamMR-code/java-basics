public class InvitationCardRunner {
    public static void main(String[] args) {

        InvitationCard card1 = new InvitationCard();
        card1.eventType = "Wedding";
        card1.color = "Red";
        card1.paperType = "Glossy";
        card1.fontStyle = "Cursive";
        card1.quantity = 100;
        card1.getInvitationCardInfo();

        InvitationCard card2 = new InvitationCard();
        card2.eventType = "Birthday";
        card2.color = "Blue";
        card2.paperType = "Matte";
        card2.fontStyle = "Arial";
        card2.quantity = 50;
     class InvitationCardRunner {
    public static void main(String[] args) {

        InvitationCard card1 = new InvitationCard("Wedding", "Red", "Glossy", "Cursive", 100);
        /*card1.eventType = "Wedding";
        card1.color = "Red";
        card1.paperType = "Glossy";
        card1.fontStyle = "Cursive";
        card1.quantity = 100;*/
        card1.getInvitationCardInfo();

        InvitationCard card2 = new InvitationCard("Birthday", "Blue", "Matte", "Arial", 50);
        /*card2.eventType = "Birthday";
        card2.color = "Blue";
        card2.paperType = "Matte";
        card2.fontStyle = "Arial";
        card2.quantity = 50;*/
        card2.getInvitationCardInfo();

        InvitationCard card3 = new InvitationCard("Engagement", "Purple", "Silky", "Times New Roman", 75);
        /*card3.eventType = "Engagement";
        card3.color = "Purple";
        card3.paperType = "Silky";
        card3.fontStyle = "Times New Roman";
        card3.quantity = 75;*/
        card3.getInvitationCardInfo();

        InvitationCard card4 = new InvitationCard("Baby Shower", "Pink", "Glossy", "Verdana", 60);
        /*card4.eventType = "Baby Shower";
        card4.color = "Pink";
        card4.paperType = "Glossy";
        card4.fontStyle = "Verdana";
        card4.quantity = 60;*/
        card4.getInvitationCardInfo();

        InvitationCard card5 = new InvitationCard("Graduation", "White", "Textured", "Calibri", 30);
        /*card5.eventType = "Graduation";
        card5.color = "White";
        card5.paperType = "Textured";
        card5.fontStyle = "Calibri";
        card5.quantity = 30;*/
        card5.getInvitationCardInfo();

        InvitationCard card6 = new InvitationCard("Housewarming", "Green", "Matte", "Tahoma", 40);
        /*card6.eventType = "Housewarming";
        card6.color = "Green";
        card6.paperType = "Matte";
        card6.fontStyle = "Tahoma";
        card6.quantity = 40;*/
        card6.getInvitationCardInfo();

        InvitationCard card7 = new InvitationCard("Retirement", "Orange", "Glossy", "Helvetica", 45);
        /*card7.eventType = "Retirement";
        card7.color = "Orange";
        card7.paperType = "Glossy";
        card7.fontStyle = "Helvetica";
        card7.quantity = 45;*/
        card7.getInvitationCardInfo();

        InvitationCard card8 = new InvitationCard("Anniversary", "Golden", "Textured", "Georgia", 90);
        /*card8.eventType = "Anniversary";
        card8.color = "Golden";
        card8.paperType = "Textured";
        card8.fontStyle = "Georgia";
        card8.quantity = 90;*/
        card8.getInvitationCardInfo();

        InvitationCard card9 = new InvitationCard("Festival", "Multicolor", "Glossy", "Comic Sans", 110);
        /*card9.eventType = "Festival";
        card9.color = "Multicolor";
        card9.paperType = "Glossy";
        card9.fontStyle = "Comic Sans";
        card9.quantity = 110;*/
        card9.getInvitationCardInfo();

        InvitationCard card10 = new InvitationCard("Farewell", "Gray", "Matte", "Lucida", 35);
        /*card10.eventType = "Farewell";
        card10.color = "Gray";
        card10.paperType = "Matte";
        card10.fontStyle = "Lucida";
        card10.quantity = 35;*/
        card10.getInvitationCardInfo();

        InvitationCard card11 = new InvitationCard("Inauguration", "Navy Blue", "Glossy", "Impact", 55);
        /*card11.eventType = "Inauguration";
        card11.color = "Navy Blue";
        card11.paperType = "Glossy";
        card11.fontStyle = "Impact";
        card11.quantity = 55;*/
        card11.getInvitationCardInfo();

        InvitationCard card12 = new InvitationCard("Naming Ceremony", "Sky Blue", "Glossy", "Sans Serif", 65);
        /*card12.eventType = "Naming Ceremony";
        card12.color = "Sky Blue";
        card12.paperType = "Glossy";
        card12.fontStyle = "Sans Serif";
        card12.quantity = 65;*/
        card12.getInvitationCardInfo();

        InvitationCard card13 = new InvitationCard("Reception", "Cream", "Matte", "Segoe UI", 85);
        /*card13.eventType = "Reception";
        card13.color = "Cream";
        card13.paperType = "Matte";
        card13.fontStyle = "Segoe UI";
        card13.quantity = 85;*/
        card13.getInvitationCardInfo();

        InvitationCard card14 = new InvitationCard("Festival Pooja", "Saffron", "Glossy", "Arial Rounded", 70);
        /*card14.eventType = "Festival Pooja";
        card14.color = "Saffron";
        card14.paperType = "Glossy";
        card14.fontStyle = "Arial Rounded";
        card14.quantity = 70;*/
        card14.getInvitationCardInfo();

        InvitationCard card15 = new InvitationCard("Thread Ceremony", "Beige", "Silky", "Palatino", 60);
        /*card15.eventType = "Thread Ceremony";
        card15.color = "Beige";
        card15.paperType = "Silky";
        card15.fontStyle = "Palatino";
        card15.quantity = 60;*/
        card15.getInvitationCardInfo();

        InvitationCard card16 = new InvitationCard("Conference", "Dark Green", "Recycled", "Roboto", 150);
        /*card16.eventType = "Conference";
        card16.color = "Dark Green";
        card16.paperType = "Recycled";
        card16.fontStyle = "Roboto";
        card16.quantity = 150;*/
        card16.getInvitationCardInfo();

        InvitationCard card17 = new InvitationCard("Charity Gala", "Silver", "Metallic", "Serif", 200);
        /*card17.eventType = "Charity Gala";
        card17.color = "Silver";
        card17.paperType = "Metallic";
        card17.fontStyle = "Serif";
        card17.quantity = 200;*/
        card17.getInvitationCardInfo();

        InvitationCard card18 = new InvitationCard("Art Exhibition", "Black", "Linen", "Modern", 70);
        /*card18.eventType = "Art Exhibition";
        card18.color = "Black";
        card18.paperType = "Linen";
        card18.fontStyle = "Modern";
        card18.quantity = 70;*/
        card18.getInvitationCardInfo();

        InvitationCard card19 = new InvitationCard("Concert", "Vibrant Red", "Cardstock", "Bold Sans-serif", 300);
        /*card19.eventType = "Concert";
        card19.color = "Vibrant Red";
        card19.paperType = "Cardstock";
        card19.fontStyle = "Bold Sans-serif";
        card19.quantity = 300;*/
        card19.getInvitationCardInfo();

        InvitationCard card20 = new InvitationCard("Workshop", "Light Blue", "Standard", "Clean Sans-serif", 45);
        /*card20.eventType = "Workshop";
        card20.color = "Light Blue";
        card20.paperType = "Standard";
        card20.fontStyle = "Clean Sans-serif";
        card20.quantity = 45;*/
        card20.getInvitationCardInfo();
    }
}   card2.getInvitationCardInfo();

        InvitationCard card3 = new InvitationCard();
        card3.eventType = "Engagement";
        card3.color = "Purple";
        card3.paperType = "Silky";
        card3.fontStyle = "Times New Roman";
        card3.quantity = 75;
        card3.getInvitationCardInfo();

        InvitationCard card4 = new InvitationCard();
        card4.eventType = "Baby Shower";
        card4.color = "Pink";
        card4.paperType = "Glossy";
        card4.fontStyle = "Verdana";
        card4.quantity = 60;
        card4.getInvitationCardInfo();

        InvitationCard card5 = new InvitationCard();
        card5.eventType = "Graduation";
        card5.color = "White";
        card5.paperType = "Textured";
        card5.fontStyle = "Calibri";
        card5.quantity = 30;
        card5.getInvitationCardInfo();

        InvitationCard card6 = new InvitationCard();
        card6.eventType = "Housewarming";
        card6.color = "Green";
        card6.paperType = "Matte";
        card6.fontStyle = "Tahoma";
        card6.quantity = 40;
        card6.getInvitationCardInfo();

        InvitationCard card7 = new InvitationCard();
        card7.eventType = "Retirement";
        card7.color = "Orange";
        card7.paperType = "Glossy";
        card7.fontStyle = "Helvetica";
        card7.quantity = 45;
        card7.getInvitationCardInfo();

        InvitationCard card8 = new InvitationCard();
        card8.eventType = "Anniversary";
        card8.color = "Golden";
        card8.paperType = "Textured";
        card8.fontStyle = "Georgia";
        card8.quantity = 90;
        card8.getInvitationCardInfo();

        InvitationCard card9 = new InvitationCard();
        card9.eventType = "Festival";
        card9.color = "Multicolor";
        card9.paperType = "Glossy";
        card9.fontStyle = "Comic Sans";
        card9.quantity = 110;
        card9.getInvitationCardInfo();

        InvitationCard card10 = new InvitationCard();
        card10.eventType = "Farewell";
        card10.color = "Gray";
        card10.paperType = "Matte";
        card10.fontStyle = "Lucida";
        card10.quantity = 35;
        card10.getInvitationCardInfo();

        InvitationCard card11 = new InvitationCard();
        card11.eventType = "Inauguration";
        card11.color = "Navy Blue";
        card11.paperType = "Glossy";
        card11.fontStyle = "Impact";
        card11.quantity = 55;
        card11.getInvitationCardInfo();

        InvitationCard card12 = new InvitationCard();
        card12.eventType = "Naming Ceremony";
        card12.color = "Sky Blue";
        card12.paperType = "Glossy";
        card12.fontStyle = "Sans Serif";
        card12.quantity = 65;
        card12.getInvitationCardInfo();

        InvitationCard card13 = new InvitationCard();
        card13.eventType = "Reception";
        card13.color = "Cream";
        card13.paperType = "Matte";
        card13.fontStyle = "Segoe UI";
        card13.quantity = 85;
        card13.getInvitationCardInfo();

        InvitationCard card14 = new InvitationCard();
        card14.eventType = "Festival Pooja";
        card14.color = "Saffron";
        card14.paperType = "Glossy";
        card14.fontStyle = "Arial Rounded";
        card14.quantity = 70;
        card14.getInvitationCardInfo();

        InvitationCard card15 = new InvitationCard();
        card15.eventType = "Thread Ceremony";
        card15.color = "Beige";
        card15.paperType = "Silky";
        card15.fontStyle = "Palatino";
        card15.quantity = 60;
        card15.getInvitationCardInfo();

        InvitationCard card16 = new InvitationCard();
        card16.eventType = "Conference";
        card16.color = "Dark Green";
        card16.paperType = "Recycled";
        card16.fontStyle = "Roboto";
        card16.quantity = 150;
        card16.getInvitationCardInfo();

        InvitationCard card17 = new InvitationCard();
        card17.eventType = "Charity Gala";
        card17.color = "Silver";
        card17.paperType = "Metallic";
        card17.fontStyle = "Serif";
        card17.quantity = 200;
        card17.getInvitationCardInfo();

        InvitationCard card18 = new InvitationCard();
        card18.eventType = "Art Exhibition";
        card18.color = "Black";
        card18.paperType = "Linen";
        card18.fontStyle = "Modern";
        card18.quantity = 70;
        card18.getInvitationCardInfo();

        InvitationCard card19 = new InvitationCard();
        card19.eventType = "Concert";
        card19.color = "Vibrant Red";
        card19.paperType = "Cardstock";
        card19.fontStyle = "Bold Sans-serif";
        card19.quantity = 300;
        card19.getInvitationCardInfo();

        InvitationCard card20 = new InvitationCard();
        card20.eventType = "Workshop";
        card20.color = "Light Blue";
        card20.paperType = "Standard";
        card20.fontStyle = "Clean Sans-serif";
        card20.quantity = 45;
        card20.getInvitationCardInfo();
    }
}