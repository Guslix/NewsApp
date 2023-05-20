package space.guslix.newsapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.guslix.newsapp.R
import space.guslix.newsapp.databinding.FragmentFavoriteBinding
import space.guslix.newsapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var bind: FragmentMainBinding? = null
    private val _bind get() = bind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentMainBinding.inflate(layoutInflater, container, false)
        return _bind.root
    }
}