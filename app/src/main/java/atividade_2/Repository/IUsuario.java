package atividade_2.Repository;

import atividade_2.models.Usuario;

public  interface IUsuario<T extends  Usuario>{
    public  boolean acessar(T usuario);
    public boolean desconectar(T usuario);
}
