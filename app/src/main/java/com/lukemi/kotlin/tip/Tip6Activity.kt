package com.lukemi.kotlin.tip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lukemi.kotlin.tips.R

class Tip6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_container)
        var fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as Tip6Fragment?
        if (fragment == null) {
            fragment = Tip6Fragment()
            addFragmentToActivity(fragment, R.id.fragmentContainer)
        }
    }
}


