package com.lukemi.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import com.lukemi.kotlin.github.R
import com.lukemi.kotlin.tip.invokeActivity
import com.lukemi.kotlin.tip.Tip6Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toTip6.setOnClickListener {
            invokeActivity(Tip6Activity::class.java)
        }
    }
}
