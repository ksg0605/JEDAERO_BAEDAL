package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_ChineseList extends Activity implements View.OnClickListener {

    private ArrayList<ChineseItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chinese_list);

        ListView listView = (ListView)findViewById(R.id.chinese_listview);

        data = new ArrayList<>();

        ChineseItem chinese1 = new ChineseItem(R.drawable.chi,"월궁","064-724-3477","자장면\t5,500원\n간짜장\t7,000원\n" +
                "짬뽕\t7,000원\n우동\t7,000원\n" +
                "울면\t8,000원\n삼선짜장\t9,000원\n" +
                "삼선짬뽕\t9,000원\n고추짬뽕\t9,000원\n" +
                "사천짜장\t9,000원\n삼선간짜장\t9,000원\n" +
                "쟁반짜짱\t15,000원\n쟁반짬뽕\t17,000원\n" +
                "볶음밥\t7,000원\n짜장밥\t7,000원\n" +
                "짬뽕밥\t8,000원\n잡채밥\t8,000원\n" +
                "오므라이스\t8,000원\n해물덮밥\t9,000원\n" +
                "새우볶음밥\t9,000원\n삼선볶음밥\t9,000원\n" +
                "잡탕밥\t12,000원\n마파밥\t9,000원\n" +
                "탕수육 \t17,000원\n잡채\t20,000원\n" +
                "마파두부\t20,000원\n라조육\t26,000원\n" +
                "팔보채\t26,000원\n난자완스\t30,000원\n" +
                "깐풍기\t26,000원\n라조기\t26,000원\n" +
                "양장피\t28,000원\n깐풍새우\t35,000원\n" +
                "깐쇼새우\t35,000원\n유산슬\t30,000원\n" +
                "고추잡채\t30,000원\n해삼판\t35,000원\n" +
                "세트1(탕수육 자장1)\t15,000원\n세트2(탕수육 자장2)\t18,000원\n" +
                "세트3(탕수육 짬뽕1)\t16,000원\n세트4(탕수육 짬뽕2)\t20,000원\n" +
                "세트5(탕수육 자장 짬뽕)\t19,000원\n세트6(탕수육 볶음밥2)\t20,000원\n" +
                "세트7(탕수육 잡채밥2)\t21,000원\n세트8(탕수육 + 쟁반자장)\t22,000원\n" +
                "세트9(탕수육 쟁반짬뽕)\t23,000원");
        ChineseItem chinese2 = new ChineseItem(R.drawable.chi,"평화","064-724-1344", "자장면\t5,000원\n볶음밥\t6,000원\n" +
                "간자장\t6,000원\n자장밥\t7,000원\n" +
                "잡채밥\t7,000원\n짬뽕밥\t7,000원\n" +
                "짬뽕\t6,000원\n울면\t7,000원\n" +
                "오므라이스\t7,000원\n삼선자장\t8,000원\n" +
                "삼선우동\t8,000원\n삼선짬뽕\t8,000원\n" +
                "사천자장\t8,000원\n고추짬뽕\t8,000원\n" +
                "송이덮밥\t9,000원\n해물덮밥\t9,000원\n" +
                "고추짬뽕밥\t9,000원\n새우볶음밥\t9,000원\n" +
                "오징어덮밥\t9,000원\n삼선짬뽕밥\t9,000원\n" +
                "유산슬덮밥\t12,000원\n고추잡채밥\t12,000원\n" +
                "잡탕밥\t12,000원\n쟁반짬뽕\t13,000원\n" +
                "쟁반짜장\t12,000원\n팔보채\t30,000원\n" +
                "탕수육 대\t22,000원\n탕수육 소\t15,000원\n" +
                "양장피\t30,000원\n깐풍기\t30,000원\n" +
                "라조기\t30,000원\n고추잡채밥\t30,000원\n" +
                "깐쇼새우\t35,000원\n깐풍새우\t35,000원\n" +
                "깐쇼육\t30,000원\n유산슬\t30,000원\n" +
                "라조육\t30,000원\n세트1(탕수육 자장1)\t16,000원\n" +
                "세트2(탕수육 자장2)\t18,000원\n세트3(탕수육 짬뽕1)\t17,000원\n" +
                "세트4(탕수육 짬뽕2)\t19,000원\n세트5(탕수육 자장 짬뽕)\t19,000원\n" +
                "세트6(탕수육 볶음밥2)\t20,000원\n세트7(탕수육 잡채밥2)\t21,000원\n" +
                "세트8(탕수육 + 쟁반자장)\t23,000원\n세트9(탕수육 쟁반짬뽕)\t23,000원");

        data.add(chinese1);
        data.add(chinese2);


        ChineseAdapter adapter = new ChineseAdapter(this,R.layout.chinese_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_ChineseClicked.class);

                intent.putExtra("chinese_profile", Integer.toString(data.get(position).getChineseProfile()));
                intent.putExtra("chinese_info", data.get(position).getChineseInfo());
                intent.putExtra("chinese_phone", data.get(position).getChinesePhone());
                intent.putExtra("chinese_menu", data.get(position).getChinesemenu());
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}

