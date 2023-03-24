package fr.isen.kaddouri.androiderestaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CategoryAdapter(val dishes: ArrayList<String>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dishes.size

    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val item = dishes[position] // Récupère l'élément à la position donnée
        holder.bind(item) // Appelle la fonction "bind" du ViewHolder pour lier les données à la vue
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dishName = itemView.findViewById<TextView>(R.id.dishName)
        fun bind(item: String) {
            dishName.text = item

        }
    }

}