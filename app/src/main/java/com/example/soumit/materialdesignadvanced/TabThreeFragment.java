package com.example.soumit.materialdesignadvanced;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Soumit on 1/20/2018.
 */

public class TabThreeFragment extends Fragment {

    View view;

    public TabThreeFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tablayout_item_three, container, false);

        return view;
    }
}
