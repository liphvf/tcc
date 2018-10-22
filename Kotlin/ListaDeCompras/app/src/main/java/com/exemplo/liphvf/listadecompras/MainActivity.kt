package com.exemplo.liphvf.listadecompras

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val listaAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        lista_de_compras.adapter = listaAdapter

        btn_adicionar.setOnClickListener {
            var item = txt_novoitem.text.toString()
            if (item.isNotEmpty()) {
                listaAdapter.add(item)
                txt_novoitem.text.clear()
            } else {
                txt_novoitem.error = "Digite o nome do produto"
            }
        }
    }
}
