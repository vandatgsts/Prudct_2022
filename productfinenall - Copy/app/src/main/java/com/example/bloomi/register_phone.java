package com.example.bloomi;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link register_phone#} factory method to
 * create an instance of this fragment.
 */
public class register_phone extends Fragment {
    View view;
    EditText phone_register;
    Button Next_of_signup2_P;
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public register_phone() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment register_phone.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static register_phone newInstance(String param1, String param2) {
//        register_phone fragment = new register_phone();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_register_phone, container, false);
        Next_of_signup2_P=view.findViewById(R.id.Next_of_Signup2_P);
        phone_register=(EditText) view.findViewById(R.id.Phone_register);
        Next_of_signup2_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String check=email_register.getText().toString();
//                System.out.println(check);
                if(phone_register.getText().toString().isEmpty())
                    Toast.makeText(getActivity(), "Phone number errol!", Toast.LENGTH_SHORT).show();
                else
                {FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.signUp2, new register_Password());
                fragmentTransaction.commit();
                Next_of_signup2_P.setVisibility(View.GONE);

                }
            }
        });


        return view;
    }
}