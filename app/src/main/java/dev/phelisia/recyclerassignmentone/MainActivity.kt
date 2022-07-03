package dev.phelisia.recyclerassignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.phelisia.recyclerassignmentone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fabonicci()
    }
    fun fabonicci() {
        val n = 50
        var t1 = 0
        var t2 = 1

        print("First $n terms: ")

       var numbers= mutableListOf<Int>()
        for(i in 1..n){
            numbers.add((t1))
            val sum = t1 + t2
            t1 = t2
            t2 = sum
        }





        var numberAdapter=NumberRecyclerViewAdapter(numbers)
        binding.rvNumbers.layoutManager= LinearLayoutManager(this)
        binding.rvNumbers.adapter=numberAdapter
        }
}