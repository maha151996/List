package com.example.list.studentlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.list.R
import com.example.list.Student
import kotlinx.android.synthetic.main.student_item_view.view.*

class StudentAdapter:RecyclerView.Adapter<StudentAdapter.studentViewHolder>() {

    lateinit var globalStudentList:List<Student>
    class studentViewHolder(studentitemview: View) :RecyclerView.ViewHolder(studentitemview)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): studentViewHolder {
//        val view=
//            LayoutInflater.from(parent.context).inflate(R.layout.student_item_view,parent,false)
   val view =LayoutInflater.from(parent.context).inflate(R.layout.student_item_view,parent,false)
   return studentViewHolder(view)
    }

    override fun onBindViewHolder(holder: studentViewHolder, position: Int) {
 val student =globalStudentList[position]
        holder.itemView.studentName.text=student.Name.toString()
        holder.itemView.department.text=student.Department.toString()
        holder.itemView.phoneNumber.text=student.PhoneNO.toString()
    }

    override fun getItemCount(): Int {
       return globalStudentList.size
    }

    fun studentList(studentList: List<Student>) {
        globalStudentList= studentList
    }
}