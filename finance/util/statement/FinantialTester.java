package main;

import accouting.util.FinancialStatementUtil;

public class FinantialTester {
	
	
	public static void main(String[] args) {
		
		String templateDigits[]=
			{
				"1000000000000000","100000000000000" ,"10000000000000",
				"1000000000000","100000000000","10000000000","1000000000",
				"100000000","10000000","1000000","100000","10000","1000",
				};
		String priceStringFormat[]= 
			{
					"1,000,000,000,000,000","100,000,000,000,000","10,000,000,000,000",
					"1,000,000,000,000","100,000,000,000","10,000,000,000","1,000,000,000",
					"100,000,000","10,000,000","1,000,000","100,000","10,000","1,000",
					};                        //1,000000

		
		FinancialStatementUtil fsu = new FinancialStatementUtil();
		int length = templateDigits.length;
		
		for(int i =0; i < length;i++) {
			String result = fsu.PriceDelimiter(Long.valueOf(templateDigits[0]));
			System.out.println(priceStringFormat[i].equals(result));
			System.out.println(templateDigits[i]+":"+result);		
		}
		
		
	}
}
