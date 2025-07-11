package accouting.calc;

/**
 * @AmountCalclate 
 * 財務諸表に記載してある商品または備品等を数えるためのインタフェースです。
 * これらは整数値を扱います
 */

@FunctionalInterface
public interface AmountCalclate extends Calclate<Integer>{
	
	public abstract Integer toCalclate(Integer ...n);

}
