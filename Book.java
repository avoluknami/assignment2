
public class Book
{
public String title;
public String author;
public String ISBN;
public int price;
	public static void main(String[] args) {
	    Book bookOne = new Book ("Pride and Prejudice","Jane Austen","123-456-789",12);
	    Book bookTwo = new Book ("Jane Eyre","Charlotte Brontë","987-654-321",20);
	    Book bookThree = new Book();
	    
	    bookOne.displayInfo();
	    bookTwo.displayInfo();
	    bookThree.displayInfo();
	    
	    double taxRate = 10; // 10% tax
        double priceAfterTax = bookTwo.getPriceAfterTax(taxRate);
        System.out.println("Price of 'Jane Eyre' after " + taxRate + "% tax: $" + priceAfterTax);

	    
	}
	
	
	public Book (String title,String author,String ISBN,int price){
	    this.title = title;
	    this.author = author;
	    this.ISBN = ISBN;
	    this.price = price;
	}
	
	public Book(){
	    this.title = "";
	    this.author = "";
	    this.ISBN = "";
	    this.price = 0;
	}
	
	
	
	public void displayInfo(){
	    System.out.println("Title:" + title);
	    System.out.println("Author:"+ author);
	    System.out.println("ISBN:" + ISBN);
	    System.out.println("Price:" + price);
	}
	
  public double getPriceAfterTax(double taxPercentage) {
        return price + (price * taxPercentage / 100);
    }
}
