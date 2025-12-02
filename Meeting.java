class Meeting {
    String topic;
    String time;
    String platform;

    Invitee invitee;

    Meeting() {
        this.topic = "Project Review";
        this.time = "10:00 AM";
        this.platform = "Google Meet";
    }

    void getMeetingInfo() {
        System.out.println("-------Meeting Details ------");
        System.out.println("Topic: " + topic);
        System.out.println("Time: " + time);
        System.out.println("Platform: " + platform);

        this.invitee.getInviteeInfo();
    }
}

