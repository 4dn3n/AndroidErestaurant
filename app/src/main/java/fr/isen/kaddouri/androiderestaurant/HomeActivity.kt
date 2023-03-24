package fr.isen.kaddouri.androiderestaurant

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import fr.isen.kaddouri.androiderestaurant.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun click(view: View){
        Toast.makeText(this , "vous avez cliquer sur lentre", Toast.LENGTH_LONG).show()
    }
    fun click2(view: View){
        Toast.makeText(this , "vous avez cliquer sur le plat", Toast.LENGTH_LONG).show()
    }
    fun click3(view: View){
        Toast.makeText(this , "vous avez cliquer sur le dessert", Toast.LENGTH_LONG).show()
    }
}