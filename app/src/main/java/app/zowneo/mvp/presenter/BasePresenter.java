package app.zowneo.mvp.presenter;

import java.lang.ref.WeakReference;

/**
 * 向上抽一个基类
 */

public class BasePresenter<T> {
    // 1.view 层的引用
//    IGirlView girlView;// 不可以使用new的方式
    // 解决内存泄漏，使用弱引用，GC 在系统内存紧张的时候回收
    protected WeakReference<T> mViewRef;

    // 进行绑定，解决内存泄漏，不再是内存紧张的时候，只要是GC有空就会回收
    public void attachView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    // 进行绑定，解决内存泄漏，不再是内存紧张的时候，只要是GC有空就会回收
    public void detachView() {
        mViewRef.clear();
    }
}
