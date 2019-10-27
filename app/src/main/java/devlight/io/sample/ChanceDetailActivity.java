package devlight.io.sample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import android.view.LayoutInflater;

import android.content.Context;

public class ChanceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chance);
        WebView webView = (WebView) findViewById(R.id.webView);


        //webView.loadUrl("https://www.youtube.com/watch?v=UH7bb9R3Vic");
        // webView.loadUrl("https://www.youtube.com/watch?v=Eb0qWVmpY9U");

        String htmlData = "<!DOCTYPE html>" +
                "<html>" +
                "  <body>" +
                "<iframe width='331' height='325' src='https://www.youtube.com/embed/jSkAedxdszs' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>" +
                "    </script>" +
                "  </body>" +
                "</html>";

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadData(htmlData, "text/html", "UTF-8");


        View like_button = (View) findViewById(R.id.imageView);

        final Intent intent1 = new Intent(ChanceDetailActivity.this, HorizontalCoordinatorNtbActivity.class);

        intent1.putExtra("REQUEST_CODE", 7);

        like_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(
                      intent1
                );

            }
        });


    }
}