package br.com.android_mvp_intent_sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class HandoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handout)


        val code = intent.getStringExtra("EXTRA_CODE") ?: ""
        val attribute = intent.getBooleanExtra("EXTRA_ATTRIBUTE", false)


        val text = findViewById<TextView>(R.id.txtInfo)
        // text.text = "Code: $code | Retention: $retention"
        "Code: $code | Attribute: $attribute".also { text.text = it }
    }
}