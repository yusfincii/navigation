package com.example.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawer.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var first : FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View?
    {
        first = FragmentFirstBinding.inflate(inflater, container, false)
        return first.root
    }

}