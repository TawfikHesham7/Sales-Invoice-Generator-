package model;
import java.util.ArrayList;
public class InvoiceLine {
    public ArrayList<String> invoiceNumber = new ArrayList<>();// initialize array string dynamic variable of invoice number
    public ArrayList<String> itemName = new ArrayList<>();// initialize array string dynamic variable of item name
    private ArrayList<String> itemPrice = new ArrayList<>();// initialize array string dynamic variable of item price
    private ArrayList<String> count = new ArrayList<>();// initialize array string dynamic variable of items count

    public void set_invoiceNumber(String numberInvoice)// make invoice number set  method
    {
        invoiceNumber.add(numberInvoice);
    }
    public String get_invoiceNumber(int numOfinvoice)// make invoice number get  method
    {
        return invoiceNumber.get(numOfinvoice);

    }

    public void set_itemName(String nameItem)// make invoice name items set  method

    {
        itemName.add(nameItem);
    }
    public String get_itemName(int numOfitem)// make invoice name items get  method
    {
        return itemName.get(numOfitem);

    }
    public void set_itemPrice(String priceItem)// make invoice price items set method

    {
        itemPrice.add(priceItem);
    }
    public String get_itemPrice(int numOfitemPrice)// make invoice price items get method
    {
        return itemPrice.get(numOfitemPrice);

    }



    public void set_count(String Count)// make invoice  items count set method
    {
        count.add(Count);
    }
    public String get_count(int Count)// make invoice  items count get method
    {
        return count.get(Count);

    }


}
