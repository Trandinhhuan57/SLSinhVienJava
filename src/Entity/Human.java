/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import java.time.LocalDate;
/**
 *
 * @author NamHV
 */
public class Human {
    private String name;
    private LocalDate doB;
    private String email;
    private String address;

    public Human(){
        
    }
    
    public Human(String name, LocalDate doB, String email, String address){
        this.name=name;
        this.doB=doB;
        this.email=email;
        this.address=address;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the doB
     */
    public LocalDate getDoB() {
        return doB;
    }

    /**
     * @param doB the doB to set
     */
    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Date of Birth: "+getDoB());
        System.out.println("Email: "+getEmail());
        System.out.println("Address: "+getAddress());
    }
}
