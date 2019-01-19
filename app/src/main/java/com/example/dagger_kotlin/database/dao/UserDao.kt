package com.example.dagger_kotlin.database.dao

import android.arch.persistence.room.*
import com.example.dagger_kotlin.database.entity.User

@Dao
interface UserDao {

    @Query("select * from User")
    fun listarUsuario(): List<User>

    //valida si el usuario existe y devuelve el usuario
    @Query("select * from User where name = :name and password = :pass")
    fun userLogin(name:String,pass:String):User

    //trae usuario segun id ingresado
    @Query("select * from User where id = :id")
    fun verDetalleUsuarioLogeado(id : Long ): User

    @Query("select * from User where name = :nameuser")
    fun verUsuarioSegunNombre(nameuser : String)

    //inserta un usuario y devuelve el id generado
    @Insert
    fun insert(usuarios: User): Long

    //inserta lista de usuario
    @Insert
    fun isertarListaUsurios (listaUser : ArrayList<User>): Array<Long>

    //borra el usuario ingresado
    @Delete
    fun deleteUser(usuarios: User):Int

    @Update
    fun updateUser(usuarios: User)
}