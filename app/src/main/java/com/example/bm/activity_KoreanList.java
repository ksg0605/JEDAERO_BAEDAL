package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_KoreanList extends Activity implements View.OnClickListener {

    private ArrayList<KoreanItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.korean_list);

        ListView listView = (ListView)findViewById(R.id.korean_listview);

        data = new ArrayList<>();

        KoreanItem korean1 = new KoreanItem(R.drawable.kor,"아라불족","064-724-4885", "소금구이 소\t22,000원\n소금구이 대\t29,000원\n" +
                "양념구이 소\t22,000원\n양념구이 대\t29,000원\n" +
                "매운구이 소\t22,000원\n매운구이 대\t29,000원\n" +
                "반반 대\t29,000원\n세트 1(소금 대 계란찜 김가루밥)\t33,000원\n" +
                "세트 2(양념 대 계란찜 김가루밥)\t33,000원\n세트 3(매운 대 계란찜 김가루밥)\t33,000원\n" +
                "세트 4(반반 대 계란찜 김가루밥)\t33,000원");
        KoreanItem korean2 = new KoreanItem(R.drawable.kor,"부부족발","064-755-7727", "족발 소\t25,000원\n족발 중\t30,000원\n" +
                "족발 대\t35,000원\n보쌈 소\t25,000원\n" +
                "보쌈 중\t30,000원\n보쌈 대\t36,000원\n" +
                "냉채족발 중\t30,000원\n냉채족발 대\t36,000원\n" +
                "매운족발 중\t30,000원\n매운족발 대\t36,000원\n" +
                "쟁반국수\t10,000원\n탕수육 소\t10,000원\n" +
                "세트1(보쌈 족발)\t38,000원\n세트2(족발 매운족발)\t38,000원\n");
        KoreanItem korean3 = new KoreanItem(R.drawable.kor,"배꼽시계","064-724-4656", "뚝배기삼겹살\t7,000원\n숯불갈비덮밥\t7,000원\n" +
                "두루치기\t7,000원\n갈비찜\t7,000원\n" +
                "뼈해장국\t7,000원\n돈까스\t7,000원\n" +
                "불고기뚝배기\t7,000원\n제육덮밥\t7,000원\n" +
                "부대찌개\t7,000원\n육개장\t7,000원\n" +
                "순살닭도리탕\t6,000원\n김치찌개\t6,000원\n" +
                "순두부\t6,000원\n된장찌개\t6,000원\n" +
                "비빔밥\t6,000원\n오므라이스\t6,000원\n" +
                "김치볶음밥\t6,000원\n갈비만두\t4,000원\n" +
                "김치만두\t4,000원\n고기만두\t4,000원\n" +
                "비빔냉면\t6,000원\n물냉면\t6,000원\n");
        KoreanItem korean4 = new KoreanItem(R.drawable.kor,"개미와베짱이","064-726-4939", "돼지국밥\t7,000원\n갈비찜\t7,000원\n" +
                "소불고기\t7,000원\n돈가스\t7,000원\n" +
                "제육덮밥\t7,000원\n육개장\t6,000원\n" +
                "닭곰탕\t6,000원\n김치찌개\t6,000원\n" +
                "김치찜\t7,000원\n고등어짐치찜\t7,000원\n" +
                "부대찌개(2인이상)\t7,000원\n고등어구이\t12,000원\n" +
                "제육볶음\t12,000원\n비빔 물냉면\t6,000원\n" +
                "한치물회\t8,000원");
        KoreanItem korean5 = new KoreanItem(R.drawable.kor,"신전떡볶이 제주대점","064-723-4448", "떡볶이\t3,500원\n치즈떡볶이\t4,500원\n" +
                "오뎅튀김\t1,500원\n만두튀김\t1,500원\n" +
                "잡채말이\t1,500원\n김말이\t1,500원\n" +
                "치즈스틱\t2,000원\n오징어튀김\t2,000원\n" +
                "고구마튀김\t1,500원\n모둠튀김\t3,500원\n" +
                "순대\t3,500원\n꼬마치킨윙\t2,000원\n" +
                "스팸마요컵밥\t3,500원\n신전치즈겁밥\t3,500원\n" +
                "참치마요컵밥\t3,500원\n치즈추가\t1,000원\n" +
                "삶은계란\t1,000원\n쿨피스\t1,000원\n" +
                "기본세트(할인)\t500원\n패밀리세트(할인)\t1,000원\n");
        KoreanItem korean6 = new KoreanItem(R.drawable.kor,"빠샤시 떡볶이","064-702-8832", "빠사시 떡볶이 \t3,000원\n매콤까르보나라떡볶이\t4,900원\n" +
                "자연산치즈떡볶이\t3,900원\n찰순대\t3,000원\n" +
                "진짜부산오뎅\t3,000원\n새우튀김\t3,500원\n" +
                "오징어튀김\t3,500원\n오뎅튀김\t2,000원\n" +
                "야채만두튀김\t2,000원\n김말이튀김\t2,000원\n" +
                "모둠야채튀김\t2,000원\n후라이드\t15,000원\n" +
                "닭강정\t15,000원\n치즈굴림치킨\t15,000원\n" +
                "간장마늘치킨\t15,000원\n옛날통닭\t15,000원\n" +
                "양념치킨\t15,000원\n닭강정 빠사시떡볶이 콜라\t17,500원\n" +
                "후라이드 빠사시떡볶이 콜라\t17,500원\n치즈굴림치킨 빠사시떡볶이 콜라\t17,500원\n" +
                "간장마늘치킨 빠사시떡볶이 콜라\t17,500원\n양념치킨 빠사시떡볶이 콜라\t17,500원\n");


        data.add(korean1);
        data.add(korean2);
        data.add(korean3);
        data.add(korean4);
        data.add(korean5);
        data.add(korean6);

        KoreanAdapter adapter = new KoreanAdapter(this,R.layout.korean_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_KoreanClicked.class);

                intent.putExtra("korean_profile", Integer.toString(data.get(position).getKoreanProfile()));
                intent.putExtra("korean_info", data.get(position).getKoreanInfo());
                intent.putExtra("korean_phone", data.get(position).getKoreanPhone());
                intent.putExtra("korean_menu", data.get(position).getKoreanMenu());
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
