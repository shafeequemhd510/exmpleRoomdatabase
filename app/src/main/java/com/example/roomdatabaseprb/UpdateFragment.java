package com.example.roomdatabaseprb;


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
 */
public class UpdateFragment extends Fragment {
    private EditText userId,name,email;
    private Button bnUpdate;


    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_update, container, false);
        userId=view.findViewById(R.id.editText);
        name=view.findViewById(R.id.editText2);
        email=view.findViewById(R.id.editText3);
        bnUpdate=view.findViewById(R.id.btn_save);

        bnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userid= Integer.parseInt(userId.getText().toString());
                String username=name.getText().toString();
                String useremail=email.getText().toString();

                User user=new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                MainActivity.myAppDatabase.myDao().updateUser(user);
                Toast.makeText(getActivity(), "user updated successfully", Toast.LENGTH_SHORT).show();

                userId.setText("");
                name.setText("");
                email.setText("");
            }
        });

        return view;
    }

}
