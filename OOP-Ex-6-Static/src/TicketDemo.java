
public class TicketDemo {

	public static void main(String[] args) {
		
		System.out.println(Ticket.getNumberSold());
		
		Ticket myTicket1=new Ticket();
		System.out.println(myTicket1.getNumberSold());
		
		Ticket myTicket2=new Ticket();
		System.out.println(myTicket2.getNumberSold());
		
		
		System.out.println(myTicket2.getInfo());
		System.out.println(myTicket1.getInfo());
		
	}
}
