package app.zowneo.mvp.presenter;

import java.lang.ref.WeakReference;
import java.util.List;

import app.zowneo.mvp.bean.Girl;
import app.zowneo.mvp.model.GirlModelImpl;
import app.zowneo.mvp.model.IGirlModel;
import app.zowneo.mvp.view.IGirlView;

/**
 * 表示层
 */
public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {// 使用泛型，更加灵活
    // 2.model 层的引用
    IGirlModel girlModel = new GirlModelImpl();// 可以使用new的方式

    // 3.构造方法
    /*public GirlPresenter(IGirlView girlView, IGirlModel girlModel) {
        // view 是视图的一个activity，activity 不能用new Activity
        this.girlView = girlView;
        this.girlModel = girlModel;
    }*/
//    public GirlPresenter(T view) {// 使用泛型，更加灵活
    public GirlPresenter() {// 使用绑定的方法
//        this.girlView = view;
//        mViewRef = new WeakReference<>(view);// 软引用，解决内存泄漏
    }

    // 4.执行操作(UI逻辑)
    public void fetch() { // 提取
        if (/*girlView*/ mViewRef.get() != null) {
            /*girlView*/
            mViewRef.get().showLoading();
            if (girlModel != null) {
                girlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if (/*girlView*/ mViewRef.get() != null) {
                            /*girlView*/
                            mViewRef.get().showGirls(girls);
                        }
                    }
                });
            }
        }
    }
}
