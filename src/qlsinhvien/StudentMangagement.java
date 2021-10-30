/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsinhvien;

import Entity.Student;
import java.util.ArrayList;



public class StudentMangagement {
    public static ArrayList<Student> list=new ArrayList<Student>();
    
    public ArrayList<Student> add(Student student){
        list.add(student);
        return list;
    }
    
    public void delete(String id){
        ArrayList<Student> result=new ArrayList<Student>();
        for(Student item:list){
            if (id==item.getId()) {
                result.add(item);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Not found");
        }
        else{
            list.removeAll(result);
        }
    }
    
    public ArrayList<Student> update(Student student){
        Student oldStudent=new Student();
        for(Student item:list){
            if (item.getId()==student.getId()) {
                oldStudent=item;
            }
        }
        list.set(list.indexOf(oldStudent), student);
        return list;
    }
    
    public void display(){
        int i=1;
        
        for(Student item:list){
            System.out.println("Student: "+i);
            item.display();
            i++;
        }
    }
    
    public void search(String name){
        ArrayList<Student> result=new ArrayList<Student>();
        for(Student item:list){
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(item);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Not found");
        }
        else{
            int i=1;
        for(Student item:result){
                System.out.println("Student: "+i);
                item.display();
                i++;
        }
        }
    }
    
}
