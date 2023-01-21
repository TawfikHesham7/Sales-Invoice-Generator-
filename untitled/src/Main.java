import controller.fileOperations;// call class fileoperations from controller package
public class Main //main class
{// main method
    public static void main(String[] args) {
        fileOperations newInvoice=new fileOperations();// make object from file operation method
        newInvoice.writeFile( );//write method from console to two csv"src\\InvoiceLine.csv","src\\InvoiceHeader.csv"
        newInvoice.readFile("src\\InvoiceLine.csv","src\\InvoiceHeader.csv" );// read method from csv to arrays
        newInvoice.printFile();// print method to console from reading arrays
    }
}