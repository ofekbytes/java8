package ofekbytes.java8.lambda_Expression;

public class Lambda_01_ForEach {
	public Lambda_01_ForEach() {
		ProductsInventory pl = new ProductsInventory();
		pl.getStatMainList().forEach(p -> {
			System.out.println(p.toString());
		});
	}
}
