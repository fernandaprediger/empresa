/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Empresa {
private Integer codigo;
private String nomef;
private String razaos;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public String getRazaos() {
        return razaos;
    }

    public void setRazaos(String razaos) {
        this.razaos = razaos;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nomef=" + nomef + '}';
    }

}
