package com.example.app_hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)
        var courseList = listOf<Course>(
            Course("1", "Hardware Electronics", "20012", "Barre", "Fusion 360 induction")
            Course("2", "Python","100023", "Mwai", "OOP")



        )
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        rvCourses.adapter = CourseAdapter(courseList)
    }
}