package org.d3if4052.praassest1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4052.praassest1.databinding.FragmentSegitigaBinding


/**
 * A simple [Fragment] subclass.
 */
class Segitiga: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<org.d3if4052.praassest1.databinding.FragmentSegitigaBinding>(
            inflater,
            R.layout.fragment_segitiga,
            container,
            false)

        binding.btnHitung.setOnClickListener{
            var als = binding.inpAlas.text.toString().toDouble()
            var tg = binding.inpTg.text.toString().toDouble()

            var luas = (als*tg)/2
            binding.hasilLuas.setText(luas.toString())

            var kll = (als+tg+als)
            binding.hasilKll.setText(kll.toString())
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

