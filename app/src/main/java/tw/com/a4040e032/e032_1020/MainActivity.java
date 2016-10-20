package tw.com.a4040e032.e032_1020;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView t1;
private ImageButton i1;
private ImageButton i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        t1 = (TextView) findViewById(R.id.t1);
        i1 = (ImageButton) findViewById(R.id.i1);
        i2 = (ImageButton) findViewById(R.id.i2);
     ImageButton nextPageBtn = (ImageButton) findViewById(R.id.i1);
     nextPageBtn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent();
             intent.setClass(MainActivity.this,Main2Activity.class);
             startActivity(intent);
         }
     });
ImageButton nextPageBtn1 = (ImageButton) findViewById(R.id.i2);
nextPageBtn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Main3Activity.class);
        startActivity(intent);
    }
});
    }
}
