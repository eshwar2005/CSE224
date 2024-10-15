package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        var btn=findViewById<Button>(R.id.btn)
        var btn2=findViewById<Button>(R.id.btn2)
        var btn3=findViewById<Button>(R.id.btn3)
        var btn4=findViewById<Button>(R.id.btn4)
        var btn5=findViewById<Button>(R.id.btn5)
        var btn6=findViewById<Button>(R.id.btn6)
        var btn7=findViewById<Button>(R.id.btn7)

        btn.setOnClickListener{
            val i1=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"))
            startActivity(i1)
        }
        btn2.setOnClickListener{
            val i2=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }
        btn3.setOnClickListener{
            val i3=Intent(Intent.ACTION_VIEW)
            i3.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i3)
        }
        btn4.setOnClickListener{
            val i4=Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i4)
        }
        btn5.setOnClickListener{
            val i5=Intent()
            i5.action=Intent.ACTION_VIEW
            i5.type="image/*"
            startActivity(i5)
        }
        btn6.setOnClickListener{
            val i6=Intent(Intent.ACTION_DIAL)
            i6.setData(Uri.parse("tel:+9111112358"))
            startActivity(i6)
        }
        btn7.setOnClickListener{
            val i1=Intent(Intent.ACTION_MAIN)
            startActivity(i1)
        }
    }
}
