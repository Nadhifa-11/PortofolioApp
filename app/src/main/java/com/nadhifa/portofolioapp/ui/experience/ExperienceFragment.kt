package com.nadhifa.portofolioapp.ui.experience

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.nadhifa.portofolioapp.R
import com.nadhifa.portofolioapp.data.experience.ExperienceObject
import com.nadhifa.portofolioapp.databinding.FragmentExperienceBinding
import kotlinx.android.synthetic.main.fragment_experience.view.*

class ExperienceFragment : Fragment() {
    private var _binding: FragmentExperienceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExperienceBinding.inflate(inflater, container, false)
        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val adapterExperience = ExperienceAdapter()
//        adapterExperience.onItemClicked = { experience ->
//            findNavController().navigate(
//                ExperienceFragmentDirections.actionExperienceFragmentToDetailExperiencesFragment(
//                    experience
//                )
//            )
//        }
//        adapterExperience.setData(ExperienceObject.listData)
//
//        with(binding.rvExperience) {
//            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
//            setHasFixedSize(true)
//            adapter = adapterExperience
//        }
//    }

}