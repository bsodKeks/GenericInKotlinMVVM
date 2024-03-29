package com.als.genericinkotlinmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.als.genericinkotlinmvvm.view.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commit()
        }
    }
}
