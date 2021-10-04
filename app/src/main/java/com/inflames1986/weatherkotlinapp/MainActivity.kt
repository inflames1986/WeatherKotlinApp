package com.inflames1986.weatherkotlinapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var edittext: EditText
//    var name = "Alex"

    var copy = MyCopyClass()
    var name = copy.arg1

    var copy1 = NameCopy
    var copyname = copy1.secondname

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Weather App Started", Toast.LENGTH_SHORT).show()

        button = findViewById(R.id.first_action_btn)
        button.setOnClickListener {
            Toast.makeText(this, "Hello, I'm Working", Toast.LENGTH_SHORT).show()
        }

        edittext = findViewById(R.id.edittext)
        edittext.setText(copyname)
    }

    companion object {
        fun start(intent: Intent, context: Context) {
            context.startActivity(intent)
        }
    }
}