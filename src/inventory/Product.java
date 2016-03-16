package inventory;

public class Product 
{
    
    private String productId,productName,category,manufacturer,
            description,partNum;
    private double productCost, productPrice,productMarkup;
    
    
    //default constructor
    public Product()
    {}
    //full constructor - manufacturer should be it's own class
    public Product(String productId,String productName,String category, 
            String manufacturer,String description, String partNum, 
            double productCost,double productPrice, double productMarkup,
            int minimumInventory)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.manufacturer = manufacturer;
        this.description = description;
        this.partNum = partNum;
        this.productCost = productCost;
        this.productPrice = productPrice;
        this.productMarkup = productMarkup;
        
    }
    
    //GET methods
    public String getProductId()
    {
        return this.productId;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public String getCategory()
    {
        return this.category;
    }
    public String getManufacturer()
    {
        return this.manufacturer;
    }
    public String getDescription()
    {
        return this.description;
    }
    public String getPartNum()
    {
        return this.partNum;
    }
    public double getProductCost()
    {
        return this.productCost;
    }
    public double getProductPrice()
    {
        return this.productPrice;
    }
    public double getProductMarkup()
    {
        return this.productMarkup;
    }
    
    @Override
    public String toString() 
    {
        String productInfo = "";

        productInfo += "\nName:\t\t" + getProductName();
        productInfo += "\nId:\t\t" + getProductId();
        productInfo += "\nPart Num:\t" + getPartNum();
        productInfo += "\nCategory:\t" + getCategory();
        productInfo += "\nManufacturer:\t" + getManufacturer();
        productInfo += "\nDescription:\t" + getDescription();
        productInfo += "\nCost:\t\t$" + getProductCost();
        productInfo += "\nPrice:\t\t$" + getProductPrice();
 
        return productInfo;
    }
    
    //SET methods
    public void setProductId(String productId)
    {
         this.productId = productId;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    public void setCategory(String category)
    {
         this.category = category;
    }
    public void setManufaturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setPartNum(String partNum)
    {
        this.partNum = partNum;
    }
    public void setProductCost(double productCost)
    {
        //add validation here before setting the value
        this.productCost = productCost;
        //run activation check 
    }
    public void setProductPrice(double productPrice)
    {
        //add validation here before setting the value
        this.productPrice = productPrice;
        //run changeActivationState if needed
    }
    public void setProductMarkup(double productMarkup)
    {
        //add validation here before setting the value
        this.productMarkup = productMarkup;
        //run changeActivationState if needed
    }
    
    
    /*product activation method. All products are unavailable until
      validated. The product is forced to be activated through several tests
      to ensure that the product is ready for sale.  
    
    public boolean changeActivationState(int productId)
    {
        //validate productId before procceding
        //if(validateProd) 
                   
        //if statement to validate cost, price and markup. 
        if(this.productCost > 0.0 && this.productPrice > 0.0 && 
                ((this.productPrice/this.productCost)-1)>=0.22)
        {
            return this.productAvailable = true;
        }
        else
        {
            return this.productAvailable = false;
        }
    }
*/
    
}
