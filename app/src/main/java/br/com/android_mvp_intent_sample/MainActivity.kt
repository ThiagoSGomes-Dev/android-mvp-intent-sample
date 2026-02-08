package br.com.android_mvp_intent_sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class MainActivity : AppCompatActivity(), HandoutContract.View {


    private lateinit var presenter: HandoutContract.Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        presenter = HandoutPresenter(this)


        val button = findViewById<Button>(R.id.btnOpen)
        button.setOnClickListener {
            presenter.onOpenHandoutClicked("123")
        }
    }


    override fun navigateToHandout(code: String, showAttribute: Boolean) {
        val intent = Intent(this, HandoutActivity::class.java)
        intent.putExtra("EXTRA_CODE", code)
        intent.putExtra("EXTRA_ATTRIBUTE", showAttribute)
        startActivity(intent)
    }
}