package mx.edu.uthermosillo.a21311118.comandas

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import mx.edu.uthermosillo.a21311118.comandas.databinding.FragmentDashboardBinding
import com.bumptech.glide.Glide
import mx.edu.uthermosillo.a21311118.comandas.data.ui.views.activities.AuthActivity
import mx.edu.uthermosillo.a21311118.comandas.data.ui.views.activities.MainActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {
    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
       
    }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            // Obtener la instancia actual de FirebaseUser
            val user: FirebaseUser? = FirebaseAuth.getInstance().currentUser

            // Acceder a la información del usuario
            val userEmail = user?.email
            val userName = user?.displayName
            val userPhotoUrl = user?.photoUrl

            // Establecer la información del usuario en los elementos de la interfaz de usuario
            // Asegúrate de tener TextViews (o cualquier otro elemento de la interfaz de usuario) en tu layout para mostrar esta información
            view.findViewById<TextView>(R.id.user_email).text = userEmail
            view.findViewById<TextView>(R.id.user_name).text = userName
            val imageView = view.findViewById<ImageView>(R.id.user_photo)
            Glide.with(this)
                .load(userPhotoUrl)
                .into(imageView)

            view.findViewById<Button>(R.id.button3).setOnClickListener {
                FirebaseAuth.getInstance().signOut()
                // Aquí puedes navegar de vuelta a la pantalla de inicio de sesión después de desloguearte
                val loginFragment = LoginFragment()
                val intent = Intent(activity, AuthActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }
        }


    }
