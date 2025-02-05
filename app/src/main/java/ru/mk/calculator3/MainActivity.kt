package ru.mk.calculator3

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
import ru.mk.calculator3.databinding.ActivityMainBinding
import ru.mk.calculator3.ui.theme.Calculator3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn0.setOnClickListener{ setTextFields("0", binding) }
        binding.btn1.setOnClickListener{ setTextFields("1", binding) }
        binding.btn2.setOnClickListener{ setTextFields("2", binding) }
        binding.btn3.setOnClickListener{ setTextFields("3", binding) }
        binding.btn4.setOnClickListener{ setTextFields("4", binding) }
        binding.btn5.setOnClickListener{ setTextFields("5", binding) }
        binding.btn6.setOnClickListener{ setTextFields("6", binding) }
        binding.btn7.setOnClickListener{ setTextFields("7", binding) }
        binding.btn8.setOnClickListener{ setTextFields("8", binding) }
        binding.btn9.setOnClickListener{ setTextFields("9", binding) }
        binding.divideBtn.setOnClickListener{ setTextFields("/", binding) }
        binding.multBtn.setOnClickListener{ setTextFields("*", binding) }
        binding.minusBtn.setOnClickListener{ setTextFields("-", binding) }
        binding.plusBtn.setOnClickListener{ setTextFields("+", binding) }
        binding.openBrkBtn.setOnClickListener{ setTextFields("(", binding) }
        binding.closeBrkBtn.setOnClickListener{ setTextFields(")", binding) }
        binding.clearBtn.setOnClickListener {
            binding.mathOperation.text = ""
            binding.resultText.text = ""
        }
        binding.undoBtn.setOnClickListener {
            var text = binding.mathOperation.text.toString()
            if (text.isNotEmpty()) {
                binding.mathOperation.text = text.substring(0, text.length - 1)
            }
            binding.resultText.text = ""
        }
    }

    fun setTextFields(str: String, binding: ActivityMainBinding) {
        binding.mathOperation.append(str)
    }
}
