package com.example.locationobjet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_audio.*


class AudioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)


        imageButton2.setOnClickListener {
            imageButton2.setOnClickListener {
                startActivity(
                    Intent(baseContext, MainActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                )
                finish()

            }
        }

        //el apartado de audio se desabilita para habilitar el de mapa

        imgLocalization2.setOnClickListener {
            imgLocalization2.setOnClickListener {
                startActivity(
                    Intent(baseContext, LocationActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                )
                finish()

            }
        }
    }
}