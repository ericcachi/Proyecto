package com.example.cachipuendoe.proyecto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ajustes.*
import kotlinx.android.synthetic.main.activity_main.*

class RegistroActivity : AppCompatActivity() {




    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                principal()
                Toast.makeText(this,"Pestaña Home", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_register -> {
                registro()

                Toast.makeText(this,"Pestaña Registro", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_ajustes -> {
                ajustes()

                Toast.makeText(this,"Pestaña Ajustes", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }

    fun principal(){
        var intent = Intent (this,MainActivity::class.java)
        this.startActivity(intent)
    }

    fun registro(){
        var intent = Intent (this,RegistroActivity::class.java)
        this.startActivity(intent)
    }

    fun ajustes(){
        var intent = Intent (this,AjustesActivity::class.java)
        this.startActivity(intent)
    }

}
