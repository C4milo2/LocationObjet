package com.example.locationobjet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_location.*

class LocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_location)
        imageButton3.setOnClickListener {
            imageButton3.setOnClickListener {
                startActivity(
                    Intent(baseContext, MainActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                )
                finish()

            }
        }



        imgAudio3.setOnClickListener {
            imgAudio3.setOnClickListener {
                startActivity(
                    Intent(baseContext, AudioActivity::class.java)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                )
                finish()

            }
        }

        //el apartado de Location se desabilita para que pueda dar paso a Audio y Maps(MainActivity)

    }
}