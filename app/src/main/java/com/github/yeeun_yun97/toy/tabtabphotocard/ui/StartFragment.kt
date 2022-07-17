package com.github.yeeun_yun97.toy.tabtabphotocard.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.github.yeeun_yun97.toy.tabtabphotocard.R

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_start,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button2)
       val navController = NavHostFragment.findNavController(this)
        button.setOnClickListener {
            navController.navigate(R.id.action_startFragment_to_pickPhotoFragment)
        }

    }

}