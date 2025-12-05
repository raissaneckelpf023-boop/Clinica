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

   @Enumerated(EnumType.STRING)
@Column(nullable = false)
private Especialidade especialidade;
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

      public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    @Override
    public String toString() {
        return nome;
    }


}
