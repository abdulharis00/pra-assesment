package org.d3if4052.praassest1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import org.d3if4052.praassest1.databinding.FragmentPersegiPanjangBinding
/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjang : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<org.d3if4052.praassest1.databinding.FragmentPersegiPanjangBinding>(
            inflater,
            R.layout.fragment_persegi_panjang,
            container,
            false)

        binding.btnHitung.setOnClickListener{
            var pjg = binding.inpPj.text.toString().toInt()
            var lbr = binding.inpLb.text.toString().toInt()

            var luas = pjg*lbr
            binding.hasilLuas.setText(luas.toString())

            var kll = (pjg+lbr)*2
            binding.hasilKll.setText(kll.toString())
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

