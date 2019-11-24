///////////////////////////////////////////////////////////////////////////
// This Solution Was Fully Written By Omri Weiss
///////////////////////////////////////////////////////////////////////////

public class OrderLine
{
    private int productId;
    //val productId: Int

    private String name;
    //val name: String

    private int quantity;
    //val quantity: Int

    private double unitPrice;
    //val unitPrice: BigDecimal


    public OrderLine(int productId, String name, int quantity, double unitPrice)
    {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;

    }



    public void print()
    {
        System.out.print(" { ");
        System.out.print("productId : " + productId + ", ");
        System.out.print("name : '" + name + "', ");
        System.out.print("quantity : " + quantity + ", ");
        System.out.print("unitPrice : " + unitPrice);
        System.out.print(" } ");

    }

}
