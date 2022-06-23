package com.beatriz.alertdialogtest

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        abreDialog()
    }

    fun abreDialog() {
        val alertDialog = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.layout__dialog, null)

        alertDialog.setView(view)

        val dialog = alertDialog.create()
        dialog.show()
    }

}