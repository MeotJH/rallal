
public class AccountingaApp {
	
	public static void main(String[] args) {
		
		double Valueofsupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expneseRate = 0.3;
		double Vat = Valueofsupply*VatRate;
		double Tatal = Valueofsupply + Vat;
		double expense = Valueofsupply*expneseRate;
		double income = Valueofsupply - expense;
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		System.out.println("Value of supply :" + Valueofsupply);
		System.out.println("Vat : "+ Vat );
		System.out.println("Total : " + Tatal );
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		System.out.println("Dividende 1 : "+ dividend1 );
		System.out.println("Dividende 2 : "+ dividend2 );
		System.out.println("Dividende 3 : "+ dividend3 );
		
		
	}

}
