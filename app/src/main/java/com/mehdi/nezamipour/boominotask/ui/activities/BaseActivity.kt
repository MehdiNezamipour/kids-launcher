package com.mehdi.nezamipour.boominotask.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehdi.nezamipour.boominotask.R

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}