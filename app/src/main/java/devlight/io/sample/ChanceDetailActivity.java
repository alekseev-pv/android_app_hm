package devlight.io.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
public class ChanceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chance);
        WebView webView = (WebView) findViewById(R.id.webView);


        webView.loadUrl("https://www.youtube.com/watch?v=UH7bb9R3Vic");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }
}
