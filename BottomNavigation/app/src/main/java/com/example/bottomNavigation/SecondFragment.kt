package com.example.bottomNavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomNavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var second : FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        second = FragmentSecondBinding.inflate(inflater, container, false)
        return second.root
    }
}