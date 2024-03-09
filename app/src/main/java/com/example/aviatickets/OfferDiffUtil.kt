package com.example.aviatickets

import androidx.recyclerview.widget.DiffUtil
import com.example.aviatickets.model.entity.Offer

class OfferDiffUtil(
    private val oldList: List<Offer>,
    private val newList: List<Offer>,
    ): DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            oldList[oldItemPosition].id != newList[newItemPosition].id -> {
                false
            }
            oldList[oldItemPosition].flight != newList[newItemPosition].flight -> {
                false
            }
            oldList[oldItemPosition].price != newList[newItemPosition].price -> {
                false
            }
            else -> true
        }
    }
}