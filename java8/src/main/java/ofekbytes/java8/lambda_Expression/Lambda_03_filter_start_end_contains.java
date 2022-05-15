package ofekbytes.java8.lambda_Expression;

public class Lambda_03_filter_start_end_contains {
	public Lambda_03_filter_start_end_contains() {
		ProductsInventory p3 = new ProductsInventory();
		System.out.println("'name' Search Starts With: micro");
		p3.getStatMainList().stream().filter(p -> p.getName().startsWith("micro")).forEach(p -> {
			System.out.println(p.toString());
		});
		System.out.println("======================");
		System.out.println("'name' Search Ends With: ne");
		p3.getStatMainList().stream().filter(p -> p.getName().endsWith("ne")).forEach(p -> {
			System.out.println(p.toString());
		});
		System.out.println("======================");
		System.out.println("'name' Search Contains: toaster");
		p3.getStatMainList().stream().filter(p -> p.getName().contains("toaster")).forEach(p -> {
			System.out.println(p.toString());
		});
		System.out.println("======================");
	}
}
