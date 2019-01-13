package com.example.harsh_raj.sabrcare_mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class SignUpFragment extends Fragment {

    private static final String TAG = "SIGN UP";
    TextInputEditText username;
    TextInputEditText password;
    TextInputEditText name;
    Button signUp_btn;
    TextView sign_in;
    ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sign_up_fragment,container,false);



        username=view.findViewById(R.id.username);
        password=view.findViewById(R.id.password);
        name=view.findViewById(R.id.name);

        viewPager=view.findViewById(R.id.container);
        sign_in = view.findViewById(R.id.sign_in);
        signUp_btn =view.findViewById(R.id.register_btn);

        signUp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"REGISTERED!",Toast.LENGTH_LONG).show();
            }
        });

//        sign_in.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                viewPager.setCurrentItem(1);
//            }
//        });
        return view;
    }
}
