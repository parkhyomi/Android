package com.example.a726android

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
import com.example.a726android.ui.theme._726AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _726AndroidTheme {

            }
        }
    }
}

class SmartDevice(val name:String,val category:String){
    var deviceStatus="online"

    constructor(name: String,category: String,statusCode:Int):this(name, category) {
        deviceStatus= when(statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned off")
    }
}

fun main(){
    val smartTvDevice =SmartDevice()
    println("device name is : ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}