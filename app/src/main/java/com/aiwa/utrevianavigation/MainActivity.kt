package com.aiwa.utrevianavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aiwa.utrevianavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}
