package com.example.listausarios;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.listausarios.data.db.ListaUsuariosOpenHelper;
import com.example.listausarios.data.db.repository.UsuarioRepository;
import com.example.listausarios.data.pojo.Usuario;
import com.example.listausarios.utils.MyContext;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MyContext(this);

        ArrayList<Usuario> usuarios = UsuarioRepository.getInstance().getUsuarios();

        Toast.makeText(this,usuarios.get(0).getNombre(), Toast.LENGTH_LONG).show();
    }
}
