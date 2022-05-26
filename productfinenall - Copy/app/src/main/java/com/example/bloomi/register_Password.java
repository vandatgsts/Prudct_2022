package com.example.bloomi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class register_Password extends Fragment {

    View mview;
    Button Next_of_c_Password;
    EditText pass,re_pass;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mview= inflater.inflate(R.layout.fragment_register__password, container, false);
        pass=mview.findViewById(R.id.create_newPassword);
        re_pass=mview.findViewById(R.id.reCreare_NewPassWord);
        Next_of_c_Password=mview.findViewById(R.id.Next_of_new_PassWord);
        Next_of_c_Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pass.getText().toString().equals(re_pass.getText().toString()) ==false || pass.getText().toString().isEmpty())
                {
                    Toast.makeText(getActivity(),"Password errol!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getActivity(),"Register Concuragtion",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return mview;
    }
}