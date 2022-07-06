package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        practicaListView()
    }
    fun practicaListView(){
        val adaptador:ArrayAdapter<String>
        val listaPersonas=findViewById<ListView>(R.id.lv_personas)
        val Personas = arrayOf<String>(
            "Derian Chun", "Elian Chun", "Erick Chun", "Maria Chun","Victor Chun"
        )
        adaptador =ArrayAdapter(this,android.R.layout.simple_list_item_1,Personas)
        listaPersonas.adapter=adaptador
        listaPersonas.setOnItemClickListener(){parent,view,position,id->
            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()
        }
    }
}