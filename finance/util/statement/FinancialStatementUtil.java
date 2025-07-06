package accouting.util;
import java.lang.NullPointerException;
import accouting.util.exception.*;


/**
 * @FinancialStatement
 * @author IBusa
 * 今回作成するライブラリにおいて使われる共通処理をまとめています。
 * */

public class FinancialStatementUtil {
	
	private final static Integer  minstndardValue = 0;
	
	
	/**
	 * @param itemPrice
	 * @throws NullPointerException
	 * 最低基準値
	 * 金額が正常な数値の範囲であるかを判定する
	 * */	
	private boolean priceCheck(Long itemPrice) 
			throws NullPointerException ,NegativeNumberException {
		
		if(itemPrice == null) 
			throw new  NullPointerException();
		
		if(minstndardValue > itemPrice)
				throw new NegativeNumberException();

		return true;
	}

	
	/**
	 * @param itemPrice
	 * @throws NullPointerException
	 * 勘定科目の金額に対し区切り文字でデリミタします
	 * 会計システム上の画面上に表示する想定で行っています。
	 * */		
	
	public String PriceDelimiter(Long itemPrice) 
	                            throws NullPointerException{
		
		boolean flag = this.priceCheck(itemPrice);
		
		/*金額の参照がないならj例外を投げる*/
		if(flag==false)
			throw new NullPointerException();
		
		
		/**
		 * 金額を文字列型に変換
		 * */
	
		String priceString = String.valueOf(itemPrice);
		try {
			
			if(DigitValidation.isFormatNum(priceString) == true) 
					throw  new InvalidFormatException();
			
			/*四桁未満ならデリミタの必要がないのでそのまま返す*/
			flag = DigitValidation.checkDigit(priceString);
			if(flag==true)
				return priceString;
		
			/**
			 * 4桁以上なら
			 * デリミタする
			 * */
					
			priceString = new String(DigitValidation.PriceBuilder.derimiter(priceString));
			
		}catch( NegativeNumberException e) {
			e.printStackTrace();
		}catch( InvalidFormatException | UnOperatingDigitsException e) {
			e.printStackTrace();
		}
	
				
		return priceString;
	}
}
