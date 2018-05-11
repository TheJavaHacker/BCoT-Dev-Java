package *;

public class MySQLManager{

    private Connection connection;
    private String host, database, username, password;
    private int port;

    public void openConnection() throws SQLException, ClassNotFoundException{
        
        this.host = "";
        this.database = "";
        this.username = "";
        this.password = "";
        this.port = 3306;
        
        if(connection != null && !connection.isClosed()){
            return;
        }
        
        synchronized(this){
            if(connection != null && !connection.isClosed()){
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database, this.username, this.password);
        }
    }
    
    public void executeStatement(String sqlStatement){
        PreparedStatement statement = this.connection.prepareStatement(sqlStatement);
        statement.executeUpdate();
        statement.close();
    }

}