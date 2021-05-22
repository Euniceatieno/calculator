package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var theOutput=findViewById<TextView>(R.id.tvResult)

        var num1=findViewById<EditText>(R.id.etNum1)
        var num2=findViewById<EditText>(R.id.etNum2)
        var add=findViewById<Button>(R.id.btnAdd)
        add.setOnClickListener {
            var a=num1.text.toString().toInt()
            var b=num2.text.toString().toInt()
            var sum=a+b
            theOutput.setText(sum.toString())
        }
        var subtract=findViewById<Button>(R.id.btnSubtract)
        subtract.setOnClickListener {
            var a=num1.text.toString().toInt()
            var b=num2.text.toString().toInt()
            var minus=a-b
            theOutput.setText(minus.toString())
        }
        var multiply=findViewById<Button>(R.id.btnMultiply)
        multiply.setOnClickListener {
            var a=num1.text.toString().toInt()
            var b=num2.text.toString().toInt()
            var multiplication=a*b
            theOutput.setText(multiplication.toString())
        }
        var modulus=findViewById<Button>(R.id.btnModulus)
        modulus.setOnClickListener {
                        var a=num1.text.toString().toInt()
                        var b=num2.text.toString().toInt()
                        var modulo=a%b
                        theOutput.setText(modulo.toString())


                    }

    }
}


