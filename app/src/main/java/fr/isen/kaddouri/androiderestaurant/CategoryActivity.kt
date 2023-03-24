package fr.isen.kaddouri.androiderestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import fr.isen.kaddouri.androiderestaurant.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.categoryRecycleView.layoutManager = LinearLayoutManager(this)
        binding.categoryRecycleView.adapter = CategoryAdapter(arrayListOf<String>())

    }
}