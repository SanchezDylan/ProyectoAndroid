package onboarding

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.edu.uthermosillo.a21311118.comandas.R
import mx.edu.uthermosillo.a21311118.comandas.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
private var _binding: FragmentSecondBinding? = null
private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
          _binding = FragmentSecondBinding.inflate(inflater, container, false)
          return binding.root
    }


}