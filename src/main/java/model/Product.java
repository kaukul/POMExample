package model;

public class Product {
    private String modelNum;
    private String modelDesc;
    private String brandName;
    private boolean isCollection;
    private boolean isSponsored;


    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String manufacturer) {
        this.brandName = manufacturer;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }

    public boolean isSponsored() {
        return isSponsored;
    }

    public void setSponsored(boolean sponsored) {
        isSponsored = sponsored;
    }

    @Override
    public String toString() {
        return "Product{" +
                "modelNum='" + modelNum + '\'' +
                ", modelDesc='" + modelDesc + '\'' +
                ", brandName='" + brandName + '\'' +
                ", isCollection=" + isCollection +
                ", isSponsored=" + isSponsored +
                '}';
    }

}
