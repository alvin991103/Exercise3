package com.example.exercise3

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isEmpty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonCalculate).setOnClickListener{
            calculate()
        }
        findViewById<Button>(R.id.buttonReset).setOnClickListener{
            reset()
        }
    }

    private fun calculate() {


        val age = findViewById<Spinner>(R.id.spinnerAge).selectedItem.toString()
        val smoke = findViewById<CheckBox>(R.id.checkBoxSmoker)
        val gender = findViewById<RadioGroup>(R.id.radioGroupGender).checkedRadioButtonId

        if (age == "Less than 17") {
            val total = 60
            textViewPremium.text = total.toString()
        }
            else if(gender == (R.id.radioButtonMale) && smoke.isChecked && age == "Less than 17"){
            val total = 60
            textViewPremium.text = total.toString()
        }
        else if(gender == (R.id.radioButtonMale) && !smoke.isChecked && age == "Less than 17"){
            val total = 60
            textViewPremium.text = total.toString()
        }
        else if(gender == (R.id.radioButtonFemale) && smoke.isChecked && age == "Less than 17"){
            val total = 60
            textViewPremium.text = total.toString()
        }
        else if(gender == (R.id.radioButtonFemale) && !smoke.isChecked && age == "Less than 17"){
            val total = 60
            textViewPremium.text = total.toString()
        }

        //17-25
        else if (gender == (R.id.radioButtonMale) && smoke.isChecked && age == "17 to 25") {

            val total = 70 + 50 + 100
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && smoke.isChecked && age == "17 to 25") {

            val total = 70 + 100
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && !smoke.isChecked && age == "17 to 25") {

            val total = 70
            textViewPremium.text = total.toString()
        }
        //26-39
        else if (gender == (R.id.radioButtonMale) && smoke.isChecked && age == "26 to 30") {
            val total = 90 + 100 + 150
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && smoke.isChecked && age == "26 to 30") {
            val total = 90 + 150
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && !smoke.isChecked && age == "26 to 30") {
            val total = 90
            textViewPremium.text = total.toString()
        }
        //31-40
        else if (gender == (R.id.radioButtonMale) && smoke.isChecked && age == "31 to 40") {
            val total = 120 + 150 + 200
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && smoke.isChecked && age == "31 to 40") {
            val total = 120 + 200
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && !smoke.isChecked && age == "31 to 40") {
            val total = 120
            textViewPremium.text = total.toString()
        }
        //41-55
        else if (gender == (R.id.radioButtonMale) && smoke.isChecked && age == "41 to 55") {
            val total = 150 + 200 + 250
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && smoke.isChecked && age == "41 to 55") {
            val total = 150 + 250
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && !smoke.isChecked && age == "41 to 55") {
            val total = 150
            textViewPremium.text = total.toString()
        }
        //>55
        else if (gender == (R.id.radioButtonMale) && smoke.isChecked && age == "More than 55") {
            val total = 150 + 200 + 300
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && smoke.isChecked && age == "More than 55") {
            val total = 150 + 300
            textViewPremium.text = total.toString()
        } else if (gender == (R.id.radioButtonFemale) && !smoke.isChecked && age == "More than 55") {
            val total = 150
            textViewPremium.text = total.toString()
        }

    }
    private fun reset(){

        findViewById<Spinner>(R.id.spinnerAge).setSelection(0)
        findViewById<RadioGroup>(R.id.radioGroupGender).clearCheck()
        findViewById<CheckBox>(R.id.checkBoxSmoker).setChecked(false)
        findViewById<TextView>(R.id.textViewPremium).setText("Insurance Premium : ")
    }
}
