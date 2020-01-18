package com.example.roomdatabaseprb;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

private Button bnAddUser;
private Button bnReadUser;
private Button bnDeleteUser;
private Button bnUpdateUser;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

   View view= inflater.inflate(R.layout.fragment_home, container, false);
    bnAddUser= view.findViewById(R.id.bn_add_users);
    bnAddUser.setOnClickListener(this);
    bnReadUser=view.findViewById(R.id.bn_view_users);
    bnReadUser.setOnClickListener(this);
    bnDeleteUser=view.findViewById(R.id.bn_delete_users);
    bnDeleteUser.setOnClickListener(this);
    bnUpdateUser=view.findViewById(R.id.bn_update_users);
    bnUpdateUser.setOnClickListener(this);

   return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.bn_add_users:
                MainActivity.fragmentManager.beginTransaction().replace
                        (R.id.fragment_container,new AddUserFragment()).addToBackStack(null).commit();

                break;
            case R.id.bn_view_users:
                MainActivity.fragmentManager.beginTransaction().replace
                        (R.id.fragment_container,new ReadUserFragment()).addToBackStack(null).commit();

                break;

            case R.id.bn_delete_users:
                MainActivity.fragmentManager.beginTransaction().replace
                        (R.id.fragment_container,new DeleteFragment()).addToBackStack(null).commit();

                break;

            case R.id.bn_update_users:
                MainActivity.fragmentManager.beginTransaction().replace
                        (R.id.fragment_container,new UpdateFragment()).addToBackStack(null).commit();
                break;
        }




    }
}
