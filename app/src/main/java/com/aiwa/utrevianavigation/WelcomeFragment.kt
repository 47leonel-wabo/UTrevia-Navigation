package com.aiwa.utrevianavigation


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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

        setHasOptionsMenu(true)


        return welcomeBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.option_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
