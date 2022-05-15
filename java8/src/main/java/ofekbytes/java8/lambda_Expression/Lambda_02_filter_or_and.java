package ofekbytes.java8.lambda_Expression;

import java.util.ArrayList;
import java.util.List;

public class Lambda_02_filter_or_and {
	public Lambda_02_filter_or_and() {
		ProductsInventory p2 = new ProductsInventory();

		System.out.println("Or Condition");
		p2.getStatMainList().stream()
				.filter(p -> p.getId().equalsIgnoreCase("id-1001") || p.getId().equalsIgnoreCase("id-1002"))
				.forEach(p -> {
					System.out.println(p.toString());
				});
		System.out.println("======================");

		System.out.println("And Condition");
		p2.getStatMainList().stream().filter(p -> p.getPrice() > 100 && p.getPrice() < 460).forEach(p -> {
			System.out.println(p.toString());
		});
	}
}
