package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_ChickenList extends Activity implements View.OnClickListener {

    private ArrayList<ChickenItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chicken_list);

        ListView listView = (ListView)findViewById(R.id.chicken_listview);

        data = new ArrayList<>();

        ChickenItem chicken1 = new ChickenItem(R.drawable.chn,"노랑통닭 아라점","064-759-5592", "후라이드치킨\t\t\t\t16,000원\n매콤 후라이드\t\t\t18,000원\n"+
                "양념치킨\t\t\t\t\t\t18,000원\n매콤 양념치킨\t\t\t20,000원\n"+
                "깐풍치킨\t\t\t\t\t\t18,000원\n윙봉깐풍\t\t\t\t\t\t18,000원\n"+
                "간바치/고바치\t\t\t19,000원\n간바치반 고바치반\t21,000원\n"+
                "후라이드 양념\t\t\t18,000원\n후라이드 깐풍\t\t\t18,000원\n"+
                "양념 깐풍\t\t\t\t\t20,000원\n순살3종세트\t\t\t\t20,000원\n"+
                "신3종세트\t\t\t\t\t21,000원\n똥집감자튀김\t\t\t\t11,000원\n"+
                "깐풍똥집\t\t\t\t\t\t13,000원");
        ChickenItem chicken2 = new ChickenItem(R.drawable.chn,"네네치킨 아라점","064-726-4479", "흑임자치킨\t\t\t\t\t\t\t19,500원\t마늘치킨\t\t\t\t\t\t\t\t17,000원\n" +
                "스노윙치킨\t\t\t\t\t\t\t17,000원\n 오리엔탈파닭\t\t\t\t\t\t17,000원\n" +
                "쇼킹핫양념치킨\t\t\t\t\t17,000원\n후라이드\t\t\t\t\t\t\t\t15,000원\n" +
                "양념치킨\t\t\t\t\t\t\t\t16,000원\n후라이드반 양념반\t\t\t16,000원\n" +
                "후닭\t\t\t\t\t\t\t\t\t\t16,000원\n후닭윙봉\t\t\t\t\t\t\t\t18,000원\n" +
                "윙봉\t\t\t\t\t\t\t\t\t\t17,000원\n순살\t\t\t\t\t\t\t\t\t\t17,000원\n" +
                "닭다리\t\t\t\t\t\t\t\t\t17,000원\n닭다리 반 닭날개 반\t17,000원\n" +
                "순살 변경\t\t\t\t\t\t\t2,000원");
        ChickenItem chicken3 = new ChickenItem(R.drawable.chn,"엄마치킨","064-726-5330","순살후라이드\t\t\t\t15,000원\n순살양념\t\t\t\t\t\t16,000원\n" +
                "순살간장\t\t\t\t\t\t16,000원\n후라이드\t\t\t\t\t\t15,000원\n" +
                "양념\t\t\t\t\t\t\t\t16,000원\n간장\t\t\t\t\t\t\t\t16,000원\n" +
                "순살 반반\t\t\t\t\t18,000원\n순살매운양념\t\t\t\t17,000원\n" +
                "엄마강정\t\t\t\t\t\t17,000원\n반반치킨\t\t\t\t\t\t16,000원\n" +
                "매운양념치킨\t\t\t\t17,000원\n마늘깐풍치킨\t\t\t\t18,000원");
        ChickenItem chicken4 = new ChickenItem(R.drawable.chn,"명품치킨","064-723-8292","후라이드\t\t\t\t\t\t\t\t\t16,000원\t양념\t\t\t\t\t\t\t\t\t\t\t17,000원\n" +
                "간장\t\t\t\t\t\t\t\t\t\t\t17,000원\n매운간장\t\t\t\t\t\t\t\t\t18,000원\n" +
                "매운양념치킨\t\t\t\t\t\t\t18,000원\n해물양념\t\t\t\t\t\t\t\t\t20,000원\n" +
                "크리스피\t\t\t\t\t\t\t\t\t17,000원\n순살안심후라이드\t\t\t\t17,000원\n" +
                "순살안심양념/간장\t\t\t18,000원\n똥집튀김\t\t\t\t\t\t\t\t16,000원\n" +
                "감자튀김\t\t\t\t\t\t\t\t3,000원\n다리 날개 후라이드\t\t19,000원\n" +
                "다리 날개 양념/간장\t\t20,000원\n오리지날 후라이드 파닭\t19,000원\n" +
                "크리스피 후라이드 파닭\t20,000원\n국내산 순살 안심 파닭\t\t20,000원\n");
        ChickenItem chicken5 = new ChickenItem(R.drawable.chn,"숲노을 치킨","064-724-4719","치킨(후라이드/양념/간장/반반)\t14,000원\n순살치킨(후라이드/양념/간장/반반)\t14,000원\n" +
                "감자튀김\t\t\t\t\t\t2,000원\n치킨떡볶이\t\t\t\t\t15,000원\n" +
                "매운순살치킨 감자\t17,000원\n순살파닭\t\t\t\t\t\t17,000원\n" +
                "양념파닭\t\t\t\t\t\t17,000원\n매운무뼈닭발\t\t\t\t15,000원\n" +
                "소금똥집볶음\t\t\t\t15,000원\n떡볶이\t\t\t\t\t\t\t12,000원\n");

                ChickenItem chicken6 = new ChickenItem(R.drawable.chn,"푸라닭 제주대점","064-702-1588","더 차이나\t\t\t\t\t17,900원\n순살 더 차이나\t\t18,900원\n" +
                "매드갈릭치킨\t\t\t\t17,900원\n블랙알리오\t\t\t\t\t17,900원\n" +
                "고추마요 치킨\t\t\t17,900원\n파불로 치킨\t\t\t\t17,900원\n" +
                "스파이시걸스\t\t\t\t16,900원\n악마 치킨\t\t\t\t\t17,900원\n" +
                "푸라닭 치킨\t\t\t\t15,900원\n달콤양념 치킨\t\t\t16,900원\n" +
                "순살 블랙알리오\t\t18,900원\n순살 매드갈릭\t\t\t18,900원\n" +
                "순살 고추마요\t\t\t18,900원\n순살 파불로\t\t\t\t18,900원\n" +
                "순살 치킨\t\t\t\t\t17,900원\n푸라 윙콤보\t\t\t\t18,900원\n" +
                "블랙 윙콤보\t\t\t\t19,000원\n씨즐링 윙콤보\t\t\t19,900원\n" +
                "악마 윙콤보\t\t\t\t19,900원\n블랙악마\t\t\t\t\t\t18,900원\n" +
                "순살 블랙악마\t\t\t19,900원\n블랙악마 윙콤보\t\t20,900원\n");
        ChickenItem chicken7 = new ChickenItem(R.drawable.chn,"멕시카나 치킨","064-7002-8865","뿌리고치킨\t\t\t\t\t\t\t\t18,000원\n후라이드\t\t\t\t\t\t\t\t\t17,000원\n" +
                "양념\t\t\t\t\t\t\t\t\t\t\t18,000원\n골드(간장)\t\t\t\t\t18,000원\n" +
                "반반\t\t\t\t\t\t\t\t\t\t\t18,000원\n순살 변경\t\t\t\t\t\t\t\t1,000원\n" +
                "순살파닭\t\t\t\t\t\t\t\t\t20,000원\n눈꽃치즈치킨\t\t\t\t\t\t\t19,000원\n" +
                "땡초치킨\t\t\t\t\t\t\t\t\t19,000원\n마늘치킨\t\t\t\t\t\t\t\t\t19,000원\n" +
                "허니벌꿀치킨\t\t\t\t\t\t\t19,000원\n순살강정\t\t\t\t\t\t\t\t\t20,000원\n" +
                "매운양념치킨\t\t\t\t\t\t\t19,000원\n치토스치킨\t\t\t\t\t\t\t\t19,000원\n" +
                "치토스2탄\t\t\t\t\t\t\t\t19,000원\n멕시편(다리)\t\t\t\t\t\t19,000원\n" +
                "세트1(후라이드 양념)\t23,000원\n세트2(후라이드 간장)\t23,000원\n" +
                "세트23(양념 간장)\t\t23,000원\n멕시감자\t\t\t\t\t\t\t\t\t4,000원\n" +
                "더블치즈볼\t\t\t\t\t\t\t\t4,000원\n닭모래집\t\t\t\t\t\t\t\t\t13,000원\n");

        data.add(chicken1);
        data.add(chicken2);
        data.add(chicken3);
        data.add(chicken4);
        data.add(chicken5);
        data.add(chicken6);
        data.add(chicken7);

        ChickenAdapter adapter = new ChickenAdapter(this,R.layout.chicken_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_ChickenClicked.class);

                intent.putExtra("chicken_profile", Integer.toString(data.get(position).getChickenProfile()));
                intent.putExtra("chicken_info", data.get(position).getChickenInfo());
                intent.putExtra("chicken_phone", data.get(position).getChickenPhone());
                intent.putExtra("chicken_menu", data.get(position).getChickenMenu());

                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
