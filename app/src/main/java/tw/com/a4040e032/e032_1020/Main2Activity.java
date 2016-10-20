package tw.com.a4040e032.e032_1020;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {
private TextView t2;
private Button b1;
    private VideoView videoView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        VideoView videoView = (VideoView) this.findViewById(R.id.videoView3);
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ss));
        videoView.requestFocus();
        videoView.start();
        findViews();
    }
public void findViews(){
t2 = (TextView) findViewById(R.id.t2);
b1 = (Button) findViewById(R.id.b1);
Button nextPageBtn = (Button) findViewById(R.id.b1);
nextPageBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
});

}
}
