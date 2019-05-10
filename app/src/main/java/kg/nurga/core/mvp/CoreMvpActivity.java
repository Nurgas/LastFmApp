package kg.nurga.core.mvp;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import kg.nurga.core.CoreUtils;

public abstract class CoreMvpActivity<T extends ICoreMVPContract.Presenter>
        extends AppCompatActivity implements ICoreMVPContract.View<T> {
    @Nullable
    protected T presenter;

    @LayoutRes
    protected abstract int getLayoutId();
    protected abstract void initView();

    @Nullable
    protected abstract T providePresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initView();

        presenter = providePresenter();
        if (presenter != null) {
            presenter.attachView(this);
        }
    }

    @Override
    public void attachPresenter(T presenter) {
        this.presenter = presenter;
    }

    @Override
    public void finnishView() {
        finish();

    }

    @Override
    public void showMessage(String message) {
        CoreUtils.showShortToast(this, message);


    }
}
