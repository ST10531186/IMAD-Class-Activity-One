package com.example.imadclassactivityone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imadclassactivityone.ui.theme.IMADCLASSACTIVITYONETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IMADCLASSACTIVITYONETheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//Class Activity one
/**
 * 1. Write a program that takes two numbers from the user and multiplies them
 * 2. Write a program that asks for a price, ask for a discount amount and calculate the final price
 * 3. Write a program that asks for a length , asks for width and calculate the area
 * 4. Write a program that asks for teperature in Celsius and converts to Fahrenhheit
 * 5. Write a program that asks for three numbers and calculates an average
 *
 * Name: Luthando
 * Surname: Mhlarhi
 * Student Number: ST10531186
 *
 */


fun main(){

    //Input a name (String)

    println("Please enter your name : ")
    var name = readLine()

     println("Enter First Number : ")
    var num1 = readLine()!!.toInt()

    println("Enter Second Number : ")
    var num2 = readLine()!!.toInt()

    var mul = num1 * num2

    println("Please Enter Price : ")
    var price = readLine()!!.toDouble()

    println("Please Enter Discount : ")
    var discount = readLine()!!.toDouble()

    var sum = price - discount

    println("Please Enter Length")
    var length = readLine()!!.toInt()

    println("Please Enter Width")
    var width = readLine()!!.toInt()

    var area = length * width

    println("Please Enter Temperature")
    var temp = readLine()!!.toInt()

    println("Please Enter Celcius")
    var celc = readLine()!!.toInt()

    var Fah = temp + celc * 2

    //Recieve three numbers that are integers

    println("Enter First Number : ")
    var num3 = readLine()!!.toInt()

    println("Enter Second Number : ")
    var num4 = readLine()!!.toInt()

    println("Enter Third Number : ")
    var num5 = readLine()!!.toInt()

    var ave = num3 + num4 + num5 / 3
    

    println((" Hello $name"))
    println(" The price is $price")
    println(" The sum of the num1 and num2 is : $sum ")
    println(" The area of length and width : $area ")
    println(" The Fahrenheit of temp and celcius : $Fah ")
    println("Average of num3 and num4 and num5 is : $ave ")

}




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IMADCLASSACTIVITYONETheme {
        Greeting("Android")
    }
}