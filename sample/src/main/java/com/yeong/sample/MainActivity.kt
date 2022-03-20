package com.yeong.sample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.yeong.core.component.BindingActivity
import com.yeong.core.logger.mLog
import com.yeong.sample.databinding.ActivityMainBinding

class MainActivity : BindingActivity<ActivityMainBinding>() {

    private val dialogTest by lazy {
        TestDialogFragment()
            .setSubmitCallback { mLog.i("dialog submit") }
            .setCancelCallback { mLog.i("dialog isCancel : $it") }
    }

    override val layoutId: Int = R.layout.activity_main

    override fun initView() {
        binding.sampleTestButton.setOnClickListener {
            dialogTest.show(supportFragmentManager, "")
        }
        binding.sampleRvView.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): RecyclerView.ViewHolder =
                object : RecyclerView.ViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(android.R.layout.simple_list_item_1, parent, false)
                ){}

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                holder.itemView.findViewById<TextView>(android.R.id.text1).text = "$position"
            }

            override fun getItemCount(): Int = 100
        }
        ItemTouchHelper(object : ItemTouchHelper.Callback() {
            override fun getMovementFlags(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
                val swipeFlags = ItemTouchHelper.START or ItemTouchHelper.END
                return makeMovementFlags(dragFlags, swipeFlags)
            }

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                recyclerView.adapter?.notifyItemMoved(viewHolder.adapterPosition, target.adapterPosition)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                binding.sampleRvView.adapter?.notifyItemRemoved(viewHolder.adapterPosition)
            }
        }).attachToRecyclerView(binding.sampleRvView)
    }

    override fun initViewBinding() {

    }

    override fun observeBinding() {

    }

}