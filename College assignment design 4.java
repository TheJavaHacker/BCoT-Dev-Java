package *;

public interface AccountInformation{

    String getName();
    String getPostCode();
    UUID getUUID();
    int getLoanLength();
    double getAPR();
    Ranks getRank();
    
    void setRank(Ranks rank);
    void setName(String name);
    void setPostCode(String postcode);
    void setUUID(UUID uuid);
    void setLoanLength(int loanLength);
    void setAPR(double apr);

}