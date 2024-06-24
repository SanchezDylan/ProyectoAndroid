package onboarding

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import mx.edu.uthermosillo.a21311118.comandas.R
import mx.edu.uthermosillo.a21311118.comandas.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {

        val customColor = Color.rgb(234, 226, 183)
        val window = requireActivity().window // Get the window instance
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = customColor

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root


    }

}