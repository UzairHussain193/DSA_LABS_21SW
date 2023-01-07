
public class Task3_Invoice {
	String part_number;
	String part_description;
	int quantity_item_purchased;
	float ItemPrice;
	public void setDetails(String p,String pd,int t,float price) {
		part_number=p;
		part_description=pd;
		quantity_item_purchased=t;
		ItemPrice=price;
	}
	public String getPartNumb() {
		return part_number;
	}
	public String getPartDesc() {
		return part_description;
	}
    public int getItemPurchased(){
        return quantity_item_purchased;
    }
    public float getItemPrice(){
        return ItemPrice;
    } 
	public float getInvoiceAmount(){
		if(ItemPrice<0 && quantity_item_purchased<0){
			ItemPrice=0;
			quantity_item_purchased=0;
		}
		return (ItemPrice*quantity_item_purchased);
	}
	public static void main(String[] args) {
		Task3_Invoice first=new Task3_Invoice();

		first.setDetails("AE32", "Grinder", 5, 23000);
		System.out.println("Part Number: "+first.getPartNumb());
		System.out.println("Part Description: "+first.getPartDesc());
		System.out.println("Item Quantity: "+first.getItemPurchased());
		System.out.println("Item Price: "+first.getItemPrice());
		System.out.println("Invoice amount = "+first.getInvoiceAmount());


		
	}
}