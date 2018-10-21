package com.exemplo.liphvf.aposentadoriacalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //acessando o spinner
        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)

        //acessando a caixa de idade
        val txt_idade = findViewById<EditText>(R.id.txt_idade)

        //acessando o botão de calcular
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        spn_sexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
            listOf("masculino", "feminino"))

        btn_calcular.setOnClickListener {

            val sexo = spn_sexo.selectedItem as String
            val idade = txt_idade.text.toString().toInt()

            var result  =findViewById<TextView>(R.id.txt_resultado)

            var tempoParaAposentar = 0
            if (sexo == "masculino" ){
                tempoParaAposentar = 65 - idade;
            } else {
                tempoParaAposentar = 60 - idade;

            }
            result.text = "Faltam $tempoParaAposentar anos para vocse se aposentar"
        }


    }

}
