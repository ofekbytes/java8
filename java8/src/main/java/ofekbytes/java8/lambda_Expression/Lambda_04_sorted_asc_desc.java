package ofekbytes.java8.lambda_Expression;

public class Lambda_04_sorted_asc_desc 
{
	public Lambda_04_sorted_asc_desc() 
	{
		
		ProductsInventory p4 = new ProductsInventory();

		System.out.println("Ascending Order");
		p4.getStatMainList().stream()
			.sorted((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()))
			.forEach(p -> 
			{
				System.out.println(p.toString());
			});
		System.out.println("======================");
		System.out.println("Descending Order");
		p4.getStatMainList().stream()
			.sorted((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()))
			.forEach(p -> 
			{
				System.out.println(p.toString());
			});
		System.out.println("======================");
	}
}