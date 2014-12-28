import java.util.*;

public class BookingSystem{

	public static void main(String[] args) {
		
		Plane plane1 = new Plane();
		
		int numberToBook=0;
		String input = "";
		String bookingClass = "";
		String seatLocation = "";
		Scanner keyboard = new Scanner (System.in);
		
		while(!input.equalsIgnoreCase("quit")){
		input="";
		bookingClass="";
		System.out.println("What would you like to do?");
		System.out.println("Type 'add' to book, 'show' to show the avaiable seats, "
				+ "and 'quit' to finish booking.");
	
		input= keyboard.nextLine();
		
			if(input.equalsIgnoreCase("add")){
				System.out.println("Which class would you like seats in? First or Economy?");
				bookingClass=keyboard.nextLine();
				
					if(bookingClass.equalsIgnoreCase("first")||bookingClass.equalsIgnoreCase("economy")){	
						if(bookingClass.equalsIgnoreCase("First")){
						}
						else if (bookingClass.equalsIgnoreCase("Economy")){
						}
						else {
							System.out.println("That didn't seem to work, try again.");
							input="";
							bookingClass="";
						}
				
						System.out.println("Enter the amount of seats you would like together.");
						System.out.println("(Up to 2 in First Class or 3 in Economy");
				
						try {
							numberToBook = keyboard.nextInt();
							keyboard.nextLine();
							if(bookingClass.equalsIgnoreCase("first")){
								if(numberToBook==1||numberToBook==2){
									System.out.println("Would you like a window or an aisle seat?");
									seatLocation=keyboard.nextLine();
										if (seatLocation.equalsIgnoreCase("window")||seatLocation.equalsIgnoreCase("aisle")){
											plane1.PlaneCheck(numberToBook, "first", seatLocation);
									}
										else{
											System.out.println("That didn't seem to work, try agian.");
									}
								}
								else{
									System.out.println("That didn't seem to work, try again.");
								}
							}
							else if(bookingClass.equalsIgnoreCase("economy")){
								if(numberToBook==1||numberToBook==2||numberToBook==3){
									System.out.println("Would you like a window, center, or aisle seat?");
									seatLocation=keyboard.nextLine();
									if (seatLocation.equalsIgnoreCase("window")||seatLocation.equalsIgnoreCase("aisle")||seatLocation.equalsIgnoreCase("center")){
										plane1.PlaneCheck(numberToBook, "economy", seatLocation);
									}
									else{
										System.out.println("That didn't seem to work, try agian.");
									}
								}
								else{
									System.out.println("That didn't seem to work, try again.");
								}
							}
							else{
								System.out.println("That didn't seem to work, try again.");
							}
						} 
						catch (InputMismatchException e) {
							System.out.println("***Number to book has to be a number. Try again.***");
							keyboard.nextLine();
							input="";
							bookingClass="";							
						}
						finally{
							input="";
							bookingClass="";
						}
					}
					else {
						System.out.println("That didn't seem to work, try again.");
						input="";
						bookingClass="";
					}
					
					   
			}
			
			else if(input.equalsIgnoreCase("show")){
			plane1.PlaneShow();
			}
		
		
		
		}
	}

}

