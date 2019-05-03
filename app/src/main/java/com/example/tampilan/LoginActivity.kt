package com.example.tampilan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tampilan.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {


//    var edtEmail : EditText? = null
//    var edtPassword : EditText? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


//        edtEmail = findViewById(R.id.edtEmail)
//        edtPassword = findViewById(R.id.edtPassword)


        val btSave = findViewById(R.id.btnSave) as Button
        btnSave.setOnClickListener { validasiInput() }
    }

    private fun validasiInput() {


        val emailInput = edtEmail.text.toString()
        val passwordInput = edtPassword.text.toString()


        when {

            emailInput.isEmpty() -> edtEmail.error = "Email tidak boleh kosong"
            passwordInput.isEmpty() -> edtPassword.error = "Password tidak boleh kosong"


            else -> {
                Toast.makeText(
                    this,
                    "Navigasi ke halaman profil",
                    Toast.LENGTH_SHORT
                ).show()
                navigasiKeHalamanMenu()


            }

        }}

    private fun navigasiKeHalamanMenu() {

        val emailInput = edtEmail.text.toString()
        val passwordInput = edtPassword.text.toString()



            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


            val bundle = Bundle()

            bundle.putString("email", emailInput)
            bundle.putString("password", passwordInput)

            intent.putExtras(bundle)
            startActivity(intent)

    }
}
