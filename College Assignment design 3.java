package *;

public enum Ranks{

    CEO(4),
    ADMIN(3),
    STAFF(2),
    USER(1);
    
    private int rankNumber;
    private String prefix;
    
    Ranks(String prefix, int rankNumber){
        this.prefix = prefix;
        this.rankNumber = rankNumber;
    }

}