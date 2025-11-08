/*A fifth advantage of static factories is that the class of the returned object need not exist 
when the class containing the method is written*/

interface Ticket {
    void print();
}

class StandardTicket implements Ticket {
    public void print() { System.out.println("Standard Ticket"); }
}

class VIPTicket implements Ticket {
    public void print() { System.out.println("VIP Ticket"); }
}

class DiscountTicket implements Ticket {
    public void print() { System.out.println("Discount Ticket"); }
}

class TicketFactory {
    public static Ticket createTicket(String type) {
        switch(type.toLowerCase()) {
            case "standard": return new StandardTicket();
            case "vip": return new VIPTicket();
            case "discount": return new DiscountTicket();
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}
