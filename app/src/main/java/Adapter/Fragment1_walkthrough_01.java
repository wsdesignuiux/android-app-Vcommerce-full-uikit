package Adapter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wolfsoft3 on 21/5/18.
 */
 import ws.wolfsoft.mobile.R;


public class Fragment1_walkthrough_01 extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;

    }
}
