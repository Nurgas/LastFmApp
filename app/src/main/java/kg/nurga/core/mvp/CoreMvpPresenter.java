package kg.nurga.core.mvp;

import android.support.annotation.Nullable;

public abstract class CoreMvpPresenter<T extends ICoreMVPContract.View>
        implements ICoreMVPContract.Presenter<T>{

    @Nullable
    protected  T view;

    @Override
    public void attachView(T view) {
        this.view = view;
        view.attachPresenter(this);
    }

    @Override
    public void detachView() {
        view =null;

    }
}
