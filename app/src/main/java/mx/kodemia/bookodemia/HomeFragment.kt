package mx.kodemia.bookodemia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_cardview_home.*
import mx.kodemia.bookodemia.adapters.RecyclerViewHome
import mx.kodemia.bookodemia.model.DataClassHome

class HomeFragment : Fragment(R.layout.fragment_home) {

    val listLibros: MutableList<DataClassHome> = mutableListOf()
    var adapterHome = activity?.let { RecyclerViewHome(listLibros, requireActivity()) }
    var parent_view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parent_view = view.findViewById(android.R.id.content)
        initRecyclerHome()
    }

    private fun initRecyclerHome(){
        listLibros.add(DataClassHome("Mil años de muerte","Pancho","Terror"))
        listLibros.add(DataClassHome("La naranja mecanica","Romero","Erotico"))
        listLibros.add(DataClassHome("Los hornos de Hitler","Mariano","Relato"))
        listLibros.add(DataClassHome("Infraestructocho","Alan","Comedia"))

        recyclerView_Home.layoutManager = LinearLayoutManager(activity)
        recyclerView_Home.setHasFixedSize(true)
        adapterHome = activity?.let { RecyclerViewHome(listLibros, requireActivity()) }
        recyclerView_Home.adapter = adapterHome
    }

}