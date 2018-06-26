package cn.fanrunqi.materiallogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.fanrunqi.materiallogin.a.AActivityOne;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doEffectA(View v){
            startActivity(new Intent(this, AActivityOne.class));
    }


}
