package tw.com.a4040e032.e032_1020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        findViews();
    }
    public void findViews(){
    b2 = (Button) findViewById(R.id.b2);
    Button nextPageBtn = (Button) findViewById(R.id.b2);
    nextPageBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent();
            intent.setClass(Main3Activity.this,MainActivity.class);
            startActivity(intent);
        }
    });
    }

}
