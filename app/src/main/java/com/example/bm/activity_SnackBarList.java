package com.example.bm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_SnackBarList extends Activity implements View.OnClickListener {

    private ArrayList<SnackBarItem> data = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.snackbar_list);

        ListView listView = (ListView)findViewById(R.id.snackbar_listview);

        data = new ArrayList<>();

        SnackBarItem snackbar1 = new SnackBarItem(R.drawable.bun_1,"도스마스 제주대점","064-748-1253","부리또\t3,300원\n부리또 + 탄산음료\t4,000원\n" +
                "부리또 + 탄산음료 + 감자튀김\t5,800원");
        SnackBarItem snackbar2 = new SnackBarItem(R.drawable.bun_1,"맘스터치 제주대점","064-726-9299", "언빌리버블버거\t5,100원\n언빌리버블버거 세트\t7,000원\n" +
                "인크레더블버거\t4,900원\n인크레더블버거 세트\t6,900원\n" +
                "마살라버거\t3,800원\n마살라버거 세트\t6,000원\n" +
                "치즈베이컨버거\t4,500원\n치즈베이컨버거 세트\t6,500원\n" +
                "딥치즈버거\t4,000원\n딥치즈버거 세트\t6,000원\n" +
                "화이트갈릭버거\t4,100원\n화이트갈릭버거 세트\t6,100원\n" +
                "햄치즈휠렛버거\t3,900원\n햄치즈휠렛버거 세트\t6,100원\n" +
                "휠렛버거\t3,600원\n휠렛버거 세트\t5,800원\n" +
                "치킨커틀렉버거\t3,200원\n치킨커틀렉버거 세트\t5,400원\n" +
                "할라피뇨/통가슴살버거\t3,900원\n할라피뇨/통가슴살버거 세트\t6,100원\n" +
                "싸이버거\t3,400원\n싸이버거 세트\t5,600원\n" +
                "불싸이버거\t3,600원\n불싸이버거 세트\t5,800원\n" +
                "스파이시디럭스불고기버거\t4,200원\n스파이시디럭스불고기버거 세트\t6,400원\n" +
                "디럭스불고기버거\t4,000원\n디럭스불고기버거 세트\t6,200원\n" +
                "스파이시불고기버거\t3,200원\n스파이시불고기버거 세트\t5,400원\n" +
                "불고기버거\t3,000원\n불고기버거 세트\t5,200원\n" +
                "통새우버거\t2,900원\n통새우버거 세트\t5,100원\n" +
                "리샐버거\t4,200원\n리샐버거 세트\t6,100원\n" +
                "매콤소이팝치킨 톨\t18,000원\n매콤소이팝치킨 하프\t9,500원\n" +
                "매콤소이팝강정 싱글\t4,500원\n매콤소이팝강정 커플\t9,000원\n" +
                "매콤소이팝윙 10조각\t10,000원\n매콤소이팝윙 20조각\t17,000원\n" +
                "마살라치킨 톨\t17,000원\n마살라치킨 하프\t9,000원\n" +
                "마살라텐더 4조각\t5,000원\n마살라텐더 8조각\t9,500원\n" +
                "마살라윙 10조각\t9,500원\n마살라윙 20조각\t16,000원\n" +
                "치파오치킨 톨\t17,000원\n치파오치킨 하프\t9,000원\n" +
                "치파오 싱글\t4,000원\n치파오 커플\t8,000원\n" +
                "순살치킨 8조각\t7,500원\n케이준윙 10조각\t8,500원\n" +
                "불사치킨 톨\t17,000원\n불사치킨 하프\t9,000원\n" +
                "불사텐더 4조각\t5,000원\n불사텐더 8조각\t9,500원\n" +
                "불사윙 10조각\t9,500원\n불사윙 20조각\t16,000원\n" +
                "후라이드치킨 톨\t15,000원\n후라이드치킨 하프\t8,000원\n" +
                "핫후라이드치킨 톨\t16,000원\n핫후라이드치킨 하프\t8,500원\n" +
                "찜햇닭 홀\t17,000원\n찜햇닭 하프\t9,000원\n" +
                "찜햇닭강정 싱글\t4,000원\n찜햇닭강정 커플\t8,000원\n" +
                "찜햇닭윙 10조각\t9,500원\n찜햇닭윙 20조각\t16,000원\n" +
                "순살뿌치 4조각\t5,000원\n순살뿌치 8조각\t9,500원\n" +
                "뿌치 톨\t17,000원\n뿌치 하프\t9,000원\n" +
                "후레이크갈릭치킨 톨\t17,000원\n후레이크갈릭치킨 하프\t9,000원\n" +
                "후레이크 핫치킨 톨\t17,000원\n후레이크 핫치킨 하프\t9,000원\n" +
                "조청치킨 톨\t17,000원\n조청치킨 하프\t9,000원\n" +
                "조청강정 레귤러\t10,000원\n팝콘볼\t8,000원\n" +
                "치킨강정 톨\t16,000원\n치킨강정 하프\t8,500원\n" +
                "케이준강정 싱글\t3,500원\n케이준강정 커플\t7,000원\n" +
                "강정콤보\t11,000원");
        SnackBarItem snackbar3 = new SnackBarItem(R.drawable.bun_1,"맘스터치 아라점","064-755-8299", "언빌리버블버거\t5,100원\n언빌리버블버거 세트\t7,000원\n" +
                "인크레더블버거\t4,900원\n인크레더블버거 세트\t6,900원\n" +
                "마살라버거\t3,800원\n마살라버거 세트\t6,000원\n" +
                "치즈베이컨버거\t4,500원\n치즈베이컨버거 세트\t6,500원\n" +
                "딥치즈버거\t4,000원\n딥치즈버거 세트\t6,000원\n" +
                "화이트갈릭버거\t4,100원\n화이트갈릭버거 세트\t6,100원\n" +
                "햄치즈휠렛버거\t3,900원\n햄치즈휠렛버거 세트\t6,100원\n" +
                "휠렛버거\t3,600원\n휠렛버거 세트\t5,800원\n" +
                "치킨커틀렉버거\t3,200원\n치킨커틀렉버거 세트\t5,400원\n" +
                "할라피뇨/통가슴살버거\t3,900원\n할라피뇨/통가슴살버거 세트\t6,100원\n" +
                "싸이버거\t3,400원\n싸이버거 세트\t5,600원\n" +
                "불싸이버거\t3,600원\n불싸이버거 세트\t5,800원\n" +
                "스파이시디럭스불고기버거\t4,200원\n스파이시디럭스불고기버거 세트\t6,400원\n" +
                "디럭스불고기버거\t4,000원\n디럭스불고기버거 세트\t6,200원\n" +
                "스파이시불고기버거\t3,200원\n스파이시불고기버거 세트\t5,400원\n" +
                "불고기버거\t3,000원\n불고기버거 세트\t5,200원\n" +
                "통새우버거\t2,900원\n통새우버거 세트\t5,100원\n" +
                "리샐버거\t4,200원\n리샐버거 세트\t6,100원\n" +
                "매콤소이팝치킨 톨\t18,000원\n매콤소이팝치킨 하프\t9,500원\n" +
                "매콤소이팝강정 싱글\t4,500원\n매콤소이팝강정 커플\t9,000원\n" +
                "매콤소이팝윙 10조각\t10,000원\n매콤소이팝윙 20조각\t17,000원\n" +
                "마살라치킨 톨\t17,000원\n마살라치킨 하프\t9,000원\n" +
                "마살라텐더 4조각\t5,000원\n마살라텐더 8조각\t9,500원\n" +
                "마살라윙 10조각\t9,500원\n마살라윙 20조각\t16,000원\n" +
                "치파오치킨 톨\t17,000원\n치파오치킨 하프\t9,000원\n" +
                "치파오 싱글\t4,000원\n치파오 커플\t8,000원\n" +
                "순살치킨 8조각\t7,500원\n케이준윙 10조각\t8,500원\n" +
                "불사치킨 톨\t17,000원\n불사치킨 하프\t9,000원\n" +
                "불사텐더 4조각\t5,000원\n불사텐더 8조각\t9,500원\n" +
                "불사윙 10조각\t9,500원\n불사윙 20조각\t16,000원\n" +
                "후라이드치킨 톨\t15,000원\n후라이드치킨 하프\t8,000원\n" +
                "핫후라이드치킨 톨\t16,000원\n핫후라이드치킨 하프\t8,500원\n" +
                "찜햇닭 홀\t17,000원\n찜햇닭 하프\t9,000원\n" +
                "찜햇닭강정 싱글\t4,000원\n찜햇닭강정 커플\t8,000원\n" +
                "찜햇닭윙 10조각\t9,500원\n찜햇닭윙 20조각\t16,000원\n" +
                "순살뿌치 4조각\t5,000원\n순살뿌치 8조각\t9,500원\n" +
                "뿌치 톨\t17,000원\n뿌치 하프\t9,000원\n" +
                "후레이크갈릭치킨 톨\t17,000원\n후레이크갈릭치킨 하프\t9,000원\n" +
                "후레이크 핫치킨 톨\t17,000원\n후레이크 핫치킨 하프\t9,000원\n" +
                "조청치킨 톨\t17,000원\n조청치킨 하프\t9,000원\n" +
                "조청강정 레귤러\t10,000원\n팝콘볼\t8,000원\n" +
                "치킨강정 톨\t16,000원\n치킨강정 하프\t8,500원\n" +
                "케이준강정 싱글\t3,500원\n케이준강정 커플\t7,000원\n" +
                "강정콤보\t11,000원");

        data.add(snackbar1);
        data.add(snackbar2);
        data.add(snackbar3);


        SnackBarAdapter adapter = new SnackBarAdapter(this,R.layout.snackbar_item,data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), activity_ChickenClicked.class);

                intent.putExtra("snackbar_profile", Integer.toString(data.get(position).getSnackBarProfile()));
                intent.putExtra("snackbar_info", data.get(position).getSnackBarInfo());
                intent.putExtra("snackbar_phone", data.get(position).getSnackBarPhone());
                intent.putExtra("snackbar_menu", data.get(position).getSnackBarMenu());
                startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}

