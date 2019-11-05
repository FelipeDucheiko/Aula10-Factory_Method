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
public class MySQLConexaoFactory extends ConexaoFactory {

    @Override
    public Conexao obterConexao() {
        return new ConexaoMySQL();
    }
    
}
