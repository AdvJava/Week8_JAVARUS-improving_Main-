package inventory;
import java.util.*;
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
        try
        {
            if(productId!="")
            {
                this.productId = productId;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
    }
    public void setProductName(String productName)
    {
        try
        {
            if(productName!="")
            {
                this.productName = productName;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
        
    }
    public void setCategory(String category)
    {
        try
        {
            if(category!="")
            {
                this.category = category;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
        
    }
    public void setManufaturer(String manufacturer)
    {
        try
        {
            if(manufacturer!="")
            {
                this.manufacturer = manufacturer;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
       
    }
    public void setDescription(String description)
    {
        try
        {
            if(description!="")
            {
                this.description = description;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
        
    }
    public void setPartNum(String partNum)
    {
        try
        {
            if(partNum!="")
            {
                this.partNum = partNum;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
       
    }
    public void setProductCost(double productCost)
    {
        try
        {
            if(productCost>0.00)
            {
                this.productCost = productCost;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
      
    }
    public void setProductPrice(double productPrice)
    {
        try
        {
            if(productPrice>0.00)
            {
                this.productPrice = productPrice;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
        
    }
    public void setProductMarkup(double productMarkup)
    {
        try
        {
            if(productMarkup>0.00)
            {
               this.productMarkup = productMarkup;
            }
            else
                throw new Exception();
        }
        catch(InputMismatchException | ArithmeticException error)
        {
            System.out.println("Invalid Value");                        
        }
        catch(Exception e)
        {
            System.out.println("Invalid Value");                          
        }
       
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
