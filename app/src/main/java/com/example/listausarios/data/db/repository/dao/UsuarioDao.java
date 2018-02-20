package com.example.listausarios.data.db.repository.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.listausarios.data.db.ListaUsuariosContract;
import com.example.listausarios.data.db.ListaUsuariosOpenHelper;
import com.example.listausarios.data.pojo.Usuario;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mamorky on 20/02/18.
 */

public class UsuarioDao {
    public ArrayList<Usuario> getAll(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        SQLiteDatabase db = ListaUsuariosOpenHelper.getInstance().openDatabase();

        Cursor cursor = db.query(ListaUsuariosContract.usuario_entries.TABLE_NAME,ListaUsuariosContract.usuario_entries.ALL_COLUMNS,null,null,null,null,null);

        if(cursor.moveToFirst()){
            do {
                Usuario usuario = new Usuario(cursor.getInt(0),cursor.getString(1),cursor.getString(2),new Date(cursor.getString(3)));
                usuarios.add(usuario);
            }while(cursor.moveToNext());
        }
        ListaUsuariosOpenHelper.getInstance().closeDatabase();

        return usuarios;
    }
}
