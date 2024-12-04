package com.example.task_039

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class GridViewAdapter (
    private val list: List<GridViewModal>,
    private val context: Context
) :
    BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageViewIV: ImageView
    private lateinit var imageContentTV: TextView

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {

            convertView = layoutInflater!!.inflate(R.layout.gridview_item, null)
        }
        imageViewIV    = convertView!! .findViewById(R.id.imageViewIV)
        imageContentTV = convertView.findViewById(R.id.imageContentTV)

        imageViewIV.setImageResource(list[position].imageView)
        imageContentTV.text = list[position].imageContent

        return  convertView
    }
}