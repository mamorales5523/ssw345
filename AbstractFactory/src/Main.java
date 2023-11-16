import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Pizza Store! Would you like a NewYork or Chicago style pizza?");
		String franchise = scan.nextLine();
		
		while(!franchise.equals("NewYork") && !franchise.equals("Chicago")) {
			System.out.print("Enter NewYork or Chicago");
			franchise = scan.nextLine();
		     	 
		}
		
		System.out.println("Would you like it with cheese, pepperoni, veggie, or clam?");
		String pizzaKind = scan.nextLine();
		while(!(pizzaKind.equals("cheese") || pizzaKind.equals("pepperoni") || pizzaKind.equals("veggie") || pizzaKind.equals("clam"))) {
			System.out.print("Enter cheese, pepperoni, veggie, or clam");
			pizzaKind = scan.nextLine();
		     	 
		}
		
		if(franchise.equals("NewYork")) {
			PizzaStore nyPizzaStore = new NYPizzaStore();
			nyPizzaStore.orderPizza(pizzaKind);
		}else {
			PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
			chicagoPizzaStore.orderPizza(pizzaKind);
		}
	}

}
