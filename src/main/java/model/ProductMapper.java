package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductMapper {
    public static Product map(WebElement e) {
        Product product = new Product();
        product.setModelNum(e.findElement(By.id("model-id-nmbr")).getText().substring(7));
        product.setBrandName(e.findElement(By.cssSelector("[data-selector=\"splp-prd-brd-nm\"]")).getText());
        product.setSponsored((e.findElements(By.cssSelector("[data-selector=\"prd-sponsored-badge\"] span")).size() > 0));
        product.setCollection((e.findElements(By.cssSelector("[data-selector=\"splp-prd-shp-coll-txt\"]")).size() > 0));
        product.setModelDesc(e.findElement(By.cssSelector("[class=\"description-spn\"")).getText());
        return product;
    }
}
