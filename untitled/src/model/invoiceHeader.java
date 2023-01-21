package model;
import java.util.ArrayList;//call arrays packages


public class invoiceHeader {
    public ArrayList<String> invoiceNumberr= new ArrayList<>();// initialize array string dynamic variable of invoice number
    public ArrayList<String> invoiceDate= new ArrayList<>();// initialize array string dynamic variable of invoice date
    public ArrayList<String> customarName= new ArrayList<>();// initialize array string dynamic variable of customar name
    public void set_invoiceNumberr(String numberInvoice) // make invoice number set  method
    {
        invoiceNumberr.add(numberInvoice);
    }
    public String get_invoiceNumberr(int numberOfinvoice)// make invoice number get method
    {
        return invoiceNumberr.get(numberOfinvoice);
    }
    public void set_invoiceDate (String dateInvoice)// make invoice date get method
    {
        invoiceDate.add(dateInvoice);
    }
    public String get_invoiceDate (int dateOfinvoice)// make invoice date get method
    {
        return invoiceDate.get(dateOfinvoice);
    }
    public void set_customarName (String nameCustomer)// make invoice customar name set method
    {
        customarName.add(nameCustomer);
    }
    public String get_customarName (int nameOfcustomer) // make invoice customar name set method
    {
        return customarName.get(nameOfcustomer);
    }


}