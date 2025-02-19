package com.example.nemo_autofis.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nemo_autofis.databinding.FragmentAboutBinding
import com.example.nemo_autofis.fullscreen_image


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class About : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflating the layout for this fragment
        binding = FragmentAboutBinding.inflate(layoutInflater)

        binding.sarthakLinkedinBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/sarthak-t-y-a-g-i/")
            startActivity(intent)
        }
        binding.sarthakLinkedinLogo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/sarthak-t-y-a-g-i/")
            startActivity(intent)
        }
        binding.sarthakPic.setOnClickListener {
            val intent = Intent(context, fullscreen_image::class.java)
            // Passing the image resource ID or URI to the new activity
            intent.putExtra(
                "imageResId",
                "https://firebasestorage.googleapis.com/v0/b/nemo-app-c188b.appspot.com/o/Profile_photos%2Fsarthak.png?alt=media&token=4ef76d26-1073-4554-b88d-8798e59375bd"
            )
            startActivity(intent)
        }

        binding.manvendraLinkedinBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/manvendrasingh1407/")
            startActivity(intent)
        }
        binding.manvendraLinkedinLogo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/manvendrasingh1407/")
            startActivity(intent)
        }
        binding.manvendraPic.setOnClickListener {
            val intent = Intent(context, fullscreen_image::class.java)
            // Passing the image resource ID or URI to the new activity
            intent.putExtra(
                "imageResId",
                "https://firebasestorage.googleapis.com/v0/b/nemo-app-c188b.appspot.com/o/Profile_photos%2Fmanvendra.jpg?alt=media&token=eca04fce-1ee7-4f78-bc6c-ae5d1a8c66d0"
            )
            startActivity(intent)
        }

        binding.princeLinkedinBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/prince-yadav-075346239/")
            startActivity(intent)
        }
        binding.princeLinkedinLogo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/prince-yadav-075346239/")
            startActivity(intent)
        }
        binding.princePic.setOnClickListener {
            val intent = Intent(context, fullscreen_image::class.java)
            // Passing the image resource ID or URI to the new activity
            intent.putExtra(
                "imageResId",
                "https://firebasestorage.googleapis.com/v0/b/nemo-app-c188b.appspot.com/o/Profile_photos%2Fprince.png?alt=media&token=509c55fb-6bfb-40ca-9782-3563560706f3"
            )
            startActivity(intent)
        }

        binding.uditLinkedinBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/udit-sharma-a61b4b256/")
            startActivity(intent)
        }
        binding.uditLinkedinLogo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/udit-sharma-a61b4b256/")
            startActivity(intent)
        }
        binding.uditPic.setOnClickListener {
            val intent = Intent(context, fullscreen_image::class.java)
            // Passing the image resource ID or URI to the new activity
            intent.putExtra(
                "imageResId",
                "https://firebasestorage.googleapis.com/v0/b/nemo-app-c188b.appspot.com/o/Profile_photos%2Fprofile%20pic.jpeg?alt=media&token=197db3cc-37c7-4e30-a050-2a30b656a200"
            )
            startActivity(intent)
        }


        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment About.
         */

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            About().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}