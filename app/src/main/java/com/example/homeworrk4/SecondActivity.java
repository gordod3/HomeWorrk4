package com.example.homeworrk4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.xml.transform.Result;

public class SecondActivity extends AppCompatActivity {
    EditText editName, editSecondName, editPatronymic;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editName = findViewById(R.id.editName);
        editSecondName = findViewById(R.id.editSecondName);
        editPatronymic = findViewById(R.id.editPatronymic);
    }
    public void create(View view){
        try {
        String[] dataMan = new String[3];
        dataMan[0] = editName.getText().toString();
        dataMan[1] = editSecondName.getText().toString();
        dataMan[2] = editPatronymic.getText().toString();
        Intent intent = new Intent();
            intent.putExtra("Data", dataMan);
            setResult(RESULT_OK, intent);
        finish();
        }catch (Exception e){}
    }
}
