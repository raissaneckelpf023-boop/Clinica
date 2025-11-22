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
@Table(name = "profissional")
@Inheritance(strategy = InheritanceType.JOINED)
public class Profissional extends Pessoa{
     @Column(nullable = false, unique = true)
    protected String registro;

    protected String especialidade;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString() {
        return "Profissional{" + "id=" + id + ", nome='" + nome + '\'' + ", registro='" + registro + '\'' + '}';
    }

}
