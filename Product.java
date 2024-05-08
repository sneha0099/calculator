

import java.util.*;

public class Product{

Scanner sc = new scanner(System.in);
        int MRP;
	int QUANTITY;

 void display()
{

System.out.ptintln("MRP" + MRP);
System.out.ptintln("QUANTITY" + QUANTITY);


}

void setdata()
{

System.out.println("Enter mrp:");
this.MRP = sc.nextInt();
System.out.println("Enter QUANTITY:");
this.QUANTITY = sc.nextInt();


}

public static void main(string args[]){
Product p1 = new Product();
P1.display();
P1.setdata();
}







































