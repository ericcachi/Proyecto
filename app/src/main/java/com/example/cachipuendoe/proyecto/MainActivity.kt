package com.example.cachipuendoe.proyecto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val manager = this.supportFragmentManager

/*
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                principal()
                Toast.makeText(this, "Pestaña Home", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_register -> {
                registro()
                Toast.makeText(this, "Pestaña Registro", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_ajustes -> {
                ajustes()
                Toast.makeText(this, "Pestaña Ajustes", Toast.LENGTH_SHORT).show()
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }*/

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                principal()
                createFragmenteHome()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_register -> {
                registro()
                createFragmenteRegistro()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_ajustes -> {
                ajustes()
                createFragmenteAjustes()
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
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

    fun createFragmenteHome() {
        val trans = manager.beginTransaction()
        val fragment = FragmentHome()
        trans.replace(R.id.fragmentholder, fragment)
        trans.addToBackStack(null)
        trans.commit()
    }

    fun createFragmenteRegistro() {
        val trans = manager.beginTransaction()
        val fragment = FragmentRegistro()
        trans.replace(R.id.fragmentholder, fragment)
        trans.addToBackStack(null)
        trans.commit()
    }

    fun createFragmenteAjustes() {
        val trans = manager.beginTransaction()
        val fragment = FragmentAjustes()
        trans.replace(R.id.fragmentholder, fragment)
        trans.addToBackStack(null)
        trans.commit()
    }

}
