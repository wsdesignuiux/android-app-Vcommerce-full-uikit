package ws.wolfsoft.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListAdapter;

import java.util.ArrayList;

import Adapter.List_listAdapter;
import Modellclass.PojoClass;

public class V_Commerce_subcategory extends AppCompatActivity {

    private RecyclerView rv1;
    private ArrayList<PojoClass> pojoClassArrayList;
    private List_listAdapter list_listAdapter;


    private String[] title = {"0 - 599", "600 - 1199", "1200 - 2499", "2500 - 4999"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__commerce_subcategory);


        pojoClassArrayList = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {

            PojoClass pojoClass = new PojoClass();
            pojoClass.setTitle(title[i]);


            pojoClassArrayList.add(pojoClass);
        }

        rv1 = (RecyclerView) findViewById(R.id.rv1);

        list_listAdapter = new List_listAdapter(V_Commerce_subcategory.this, pojoClassArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(V_Commerce_subcategory.this,  LinearLayoutManager.HORIZONTAL, false);
        rv1.setLayoutManager(mLayoutManager);
        rv1.setItemAnimator(new DefaultItemAnimator());
        rv1.setAdapter(list_listAdapter);
    }
}
