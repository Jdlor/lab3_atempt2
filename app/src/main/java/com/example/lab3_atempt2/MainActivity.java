package com.example.lab3_atempt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;

import com.example.lab3_atempt2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);
        binding.button.setOnClickListener(this::Send_Button);
    }
    private void Send_Button(View v){
        Layout view = binding.textView.getLayout();

    }
}