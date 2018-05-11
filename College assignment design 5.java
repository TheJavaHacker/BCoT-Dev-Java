package *;

public class AccountInformationObject implements AccountInformation{

    private HashMap<UUID, Ranks> ranks = new HashMap<UUID, Ranks>
    ();
    
    private String name, postCode;
    private UUID uuid;
    private int loanLength;
    private double APR;
    private Ranks rank;
    
    public AccountInformationObject(UUID uuid, String name, String postcode){
        if(uuid == null){
            this.name = name;
            this.rank = Ranks.USER;
            this.uuid = UUID.randomUUID();
            this.loanLength = 12;
            this.APR = 5.9;
            this.postCode = postcode;
        }else{
            this.rank = mySQL.lookupStatement(uuid.toString(), "Rank");
            this.name = mySQL.lookupStatement(uuid.toString(), "Name");
            this.postCode = mySQL.lookupStatement(uuid.toString(), "Postcode");
            this.loanLength = mySQL.lookupStatement(uuid.toString(), "Loan Length");
            this.APR = mySQL.lookupStatement(uuid.toString(), "APR");
            this.uuid = uuid;
        }
    }
    
    public Ranks getRank(UUID uuid){
        mySQL.lookupStatement(uuid, "Rank");
    }
    
    public Ranks getCachedRank(UUID uuid){
        return ranks.get(UUID);
    }
    
    public void setRank(UUID uuid, Ranks rank){
        ranks.put(uuid, rank);
        mySQL.executeStatement("" /*Add Rank to the database where UUID is uuid*/);
    }

}