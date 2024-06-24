package mx.edu.uthermosillo.a21311118.comandas.data.ui.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import mx.edu.uthermosillo.a21311118.comandas.R

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_auth)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
                // Obtener una referencia a FirebaseAuth
                val auth = FirebaseAuth.getInstance()

                // Verificar si el usuario ya está logueado
                if (auth.currentUser != null) {
                    // Si el usuario ya está logueado, iniciar MainActivity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                    // Finalizar AuthActivity
                    finish()
                }
            }
        }
