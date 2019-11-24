////////////////////////////////////////////////////////////////////////////
// This Solution Was Fully Written By Omri Weiss
////////////////////////////////////////////////////////////////////////////

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class OrdersAnalyzer {

    public static HashMap<DayOfWeek, Integer> totalDailySales(ArrayList<Order> My_Orders)
    {
        HashMap<DayOfWeek, Integer> Sums_Of_Orders_Per_Day = new HashMap<DayOfWeek, Integer>();

        int temp_SumOfProducts =0;
        DayOfWeek temp_DayOfWeek;
        Order temp_Order;

        for (int j = 0; j <My_Orders.size() ; j++)
        {
            temp_SumOfProducts =0;

            temp_Order= My_Orders.get(j);//Working on Current Order, Calculating sum of Costs

            temp_DayOfWeek= temp_Order.getCreationDate().getDayOfWeek();


            for (OrderLine oL : temp_Order.orderLines)
            {
                temp_SumOfProducts+= oL.getQuantity();

            }
            // Summed all the quantities of this Order to a temp variable

            if (Sums_Of_Orders_Per_Day.containsKey(temp_DayOfWeek))
            //This day already exists in System,
            // now need to add to existing Sum
            {
                temp_SumOfProducts+= Sums_Of_Orders_Per_Day.get(temp_DayOfWeek);
                //Adding the already Existing Products sum, to our new sum
                Sums_Of_Orders_Per_Day.put(temp_DayOfWeek, temp_SumOfProducts);
            }

            else
            {
              Sums_Of_Orders_Per_Day.put(temp_DayOfWeek, temp_SumOfProducts);

            }



        }

        return Sums_Of_Orders_Per_Day;

    }

    public static void printHashMap(HashMap<DayOfWeek, Integer> totalDailySales)
    {
        for (DayOfWeek i: totalDailySales.keySet())
        {

            System.out.println("DayOfWeek."+ i +" : " + totalDailySales.get(i) );
        }


    }

    public static void printOrderLines(List<OrderLine> Ols)
    {
        System.out.println(" orderLines: [ ");



        for(OrderLine Ol:Ols)
        {
            Ol.print();

            System.out.println(", ");
        }

        System.out.println("            ] ");
    }

    public static void printOrders(ArrayList<Order> My_Orders)
    {
        System.out.println(" [ ");

        for (int i = 0; i <My_Orders.size() ; i++)
        {
            System.out.println(" { ");

            My_Orders.get(i).print();
            printOrderLines(My_Orders.get(i).orderLines);

            System.out.println(" }, ");
        }

        System.out.println(" ] ");

    }

    public static void main(String[] args)//Test For Example Input

    {
        Order O1= new Order();//554
        Order O2= new Order();//555
        Order O3= new Order();//453
        Order O4= new Order();//431
        Order O5= new Order();//690

        ArrayList<Order> My_Orders = new ArrayList<Order>();

        ///////////////////////////////////////////////////////////////////////////
        // Order1 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////
        O1.setOrderId(554);
        O1.setCreationDate(LocalDateTime.parse("2017-03-25T10:35:20") );
        O1.orderLines= new ArrayList<OrderLine>();

        OrderLine O1_Object1=new OrderLine(9872, "Pencil", 3,3.00);

        O1.orderLines.add(O1_Object1);

        ///////////////////////////////////////////////////////////////////////////
        // Order1 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////////
        // Order2 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////
        O2.setOrderId(555);
        O2.setCreationDate(LocalDateTime.parse("2017-03-25T11:24:20") );
        O2.orderLines= new ArrayList<OrderLine>();

        OrderLine O2_Object1=new OrderLine(9872, "Pencil", 2,3.00);
        OrderLine O2_Object2=new OrderLine(1746, "Eraser", 1,1.00);

        O2.orderLines.add(O2_Object1);
        O2.orderLines.add(O2_Object2);
        ///////////////////////////////////////////////////////////////////////////
        // Order2 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////
        // Order3 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////
        O3.setOrderId(453);
        O3.setCreationDate(LocalDateTime.parse("2017-03-27T14:53:12") );
        O3.orderLines= new ArrayList<OrderLine>();

        OrderLine O3_Object1=new OrderLine(5723, "Pen", 4,4.22);
        OrderLine O3_Object2=new OrderLine(9872, "Pencil", 3,3.12);
        OrderLine O3_Object3=new OrderLine(3433, "Eraser Set", 1,6.15);

        O3.orderLines.add(O3_Object1);
        O3.orderLines.add(O3_Object2);
        O3.orderLines.add(O3_Object3);
        ///////////////////////////////////////////////////////////////////////////
        // Order3 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////////
        // Order4 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////
        O4.setOrderId(431);
        O4.setCreationDate(LocalDateTime.parse("2017-03-20T12:15:02") );
        O4.orderLines= new ArrayList<OrderLine>();

        OrderLine O4_Object1=new OrderLine(5723, "Pen", 7,4.22);
        OrderLine O4_Object2=new OrderLine(3433, "Erasers Set", 2,6.15);

        O4.orderLines.add(O4_Object1);
        O4.orderLines.add(O4_Object2);
        ///////////////////////////////////////////////////////////////////////////
        // Order4 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////
        // Order5 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////
        O5.setOrderId(690);
        O5.setCreationDate(LocalDateTime.parse("2017-03-26T11:14:00") );
        O5.orderLines= new ArrayList<OrderLine>();

        OrderLine O5_Object1=new OrderLine(9872, "Pencil", 4,3.12);
        OrderLine O5_Object2=new OrderLine(4098, "Market", 5,4.50);

        O5.orderLines.add(O5_Object1);
        O5.orderLines.add(O5_Object2);
        ///////////////////////////////////////////////////////////////////////////
        // Order5 - All Data Insertion
        ///////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////
        // Array Of orders
        ///////////////////////////////////////////////////////////////////////////

        My_Orders.add(O1);
        My_Orders.add(O2);
        My_Orders.add(O3);
        My_Orders.add(O4);
        My_Orders.add(O5);

        ///////////////////////////////////////////////////////////////////////////
        // Array Of orders
        ///////////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////////
        // Implementing Function
        ///////////////////////////////////////////////////////////////////////////

        System.out.println("Total Sales by each day: ");
        printHashMap(totalDailySales(My_Orders));

        System.out.println();
        System.out.println();

        ///////////////////////////////////////////////////////////////////////////
        // Implementing Function
        ///////////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////////////////////////////////////
        // Printing Test
        ///////////////////////////////////////////////////////////////////////////
        System.out.println(" --- Orders Test --- ");

        printOrders(My_Orders);

        System.out.println(" --- Orders Test --- ");

        ///////////////////////////////////////////////////////////////////////////
        // Printing Test
        ///////////////////////////////////////////////////////////////////////////







    }



}
