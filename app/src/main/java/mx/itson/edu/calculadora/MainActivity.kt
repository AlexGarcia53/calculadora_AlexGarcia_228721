package mx.itson.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num0: Button = findViewById(R.id.btnCero)
        val num1: Button = findViewById(R.id.btnUno)
        val num2: Button = findViewById(R.id.btnDos)
        val num3: Button = findViewById(R.id.btnTres)
        val num4: Button = findViewById(R.id.btnCuatro)
        val num5: Button = findViewById(R.id.btnCinco)
        val num6: Button = findViewById(R.id.btnSeis)
        val num7: Button = findViewById(R.id.btnSiete)
        val num8: Button = findViewById(R.id.btnOcho)
        val num9: Button = findViewById(R.id.btnNueve)

        val suma: Button = findViewById(R.id.btnSuma)
        val resta: Button = findViewById(R.id.btnResta)
        val multiplicacion: Button = findViewById(R.id.btnMulti)
        val division: Button = findViewById(R.id.btnDivi)

        val igual: Button = findViewById(R.id.btnResultado)
        val borrar: Button = findViewById(R.id.btnDel)

        val operacion: TextView = findViewById(R.id.twOperando)
        val resultado: TextView = findViewById(R.id.twResultado)
        var resultadoDecimal: Double = 0.0

        num0.setOnClickListener{
            operacion.setText(operacion.text.toString()+0)
        }
        num1.setOnClickListener{
            operacion.setText(operacion.text.toString()+1)
        }
        num2.setOnClickListener{
            operacion.setText(operacion.text.toString()+2)
        }
        num3.setOnClickListener{
            operacion.setText(operacion.text.toString()+3)
        }
        num4.setOnClickListener{
            operacion.setText(operacion.text.toString()+4)
        }
        num5.setOnClickListener{
            operacion.setText(operacion.text.toString()+5)
        }
        num6.setOnClickListener{
            operacion.setText(operacion.text.toString()+6)
        }
        num7.setOnClickListener{
            operacion.setText(operacion.text.toString()+7)
        }
        num8.setOnClickListener{
            operacion.setText(operacion.text.toString()+8)
        }
        num9.setOnClickListener{
            operacion.setText(operacion.text.toString()+9)
        }
        suma.setOnClickListener{
            if(!operacion.text.equals("")){
                resultado.setText(operacion.text.toString()+"+")
                operacion.setText("")
            }
        }
        resta.setOnClickListener{
            if(!operacion.text.equals("")) {
                resultado.setText(operacion.text.toString() + "-")
                operacion.setText("")
            }
        }
        multiplicacion.setOnClickListener{
            if(!operacion.text.equals("")) {
                resultado.setText(operacion.text.toString() + "*")
                operacion.setText("")
            }

        }
        division.setOnClickListener{
            if(!operacion.text.equals("")) {
                resultado.setText(operacion.text.toString() + "/")
                operacion.setText("")
            }
        }
        borrar.setOnClickListener{
            if(!operacion.text.equals("")) {
                operacion.setText(operacion.text.substring(0, operacion.text.length - 1))
            }
        }
        igual.setOnClickListener{
            if(!operacion.text.equals("")) {
                if(resultado.text.toString().contains("+")){
                    resultadoDecimal = resultado.text.substring(0, resultado.text.length - 1)
                        .toDouble() + operacion.text.toString().toDouble()
                    operacion.setText("")
                }
                if(resultado.text.toString().contains("-")){
                    resultadoDecimal = resultado.text.substring(0, resultado.text.length - 1)
                        .toDouble() - operacion.text.toString().toDouble()
                    operacion.setText("")
                }
                if(resultado.text.toString().contains("/")){
                    resultadoDecimal = resultado.text.substring(0, resultado.text.length - 1)
                        .toDouble() / operacion.text.toString().toDouble()
                    operacion.setText("")
                }
                if(resultado.text.toString().contains("*")){
                    resultadoDecimal = resultado.text.substring(0, resultado.text.length - 1)
                        .toDouble() * operacion.text.toString().toDouble()
                    operacion.setText("")
                }
                resultado.setText(resultadoDecimal.toString())
            }
        }
    }
}