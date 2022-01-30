package mx.kodemia.bookodemia.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.google.android.material.snackbar.Snackbar
import mx.kodemia.bookodemia.DetailsActivity
import mx.kodemia.bookodemia.R
import mx.kodemia.bookodemia.model.DataClassHome
import mx.kodemia.bookodemia.modelBooks.Data
import mx.kodemia.bookodemia.modelBooks.datosLibro

class AdaptadorBooks(val activity: Activity, val books: MutableList<datosLibro>): RecyclerView.Adapter<AdaptadorBooks.BookHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_home,parent,false)
        return BookHolder(view)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        val book = books.get(position)
        with(holder){
            cardView.setOnClickListener {
                val bundle = Bundle()
                bundle.putSerializable("book",book)
                val intent = Intent(activity,DetailsActivity::class.java)
                intent.putExtras(bundle)
                activity.startActivity(intent)
            }
            tv_title.text = book.attributes.title
            tv_autor.text = book.relationships.authors.links.self
            tv_category.text = book.relationships.categories.links.related
        }
    }

    override fun getItemCount(): Int = books.size

    class BookHolder(view: View): RecyclerView.ViewHolder(view){
        val cardView: MaterialCardView = view.findViewById(R.id.cardView_item_home)
        val tv_title: TextView = view.findViewById(R.id.text_title)
        val tv_autor: TextView = view.findViewById(R.id.text_autor)
        val tv_category: TextView = view.findViewById(R.id.text_categoria)
    }

}