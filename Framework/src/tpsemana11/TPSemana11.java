/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsemana11;

/**
 *
 * @author MauricioAsenjo
 */
public class TPSemana11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro umlivro = new Livro();

        MyDAL.geraTabela(umlivro);
        
        umlivro.setTitulo("Um titulo qualquer");
        umlivro.setAutor("Qualquer um");
        umlivro.setEditora("Uma editora qualquer");
        umlivro.setAno("2017");
        umlivro.setLocalizacao("Santos/SP");
        MyDAL.delete(umlivro);
    }
    
}
