package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_PizzaList extends Activity implements View.OnClickListener {

    private ArrayList<PizzaItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pizza_list);

        ListView listView = (ListView)findViewById(R.id.pizza_listview);

        data = new ArrayList<>();

        PizzaItem pizza1 = new PizzaItem(R.drawable.piz,"알볼로 제주점","064-755-8495", "옥수수피자L\t22,000원\n옥수수피자R\t18,000원\n" +
                "전주불백피자L\t25,000원\n전주불백피자R\t21,000원\n" +
                "부산피자L\t31,000원\n부산피자R\t26,000원\n" +
                "목동피자L\t22,000원\n목동피자R\t18,000원\n" +
                "쉬림프 핫치킨골드피자L\t31,000원\n쉬림프 핫치킨골드피자R\t26,000원\n" +
                "꿈을피자L\t28,000원\n꿈을피자R\t24,000원\n" +
                "어깨피자L\t28,000원\n어깨피자R\t24,000원\n" +
                "단호박피자L\t22,000원\n단호박피자R\t18,000원\n" +
                "단호박골드피자L\t25,000원\n단호박골드피자R\t21,000원\n" +
                "콤비네이션피자L\t19,000원\n콤비네이션피자R\t16,000원\n" +
                "더너피자 바베킹L\t28,000원\n더너피자 바베킹R\t24,000원\n" +
                "웃을꽃피자L\t25,000원\n웃을꽃피자R\t21,000원\n" +
                "고구마골드피자L\t25,000원\n고구마골드피자R\t21,000원\n" +
                "고르곤졸라L\t22,000원\n고르곤졸라R\t18,000원\n" +
                "포테이토피자L\t19,000원\n포테이토피자R\t16,000원\n" +
                "베이컨체다치즈피자L\t19,000원\n베이컨체다치즈피자R\t16,000원\n" +
                "불고기피자L\t19,000원\n불고기피자R\t16,000원\n" +
                "야채피자L\t18,000원\n야채피자R\t15,000원\n" +
                "하와이안피자L\t18,000원\n하와이안피자R\t15,000원\n" +
                "페퍼로니피자L\t18,000원\n페퍼로니피자R\t15,000원\n" +
                "치즈피자L\t18,000원\n치즈피자R\t15,000원\n" +
                "고구마피자L\t22,000원\n고구마피자R\t18,000원\n" +
                "핫 스파이시치킨피자L\t22,000원\n핫 스파이시치킨피자R\t18,000원\n" +
                "콰트로포르마지오L\t25,000원\n콰트로포르마지오R\t21,000원\n" +
                "쉬림프 안심골드피자L\t31,000원\n쉬림프 안심골드피자R\t26,000원\n" +
                "팔도피자L\t28,000원\n슈크림치즈스틱\t8,500원\n" +
                "로제치즈오븐스파게티\t8,500원\n치즈볼 바게트스틱\t8,500원\n" +
                "치즈볼\t5,000원\n바게트스틱\t4,000원\n" +
                "콘치즈그라탕L\t7,500원\n콘치즈그라탕R\t4,500원\n" +
                "버팔로윙 4조각\t3,000원\n버팔로윙 10조각\t7,500원\n" +
                "단호박 고구마샐러드\t3,000원\n치즈오븐스파게티\t7,500원\n" +
                "까르보나라 스파게티\t8,500원\n브래드스틱\t6,500원\n" +
                "고구마스틱\t7,500원\n치즈스틱\t7,500원\n" +
                "팥치즈반달빵\t8,500원\n치킨텐더 6조각\t7,500원\n" +
                "스노우 칠리감자\n4,500원");
        PizzaItem pizza2 = new PizzaItem(R.drawable.piz,"7번가피자 아라점","064-721-7767", "샘스테이크L\t29,500원\n샘스테이크R\t22,900원\n" +
                "깐쇼불갈비L\t29,500원\n깐쇼불갈비R\t22,900원\n" +
                "반&반L\t29,500원\n반&반R\t22,900원\n" +
                "7번가 스페셜L\t29,500원\n7번가 스페셜R\t22,900원\n" +
                "놀부단호박L\t29,500원\n놀부단호박R\t22,900원\n" +
                "칠리새우L\t29,500원\n칠리새우R\t22,900원\n" +
                "체다골드포테이토L\t29,500원\n체다골드포테이토R\t22,900원\n" +
                "홍대피자L\t29,500원\n홍대피자R\t22,900원\n" +
                "와이키키L\t27,500원\n와이키키R\t20,400원\n" +
                "리치고구마치킨L\t27,500원\n리치고구마치킨R\t20,400원\n" +
                "칠리불갈비L\t27,500원\n칠리불갈비R\t20,400원\n" +
                "언더더시L\t27,500원\n언더더시R\t20,400원\n" +
                "해쉬베이컨L\t27,500원\n해쉬베이컨R\t20,400원\n" +
                "고구마L\t27,500원\n고구마R\t20,400원\n" +
                "더블치즈L\t24,900원\n더블치즈R\t18,900원\n" +
                "흥부포테이토L\t24,900원\n흥부포테이토R\t18,900원\n" +
                "불고기피자L\t24,900원\n불고기피자R\t18,900원\n" +
                "슈퍼콤비네이션L\t24,900원\n슈퍼콤비네이션R\t18,900원\n" +
                "페퍼로니피자L\t24,900원\n페퍼로니피자R\t18,900원\n" +
                "고르곤졸라\t21,500원\n치킨할라피뇨\t21,500원\n" +
                "콘길리에 파스타\t7,900원\n치즈까르보나라 스파게티\t7,900원\n" +
                "오븐 스파게티\t6,500원\n치킨오븐텐더\t5,900원\n" +
                "화이어윙\t3,900원\n핫윙\t3,500원\n" +
                "통통새우링\t2,900원\n찹살치즈볼\t4,900원\n" +
                "나폴리샐러드\t2,900원\n통쌀치킨\t3,900원");

        data.add(pizza1);
        data.add(pizza2);

        PizzaAdapter adapter = new PizzaAdapter(this,R.layout.pizza_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_PizzaClicked.class);

                intent.putExtra("pizza_profile", Integer.toString(data.get(position).getPizzaProfile()));
                intent.putExtra("pizza_info", data.get(position).getPizzaInfo());
                intent.putExtra("pizza_phone", data.get(position).getPizzaPhone());
                intent.putExtra("pizza_menu", data.get(position).getPizzaMenu());
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
