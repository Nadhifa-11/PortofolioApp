package com.nadhifa.portofolioapp.ui.experience

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import com.nadhifa.portofolioapp.R
import com.nadhifa.portofolioapp.databinding.FragmentDetailExperienceBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailExperienceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailExperienceFragment : Fragment() {
    private var _binding: FragmentDetailExperienceBinding? = null
    private val binding get() = _binding!!
//    private val experienceArgs by navArgs<DetailExperiencesFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailExperienceBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        with(binding) {
//            tvTitleName.text = experienceArgs.experience.title
//            tvContentDetailExperiences.text = experienceArgs.experience.detail
//            ivDetailProfile.load(experienceArgs.experience.image){
//                crossfade(2000)
//            }
//        }
    }

}