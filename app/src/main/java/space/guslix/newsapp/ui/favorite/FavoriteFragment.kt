package space.guslix.newsapp.ui.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.guslix.newsapp.R
import space.guslix.newsapp.databinding.FragmentDetailsBinding
import space.guslix.newsapp.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {
    private var bind: FragmentFavoriteBinding? = null
    private val _bind get() = bind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentFavoriteBinding.inflate(layoutInflater, container, false)
        return _bind.root
    }
}