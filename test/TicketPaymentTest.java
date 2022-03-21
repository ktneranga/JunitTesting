import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
class TicketPaymentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testUserId() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String uid = "";
		
		System.out.println("Enter user id: ");
		uid = myObj.next();
		
		String actual = ticketPayment.userId(uid);
		System.out.println(actual + "\n");
		String expected = ("User ID is valid!");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testTicketId() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String tid = "T001"; //T001
		
		System.out.println("Enter ticket id: ");
		tid = myObj.next();
		
		String actual = ticketPayment.ticketId(tid);
		System.out.println(actual + "\n");
		String expected = ("Ticket ID is valid!");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testTicketAmount() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String amount = ""; //100000
		
		System.out.println("Enter ticket payment Amount: ");
		amount = myObj.next();
		
		String actual = ticketPayment.ticketAmount(amount);
		System.out.println(actual + "\n");
		String expected = ("Payment amount is valid!");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testPaymentMethod() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String paymentMethod = ""; //Master
		
		System.out.println("Enter payment method: ");
		paymentMethod = myObj.next();
		
		String actual = ticketPayment.paymentMethod(paymentMethod);
		String expected = ("Payment method is valid");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testCardPayment() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String cardNumber = "1212 1212 1212 1212"; //
		String expireDate = "12/22"; //
		String cvv = "121"; //
		
		String actual = ticketPayment.cardPayment(cardNumber, expireDate, cvv);
		System.out.println(actual + "\n");
		String expected = ("Valid card number!");
		
		assertEquals(expected, actual);
		
	}
	

	@Test
	void testPaymentDate() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String date = ""; //14/03/2022
		
		System.out.println("Enter payment date: ");
		date = myObj.next();
		
		String actual = TicketPayment.paymentDate(date);
		System.out.println(actual + "\n");
		String expected = ("Invaalid date format!");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testCheackCoupon() {
		TicketPayment ticketPayment = new TicketPayment();
		Scanner myObj = new Scanner(System.in);
		String coupon = ""; //cpn1423
		
		System.out.println("Enter coupon code: ");
		coupon = myObj.next();
		
		String actual = TicketPayment.cheackCoupon(coupon);
		System.out.println(actual + "\n");
		String expected = ("Invalid coupon code");
		
		assertEquals(expected, actual);
		
	}
	

}
