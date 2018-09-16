package com.helloworld.candor.candor.Fragments;

import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.helloworld.candor.candor.R;


public class FragmentContent extends Fragment {

    private static final String KEY_TITLE="Content";


    public FragmentContent() {
        // Required empty public constructor
    }


    public static FragmentContent newInstance(String param1, String param2) {
        FragmentContent fragment = new FragmentContent();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, param1);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_content, container, false);
    }

     @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String title = getArguments().getString(KEY_TITLE);
         ((TextView)view.findViewById(R.id.title)).setText(title);


     }


}
