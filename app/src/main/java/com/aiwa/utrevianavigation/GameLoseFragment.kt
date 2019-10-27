package com.aiwa.utrevianavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.aiwa.utrevianavigation.databinding.FragmentGameLoseBinding

/**
 * A simple [Fragment] subclass.
 */
class GameLoseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val loseBinding:FragmentGameLoseBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_game_lose,
            container,
            false
        )

        loseBinding.playAgainButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_gameLoseFragment_to_firstQuestionFragment)
        }

        return loseBinding.root
}


}
