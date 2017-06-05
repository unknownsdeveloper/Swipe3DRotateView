package ankit.developer.unknowns.swipe3drotateview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.nipunbirla.swipe3drotateview.Swipe3DRotateView;


public class MainActivity extends AppCompatActivity {
    Swipe3DRotateView swipe3DRotateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipe3DRotateView = (Swipe3DRotateView) findViewById(R.id.rotateView);
        swipe3DRotateView.setIsYRotationAllowed(true);
        swipe3DRotateView.setIsXRotationAllowed(true);
        swipe3DRotateView.setAnimationDuration(100);
    }
}
