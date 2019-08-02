package curso.carlos.mystore.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import curso.carlos.mystore.R
import curso.carlos.mystore.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductAdapter(val items: ArrayList<Product>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvName.text = items[position].name
        holder?.tvDescription.text = items[position].description
        holder?.tvPrice.text = items[position].price.toString()

        Picasso.get().load(items[position].image).into(holder?.image)
    }
}

class ViewHolder : RecyclerView.ViewHolder {

    val tvName: TextView
    val tvDescription: TextView
    val tvPrice: TextView
    val image: ImageView

    constructor(view: View) : super(view) {
        tvName = view.pro_name
        tvDescription = view.pro_description
        tvPrice = view.pro_price
        image = view.pro_image
    }
}