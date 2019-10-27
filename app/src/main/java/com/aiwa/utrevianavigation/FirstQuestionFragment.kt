package com.aiwa.utrevianavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.aiwa.utrevianavigation.databinding.FragmentFirstQuestionBinding

/**
 * A simple [Fragment] subclass.
 */
class FirstQuestionFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val firstQuestionBinding:FragmentFirstQuestionBinding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_first_question, container, false)

        var goodResp = false

        firstQuestionBinding.ansRadioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when(i){
                R.id.firstAns-> goodResp = false
                R.id.secondAns-> goodResp = true
                R.id.thirdAns-> goodResp = false
            }
        }

        firstQuestionBinding.moveNext.setOnClickListener {
            if (goodResp){
                it.findNavController().navigate(R.id.action_firstQuestionFragment_to_gameWinFragment)
            }else{
                it.findNavController().navigate(R.id.action_firstQuestionFragment_to_gameLoseFragment2)
            }
        }

        return firstQuestionBinding.root
    }


}
