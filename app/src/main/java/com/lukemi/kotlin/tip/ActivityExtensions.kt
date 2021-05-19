package com.lukemi.kotlin.tip

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


fun AppCompatActivity.addFragmentToActivity(fragment: Fragment, frameId: Int) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.add(frameId, fragment)
    transaction.commit()
}


fun Activity.invokeActivity(cls: Class<*>) {
    startActivity(Intent(this, cls))
}