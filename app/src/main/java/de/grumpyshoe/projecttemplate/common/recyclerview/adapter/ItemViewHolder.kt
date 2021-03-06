package de.grumpyshoe.projecttemplate.common.recyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import de.grumpyshoe.projecttemplate.common.recyclerview.ItemViewmodel
import de.grumpyshoe.projecttemplate.common.recyclerview.RecyclerViewClickListener


/**
 * Created by grumpyshoe on 22.11.17.
 *
 * Bindingholder
 */
class ItemViewHolder<T>(val viewModel: ItemViewmodel<T>, itemView: View, val itemClickListener: RecyclerViewClickListener?) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var isSelected: Boolean = false

    init {
        itemView.setOnClickListener(this)
    }

    internal fun setItem(item: T) {
        viewModel.setItem(item)
    }


    internal fun setSelected(selected : Boolean) {
        viewModel.setSelected(selected)
    }

    override fun onClick(view: View?) {
        itemClickListener?.recyclerViewListClicked(layoutPosition)
    }

}
