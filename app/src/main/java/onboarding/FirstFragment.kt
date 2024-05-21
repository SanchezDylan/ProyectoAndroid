package onboarding

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.edu.uthermosillo.a21311118.comandas.R


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val customColor = Color.rgb(234, 226, 183)
        val window = requireActivity().window // Get the window instance
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = customColor
        val view: View = inflater.inflate(R.layout.fragment_first, container, false);


        return view;

    }

}