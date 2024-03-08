package model.entities;

public class Livro implements ItemBiblioteca{
	private Integer id;
	private String titulo;
	private Integer paginas;
	private boolean emprestado;
	private Genero genero;
	
	public Livro(Integer id, String titulo, Integer paginas, boolean emprestado, Genero genero) {
		this.id = id;
		this.titulo = titulo;
		this.paginas = paginas;
		this.emprestado = emprestado;
		this.genero = genero;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return id + " - " + titulo + " - paginas: " + paginas;
	}
	@Override
	public void emprestar() {
		if(!estaEmprestado()) {
			System.out.print("Livro " + titulo + "emprestado com sucesso!");
			emprestado = true;
		}
		else {
			System.out.print("Livro " + titulo + " indisponivel");
		}	
	}
	@Override
	public void devolver() {
		if(estaEmprestado()) {
			System.out.print("Livro " + titulo + " devolvido com sucesso!");
			emprestado = false;
		}
		else {
			System.out.print("Livro " + titulo + " não está emprestado");
		}		
	}
	@Override
	public boolean estaEmprestado() {
		return emprestado;
	}
}
