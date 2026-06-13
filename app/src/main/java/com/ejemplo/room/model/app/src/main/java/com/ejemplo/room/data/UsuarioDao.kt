package com.ejemplo.room.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ejemplo.room.model.Usuario

@Dao
interface UsuarioDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun agregarUsuario(usuario: Usuario)

    @Query("SELECT * FROM usuarios_table ORDER BY id ASC")
    fun leerTodosLosUsuarios(): List<Usuario>
}
