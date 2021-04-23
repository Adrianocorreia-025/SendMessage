package ar.adriano.meuaplicativo

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    @SuppressLint("WrongViewCast")
    fun sendMensage(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val message = editTextMensagem.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
        putExtra(EXTRA_MESSAGE, message)
            startActivity(intent)
        }

    }

}
