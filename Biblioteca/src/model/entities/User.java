package model.entities;

public interface User {
	void registrarItemEmprestado(ItemBiblioteca item);
	void registrarItemDevolvido(ItemBiblioteca item);
	void verificarHistoricoEmprestimos();
}
