package com.example.recruitmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.recruitmenttest.databinding.FragmentInfoBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class InfoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentInfoBinding>(
            inflater, R.layout.fragment_info, container, false
        )
        val args = InfoFragmentArgs.fromBundle(requireArguments())
        val sessions = (args.sessions.replace("{", "").replace("}", "").replace("\"", "")).split(",")
        val dateModified = Date(args.modified)
        val format = SimpleDateFormat("dd-MM-yyyy HH:mm")

        binding.accessGroupNameText.text =  args.accessGroupName
        binding.accessGroupIdText.text = args.accessGroupId.toString()
        binding.totalUsesText.text = args.totalUses.toString()
        binding.sessionsTextName.text = sessions[0]
        binding.sessionsTextId.text = sessions[1]
        binding.eventIdText.text = args.eventId.toString()
        binding.structureDecodeText.text = args.structureDecode.toString()
        binding.nameText.text = args.name
        binding.modifiedText.text = format.format(dateModified)
        binding.idText.text = args.id.toString()
        binding.basicProductIdText.text = args.basicProductId.toString()

        return binding.root
    }
}