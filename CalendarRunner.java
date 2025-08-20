class CalendarRunner {
    public static void main(String args[]) {
        Calendar calendar = new Calendar();
        Meeting meeting = new Meeting();
        Invitee invitee = new Invitee();

        calendar.meeting = meeting;
        meeting.invitee = invitee;

        calendar.getCalendarInfo();
    }
}