package accouting.util;

/**
 * @author Ibusa-T
 * @TemplateDigit
 * @apiNote 桁数取得のためのテンプレートを提供するクラス
 * */
final  class TemplateDigit{
	
	private TemplateDigit() {}
	
	 final static char delimiter = ','; 
	
	 final static String templateDigits[]=
		{
			"1000000000000000","100000000000000" ,"10000000000000",
			"1000000000000","100000000000","10000000000","1000000000",
			"100000000","10000000","1000000","100000","10000","1000",
			};
	
	 final static String priceStringFormat[]= 
		{
				"1,000,000,000,000,000","100,000,000,000,000","10,000,000,000,000",
				"1,000,000,000,000","100,000,000,000","10,000,000,000","1,000,000,000",
				"100,000,000","10,000,000","1,000,000","100,000","10,000","1,000",
				};                       

	/*このライブラリ上でサポートできる金額の桁数*/
	 final static Long maxSuporteddigit = Long.valueOf(templateDigits[0].length());
	
	
}

