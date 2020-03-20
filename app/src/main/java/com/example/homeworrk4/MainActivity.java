package com.example.homeworrk4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        Button button = findViewById(R.id.newElement);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            String[] dataMan = data.getStringArrayExtra("Data");
            Log.d("ololo", "strange " + dataMan[0] + dataMan[1] + dataMan[2]);
            adapter.name.add(dataMan[0]);
            adapter.secondName.add(dataMan[1]);
            adapter.patronymic.add(dataMan[2]);
            adapter.notifyDataSetChanged();
        }
    }
}
