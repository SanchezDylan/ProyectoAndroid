package mx.edu.uthermosillo.a21311118.comandas

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment


class OnBoardingFragment : Fragment() {



    @RequiresApi(Build.VERSION_CODES.R)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val customBlue = Color.argb(255, 0, 0, 255)
        val view: View = inflater.inflate(R.layout.fragment_on_boarding, container, false);
        val window = requireActivity().window // Get the window instance
        window.statusBarColor = customBlue
        window.navigationBarColor = Color.RED



        return view;
    }


}