package ws.wolfsoft.mobile;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.ProfilePagerAdapter_walkthrough_01;
import me.relex.circleindicator.CircleIndicator;

public class V_Commerce_category extends AppCompatActivity {

    public ViewPager viewpager;

    ProfilePagerAdapter_walkthrough_01 profilePagerAdapter_walkthrough_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v__commerce_category);


        viewpager = (ViewPager) findViewById(R.id.viewpager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        profilePagerAdapter_walkthrough_01 = new ProfilePagerAdapter_walkthrough_01(getSupportFragmentManager());

        viewpager.setAdapter(profilePagerAdapter_walkthrough_01);

        indicator.setViewPager(viewpager);

        profilePagerAdapter_walkthrough_01.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
