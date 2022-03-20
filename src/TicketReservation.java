
public class TicketReservation {
	
	public static String fromTO(String from, String to) {
		
		String msg;
		
		if(from.equals("Colombo") && to.equals("Perth")) {
			return msg = "Valid, flights are available!";
		}else if(from.equals("Colombo") && to.equals("Sydney")) {
			return msg = "Valid, flights are available!";
		}else {
			return msg = "Invalid, No available flights!";
		}
	}
	
	public static String classType(String classType) {
		
		String msg;
		
		if(classType.equals("Economy")) {
			return msg = "Seats are available!";
		}else if(classType.equals("Business")) {
			return msg = "Seats are available!";
		}else if(classType.equals("First")) {
			return msg = "Seats are available!"; 
		}else {
			return msg = "Invalid class type";
		}
	}
	
	public static String tripMethod(String tripMethod) {
		
		String msg;
		
		if(tripMethod.equals("One-way")) {
			return msg = "Valid trip method";
		}else if(tripMethod.equals("Round-trip")) {
			return msg = "Valid trip method!";
		}else if(tripMethod.equals("Multi-city")) {
			return msg = "Valid trip method!";
		}else {
			return msg = "Invalid trip method!";
		}
		
	}
	
	public static String userEmail(String email) {
		String msg;
		
		if(email.equals("teran.neranga@gmail.com")) {
			return msg = "Valid email";
		}else if(email.equals("teran@gmail.com")){
			return msg = "Valid email";
		}else {
			return msg = "Invalid email";
		}
		
	}
	
	public static String reserveDate(String date) {
		String msg;
		
		if(date.equals("29/03/2022")) {
			return msg = "Valid date, flights are available";
		}else if(date.equals("29/03/2022")) {
			return msg = "Valid date, flights are available";
		}else {
			return msg = "Invalid! flights are not available";
		}
		
	}
	
}
