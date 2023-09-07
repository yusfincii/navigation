package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var home : FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        home = FragmentHomeBinding.inflate(inflater, container, false)


        home.buttonToGame.setOnClickListener {
            // without data send
            /*// 'it' represent the button(view)
            Navigation.findNavController(it).navigate(R.id.home_to_game)*/

            // data adding to action object of transition
            val transition = HomeFragmentDirections.homeToGame().apply {
                name = "yusuf"
                surname = "inci"
                age = 23
                isMarried = false
            }

            // 'it' represent the button(view)
            // transition has action and data
            Navigation.findNavController(it).navigate(transition)
        }

        return home.root
    }
}