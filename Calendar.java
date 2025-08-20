class Calendar {
    String year;
    String month;
    int day;

    Meeting meeting;

    Calendar() {
        this.year = "2025";
        this.month = "August";
        this.day = 1;
    }

    void getCalendarInfo() {
        System.out.println("-------Calendar Details-------");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        this.meeting.getMeetingInfo();
    }
}

