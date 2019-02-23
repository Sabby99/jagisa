package com.example.modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SmartGrid1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_grid1);
    }
    public void OpenCStat(View view)
    {
        Intent intent = new Intent(this,CheckStatus.class);
        startActivity(intent);
    }

    public void OpenSetTh(View view)
    {
        Intent intent = new Intent(this,SetThreshold.class);
        startActivity(intent);
    }

    public void OpenModP(View view)
    {
        Intent intent = new Intent(this,ModifyPlan.class);
        startActivity(intent);
    }

    public void OpenPay(View view)
    {
        Intent intent = new Intent(this,Payment.class);
        startActivity(intent);
    }

    public void OpenHelp(View view)
    {
        Intent intent = new Intent(this,Help.class);
        startActivity(intent);
    }
}
