import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
class TicketReservationTest {

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
	void testFromTO() {
		Scanner myObj = new Scanner(System.in);
		String from = "";
		String to = "";
		
		System.out.println("Enter Start location: ");
		from = myObj.next();
		
		System.out.println("Enter End location: ");
		to = myObj.next();
		
		String actual = TicketReservation.fromTO(from, to);
		System.out.println(actual + "\n");
		String expected = ("Valid, flights are available!");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testPassportNumber() {
		Scanner myObj = new Scanner(System.in);
		String number = "";
		
		System.out.println("Enter Passport number: ");
		number = myObj.next();
		
		String actual = TicketReservation.passportNumber(number);
		System.out.println(actual + "\n");
		String expected = ("Valid passport number!");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testTripMethod() {
		Scanner myObj = new Scanner(System.in);
		String tripMethod = "";
		
		System.out.println("Enter Trip method: ");
		tripMethod = myObj.next();
		
		String actual = TicketReservation.tripMethod(tripMethod);
		System.out.println(actual);
		String expected = ("Valid trip method");
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testUserEmail() {
		Scanner myObj = new Scanner(System.in);
		String email = "";
		
		System.out.println("Enter email: ");
		email = myObj.next();
		
		String actual = TicketReservation.userEmail(email);
		System.out.println(actual + "\n");
		String expected = ("Valid email");
		
		assertEquals(expected, actual);
	}

	@Test
	void testReserveDate() {
		Scanner myObj = new Scanner(System.in);
		String date = ""; //29/03/2022
		
		System.out.println("Enter reserve date: ");
		date = myObj.next();
		
		String actual = TicketReservation.reserveDate(date);
		System.out.println(actual + "\n");
		String expected = ("Valid date, flights are available");
		
		assertEquals(expected, actual);
		
	}

}
