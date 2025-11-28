/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raissa
 */
import javax.persistence.*;

@Entity
@Table(name = "funcionario")

public class Funcionario extends Pessoa{
      @Column(nullable = false, length = 40)
    private String cargo; 

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
      
      
}
