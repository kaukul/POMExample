package model.pom.pages;

import model.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BasePage{
    @FindBy(id = "model-id-nmbr")
    private WebElement modelNum;

    @FindBy(css = "[class=\"description-spn\"")
    private WebElement modelDesc;

    @FindBy(css = "[data-selector=\"splp-prd-brd-nm\"]")
    private WebElement brandName;

    @FindBy(css = "[data-selector=\"splp-prd-shp-coll-txt\"]")
    private List<WebElement> isCollection;

    @FindBy(css = "[data-selector=\"prd-sponsored-badge\"] span")
    private List<WebElement> isSponsored;

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public Product getProduct(WebElement e) {
        model.Product product = new model.Product();
        product.setModelNum(modelNum.getText().substring(7));
        product.setBrandName(brandName.getText());
        product.setSponsored((isSponsored.size() > 0));
        product.setCollection((isCollection.size() > 0));
        product.setModelDesc(modelDesc.getText());
        return product;
    }

}
