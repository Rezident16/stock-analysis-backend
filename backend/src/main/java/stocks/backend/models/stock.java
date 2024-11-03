package stocks.backend.models;

public class stock {

    private int stockId;
    private String ticker;
    private String shortName;
    private String officialName;

    public stock() {
        
    }

    public stock(String officialName, String shortName, int stockId, String ticker) {
        this.officialName = officialName;
        this.shortName = shortName;
        this.stockId = stockId;
        this.ticker = ticker;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }


}
