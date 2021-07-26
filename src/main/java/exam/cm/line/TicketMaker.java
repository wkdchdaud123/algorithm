package exam.cm.line;

public class TicketMaker {
    private int ticket = 0;

    private TicketMaker() {}

    public static TicketMaker getInstance() {
        return InnerClass.ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }

    private static class InnerClass {
        private static final TicketMaker ticketMaker = new TicketMaker();
    }

}
