package com.akirachix.myblogs

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myblogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBlogs.layoutManager = LinearLayoutManager(this)
        displayBlogs()

    }

    fun displayBlogs(){
        val blog1 = Blogs("Raziah Mohamed","Publishing date: 08-06-2024","Why Steve Jobs did not let his kids use iPads","If our current addictions to our iPhones and other tech is any indication, we may be setting up our children for incomplete, handicapped lives devoid of imagination, creativity and wonder when we hook them onto technology at an early age.")
        val blog2 = Blogs("Mercy Chemtai","Publishing date: 12-10-2023","Why Successful People Wear The Same Thing Every Day","Simply put, clothes can tell us a lot about sociology. Yet, at the same time, we've arguably become an excessively materialistic and superficial society. Undoubtedly, there are greater things to worry about than clothes.")
        val blog3 = Blogs("Aline Mutesi","Publishing date: 11-04-2024","Why Steve Jobs did not let his kids use iPads","I had wrongly assumed that having a four-year degree would get me through the door at any company. If it had been 1980 instead of 2010, that might have been the case. But I had graduated from an antiquated system")
        val blog4 = Blogs("Raziah Mohamed","Publishing date: 08-06-2024","What I Learned From Being a Broke, Unemployed Graduate","If our current addictions to our iPhones and other tech is any indication, we may be setting up our children for incomplete, handicapped lives devoid of imagination, creativity and wonder when we hook them onto technology at an early age.")
        val blog5 = Blogs("Raziah Mohamed","Publishing date: 08-06-2024","Why Steve Jobs did not let his kids use iPads","If our current addictions to our iPhones and other tech is any indication, we may be setting up our children for incomplete, handicapped lives devoid of imagination, creativity and wonder when we hook them onto technology at an early age.")
        val blog6 = Blogs("Raziah Mohamed","Publishing date: 08-06-2024","Why Steve Jobs did not let his kids use iPads","If our current addictions to our iPhones and other tech is any indication, we may be setting up our children for incomplete, handicapped lives devoid of imagination, creativity and wonder when we hook them onto technology at an early age.")
        val blog7 = Blogs("Raziah Mohamed","Publishing date: 08-06-2024","Why Steve Jobs did not let his kids use iPads","If our current addictions to our iPhones and other tech is any indication, we may be setting up our children for incomplete, handicapped lives devoid of imagination, creativity and wonder when we hook them onto technology at an early age.")
        val blog8 = Blogs("Raziah Mohamed","Publishing date: 08-06-2024","Why Steve Jobs did not let his kids use iPads","If our current addictions to our iPhones and other tech is any indication, we may be setting up our children for incomplete, handicapped lives devoid of imagination, creativity and wonder when we hook them onto technology at an early age.")
        val myblogs = listOf(blog1,blog2,blog3,blog4,blog5,blog6,blog7,blog8)

        val blogsAdapter = BlogsAdapter(myblogs)
        binding.rvBlogs.adapter= blogsAdapter

    }
}