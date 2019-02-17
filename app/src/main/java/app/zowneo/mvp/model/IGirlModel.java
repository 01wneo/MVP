package app.zowneo.mvp.model;

import java.util.List;

import app.zowneo.mvp.bean.Girl;

/**
 * 用来加载数据
 */
public interface IGirlModel {
    /*
     * void loadGirl(List data);
     * 当数据来源是网络，服务，
     * 如果超时，界面就会卡主
     * */

    void loadGirl(GirlOnLoadListener girlOnLoadListener);// 将数据回调回去

    // 设计一个内部的回调接口
    interface GirlOnLoadListener {
        void onComplete(List<Girl> girls);
    }
}
