package app.zowneo.mvp;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import app.zowneo.mvp.adapter.GirlAdapter;
import app.zowneo.mvp.bean.Girl;
import app.zowneo.mvp.presenter.GirlPresenter;
import app.zowneo.mvp.view.BaseActivity;
import app.zowneo.mvp.view.IGirlView;

/**
 * ① 根除 activity 内存泄漏的问题；
 * ② 让 mvp 更方便使用；
 * 实例：
 * 1.解决activity和presenter过多，每个activity都进行绑定解绑，反复操作的问题；
 * 2.由activity选择表示层，而不是在接口中new；
 * 3.有很多个表示层的时候，多个View可以选择同一个Presenter，
 * 但是View和Model一定会有很多个；
 */
public class MainActivity extends BaseActivity<IGirlView, GirlPresenter<IGirlView>> implements IGirlView {
    private GridView listView;
//    GirlPresenter girlPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
//        girlPresenter = new GirlPresenter();
        // 进行绑定，解决内存泄漏，不再是内存紧张的时候，只要是GC有空就会回收
//        girlPresenter.attachView(this); 在 baseactivity中已经做了
        girlPresenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }

//    @Override
//    protected void onDestroy() { 在 baseactivity中已经做了
//        super.onDestroy();
//        girlPresenter.detachView();    // 进行绑定，解决内存泄漏，不再是内存紧张的时候，只要是GC有空就会回收
//    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        GirlAdapter adapter = new GirlAdapter(this, girls);
        listView.setAdapter(adapter);
    }
}
