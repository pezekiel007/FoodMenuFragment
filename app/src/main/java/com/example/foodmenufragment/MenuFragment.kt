package com.example.foodmenufragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MenuFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var myFoodMenu = DataSource().loadFoodMenu()
    private var isGridLayoutManager = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        recyclerView = view.findViewById(R.id.rvFoodMenu)
        chooseLayout()

    }

    private fun chooseLayout() {

        val adapter = context?.let { ItemAdapter(it.applicationContext, myFoodMenu) }

        if ( isGridLayoutManager ) {
            recyclerView.layoutManager = GridLayoutManager(context, 2)
        }
        else {
            recyclerView.layoutManager = StaggeredGridLayoutManager(3, 1)
        }
        recyclerView.adapter = adapter

    }

    private fun setIcon( menuItem: MenuItem?) {

        if ( menuItem == null ) return

        menuItem.icon =
            if ( isGridLayoutManager ) {
                ContextCompat.getDrawable(requireContext(), R.drawable.ic_view_list)
            } else {
                ContextCompat.getDrawable(requireContext(), R.drawable.ic_grid_view)
            }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.layout_menu, menu)

        val layoutButton = menu.findItem(R.id.switch_icon)
        setIcon(layoutButton)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when ( item.itemId ) {
            R.id.switch_icon -> {
                isGridLayoutManager = !isGridLayoutManager

                chooseLayout()
                setIcon(item)

                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}