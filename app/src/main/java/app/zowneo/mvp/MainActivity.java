package app.zowneo.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.zowneo.mvp.adapter.GirlAdapter;
import app.zowneo.mvp.bean.Girl;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    List<Girl> data = new ArrayList<Girl>();
    public void init() {
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
        data.add(new Girl(R.drawable.f11, "五颗星", "sdf玩儿 姑苏风光sdf玩儿"));
        data.add(new Girl(R.drawable.f12, "二颗星", "反问我而往让它温柔绕弯儿问题问题问题鬼地方个"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listView = findViewById(R.id.listview);
        GirlAdapter adapter = new GirlAdapter(this, data);
        listView.setAdapter(adapter);
    }
}
