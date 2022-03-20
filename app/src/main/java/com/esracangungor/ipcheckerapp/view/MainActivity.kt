package com.esracangungor.ipcheckerapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.esracangungor.ipcheckerapp.databinding.ActivityMainBinding
import com.esracangungor.ipcheckerapp.viewmodel.MainActivityViewModel

/*https://www.youtube.com/watch?v=5gFrXGbQsc8
https://futurestud.io/tutorials/retrofit-2-receive-plain-string-responses
first problem: https://stackoverflow.com/questions/56543361/following-error-is-coming-when-the-button-is-clicked-to-hit-an-api
second problem:  https://stackoverflow.com/questions/39918814/use-jsonreader-setlenienttrue-to-accept-malformed-json-at-line-1-column-1-path
third problem: If I add model class it does not work it gives this error,I tried to solved it but response is not a json I could not do it: "Expected BEGIN_OBJECT but was STRING at line 1 column 1"
*/
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainActivityViewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding.btnGetResult.setOnClickListener {
            mainActivityViewModel.servicesLiveData.observe(this) {
                binding.tvResult.text = it
            }
        }

    }
}