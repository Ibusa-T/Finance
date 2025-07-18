
/**
 * @author 
 * @Ibusa-T
 * 出納帳のインターフェースです。
 * 
 * 購入
 * 売却
 * 償却
 * */
@FunctionalInterface
public abstract interface Treasurer{
    public abstract void purchaseHistory(String name,Double price);
    public abstract void saleHistory(String name,Double price);
    public abstract void amortization(String name,Double price);
}