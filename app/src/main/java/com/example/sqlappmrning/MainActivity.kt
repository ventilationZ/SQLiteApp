package com.example.sqlappmrning

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnSave:Button
    private lateinit var btnView:Button
    private lateinit var btnDelete:Button
    private lateinit var edtName:EditText
    private lateinit var edtEmail:EditText
    private lateinit var edtID:EditText
    private lateinit var db:SQLiteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave = findViewById(R.id.btnsave)
        btnView = findViewById(R.id.btnview)
        btnDelete = findViewById(R.id.btndelete)
        edtName = findViewById(R.id.edtname)
        edtEmail = findViewById(R.id.edtemail)
        edtID = findViewById(R.id.edtid)

        //Create a database called Emobilis
        db =openOrCreateDatabase("EmobilisDB", Context.MODE_PRIVATE, null)
        //Create a table inside the database
        db.execSQL("CREATE TABLE IF NOT EXISTS users(jina VARCHAR,arafa VARCHAR,kitambulisho VARCHAR)")
        btnSave.setOnClickListener {
            var name_edt = edtName.text.toString().trim()
            var email_edt = edtEmail.text.toString().trim()
            var id_edt = edtID.text.toString().trim()
            if (name_edt.isEmpty() || email_edt.isEmpty() || id_edt.isEmpty())
                Toast.makeText(this, "Check your Input", Toast.LENGTH_SHORT).show()

            else{
                db.execSQL("INSERT INTO users VALUES('"+name_edt+"','"+email_edt+"','"+id_edt+"')")
                Toast.makeText(this, "DATA SAVED SUCCESSFULLY", Toast.LENGTH_SHORT).show()
//                message("SUCCESS!!","User saved successfully!!!")
            }

        }
        btnView.setOnClickListener {


        }
        btnDelete.setOnClickListener {

        }
    }
}