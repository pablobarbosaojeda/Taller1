package com.example.taller1

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        // Inicializar elementos de la interfaz
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val goToConfigButton = findViewById<Button>(R.id.goToConfigButton)
        val startTaskButton = findViewById<Button>(R.id.btnStartTask)
        val goToMenuButton = findViewById<Button>(R.id.btnGoToMenu)
        progressBar = findViewById(R.id.progressBar)

        // Guardar el nombre ingresado y mostrarlo en el TextView
        saveButton.setOnClickListener {
            val userName = nameEditText.text.toString()
            displayTextView.text = userName
        }

        // Navegar a la pantalla de configuración
        goToConfigButton.setOnClickListener {
            val intent = Intent(this, ConfigActivity::class.java)
            startActivity(intent)
        }

        // Iniciar tarea en segundo plano para simular operación de red
        startTaskButton.setOnClickListener {
            BackgroundTask().execute()
        }

        // Volver al menú principal
        goToMenuButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // Clase interna para manejar la tarea en segundo plano
    inner class BackgroundTask : AsyncTask<Void, Int, String>() {

        override fun onPreExecute() {
            super.onPreExecute()
            progressBar.visibility = View.VISIBLE
            progressBar.progress = 0
        }

        override fun doInBackground(vararg params: Void?): String {
            for (i in 1..10) {
                Thread.sleep(500)  // Simula operación de red con tiempo de espera
                publishProgress(i * 10)
            }
            return "Operación completada"
        }

        override fun onProgressUpdate(vararg values: Int?) {
            super.onProgressUpdate(*values)
            progressBar.progress = values[0] ?: 0
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            progressBar.visibility = View.GONE
            Toast.makeText(applicationContext, result, Toast.LENGTH_SHORT).show()
        }
    }
}
