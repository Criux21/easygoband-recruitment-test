package com.example.recruitmenttest

import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.recruitmenttest.api.RetrofitInstance
import com.example.recruitmenttest.databinding.FragmentMenuBinding
import com.example.recruitmenttest.model.Info
import com.example.recruitmenttest.utils.Constants.Companion.allinfo
import kotlinx.android.synthetic.main.fragment_menu.*
import org.jetbrains.anko.doAsync


class MenuFragment : Fragment() {

    var hecho = false

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentMenuBinding>(
                inflater, R.layout.fragment_menu, container, false
        )
        if (!hecho){
            getInfo()
            while (!hecho){}
        }

        binding.button.setOnClickListener {
            var userID = 0
            if(binding.textInput.text.toString() != "")
                userID = binding.textInput.text.toString().toInt()
            this.findNavController().navigate(MenuFragmentDirections.actionMenuFragmentToListFragment(userID))
        }

        return binding.root
    }
    private fun getInfo(){
        doAsync {
            val call = RetrofitInstance.api.info
            println("HOLA")
            allinfo = call?.execute()?.body() as List<Info?>
            hecho = true
            println(hecho)
        }
    }


}