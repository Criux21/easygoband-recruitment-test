package com.example.recruitmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.recruitmenttest.ListFragmentDirections.actionListFragmentToInfoFragment
import com.example.recruitmenttest.api.RetrofitInstance
import com.example.recruitmenttest.databinding.FragmentListBinding
import com.example.recruitmenttest.model.Info
import com.example.recruitmenttest.utils.Constants.Companion.allinfo
import okhttp3.internal.wait
import org.jetbrains.anko.doAsync

class ListFragment : Fragment() {

    var listadapter: ArrayAdapter<String>? = null
    lateinit var args:ListFragmentArgs
    lateinit var sortedInfo: MutableList<Info?>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListBinding>(
            inflater, R.layout.fragment_list, container, false
        )
        args = ListFragmentArgs.fromBundle(requireArguments())

        getSortedInfo()
        binding.lista.adapter = listadapter

        binding.lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            this.findNavController().navigate(ListFragmentDirections.actionListFragmentToInfoFragment(sortedInfo[position]!!.access_group_name, sortedInfo[position]!!.access_group_id, sortedInfo[position]!!.total_uses,
                    sortedInfo[position]!!.sessions.get(0).toString() ,sortedInfo[position]!!.event_id, sortedInfo[position]!!.structure_decode, sortedInfo[position]!!.name, sortedInfo[position]!!.modified.time,
                    sortedInfo[position]!!.id, sortedInfo[position]!!.basic_product_id))

        }

        return binding.root
    }

    private fun getSortedInfo(){
        val info = mutableListOf<String>()
        sortedInfo = mutableListOf()
        var todo = false
        if (args.userID == 0){
            todo = true
        }
        for (i in allinfo.indices) {
            if (todo){
                info.add(allinfo[i]!!.name)
                sortedInfo.add(allinfo[i])
            } else if (args.userID == allinfo[i]!!.access_group_id){
                info.add(allinfo[i]!!.name)
                sortedInfo.add(allinfo[i])
            }
        }
        val idInfo = info.toTypedArray()
        var adapter = activity?.let {
            ArrayAdapter(
                    it.applicationContext,
                    android.R.layout.simple_dropdown_item_1line,
                    idInfo
            )
        }
        listadapter = adapter
    }
}