package com.mani.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // Declaration of View Components

    var etFirstNumber   : EditText ?=null
    var etSecondNumber  : EditText ?=null
    var tvResult        : TextView ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Intialization of View Components

        etFirstNumber    = findViewById(R.id.etFirstNumber)
        etSecondNumber   = findViewById(R.id.etSecondNumber)
        tvResult         = findViewById(R.id.tvResult)

        val  btnAdd     = findViewById<Button>(R.id.btnAdd)
        val  btnSub     = findViewById<Button>(R.id.btnSub)
        val  btnMul     = findViewById<Button>(R.id.btnMul)
        val  btnDiv     = findViewById<Button>(R.id.btnDiv)
        val  btnClear   = findViewById<Button>(R.id.btnClear)

        // Implement onCLickListeners for Buttons

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMul.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnClear.setOnClickListener(this)



    }

    override fun onClick(v: View?) {

        // Convert edittext value to String


        var firstNumber = etFirstNumber!!.text.toString()
        var secondNumber = etSecondNumber!!.text.toString()

        when(v?.id)
        {
            R.id.btnAdd->

                if(firstNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter FirstNumber",Toast.LENGTH_SHORT).show()
                }
                else if(secondNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter SecondNumber",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    // convert String to Integer

                    val fNumber = firstNumber.toInt()
                    val sNumber = secondNumber.toInt()

                    val result = fNumber + sNumber

                    tvResult!!.setText(""+result)
                }

            R.id.btnSub->

                if(firstNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter FirstNumber",Toast.LENGTH_SHORT).show()
                }
                else if(secondNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter SecondNumber",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    // convert String to Integer

                    val fNumber = firstNumber.toInt()
                    val sNumber = secondNumber.toInt()

                    val result = fNumber - sNumber

                    tvResult!!.setText(""+result)
                }

            R.id.btnMul->

                if(firstNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter FirstNumber",Toast.LENGTH_SHORT).show()
                }
                else if(secondNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter SecondNumber",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    // convert String to Integer

                    val fNumber = firstNumber.toInt()
                    val sNumber = secondNumber.toInt()

                    val result = fNumber * sNumber

                    tvResult!!.setText(""+result)
                }

            R.id.btnDiv->

                if(firstNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter FirstNumber",Toast.LENGTH_SHORT).show()
                }
                else if(secondNumber.isEmpty())
                {
                    Toast.makeText(this,"Enter SecondNumber",Toast.LENGTH_SHORT).show()
                }
                else
                {
                    // convert String to Integer

                    val fNumber = firstNumber.toFloat()
                    val sNumber = secondNumber.toFloat()

                    val result = fNumber / sNumber

                    tvResult!!.setText(""+result)
                }

            R.id.btnClear->

                if(!firstNumber.isEmpty() && !secondNumber.isEmpty())
                {
                    etFirstNumber!!.setText("")
                    etSecondNumber!!.setText("")
                    tvResult!!.setText("Result")
                }
        }
    }
}