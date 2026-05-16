package com.fatec.ads.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fatec.ads.models.Recepcionista;

public class recepcionistaService {

    private serviceDao _serviceDao;

    public recepcionistaService( serviceDao dao) {
        _serviceDao = dao;

    }

    public Recepcionista cadastrarRecepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        boolean result = _serviceDao.executeQuery("INSERT INTO recepcionista VALUES(?, ?, ?, ?);", new String[]{nome, cpf, telefone, senha});
        if(result){
            return new Recepcionista(nome, cpf, telefone, senha);
        }else{
            throw new Exception("Erro ao cadastrar recepcionista !");
        }
    }

    public Recepcionista updateRecepcionista(Recepcionista recepcionista) throws Exception {
        boolean result = _serviceDao.executeQuery("UPDATE recepcionista SET nome = ?, telefone = ?, senha = ? WHERE cpf = ?;", new String[]{recepcionista.getNome(), recepcionista.getTelefone(), recepcionista.getSenha(), recepcionista.getCpf()});
        if(result){
            return recepcionista;
        }else{
            throw new Exception("Erro ao atualizar recepcionista !");
        }
    }

    public List<Recepcionista> buscarRecepcionistas() throws Exception {
        ResultSet result = _serviceDao.getResult("SELECT * FROM recepcionista;");
         List<Recepcionista> recepcionistas = new ArrayList<>();
 
       while(result.next()){
        Recepcionista rec = new Recepcionista(
             result.getString("nome"),
             result.getString("cpf"),
             result.getString("telefone"),
             result.getString("senha")
         );
         recepcionistas.add(rec);
       }
 
       return recepcionistas;
     }

    public Recepcionista buscarRecepcionista(String cpf) throws Exception {
        ResultSet result = _serviceDao.getResult("SELECT * FROM recepcionista WHERE cpf = ?;", new String[]{cpf});
        if(result.next()){
            return new Recepcionista(
                result.getString("nome"),
                result.getString("cpf"),
                result.getString("telefone"),
                result.getString("senha")
            );
        }else{
            throw new Exception("Recepcionista não encontrado !");
        }
    }

    public void deleteRecepcionista(String cpf) throws Exception {
        boolean result = _serviceDao.executeQuery("DELETE FROM recepcionista WHERE cpf = ?;", new String[]{cpf});
        if(!result){
            throw new Exception("Erro ao deletar recepcionista !");
        }
    }
}
