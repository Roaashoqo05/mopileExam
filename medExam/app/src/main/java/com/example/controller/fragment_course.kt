
package com.example.controller
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mvcdemo.R

class CourseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_course, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val courseName = arguments?.getString("name") ?: ""
        val courseDesc = arguments?.getString("description") ?: ""
        val courseDuration = arguments?.getString("duration") ?: ""

        view.findViewById<TextView>(R.id.courseName).text = courseName
        view.findViewById<TextView>(R.id.courseDescription).text = courseDesc
        view.findViewById<TextView>(R.id.courseDuration).text = courseDuration
    }
}
