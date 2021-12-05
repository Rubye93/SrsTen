package com.example.srsten

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class PageOne : Fragment() {

    lateinit var fragOneTextView: TextView
    lateinit var fragOneButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.page_one_fragment, container, false)

        fragOneTextView=view.findViewById(R.id.frag_one_text)
        fragOneButton=view.findViewById(R.id.frag_one_but)

        return view
    }
}

