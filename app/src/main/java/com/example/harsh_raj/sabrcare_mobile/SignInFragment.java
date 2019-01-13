package com.example.harsh_raj.sabrcare_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

public class SignInFragment extends Fragment {

    private static final String TAG = "SIGN IN";
    TextInputEditText username;
    TextInputEditText password;
    Button signIn_btn;
    TextView sign_up;
    ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.sign_in_fragment,container,false);



        username=view.findViewById(R.id.username);
        password=view.findViewById(R.id.password);

        viewPager=view.findViewById(R.id.container);
        sign_up = view.findViewById(R.id.sign_up);
        signIn_btn =view.findViewById(R.id.sign_in_btn);
        signIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"SIGNED IN!",Toast.LENGTH_LONG).show();
            }
        });
//        sign_up.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                         getActivity().getSupportFragmentManager().beginTransaction()
//                        .replace(SignInFragment.this.getId(), SignUpFragment., "findThisFragment")
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });

        return view;


    }
}