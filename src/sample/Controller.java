package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Controller {

    // Pokemon 1
    @FXML
    private VBox vbox1;
    @FXML
    private Label label1Nombre;
    @FXML
    private Label label1Nivel;
    @FXML
    private Label label1Vida;

    // Pokemon 2
    @FXML
    private VBox vbox2;
    @FXML
    private Label label2Nombre;
    @FXML
    private Label label2Nivel;
    @FXML
    private Label label2Vida;

    // Pokemon 3
    @FXML
    private VBox vbox3;
    @FXML
    private Label label3Nombre;
    @FXML
    private Label label3Nivel;
    @FXML
    private Label label3Vida;

    // Pokemon 4
    @FXML
    private VBox vbox4;
    @FXML
    private Label label4Nombre;
    @FXML
    private Label label4Nivel;
    @FXML
    private Label label4Vida;

    // Pokemon 5
    @FXML
    private VBox vbox5;
    @FXML
    private Label label5Nombre;
    @FXML
    private Label label5Nivel;
    @FXML
    private Label label5Vida;

    // Pokemon 6
    @FXML
    private VBox vbox6;
    @FXML
    private Label label6Nombre;
    @FXML
    private Label label6Nivel;
    @FXML
    private Label label6Vida;

    // Botón Siguiente
    @FXML
    private Button botonNext;
    @FXML
    private Button botonExit;

    // GridPane General:
    @FXML
    private GridPane gridPane;

    // Valores de cada Pokémon:
    @FXML
    public void initialize() {
        // Pokemon 1
        Pokemon pokemon1 = new Pokemon("Jolteon", "Nv 65", "204/204");
        label1Nombre.setText(pokemon1.nombre);
        label1Nivel.setText(pokemon1.nivel);
        label1Vida.setText(pokemon1.vida);

        // Pokemon 2
        Pokemon pokemon2 = new Pokemon("Charizard", "Nv 45", "100/148");
        label2Nombre.setText(pokemon2.nombre);
        label2Nivel.setText(pokemon2.nivel);
        label2Vida.setText(pokemon2.vida);

        // Pokemon 3
        Pokemon pokemon3 = new Pokemon("Vaporeon", "Nv 54", "200/234");
        label3Nombre.setText(pokemon3.nombre);
        label3Nivel.setText(pokemon3.nivel);
        label3Vida.setText(pokemon3.vida);

        // Pokemon 4
        Pokemon pokemon4 = new Pokemon("Blastoise", "Nv 65", "90/222");
        label4Nombre.setText(pokemon4.nombre);
        label4Nivel.setText(pokemon4.nivel);
        label4Vida.setText(pokemon4.vida);

        // Pokemon 5
        Pokemon pokemon5 = new Pokemon("Mewtwo", "Nv 75", "208/298");
        label5Nombre.setText(pokemon5.nombre);
        label5Nivel.setText(pokemon5.nivel);
        label5Vida.setText(pokemon5.vida);

        // Pokemon 6
        Pokemon pokemon6 = new Pokemon("Butterfree", "Nv 54", "155/160");
        label6Nombre.setText(pokemon6.nombre);
        label6Nivel.setText(pokemon6.nivel);
        label6Vida.setText(pokemon6.vida);

        // Botones de Salir y Siguiente
        botonExit.setText("Salir");
        botonNext.setText("Siguiente");
        botonExit.setDisable(false);
        botonNext.setDisable(true);
    }

    // Elección de Pokémon
    @FXML
    public void pokemonSelected(VBox vbox, Label nombre, Label nivel, Label vida) {
        vbox.setStyle("-fx-background-color: #F5A9F2; -fx-border-color: #DF01D7; -fx-border-width: 2");
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        botonNext.setDisable(false);
        botonExit.setDisable(false);
    }

    // Volver a los valores iniciales cuando ningún Pokémon esté seleccionado
    @FXML
    public void pokemonNoSelected(VBox vbox, Label nombre, Label nivel, Label vida) {
        vbox.setStyle("-fx-background-color:  #BE81F7; -fx-border-color:  #4B088A; -fx-border-width: 2");
        nombre.setTextFill(Color.WHITE);
        nivel.setTextFill(Color.WHITE);
        vida.setTextFill(Color.WHITE);
        botonExit.setDisable(false);
        botonNext.setDisable(true);
    }

    // Cambiar color de fondo al pulsar Siguiente para comprobar que el botón funciona
    @FXML
    public void onClickNext() {
        gridPane.setStyle("-fx-background-color: #74DF00");
    }

    // Volver a los valores iniciales al pulsar en Salir
    @FXML
    public void onClickExit() {
        gridPane.setStyle("-fx-background-color:  #BE81F7");
        pokemonNoSelected(vbox1, label1Nombre, label1Nivel, label1Vida);
        pokemonNoSelected(vbox2, label2Nombre, label2Nivel, label2Vida);
        pokemonNoSelected(vbox3, label3Nombre, label3Nivel, label3Vida);
        pokemonNoSelected(vbox4, label4Nombre, label4Nivel, label4Vida);
        pokemonNoSelected(vbox5, label5Nombre, label5Nivel, label5Vida);
        pokemonNoSelected(vbox6, label6Nombre, label6Nivel, label6Vida);
    }

    // Elegir Pokémon:
    @FXML
    public void onClickPokemon1(){
        pokemonSelected(vbox1, label1Nombre, label1Nivel, label1Vida);
    }
    @FXML
    public void onClickPokemon2(){
        pokemonSelected(vbox2, label2Nombre, label2Nivel, label2Vida);
    }
    @FXML
    public void onClickPokemon3(){
        pokemonSelected(vbox3, label3Nombre, label3Nivel, label3Vida);
    }
    @FXML
    public void onClickPokemon4(){
        pokemonSelected(vbox4, label4Nombre, label4Nivel, label4Vida);
    }
    @FXML
    public void onClickPokemon5(){
        pokemonSelected(vbox5, label5Nombre, label5Nivel, label5Vida);
    }
    @FXML
    public void onClickPokemon6(){
        pokemonSelected(vbox6, label6Nombre, label6Nivel, label6Vida);
    }
}
