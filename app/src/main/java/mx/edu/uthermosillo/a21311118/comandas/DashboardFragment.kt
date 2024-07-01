package mx.edu.uthermosillo.a21311118.comandas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import mx.edu.uthermosillo.a21311118.comandas.data.models.Item
import mx.edu.uthermosillo.a21311118.comandas.data.ui.adapters.DashboardAdapter
import mx.edu.uthermosillo.a21311118.comandas.databinding.FragmentDashboardBinding


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
    val dashboardItems = listOf(
        Item.DashboardItem(texto1 = "Pagos", R.drawable.pago),
        Item.DashboardItem(texto1 = "Compras", R.drawable.compra),
        Item.DashboardItem(texto1 = "Saldo", R.drawable.refinanciar),
    )

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            // Obtener la instancia actual de FirebaseUser
            val user: FirebaseUser? = FirebaseAuth.getInstance().currentUser

            // Acceder a la información del usuario
            val userEmail = user?.email
            val userName = user?.displayName
            val userPhotoUrl = user?.photoUrl

            val items = listOf(
                Item.DashboardItem("Compras", R.drawable.compra),
                Item.DashboardItem("Saldo", R.drawable.refinanciar),
                Item.DashboardItem("Pago", R.drawable.pago)
                // Agrega más ítems según necesites
            )

            val adapter = DashboardAdapter(items)
            binding.recyclerview.layoutManager = LinearLayoutManager(context)
            binding.recyclerview.adapter = adapter



            val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter =
                DashboardAdapter(dashboardItems)

            // Establecer la información del usuario en los elementos de la interfaz de usuario
            // Asegúrate de tener TextViews (o cualquier otro elemento de la interfaz de usuario) en tu layout para mostrar esta información
            view.findViewById<TextView>(R.id.user_email).text = userEmail
            view.findViewById<TextView>(R.id.user_name).text = userName
            val imageView = view.findViewById<ImageView>(R.id.user_photo)
            Glide.with(this)
                .load(userPhotoUrl)
                .into(imageView)
/*
            view.findViewById<Button>(R.id.button3).setOnClickListener {
                FirebaseAuth.getInstance().signOut()
                // Aquí puedes navegar de vuelta a la pantalla de inicio de sesión después de desloguearte
                val loginFragment = LoginFragment()
                val intent = Intent(activity, AuthActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }*/
        }


    }
