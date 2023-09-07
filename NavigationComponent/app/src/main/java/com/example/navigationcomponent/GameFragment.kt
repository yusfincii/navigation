package com.example.navigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    private lateinit var game : FragmentGameBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        game = FragmentGameBinding.inflate(inflater, container, false)

        // this object hold data which come from Home fragment
        val bundle:GameFragmentArgs by navArgs()

        val name = bundle.name
        val surname = bundle.surname
        val age = bundle.age
        val isMarried = bundle.isMarried

        Log.e("yusuf", name)
        Log.e("yusuf", surname)
        Log.e("yusuf", age.toString())
        Log.e("yusuf", isMarried.toString())

        game.buttonToResult.setOnClickListener {
            // 'it' represent the button(view)
            Navigation.findNavController(it).navigate(R.id.game_to_result)

        }

        return game.root
    }
}