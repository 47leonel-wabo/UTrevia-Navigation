package com.aiwa.utrevianavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.aiwa.utrevianavigation.databinding.FragmentWelcomeBinding

/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Binding
        val welcomeBinding:FragmentWelcomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome,
            container, false)

        //Performing action on the view
        welcomeBinding.startNavigate.setOnClickListener {

            //alternative way//Navigation.findNavController(it).navigate(R.id.action_welcomeFragment_to_firstQuestionFragment)
            it.findNavController().navigate(R.id.action_welcomeFragment_to_firstQuestionFragment)
        }

        return welcomeBinding.root
    }


}
