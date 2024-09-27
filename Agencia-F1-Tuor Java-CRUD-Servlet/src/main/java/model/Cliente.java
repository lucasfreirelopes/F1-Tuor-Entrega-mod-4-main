package model;

public class Cliente {
	
	private long idCLIENTE; 
	private String nomeCLIENTE;
	private String endereçoCLEINTE;
	private String numeroCPF;
	private String numeroTELEFONE; 
    private String enderecoEMAIL;
	public long getIdCLIENTE() {
		return idCLIENTE;
	}
	public void setIdCLIENTE(long idCLIENTE) {
		this.idCLIENTE = idCLIENTE;
	}
	public String getNomeCLIENTE() {
		return nomeCLIENTE;
	}
	public void setNomeCLIENTE(String nomeCLIENTE) {
		this.nomeCLIENTE = nomeCLIENTE;
	}
	public String getNumeroRG() {
		return numeroRG;
	}
	public void setEnderecoCLIENTE	(String EnderecoCLIENTE) {
		this.EnderecoCLIENTE = EnderecoCLIENTE;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNumeroTELEFONE() {
		return numeroTELEFONE;
	}
	public void setNumeroTELEFONE(String numeroTELEFONE) {
		this.numeroTELEFONE = numeroTELEFONE;
	}
	public String getEnderecoEMAIL() {
		return enderecoEMAIL;
	}
	public void setEnderecoEMAIL(String enderecoEMAIL) {
		this.enderecoEMAIL = enderecoEMAIL;
	}
	@Override
	public String toString() {
		return "Cliente [idCLIENTE=" + idCLIENTE + ", nomeCLIENTE=" + nomeCLIENTE + ", EnderecoCLIENTE=" + numeroRG
				+ ", numeroCPF=" + numeroCPF + ", numeroTELEFONE=" + numeroTELEFONE + ", enderecoEMAIL=" + enderecoEMAIL
				+ "]";
	}
    
}



