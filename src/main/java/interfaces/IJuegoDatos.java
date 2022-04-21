package main.java.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.modelo.Juego;

public interface IJuegoDatos {

	public boolean anadir_juego(Juego juego);

	public ArrayList<Juego> listar_juegos_genero_plataforma();

	public ArrayList<Juego> listar_todos_juegos();

	public ArrayList<Juego> cargar_datos(String ruta_fichero);

	public Juego crear_juego(Scanner sc);

}
