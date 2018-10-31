package org.codedocs.codedocsapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [calander.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [calander.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class calander : Fragment() {
    var mView:View?=null
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       mView=inflater.inflate(R.layout.fragment_calander, container, false)
        return mView
    }

    // TODO: Rename method, update argument and hook method into UI event
   
   

  
   
}
