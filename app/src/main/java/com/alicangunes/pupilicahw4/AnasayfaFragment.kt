package com.alicangunes.pupilicahw4
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alicangunes.pupilicahw4.R

class AnasayfaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        view.findViewById<Button>(R.id.git_a_button).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfa_to_sayfaA)
        }

        view.findViewById<Button>(R.id.git_x_button).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfa_to_sayfaX)
        }

        return view
    }
}