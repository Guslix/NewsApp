package space.guslix.newsapp.ui.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.guslix.newsapp.R
import space.guslix.newsapp.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private var bind: FragmentDetailsBinding? = null
    private val _bind get() = bind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentDetailsBinding.inflate(layoutInflater, container, false)
        return _bind.root
    }
}