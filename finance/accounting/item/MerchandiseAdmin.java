package accounting.item;

/**
 * @author 
 * @Ibusa-T
 * @Merchandise.class
 * 商業簿記における繰越商品を扱うクラスです。
 * private HashMap<String,Integer>stock;
 * は商品名をキーに持ち、在庫を保持します。
 * private HashMap<String,Integer>priceList;
 * は商品名をキーに持ち、商品価格を扱います。
 */
final class Merchandise{
    private HashMap<String,Integer>stock;
    private HashMap<String,Integer>priceList;
}