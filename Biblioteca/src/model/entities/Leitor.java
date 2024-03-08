package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Leitor implements User{
	private Integer id;
	private String name;
	private List<ItemBiblioteca> historico = new ArrayList<ItemBiblioteca>();
	
	public Leitor(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ItemBiblioteca> getHistorico() {
		return historico;
	}
	
	@Override
	public void registrarItemEmprestado(ItemBiblioteca item) {
		System.out.print("Livro emprestado para o usuario " + name);
		historico.add(item);
	}
	@Override
	public void registrarItemDevolvido(ItemBiblioteca item) {
		System.out.print("Livro devolvido pelo usuario " + name);	
		historico.remove(item);
	}
	@Override
	public void verificarHistoricoEmprestimos() {
		System.out.println("Historico de emprestimos para o usuario " + name + ": ");
		for(ItemBiblioteca item : historico) {
			System.out.println(item);
		}
	}
}
