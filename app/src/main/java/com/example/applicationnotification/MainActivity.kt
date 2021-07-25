package com.example.applicationnotification

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging


class MainActivity : AppCompatActivity() {

    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.btn_send_notificat)
        btnSend.setOnClickListener{
        this.showNotification("1234", "Bootcamp Android", "Kotlin Android Course")
        }


        Log.i("**newToken", FirebaseMessaging.getInstance().token.toString())
    }
}