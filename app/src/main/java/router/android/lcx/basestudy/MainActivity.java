package router.android.lcx.basestudy;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
//    private DownManager mDownManager;
//    private DownEntry downEntry;
//    private DataWatcher mDataWatcher=new DataWatcher() {
//        @Override
//        protected void notifyUpdata(DownEntry data) {
//            TLog.d(data.toString());
//                    downEntry=data;
//            if (downEntry.mDownloadStatus==DownEntry.DownloadStatus.cancel){
//                  downEntry=null;
//            }
//
//        }
//    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mButton1=(Button)findViewById(R.id.button1);
//        mButton1.setOnClickListener(this);
//        mButton2=(Button)findViewById(R.id.button2);
//        mButton2.setOnClickListener(this);
//        mButton3=(Button)findViewById(R.id.button3);
//        mButton3.setOnClickListener(this);
//        mDownManager=DownManager.getInstance(this);
        ActivityManager   mActivityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> runServiceList = mActivityManager
                .getRunningServices(2);


    }

    @Override
    protected void onResume() {
        super.onResume();
//        mDownManager.addObserver(mDataWatcher);
    }

    @Override
    protected void onPause() {
        super.onPause();
//        mDownManager.removeObserver(mDataWatcher);
    }

    @Override
    public void onClick(View v) {
//        if (downEntry==null){
//            downEntry=new DownEntry("http://www.baidu.com");
//        }
//
//        switch (v.getId()){
//            case R.id.button1:
//                mDownManager.add(downEntry);
//                break;
//            case R.id.button2:
//                if (downEntry.mDownloadStatus== DownEntry.DownloadStatus.downloading){
//                    mDownManager.pause(downEntry);
//                }else if (downEntry.mDownloadStatus== DownEntry.DownloadStatus.paused){
//                    mDownManager.resume(downEntry);
//                }
//
//                break;
//            case R.id.button3:
//                mDownManager.cancel(downEntry);
//                break;
//        }

    }
}
