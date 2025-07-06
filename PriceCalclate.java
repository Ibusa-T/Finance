package accouting.calc;

/**
 * @PriceCalclate
 * は財務諸表にに記載してある全ての簿価を計算します
 * 原価計算、商業簿記からとする
 * 可変オブジェクトで表す商品価格、備品残存価格
 * 税率の計算を行います。
 * */

@FunctionalInterface
public interface PriceCalclate extends Calclate<Double>{
	public abstract Double  toCalclate(Double ...n);
}
