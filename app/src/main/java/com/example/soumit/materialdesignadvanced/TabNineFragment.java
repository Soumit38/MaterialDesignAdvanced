package com.example.soumit.materialdesignadvanced;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Soumit on 1/20/2018.
 */

public class TabNineFragment extends Fragment {

    View view;

    public TabNineFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tablayout_item_nine, container, false);

        return view;

    }
}
