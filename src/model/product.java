package model;

public class product {
    private int productId;
    private  String proName;
    private int  oder;
    private Boolean isActive;

    public int getProductId() {
        return productId;
    }

    public String getProName() {
        return proName;
    }

    public int getOder() {
        return oder;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setOder(int oder) {
        this.oder = oder;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public product() {
    }

    public product(int productId, String proName, int oder, Boolean isActive) {
        this.productId = productId;
        this.proName = proName;
        this.oder = oder;
        this.isActive = isActive;
    }
}
