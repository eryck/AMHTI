package com.projetos.amhtiApp.Controller;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Classe responsável pela cofiguração
 * e conexão do Firebase
 */
public class ConfiguracaoFirebase {
    private static DatabaseReference referenciaFireBase;
    private static FirebaseAuth autenticacao;

    //Metodo que retorna a referencia ao firebase
    public static DatabaseReference getFirebase(){
        if(referenciaFireBase == null){
            referenciaFireBase = FirebaseDatabase.getInstance().getReference();
        }
        return referenciaFireBase;
    }

    //Metodo que retorna a referencia da autencicação de usuário
    public static FirebaseAuth getFirebaseAutenticacao(){
        if(autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }
}
