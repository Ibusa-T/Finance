package accouting.util.exception;
/**
 * @author Ibusa-T
 * @apiNote このクラスは会計処理において発生するすべての例外を扱うスーパークラスです
 */
public abstract class FinanceException extends RuntimeException{
    private static final long serialVersionUID=1L;

    /**
     * @param message 例外メッセージ
     * 
     */
    public void message(String message){

        System.out.println(message);
    }
}
