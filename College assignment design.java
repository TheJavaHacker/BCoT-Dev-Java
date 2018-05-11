package *;

public class LoanCalculatorCore {

    private HelpDisplayPage helpPage;
    private PasswordAccountGenerator passGen;
    private MySQLManager mysql;

    public static void main(String[] args){
        new LoanCalculatorCore();
    }
    
    
    public LoanCalculatorCore(){
        mysql = new MySQLManager();
        
        try{
            mysql.openConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        format("-------------------------------------------------");
        format("Welcome to the Metro Bank Loan calculator System.");
        format("-------------------------------------------------");
        helpPage = new HelpDisplayPage();
        passGen = new PasswordAccountGenerator();
    }

    public void format(String message){
        System.out.println(message);
    }

    Runnable runnable = new Runnable(){
        @Override
        public void run(){
            try{
                mysql.openConnection();
                mysql.executeStatement("CREATE TABLE table_name IF NOT EXISTS " /*Create the table here for user information*/);
            }
        }
    }

}