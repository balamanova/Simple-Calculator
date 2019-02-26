package com.example.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toNum(str: EditText) : Int{
        return Integer.parseInt(str.toString());
    }

    fun add(view: View){
        result.text  = (toNum(firstNum) + toNum(secondNum)).toString();
    }

    fun sub(view: View){
        result.text = (toNum(firstNum)  - toNum(secondNum)).toString();
    }

    fun div(view: View){
        val a = firstNum.text.toString();
        val b = secondNum.text.toString();

        try {
            result.text = (toNum(firstNum)  / toNum(secondNum)).toString();
        }
        catch (err: Exception){
            result.text = err.toString();
        }
    }

    fun mul(view: View){
        result.text  = (toNum(firstNum)  * toNum(secondNum)).toString();
    }

    fun clear(view: View){
        firstNum.text.clear();
        secondNum.text.clear();

    }
}
