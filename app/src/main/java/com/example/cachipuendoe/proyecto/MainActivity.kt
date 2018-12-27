package com.example.cachipuendoe.proyecto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val manager = this.supportFragmentManager

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                message.setText("Home")
                createFragmenteHome()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_register -> {
                message.setText("Registro")
                createFragmenteRegistro()
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_ajustes -> {
                message.setText("Ajustes")
                createFragmenteAjustes()
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_nav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    fun createFragmenteHome()
    {
        val trans = manager.beginTransaction()
        val fragment = FragmentHome()
        trans.replace(R.id.fragmentholder,fragment)
        trans.addToBackStack(null)
        trans.commit()
    }

    fun createFragmenteRegistro()
    {
        val trans = manager.beginTransaction()
        val fragment = FragmentRegistro()
        trans.replace(R.id.fragmentholder,fragment)
        trans.addToBackStack(null)
        trans.commit()
    }

    fun createFragmenteAjustes()
    {
        val trans = manager.beginTransaction()
        val fragment = FragmentAjustes()
        trans.replace(R.id.fragmentholder,fragment)
        trans.addToBackStack(null)
        trans.commit()
    }


}
