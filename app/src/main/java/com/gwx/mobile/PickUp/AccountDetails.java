package com.gwx.mobile.PickUp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.gwx.mobile.Global;
import com.gwx.mobile.R;

/**
 * Created by iabdullahi on 6/20/2016.
 */
public class AccountDetails extends Fragment {
    EditText txtAccountNumber;


   public interface accountValidation {
       public void validateAccount(String accountNo);
   }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pickup, container, false);

        txtAccountNumber = (EditText) rootView.findViewById(R.id.txtAccountNumber);

        txtAccountNumber.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0 && s.length() == 10){
                    Global.globalPickupAccountNo = txtAccountNumber.getText().toString();
                }
            }
        });


        return rootView;
    }






    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }

}
