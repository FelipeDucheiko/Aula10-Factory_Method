/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.factory.method;

/**
 *
 * @author felip
 */
public class ConexaoMySQL extends Conexao {
    
    
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados MySQL com o usuário " + getUsuario());
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando ao banco de dados MySQL com o usuário " + getUsuario());
    }
    
}
