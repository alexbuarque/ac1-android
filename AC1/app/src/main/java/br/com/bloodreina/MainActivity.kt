package br.com.bloodreina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular_media(v:View){
        var media = 0.0;

        if(et_nome.text.isNotEmpty()){
            val nomeAluno = et_nome.text.toString();

            if (et_nota1.text.isNotEmpty() && et_nota2.text.isNotEmpty()){
                val nota1 = et_nota1.text.toString().toDouble();
                val nota2 = et_nota2.text.toString().toDouble();

                media = (nota1 + nota2) / 2;

                tv_resultado.text = "A media do aluno: ${nomeAluno} é ${media}";
            }else{
                tv_resultado.text = "Notas digitadas inválidas!"
            }

        }else{
            tv_resultado.text = "Digite o nome do aluno!"
        }

    }

}