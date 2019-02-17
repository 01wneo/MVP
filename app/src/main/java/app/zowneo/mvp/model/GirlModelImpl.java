package app.zowneo.mvp.model;

import java.util.ArrayList;
import java.util.List;

import app.zowneo.mvp.R;
import app.zowneo.mvp.bean.Girl;

public class GirlModelImpl implements IGirlModel {

    @Override // 传递数据
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<Girl>();
        data.add(new Girl(R.drawable.f1, "五颗星", "时时尚潮流时尚潮流时尚潮流尚潮流"));
        data.add(new Girl(R.drawable.f2, "二颗星", "米意米意识诺米意识诺米意识诺识诺"));
        data.add(new Girl(R.drawable.f3, "五颗星", "春春夏秋冬春夏秋冬春夏秋冬夏秋冬"));
        data.add(new Girl(R.drawable.f4, "一颗星", "锌矿雕刻机房啥来得快"));
        data.add(new Girl(R.drawable.f5, "五颗星", "阿萨德大所大所大所大所多"));
        data.add(new Girl(R.drawable.f6, "三颗星", "请问请问请问请问恶趣味请问"));
        data.add(new Girl(R.drawable.f7, "五颗星", "五洲新春V字形从V字形从"));
        data.add(new Girl(R.drawable.f8, "一颗星", "V过好几个号个换个换个个换个"));
        data.add(new Girl(R.drawable.f9, "五颗星", "华为认为人生巅峰手电筒赵大夫VC"));
        data.add(new Girl(R.drawable.f10, "四颗星", "玩儿玩儿飞山东人玩儿为睡房顶玩儿"));

        girlOnLoadListener.onComplete(data); // 传递数据，回调到上一层
    }
}
