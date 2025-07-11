package accouting.util;

import accouting.util.exception.*;

/**
 * @author IBusa-T
 * @DigitValidation
 * @category processor
 * @apiNote TemplateDigitクラスのテンプレートを利用して
 * 金額文字列が数字であるか、デリミタの必要な桁数であるかを検査するクラス
 * */

final  class DigitValidation {

	private final static Integer fourDigits = 4;

	private DigitValidation() {}
		
	/*
	 * @param c 
	 * 受け取った文字列の部分文字列が数字であるか検査
	 */
	
	private static boolean isNumeric(char c){
		
			return Character.isDigit(c) ;
	}
	
	/**
	 * @param  priceStringが数字文字であるかを検査
	 * 
	 * */
	
	static boolean isFormatNum(String priceString) {
		
		char c_arr [] = priceString.toCharArray();
		
		for(char pr : c_arr) {
			if(isNumeric(pr) == false)
				break;
		}
		
		return true;
	}
	
	/**
	 * @param price 金額
	 * @thorws NullPointerException
	 * カンマのデリミタが必要な桁数か検査します。
	 * */
	static boolean checkDigit(String price) 
			                  throws NullPointerException{
		
		if(price==null)
			throw new  NullPointerException();
		
		if(price.length() < fourDigits)
			return true;
		
		return false;
	}

	
	private static boolean checkDigitLen(String priceString) {
		
		if(priceString.length() < TemplateDigit.maxSuporteddigit)
			return true ;
		
		return  false;
	}
	
	/**
	 * @throws NullPointerException
	 * デリミタ前の桁数を取得します。
	 */
	private static int getDigit(String priceString) 
			throws NullPointerException ,UnOperatingDigitsException{

		if(priceString == null)
			throw new NullPointerException();
		
		if(checkDigitLen(priceString) == true)
			throw new UnOperatingDigitsException();
			
		
		int templateLength = TemplateDigit.templateDigits.length;
		int length = priceString.length();
		
		int digit=0;
		for(int i =0 ; i< templateLength;i++) {
			
			if(length == TemplateDigit.templateDigits[i].length())
			   return TemplateDigit.templateDigits[i].length();
		}
		
	}
	
	
	
   static class PriceBuilder{
		
		
		static StringBuffer derimiter(String priceString) 
				throws UnOperatingDigitsException, NullPointerException{

			int digits = getDigit(priceString);

			StringBuffer sbf = new StringBuffer(0);

			/*ビルダに文字列に変換した値を入れてカンマを挿入しやすくなる。*/
			for(int i =0; i < digits;i++) 	
				      sbf.append(priceString.charAt(i));
			
			int length = TemplateDigit.priceStringFormat.length;
		
			/*該当するサポート範囲内の桁数を探す*/
			
			for(int i =0; i < length; i++) {
				int formatLength = TemplateDigit.priceStringFormat[i].length();
				int templateLength = TemplateDigit.templateDigits[i].length();			

				if(sbf.length() !=templateLength)
					continue;

				for(int j =0 ;  j <  formatLength ; j++) {
					
					if(TemplateDigit.priceStringFormat[i].charAt(j) ==  TemplateDigit.delimiter)
						sbf.insert(j,  TemplateDigit.delimiter);
					
				}
			}
			
			return sbf;
		}
		
			
	}


}
