package com.aiwa.utrevianavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.aiwa.utrevianavigation.databinding.FragmentGameWinBinding

/**
 * A simple [Fragment] subclass.
 */
class GameWinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val gameWinBinding:FragmentGameWinBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_game_win,
            container, false
        )
        // Inflate the layout for this fragment
        return gameWinBinding.root
    }


}
