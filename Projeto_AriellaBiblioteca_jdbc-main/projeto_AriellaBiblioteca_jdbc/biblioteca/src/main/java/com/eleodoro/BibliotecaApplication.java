package com.eleodoro;

import com.eleodoro.conexao.Conexao;


public class BibliotecaApplication {

	public static void main(String[] args) {
		
		Conexao conexao  = new Conexao();
		conexao.getConexao();


	}

}
