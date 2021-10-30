package com.example.list.studentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.list.R
import com.example.list.Student
import kotlinx.android.synthetic.main.activity_student_list.*

class StudentListActivity : AppCompatActivity() {
     var studentadapter= StudentAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        getStudentList()

        studentListRecyclerView.apply{
           layoutManager=LinearLayoutManager(this@StudentListActivity,LinearLayoutManager.VERTICAL,false)
            adapter=studentadapter
        }
        
    }

    private fun getStudentList(): List<Student> {
        val List= arrayListOf<Student>()
        List.add(Student("Ali","03456789","Computer Science"))
        List.add(Student("Raza","0345456789","Information Texh"))
        List.add(Student("Ahmed","034456789","Bio-texh"))
        List.add(Student("Nimra","03987689","finance"))
        List.add(Student("Sadia","23456789","English"))
        List.add(Student("MAha","03434567","Sociology"))
        List.add(Student("moazma","3456789","MAths"))
        List.add(Student("Awais","034534567","Urdu"))
        List.add(Student("USman","3456789","Coputer Engineering"))
        List.add(Student("Umer","04567567","Software Engineering"))
        List.add(Student("USama","234567569","Physics"))

        //returning our list
        studentadapter.studentList(List)
        return List
    }
}