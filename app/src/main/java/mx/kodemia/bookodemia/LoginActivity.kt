package mx.kodemia.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tietCorreo.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editText: Editable?) {
                if(editText.toString().trim().isEmpty()){
                    tilCorreo.setError("Correo requerido")
                }else{
                    tilCorreo.setErrorEnabled(false)
                    tilCorreo.setError("")
                }
            }

        })

        bilLog.setOnClickListener{
            val textoEmail: String = tietCorreo.text?.trim().toString()
            val textPass: String = tietPassword.text?.trim().toString()
            if(textoEmail.isEmpty()){
                tilCorreo.setError("Correo requerido")
            }else{
                tilCorreo.setError(null)
            }

            if(textPass.isEmpty()){
                tilPassword.setError("Contraseña requerida")
            }else{
                tilPassword.setError(null)
            }
            startActivity(Intent(this,HomeActivity::class.java))
        }

        textSigin.setOnClickListener{
            startActivity(Intent(this,SiginActivity::class.java))
        }
    }
}