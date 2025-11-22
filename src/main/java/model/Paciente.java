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
@Table(name = "paciente")
public class Paciente extends Pessoa{
     private String telefone;
    private String email;
    private String planoSaude;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }
    
    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}
