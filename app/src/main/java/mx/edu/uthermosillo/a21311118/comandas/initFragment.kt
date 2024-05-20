package mx.edu.uthermosillo.a21311118.comandas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import mx.edu.uthermosillo.a21311118.comandas.adapter.OnboardingAdapter
import onboarding.FirstFragment
import onboarding.SecondFragment
import onboarding.ThirdFragment


class initFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_init, container, false);
        val viewPager2 = view.findViewById<ViewPager2>(R.id.OnBoardingViewPaper)
        val fragmentList = arrayListOf<Fragment>(

            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
            )
        val adapter = OnboardingAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter
        return view;
    }

}