package com.x5bart.webviewapp

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.webViewClient = MyWebViewClient()

        btnGo.setOnClickListener {
            webView.loadUrl("http://" + etURL.text.toString())
        }
        btnBack.setOnClickListener {
            if (webView.canGoBack()) webView.goBack()
            else Toast.makeText(this, "No History Available", Toast.LENGTH_SHORT).show()
        }
        btnForward.setOnClickListener {
            if (webView.canGoForward()) webView.goForward()
            else Toast.makeText(this, "No History Available", Toast.LENGTH_SHORT).show()
        }
    }

}
