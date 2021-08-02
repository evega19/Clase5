package com.bedu.clase5

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class reto1Frag1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reto1_frag1, container, false)
        Log.e("Fragment","OnCreateView")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Fragment","OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Fragment","OnCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("Fragment","OnActivityCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("Fragment","OnViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Fragment","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Fragment","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Fragment","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Fragment","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Fragment","OnDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Fragment","OnDetach")
    }
}