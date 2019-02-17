package app.zowneo.mvp.view;

import java.util.List;

import app.zowneo.mvp.bean.Girl;

/**
 * 定义出所有的 UI 逻辑
 */
public interface IGirlView {
    // 加载进度
    void showLoading();

    /*
    * List showGirls(); 这个是使用方法的返回值的方式，
    * 使用这个方式获取网络中的数据，可能会使UI卡主
    */
    /*显示 ListView 中的数据（使用回调的方式返回数据）
    * 通过参数把参数的结果带回到activity
    * */
    void showGirls(List<Girl> girls);
}
