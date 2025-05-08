package com.alicangunes.pupilicahw4
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alicangunes.pupilicahw4.R

class SayfaAFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sayfa_a, container, false)

        view.findViewById<Button>(R.id.git_b_button).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaA_to_sayfaB)
        }

        return view
    }
}