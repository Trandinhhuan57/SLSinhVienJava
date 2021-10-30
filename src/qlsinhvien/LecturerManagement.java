/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsinhvien;

import Entity.Lecturer;
import java.util.ArrayList;

/**
 *
 * @author NamHV
 */
public class LecturerManagement {
    public static ArrayList<Lecturer> list=new ArrayList<Lecturer>();
    
    public ArrayList<Lecturer> add(Lecturer Lecturer){
        list.add(Lecturer);
        return list;
    }
    
    public void delete(String id){
        ArrayList<Lecturer> result=new ArrayList<Lecturer>();
        for(Lecturer item:list){
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
    
    public ArrayList<Lecturer> update(Lecturer Lecturer){
        Lecturer oldLecturer=new Lecturer();
        for(Lecturer item:list){
            if (item.getId()==Lecturer.getId()) {
                oldLecturer=item;
            }
        }
        list.set(list.indexOf(oldLecturer), Lecturer);
        return list;
    }
    
    public void display(){
        int i=1;
        
        for(Lecturer item:list){
            System.out.println("Lecturer: "+i);
            item.display();
            i++;
        }
    }
    
    public void search(String name){
        ArrayList<Lecturer> result=new ArrayList<Lecturer>();
        for(Lecturer item:list){
            if (item.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(item);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Not found");
        }
        else{
            int i=1;
        for(Lecturer item:result){
                System.out.println("Lecturer: "+i);
                item.display();
                i++;
        }
        }
    }
}
