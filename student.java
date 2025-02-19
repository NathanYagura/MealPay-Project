import java.util.ArrayList;

public class student{
    private String name;
    private int ID;
    private static int IDgen = 1;
    private double balance;
    private ArrayList<transaction> transactions = new ArrayList<transaction>();

    
    public student (String myname){
        name = myname;
        balance = 0.0;
        ID = IDgen;
        IDgen++;
    }

    public void addfunds (double funds){
        balance += funds;
    }

    public void makeTrans(int month, int day, double amount){
        transaction x = new transaction(month, day, amount);
        transactions.add(x);
    }

    public String toString(){
        String x = "";
        return "Student: " + name + " ID: " + ID + " Balance: $" + balance + " Transactions: " + transactions;
    }


}