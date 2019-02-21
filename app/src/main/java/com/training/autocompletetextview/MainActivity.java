package com.training.autocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView selectedTextTextView;
    private AutoCompleteTextView autoCompleteTextView;

    private static final String[] items = {"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "elites" ,"morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedTextTextView = findViewById(R.id.selected_item_textview);
        autoCompleteTextView = findViewById(R.id.auto_complete_textview);


        List<String> namesList = new ArrayList<>();

        namesList.add("Anna");

        autoCompleteTextView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, namesList));

        autoCompleteTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int position, int i1, int i2) {
                selectedTextTextView.setText(autoCompleteTextView.getText());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
