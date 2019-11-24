////////////////////////////////////////////////////////////////////////////
// This Solution Was Fully Written By Omri Weiss
////////////////////////////////////////////////////////////////////////////

import java.time.LocalDateTime;
import java.util.List;

public class Order
{
    private int orderId;
    //val orderId: Int

    private LocalDateTime creationDate;
    //val creationDate: LocalDateTime

    public List<OrderLine> orderLines;
    //val orderLines: List<OrderLine>


    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public LocalDateTime getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate)
    {
        this.creationDate = creationDate;
    }

    public List<OrderLine> getOrderLines()
    {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines)
    {
        this.orderLines = orderLines;
    }

    public void print()
    {
        System.out.println("orderId : " + orderId);
        System.out.println("creationDate :'" + creationDate+ "'");

    }

}
