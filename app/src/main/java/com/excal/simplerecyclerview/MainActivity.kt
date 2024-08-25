package com.excal.simplerecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.excal.simplerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding


    var transaction1=Transaction("Spotify",15,"24-08-2024",0)
    var transaction2=Transaction("Riot",12,"24-08-2024",0)
    var transaction3=Transaction("Shopee",9,"24-08-2024",0)
    var transaction4=Transaction("Tokopedia",13,"24-08-2024",0)
    var transaction5=Transaction("BRI",10,"24-08-2024",0)
    var transaction6=Transaction("Steam",99,"24-08-2024",0)


    var listTransaction:ArrayList<Transaction> = arrayListOf(transaction1,transaction2,transaction3,transaction4, transaction5,transaction6)


    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        showTransaction()

    }

    fun showTransaction(){
        binding.rvTransaction.layoutManager=LinearLayoutManager(this)
        val listTransactionViewAdapter=TransactionAdapter(listTransaction)
        binding.rvTransaction.adapter=listTransactionViewAdapter
    }
}