package br.zero.entidade;

public class Usuario {
	
	protected int Codigo;
	protected String Nome;
	protected String Email;
	
	
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	public String toString() {
		return "pessoa [Codigo=" + Codigo+",Nome=" + Nome +", Email=" + Email +"]";
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result =  prime * result + Codigo;
		result =  prime * result + ((Email == null) ? 0 : Email.hashCode());
		result =  prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		return result;
		
	
		
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if(Codigo != other.Codigo)
			return false;
		if(Email == null) {
			if(other.Email != null)
				return false;
		}else if(!Email.equals(other.Email))
			return false;
		if(Nome == null) {
			if (other.Nome != null)
				return false;
		}else if (!Nome.equals(other.Nome))
			return false;
		return true;
			
		}
	}


