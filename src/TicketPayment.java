
public class TicketPayment {
	
	public static String userId(String uid) {
		String msg;
		
		if(uid.equals("U001")) {
			return msg = "User ID is valid!";
		}else if(uid.equals("U002")) {
			return msg = "User ID is valid!";
		}else {
			return msg = "User id is not valid, cannot proceed the payment!";
		}
	}
	
	public static String ticketId(String tid) {
		String msg;
		
		if(tid.equals("T001")){
			return msg = "Ticket ID is valid!";
		}else if(tid.equals("T002")) {
			return msg = "Ticket ID is valid!";
		}else {
			return msg = "Ticket ID is not valid!";
		}
	}
	
	public static String ticketAmount(String amount) {
		String msg;
		
		if(amount.equals("100000")) {
			return msg = "Payment amount is valid!";
		}else if(amount.equals("150000")) {
			return msg = "Payment amount is valid!";
		}else {
			return msg = "Payment amount is not valid!";
		}
	}
	
	public static String paymentMethod(String pmethod ) {
		String msg;
		
		if(pmethod.equals("Visa")) {
			return msg = "Payment method is valid";
		}else if(pmethod.equals("Master")) {
			return msg = "Payment method is valid";
		}else {
			return msg = "Invalid";
		}
	}
	
	public static String cardPayment(String cardNumber, String expireDate, String cvv) {
		String msg;
		
		if(cardNumber.equals("1212 1212 1212 1212") && expireDate.equals("12/22" ) && cvv.equals("121")) {
			return msg = "Valid card number!";
		}else{
			return msg = "Invalid card number!";
		}
	}
	
	public static String cheackCoupon(String coupon) {
		String msg;
		
		if(coupon.equals("CPN1423")) {
			return msg = "Valid coupon code!";
		}else if(coupon.equals("CPN1234")){
			return msg = "Valid coupon code!";
		}else {
			return msg = "Invalid coupon code";
		}
		
	}
	
	
	public static String paymentDate(String date) {
		String msg;
		
		if(date.equals("14/03/2022")) {
			return msg = "Valid date format!";
		}else if(date.equals("20/03/2022")) {
			return msg = "Valid date format!";
		}else {
			return msg = "Invalid date format!"; 
		}
	}
	
}
