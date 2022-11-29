
public class Accountingapp {

	public static void main(String[] args) {

		double ValueofSupply = 10000.0;
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double Vat = ValueofSupply*VatRate;
		double Total = ValueofSupply + Vat;
		double Expense = ValueofSupply*expenseRate;
		double Income = ValueofSupply - Expense;
		double dividend1 = Income *0.5;
		double dividend2 = Income *0.3;
		double dividend3 = Income *0.2;

		
		System.out.println("Value of supply : "+ValueofSupply);
		System.out.println("Vat : "+ Vat);
		System.out.println("Total : "+ Total);
		System.out.println("Expense : "+ Expense);
		System.out.println("Income : "+ Income);
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);


		
	}

}
