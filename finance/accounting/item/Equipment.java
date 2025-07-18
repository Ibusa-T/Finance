package item;

/**
 * @author 
 * @Ibusa-T
 * 備品の管理をするクラスです
 * 例えば減価償却にある定額法、定率法
 * また、間接法における減価償却累計額の計上をサポートします。
 *  private HashMap<String,Integer>stock;
 *  は備品名称をキーに持ち残存価格を値として持ちます。
 *  セットされる初期値は購入にかかった費用です 
 */

final class Equipment {
    private HashMap<String,Integer>stock;
}