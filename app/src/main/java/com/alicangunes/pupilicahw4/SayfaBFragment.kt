package com.alicangunes.pupilicahw4
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alicangunes.pupilicahw4.R


class SayfaBFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sayfa_b, container, false)

        view.findViewById<Button>(R.id.git_y_button).setOnClickListener {
            findNavController().navigate(R.id.action_sayfaB_to_sayfaY)
        }

        return view
    }
}