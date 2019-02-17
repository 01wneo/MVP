package app.zowneo.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import app.zowneo.mvp.presenter.BasePresenter;

/**
 * V 子泛型：View 要使用的；
 * T 表示层要使用的；
 */
public abstract class BaseActivity<V, T extends BasePresenter<V>> extends Activity {
    // 表示层的引用
    public T girlPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girlPresenter = createPresenter();// 调用表示层的选择
        girlPresenter.attachView((V) this); // 传入当前的 activity
    }

    // 表示层的选择：写一个抽象的方法，让继承baseactivity的类必须选择一个抽象层
    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {// activity 异常退出加到activity声明周期中进行处理
        super.onDestroy();
        girlPresenter.detachView();
    }
}
