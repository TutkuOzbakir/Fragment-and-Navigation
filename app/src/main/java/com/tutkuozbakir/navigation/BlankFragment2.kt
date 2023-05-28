package com.tutkuozbakir.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class BlankFragment2 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            var username = BlankFragment2Args.fromBundle(it).age
        }

        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val action = BlankFragment2Directions.actionBlankFragment2ToBlankFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}