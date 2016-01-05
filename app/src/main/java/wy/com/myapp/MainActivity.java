package wy.com.myapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import wy.com.myapp.volley.Request;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private TextView text;
    private MySimpleLayout mySimpleLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initv7View();
        initView();
    }

    private void initv7View() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private String[] s = {"测试","工程师","android","IOS","移动端","手机","电脑","这是测试数据，你信吗", "你说呢"};
    private void initView() {
        btn = (Button) this.findViewById(R.id.btn);
        text = (TextView) this.findViewById(R.id.text);
        btn.setOnClickListener(this);
        mySimpleLayout = (MySimpleLayout) this.findViewById(R.id.my_layout);
        initData();
    }

    private void initData() {
        List<String> list = Arrays.asList(s);
        for (String s: list) {
            TextView textView = new TextView(this);
            textView.setText(s);
            mySimpleLayout.addView(textView);
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Snackbar.make(v, "It is my view", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Request<String> request = null;
                break;
        }
    }
}
