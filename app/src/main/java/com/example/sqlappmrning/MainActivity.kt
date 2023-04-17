package com.example.sqlappmrning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnSave:Button
    private lateinit var btnView:Button
    private lateinit var btnDelete:Button
    private lateinit var edtName:EditText
    private lateinit var edtEmail:EditText
    private lateinit var edtID:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave = findViewById(R.id.btnsave)
        btnView = findViewById(R.id.btnview)
        btnDelete = findViewById(R.id.btndelete)
        edtName = findViewById(R.id.edtname)
        edtEmail = findViewById(R.id.edtemail)
        edtID = findViewById(R.id.edtid)

        btnSave.setOnClickListener {

        }
        btnView.setOnClickListener {

        }
        btnDelete.setOnClickListener {

        }
    }
}