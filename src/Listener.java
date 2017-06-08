/**
 * Created by stllpt065 on 5/6/17.
 */
public interface Listener {

    void onAction();

}
class Sample{
    public static void main(String[] args) {
        get(new Listener() {
            @Override
            public void onAction() {

            }
        });
    }

    static void get(Listener listener){

    }
}
