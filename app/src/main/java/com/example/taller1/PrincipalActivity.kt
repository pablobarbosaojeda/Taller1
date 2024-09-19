package com.example.taller1


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val goToConfigButton = findViewById<Button>(R.id.goToConfigButton)

        saveButton.setOnClickListener {
            val userName = nameEditText.text.toString()
            displayTextView.text = userName
        }

    }
}
