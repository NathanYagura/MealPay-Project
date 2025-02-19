public class transaction{
    private int month;
    private int day;
    private double amount;

    public transaction(int mymonth, int myday, double myamount){
        month = mymonth;
        day = myday;
        amount = myamount;
    }

    public String toString(){
        return "(" + month + "/" + day + ", $" + amount + ")";
    }

}