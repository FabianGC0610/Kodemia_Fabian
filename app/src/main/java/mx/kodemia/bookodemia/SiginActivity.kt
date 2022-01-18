package mx.kodemia.bookodemia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sigin.*

class SiginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigin)

        textReturnFromSigin.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }

        bilSigin.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }

        tietUsuario.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editUser: Editable?) {
                if(editUser.toString().trim().isEmpty()){
                    tilUsuario.setError("Usuario requerido")
                }else{
                    tilUsuario.setErrorEnabled(false)
                    tilUsuario.setError("")
                }
            }

        })

        tietCorreoSigin.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editCorreo: Editable?) {
                if(editCorreo.toString().trim().isEmpty()){
                    tilCorreoSigin.setError("Correo requerido")
                }else{
                    tilCorreoSigin.setErrorEnabled(false)
                    tilCorreoSigin.setError("")
                }
            }

        })

        tietPasswordSigin.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editPass: Editable?) {
                if(editPass.toString().trim().isEmpty()){
                    tilPasswordSigin.setError("Contraseña requerida")
                }else{
                    tilPasswordSigin.setErrorEnabled(false)
                    tilPasswordSigin.setError("")
                }
            }

        })

        tietPassConfirm.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editConfirm: Editable?) {
                if(editConfirm.toString().trim().isEmpty()){
                    tilPassConfirm.setError("Confirmación requerida")
                }else{
                    tilPassConfirm.setErrorEnabled(false)
                    tilPassConfirm.setError("")
                }
            }

        })

        bilSigin.setOnClickListener{
            val textoUsuario: String = tietUsuario.text?.trim().toString()
            val textoCorreo: String = tietCorreoSigin.text?.trim().toString()
            val textoPassword: String = tietPasswordSigin.text?.trim().toString()
            val textoPassConfirm: String = tietPassConfirm.text?.trim().toString()
            if(textoUsuario.isEmpty()){
                tilUsuario.setError("Usurio requerido")
            }else{
                tilUsuario.setError(null)
            }

            if(textoCorreo.isEmpty()){
                tilCorreoSigin.setError("Correo requerido")
            }else{
               tilCorreoSigin.setError(null)
            }

            if(textoPassword.isEmpty()){
                tilPasswordSigin.setError("Contraseña requerida")
            }else{
                tilPasswordSigin.setError("")
            }

            if(textoPassConfirm.isEmpty()){
                tilPassConfirm.setError("Confirmación requerida")
            }else{
                tilPassConfirm.setError("")
            }

            if (textoPassword != textoPassConfirm){
                Toast.makeText(this,"Contraseñas diferentes", Toast.LENGTH_SHORT).show()
                tilPasswordSigin.setError("Contraseña requerida")
                tilPassConfirm.setError("Confirmación requerida")
            }else{
                startActivity(Intent(this,HomeActivity::class.java))
            }

            //startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}