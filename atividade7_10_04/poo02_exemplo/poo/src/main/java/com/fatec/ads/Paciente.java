package com.fatec.ads;

public class Paciente extends Consulta {
    private int codigo;
    private String nome;
    private String email;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) throws Exception {
        if(email==null || email.length()<6 || !email.contains("@")){
            throw new Exception("Email completo Obrigatorio !");
        } else {
            this.email = email;
        }
    }
    public void cadastrar(){
        System.out.println("Cadastro Realizado:");
    }
    @Override
    public void consultar(){
        System.out.println("Consultando consulta: Data " + data + ", Hora " + hora + ", Médico " + 
        (medico != null ? medico.getNome() : "N/A") + ", Paciente " + (paciente != null ? paciente.getNome() : "N/A")
         + ", Motivo: " + motivo + ", Email:" + paciente.getEmail());
    }

    public Paciente(){
        this.codigo=0;
        this.nome="";
        this.email="";
    }
    public Paciente(int pCodigo, String pNome, String pEmail) throws Exception{
        this.codigo = pCodigo;
        setEmail(pEmail);
        this.nome = pNome;
    }
    public void mostrar() {
        var s = "Paciente [getCodigo()=" + getCodigo() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
        System.out.println(s);        
    }

   
   
}
