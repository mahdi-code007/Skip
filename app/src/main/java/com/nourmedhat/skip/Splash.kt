package com.nourmedhat.skip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.nourmedhat.skip.databinding.FragmentSplashBinding


class Splash : Fragment() {

    lateinit var binding: FragmentSplashBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSplashBinding.inflate(inflater)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        binding.btnNext .setOnClickListener{
            navController.navigate (R.id.action_splash_to_login)
          //  Toast.makeText(getContext(), "ffefeef", Toast.LENGTH_SHORT).show()
        }
    }

}