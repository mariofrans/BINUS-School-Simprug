package Practice;
import java.util.*;


class SalesPerson {
	// each object contains details of one salesperson
	private String id;
	private Sales[] salesHistory; // details of the different sales 
	private int count = 0; 
	// number of sales made
	
	//constructor for a new salesperson
	public SalesPerson(String id){
	             // code missing
		this.id = id;
	}
	       
	// constructor for a salesperson transferred (together with their sales details) from another branch
	public SalesPerson(String id, Sales[] s, int c)
	{   
		// code missing
		this.id = id;
		this.salesHistory = s;
		this.count = c;
	}
	
	       
	public int getCount(){
		return count;
	}
	       
	public String getId() {
		return id;
	}
	       
	public void setSalesHistory(Sales s)
	{
		salesHistory[count] = s; 
		count = count +1;
	}
	       
	public double calcTotalSales(){
	    
		// calculates total sales for the salesperson
		// code missing
		double totalSales = 0;
		
		for(int i=0; i<count; i++)
		{
			totalSales += getSalesHistory(i).getQuantity()*getSalesHistory(i).getValue();
		}
		
		return totalSales;
		
	}
	public Sales largestSale(){
	       // calculates the sale with the largest value
	       // code missing
	} 
}


class Sales {
	
	// each object contains details of one sale
	private String itemId; // id of the item
	private double value; // the price of one item
	private int quantity; // the number of the items sold
	
	// constructor missing
	
	public double getValue() {
		return value;	
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	
}

class Practice
{
	public void addSales(Sales s, String id){
        for(int i = 0; i < 100; i++)
        {
            if(salesPeople[i].getId() == id)
            {
                salesPeople[i].setSalesHistory(s);
            }
        }
    }
	
	public highest(salesPeople[] salesPeople)
	{
		salesPeople.calcTotalSales().sort();
		return salesPeople[0].getId;
	}
	
	public static void main(String args[]) 
	{
		SalesPerson[] salesPeople = new SalesPerson[6];
		salesPeople[0] = new SalesPerson("100");
		salesPeople[1] = new SalesPerson("101");
		salesPeople[2] = new SalesPerson("102"); 
		salesPeople[0].setSalesHistory(new Sales("A100",300.00,10)); 
		salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2)); 
		salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10)); 
		System.out.println(salesPeople[2].getId()); 
		System.out.println(salesPeople[0].getCount()); 
		System.out.println(salesPeople[1].getSalesHistory(0).getValue()); 
		System.out.println(salesPeople[0].calcTotalSales());
		
		
	}
}













