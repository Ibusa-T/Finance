package accouting.calc;

/**
 * @Calclate<T extends Number>
 * は財務諸表に必要なすべての計算を網羅します
 * 例えば浮動小数点を使う税率の計算式
 * 整数を使う売り上げ原価の計算等を実現するためのインタフェースです。
 * */

@FunctionalInterface
public abstract interface Calclate<T extends Number>{
	public abstract T toCalclate(T ...n);
}
