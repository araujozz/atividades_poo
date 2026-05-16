package com.fatec.ads.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fatec.ads.models.Medico;

public class MedicoService {

    private serviceDao _serviceDao;
    private String sqlInserir = "INSERT INTO ";
    public MedicoService(serviceDao dao) {
         _serviceDao = dao;
    }

    public Medico cadastrarMedico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception {
       
     boolean result =  _serviceDao.executeQuery(sqlInserir+"medico VALUES(?, ?, ?, ?, ?);", new String[]{crm, nome, telefone, especialidade, senha});

     if(result){
      return new Medico(nome, crm, telefone, especialidade, senha);
     }else{
        throw new Exception("Erro ao cadastrar medico !");
     }
    }

    public List<Medico> buscarMedicos() throws Exception {
       ResultSet result = _serviceDao.getResult("SELECT * FROM medico;");
        List<Medico> medicos = new ArrayList<>();

      while(result.next()){
        Medico med = new Medico(
            result.getString("nome"),
            result.getString("crm"),
            result.getString("telefone"),
            result.getString("especialidade"),
            result.getString("senha")
        );
        medicos.add(med);
      }

      return medicos;
    }

    public Medico updateMedico(Medico medico) throws Exception {
        boolean result = _serviceDao.executeQuery("UPDATE medico SET nome = ?, telefone = ?, especialidade = ?, senha = ? WHERE crm = ?;", new String[]{medico.getNome(), medico.getTelefone(), medico.getEspecialidade(), medico.getSenha(), medico.getCrm()});
        if(result){
            return medico;
        }else{
            throw new Exception("Erro ao atualizar medico !");
        }
    }

    public Medico buscarMedico(String crm) throws Exception {
        ResultSet result = _serviceDao.getResult("SELECT * FROM medico WHERE crm = ?;", new String[]{crm});
        if(result.next()){
            return new Medico(
                result.getString("nome"),
                result.getString("crm"),
                result.getString("telefone"),
                result.getString("especialidade"),
                result.getString("senha")
            );
        }else{
            throw new Exception("Medico não encontrado !");
        }
    }

    public void deleteMedico(String crm) throws Exception {
        boolean result = _serviceDao.executeQuery("DELETE FROM medico WHERE crm = ?;", new String[]{crm});
        if(!result){
            throw new Exception("Erro ao deletar medico !");
        }

        
    }


}