package com.example.android.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding
import com.example.android.navigation.R.layout as layout1


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class TitelFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
               R.layout.fragment_title, container, false )
        binding.playButton.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_titelFragment_to_gameFragment)

        }
        return binding.root

    }


}
