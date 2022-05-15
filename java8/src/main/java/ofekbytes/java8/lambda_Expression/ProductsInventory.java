package ofekbytes.java8.lambda_Expression;

import java.util.ArrayList;
import java.util.List;

public class ProductsInventory 
{	
	public static List <Product> statMainList = new ArrayList();
	
	public static final List<Product> getStatMainList() 
	{
		return statMainList;
	}

	public ProductsInventory() {	
		// cooking 
		statMainList.add(new Product("id-1001","microwave","hemilton",1122,"white","xl","b",100 ,500));
		statMainList.add(new Product("id-1002","toaster-oven","hemilton",1500,"black","l","c",150 ,350));
		// phone
		statMainList.add(new Product("id-2001", "phone", "nokia", 2255, "black", "xs", "a", 200, 250));
		statMainList.add(new Product("id-2001", "phone", "nokia", 5577, "black", "xs", "a", 200, 450));
	}
}
