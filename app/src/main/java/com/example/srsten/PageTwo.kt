package com.example.srsten

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class PageTwo : Fragment() {

    lateinit var fragTwoTextView: TextView
    lateinit var fragTwoButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.page_two_fragment, container, false)

        fragTwoTextView=view.findViewById(R.id.frag_two_text)
        fragTwoButton=view.findViewById(R.id.frag_two_but)

        return view
    }
}