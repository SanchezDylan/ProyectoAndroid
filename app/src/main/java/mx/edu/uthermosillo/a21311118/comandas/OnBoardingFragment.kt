package mx.edu.uthermosillo.a21311118.comandas

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import mx.edu.uthermosillo.a21311118.comandas.databinding.FragmentOnBoardingBinding


class OnBoardingFragment : Fragment() {

private var _binding: FragmentOnBoardingBinding? = null
private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.R)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root

    }


}