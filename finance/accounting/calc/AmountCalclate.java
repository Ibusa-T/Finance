package accouting.calc;

/**
 * @AmountCalclate 
 * 財務諸表に記載してある商品または備品等を数えるためのインタフェースです。
 * これらは整数値を扱います
 * 
 *  // DateTime date = new DateTime(2025, 7, 16); // 任意の日付
 *  // String mmdd = date.ToString("MMdd");
 *  //これらの日付で、このインターフェースを実装したクラスにある在庫を検索
 * //また過去の仕入れ、売上を検索することができます。
 * 
 */



@FunctionalInterface
public interface AmountCalclate extends Calclate<Integer>{
	
	public abstract Integer toCalclate(String month,Integer ...n);
	public abstract void Stock(String name,int amount);
	public abstract void stockHistory(int yy,int mm,int dd,int mm,int dd,String name,double price);
	public abstract void flowHistory(int yy,int mm,int dd,int mm,int dd,String name,double price);

}
