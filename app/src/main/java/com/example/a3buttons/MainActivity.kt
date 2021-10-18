package com.example.a3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    lateinit var toastInput: EditText
    lateinit var textViewInput: EditText
    lateinit var activityInput: EditText

    lateinit var toastButton: Button
    lateinit var textViewButton: Button
    lateinit var activityButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvText)

        toastInput = findViewById(R.id.etToast)
        textViewInput = findViewById(R.id.etTextView)
        activityInput = findViewById(R.id.etActivity)

        toastButton = findViewById(R.id.btnToast)
        textViewButton = findViewById(R.id.btnTextView)
        activityButton = findViewById(R.id.btnActivity)

        toastButton.setOnClickListener {
            Toast.makeText(this, "${toastInput.text}", Toast.LENGTH_LONG).show()
        }
        textViewButton.setOnClickListener {
            textView.text = textViewInput.text
        }
        activityButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("text", activityInput.text.toString())
            startActivity(intent)
        }
    }
}