package com.example.locationobjet

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Boton de mapa de Main Activity no respondera entando dentro de la actividad MainActivity

        imgAudio.setOnClickListener {
            imgAudio.setOnClickListener {
                startActivity(
                    Intent(baseContext, AudioActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                )
                finish()

            }
        }

        imgLocalization.setOnClickListener {
            imgLocalization.setOnClickListener {
                startActivity(
                    Intent(baseContext, LocationActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                )
                finish()

            }
        }


    }


}