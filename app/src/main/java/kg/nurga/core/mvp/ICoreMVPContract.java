package kg.nurga.core.mvp;

public interface ICoreMVPContract {

    interface View<T extends Presenter>{

        void attachPresenter(T presenter);

        void finnishView();

        void showMessage(String message);

    }

    interface Presenter<T extends View>{

        void  attachView(T view);

        void detachView();

    }
}
