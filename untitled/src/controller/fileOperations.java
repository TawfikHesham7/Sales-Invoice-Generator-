package controller;
import java.util.ArrayList;
import model.InvoiceLine;
import model.invoiceHeader;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
public class fileOperations// making public class called file operations
{
    InvoiceLine invoice = new InvoiceLine();//make class object called invoice from invoice line class
    invoiceHeader invoiceH = new invoiceHeader();//make class object called invoiceh from invoice header class
    public void readFile(String file,String file2 )//make method called read file which have two string input
    {
        int m = 0, counter1 = 0; // make two variables counters called m and i
        BufferedReader reader = null;// buffer reader to called read
        String line = ""; // string line
        try
        {
            reader = new BufferedReader(new FileReader(file));//making object reader from buffer
            while ((line = reader.readLine()) != null)// loop to read and save lines of csv sheet
            {
                String[] row = line.split(",");//split every line with ,
                for (String index : row)//ineasted loop to write every line in his variable
                {
                    for (; index != "," && counter1 < 1; counter1++)
                    {
                        invoice.set_invoiceNumber(row[0]);// insert invoice number string
                        invoice.set_itemName(row[1]);// insert invoice name string
                        invoice.set_itemPrice(row[2]);// insert invoice price string
                        invoice.set_count(row[3]);// insert invoice count string
                    }
                }
                counter1 = 0;
            }
        }
        catch (Exception e)// catch errors
        {
            e.printStackTrace();
        }
        finally
        {
            try// close csv
            {
                reader.close();
            } catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        int m2 = 0, counter2 = 0; // make two variables counters called m2 and i2
        BufferedReader reader2 = null;// initialize reader two
        String line2 = "";// initialize line
        try
        {
            reader2 = new BufferedReader(new FileReader(file2));// initiallize reader 2
            while ((line2 = reader2.readLine()) != null)
            {
                String[] row2 = line2.split(",");// split every line
                for (String index2 : row2)//make ineated loop
                {
                    for (; index2 != "," && counter2 < 1; counter2++)
                    {
                        invoiceH.set_invoiceNumberr(row2[0]);// insert invoice number string
                        invoiceH.set_invoiceDate(row2[1]);// insert invoice number string
                        invoiceH.set_customarName(row2[2]);// insert invoice number string
                    }
                }
                counter2= 0;//reset counter
            }
        }
        catch (Exception e)// error expetion
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader2.close();// close reader
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        printFile( );
    }
    public void printFile( )// print method in console
    {
        char cahracter='1';//initialize character
        int counter=0;//initialize counter variable
        int counter2 = 0;//initialize counter 2 variable
        int buffer=-1;// initialize buffer
        String str=String.valueOf(cahracter);//initialize string
        boolean match = false ;// initialize boolean match to find invoice number
        boolean match2 = false ;// initialize boolean match to find invoice number
        for(;counter2< invoice.invoiceNumber.size();counter2++)//Nested loop to print
        {
        for(;counter< invoice.invoiceNumber.size();counter++)//continue nested loop
        {
            str=String.valueOf(1+counter2);// convert char to string
            match = invoice.get_invoiceNumber(counter).equals(str);//matching invoice number
            if(match){if(buffer!=counter2)// if codition to match
            {
                System.out.println("  invoice number: "+invoice.get_invoiceNumber(counter));//print invoice number
                System.out.print("  invoice date: "+invoiceH.get_invoiceDate(counter2)+",");//print invoice Date
                System.out.println("  invoice name:"+invoiceH.get_customarName(counter2));//print invoice name
            }
                System.out.print("  itemName:"+invoice.get_itemName(counter)+",");//print item name
                System.out.print("  itemPrice:"+invoice.get_itemPrice(counter)+"LE"+",");// print item price
                System.out.print("  itemCount:"+invoice.get_count(counter));// print item count
                System.out.println();//make new line
                buffer=counter2;//save buffer
            }
        }
        counter=0;buffer=-1;//reset variables
        }
    }
    public void writeFile( )//write file csv
    {
        InvoiceLine invoiceLin = new InvoiceLine();//make line variable of class
        invoiceHeader invoiceHead = new invoiceHeader();//make head variable of class
        int Continue=0;// initialize countinue for while loob
        while(Continue==0)//loob for get variables values to variables arrays
        {
            Scanner input = new Scanner(System.in);// scan values
            System.out.println("If you to continue press (0) else (press any other number)");//ask to continue
            Continue = input.nextInt();//ask to wrie integer to continue
            String dumy = input.nextLine();//write next
             if(Continue!=0){break;}
            System.out.println("enter invoice number");
            String invoceNumer = input.nextLine();
            invoiceHead.set_invoiceNumberr(invoceNumer);
            System.out.println("enter invoice date");
            String invoceDate = input.nextLine();
            invoiceHead.set_invoiceDate(invoceDate);
            System.out.println("enter invoice name");
            String invoceName = input.nextLine();
            invoiceHead.set_customarName(invoceName);
            int continue2=0;
            while(continue2==0&&Continue==0)
            {
                invoiceLin.set_invoiceNumber(invoceNumer);
                System.out.println("enter item name");
                String namee = input.nextLine();
                String name = input.nextLine();
                invoiceLin.set_itemName(name);
                System.out.println("enter item price");
                String itemPrice = input.nextLine();
                invoiceLin.set_itemPrice(itemPrice);
                System.out.println("enter item count");
                String itemCount = input.nextLine();
                invoiceLin.set_count(itemCount);
                System.out.println("If you to continue writing items press (0) else (press any other number)");
                continue2 = input.nextInt();
            }
        }
        String file="src\\invoiceHeader.csv";
        try (PrintWriter pw =new PrintWriter(file))
        {
            for(int Cont=0;Cont< invoiceHead.invoiceNumberr.size();Cont++)
            {
                pw.append(invoiceHead.get_invoiceNumberr(Cont));
                pw.append(',');
                pw.append(invoiceHead.get_invoiceDate(Cont));
                pw.append(',');
                pw.append(invoiceHead.get_customarName(Cont));
                pw.append(',');
                pw.append('\n');
            }
        }
        catch(FileNotFoundException e3)
        {
            e3.printStackTrace();
        }
        String file2="src\\invoiceLine.csv";
        try (PrintWriter pww =new PrintWriter(file2))
        {
            for(int Cont2=0;Cont2< invoiceLin.itemName.size();Cont2++)
            {
                pww.append(invoiceLin.get_invoiceNumber(Cont2));
                pww.append(',');
                pww.append(invoiceLin.get_itemName(Cont2));
                pww.append(',');
                pww.append(invoiceLin.get_itemPrice(Cont2));
                pww.append(',');
                pww.append(invoiceLin.get_count(Cont2));
                pww.append(',');
                pww.append('\n');
            }
        }
        catch(FileNotFoundException e4)
        {
            e4.printStackTrace();
        }
    }
}
//******************************************************
