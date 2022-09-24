package edu.neu.csye6200;

import java.util.Date;

public class Cart {
	
	private String myItem;
	private double price;
	
	public Cart(String myItem, double price) {
		super();
		this.myItem = myItem;
		this.price = price;}
	
		public String getMyItem() {
			return myItem;
		}

		public void setMyItem(String myItem) {
			this.myItem = myItem;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			//Formatting string before returning
			return String.format("%-35s %-10s", "ItemName: "+ this.myItem, "Cost: $"+this.price);

	}
		// TODO Auto-generated constructor stub
	
	
public static void demo() {
		
		//Declaring the list of items as an array
		Cart[] Cart = new Cart[5];
		
		//Instantiating each item object
		Cart[0] = new Cart("Apples" ,2.5);
		Cart[1] = new Cart("Oranges", 4.5);
		Cart[2] = new Cart("Biscuits", 5.5);
		Cart[3] = new Cart("Bread", 2.0);
		Cart[4] = new Cart("Chocolates", 4.25);
		
		int myCash = 20;
        int myTotal = 0;
		for(int i=0;i <Cart.length; i++) {
			myTotal += Cart[i].getPrice();
		}
		int myChange = myCash - myTotal;
		
		//StringBuilder to prevent creation of multiple immutable strings
				StringBuilder receipt = new StringBuilder();
				
				String decoratorString = "*".repeat(50)+"\n";
				String decoratorString1 = "-".repeat(50)+"\n";

				receipt.append(decoratorString);
				receipt.append(" ".repeat(20)+"Receipt\n");
			

				
				Date d = new Date();
				receipt.append("Date and Time: " + d.toString()+"\n");
				receipt.append(decoratorString1);
				for(int i=0; i<Cart.length; i++)
				{
					//Storing all the items by calling toString()
					receipt.append(Cart[i].toString()+"\n");
				}
				receipt.append(decoratorString1);
				//Formatting the strings to add some padding so all the strings are equally aligned
				receipt.append(String.format("%-35s $%-10s\n", "Total:", myTotal));
				receipt.append(String.format("%-35s $%-10s\n", "Amount given:", myCash));
				receipt.append(String.format("%-35s $%-10s\n", "Change:", myChange));
				receipt.append(decoratorString1);
				receipt.append(" ".repeat(4)+"THANK YOU FOR SHOPPING. PLEASE COME AGAIN\n");
				receipt.append(decoratorString);

				
				//Converting the receipt to String and printing on console
				System.out.println(receipt.toString());
		

   }
}
