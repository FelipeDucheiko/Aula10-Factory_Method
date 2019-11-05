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
public class Teste {
    
    public static void main(String[] args) {
	MySQLConexaoFactory mySQL = new MySQLConexaoFactory();
        Conexao conexaoMySQL = mySQL.obterConexao();
        conexaoMySQL.setDriver("mySql");
        conexaoMySQL.setUsuario("Felipe");
        conexaoMySQL.setSenha("123321");
        conexaoMySQL.setUrl("mySql");
        conexaoMySQL.conectar();
        conexaoMySQL.desconectar();
        
        OracleConexaoFactory oracle = new OracleConexaoFactory();
        Conexao conexaoOracle = oracle.obterConexao();
        conexaoOracle.setDriver("oracle");
        conexaoOracle.setUsuario("João");
        conexaoOracle.setSenha("202020");
        conexaoOracle.setUrl("oracle");
        conexaoOracle.conectar();
        conexaoOracle.desconectar();
    }
    
}
