package mx.edu.uthermosillo.a21311118.comandas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import mx.edu.uthermosillo.a21311118.comandas.data.ui.adapters.OnboardingAdapter
import mx.edu.uthermosillo.a21311118.comandas.databinding.FragmentInitBinding
import onboarding.FirstFragment
import onboarding.SecondFragment
import onboarding.ThirdFragment

class initFragment : Fragment() {

    private var _binding: FragmentInitBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
_binding = FragmentInitBinding.inflate(inflater, container, false)
        val view: View = inflater.inflate(R.layout.fragment_init, container, false);
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        val viewPager2 = binding.OnBoardingViewPaper
        val fragmentList = arrayListOf<Fragment>(

            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
            LoginFragment()
            )
        val adapter = OnboardingAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter
        return binding.root
    }

}