package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Ventana1Controller {

    // Pokemon 1
    @FXML
    private VBox vbox1;
    @FXML
    private Label label1Nombre;
    @FXML
    private Label label1Nivel;
    @FXML
    private Label label1Vida;
    @FXML
    private ProgressBar progressbar1;
    @FXML
    private ImageView image1;

    // Pokemon 2
    @FXML
    private VBox vbox2;
    @FXML
    private Label label2Nombre;
    @FXML
    private Label label2Nivel;
    @FXML
    private Label label2Vida;
    @FXML
    private ProgressBar progressbar2;
    @FXML
    private ImageView image2;

    // Pokemon 3
    @FXML
    private VBox vbox3;
    @FXML
    private Label label3Nombre;
    @FXML
    private Label label3Nivel;
    @FXML
    private Label label3Vida;
    @FXML
    private ProgressBar progressbar3;
    @FXML
    private ImageView image3;

    // Pokemon 4
    @FXML
    private VBox vbox4;
    @FXML
    private Label label4Nombre;
    @FXML
    private Label label4Nivel;
    @FXML
    private Label label4Vida;
    @FXML
    private ProgressBar progressbar4;
    @FXML
    private ImageView image4;

    // Pokemon 5
    @FXML
    private VBox vbox5;
    @FXML
    private Label label5Nombre;
    @FXML
    private Label label5Nivel;
    @FXML
    private Label label5Vida;
    @FXML
    private ProgressBar progressbar5;
    @FXML
    private ImageView image5;

    // Pokemon 6
    @FXML
    private VBox vbox6;
    @FXML
    private Label label6Nombre;
    @FXML
    private Label label6Nivel;
    @FXML
    private Label label6Vida;
    @FXML
    private ProgressBar progressbar6;
    @FXML
    private ImageView image6;

    // Botón Siguiente
    @FXML
    private Button botonNext;
    @FXML
    private Button botonExit;

    // GridPane General:
    @FXML
    private GridPane gridPane;

    // Valores de cada Pokémon:
    Pokemon pokemon1 = new Pokemon("Jolteon", "Nv 65", 204,204, new Image("https://static.pokemonpets.com/images/monsters-images-300-300/135-Jolteon.png"), new Image("https://images.wikidexcdn.net/mwuploads/wikidex/thumb/0/01/latest/20200103223919/Jolteon_EpEc.gif/180px-Jolteon_EpEc.gif"));
    Pokemon pokemon2 = new Pokemon("Charizard", "Nv 45", 148,100, new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/006_f3.png"), new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b0bf2c51-e6f9-40ed-add6-0e5b2d7eb4f1/d7hx9rp-ce803f1b-14c8-49ac-bc8a-3caf2c6a5d8c.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvYjBiZjJjNTEtZTZmOS00MGVkLWFkZDYtMGU1YjJkN2ViNGYxXC9kN2h4OXJwLWNlODAzZjFiLTE0YzgtNDlhYy1iYzhhLTNjYWYyYzZhNWQ4Yy5naWYifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.DmtwEltLzjvFzT3j4za2Z4eBfcm0ByiSoKc1mI8UGtY"));
    Pokemon pokemon3 = new Pokemon("Vaporeon", "Nv 54", 234, 200, new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/detail/134.png"), new Image("https://pa1.narvii.com/6681/08568a867bfecc001b24726b1bd569d0ec6a247b_hq.gif"));
    Pokemon pokemon4 = new Pokemon("Blastoise", "Nv 65", 222, 90, new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png"),new Image("https://images.wikidexcdn.net/mwuploads/wikidex/b/b9/latest/20101105204655/Blastoise_espalda_G5.gif"));
    Pokemon pokemon5 = new Pokemon("Mewtwo", "Nv 75", 298, 200, new Image("https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png"), new Image("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/216b6183-21e2-45bb-acb1-cb7473d8bf32/dcf2dd1-f95b27cd-82d3-4652-b525-364e67c8df69.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvMjE2YjYxODMtMjFlMi00NWJiLWFjYjEtY2I3NDczZDhiZjMyXC9kY2YyZGQxLWY5NWIyN2NkLTgyZDMtNDY1Mi1iNTI1LTM2NGU2N2M4ZGY2OS5naWYifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.VIbiXLqXGApUmBRndD_bacrywkC8pqs-lNAGM0BKh2c"));
    Pokemon pokemon6 = new Pokemon("Butterfree", "Nv 54", 160, 155, new Image("https://static.wikia.nocookie.net/dreampkmn/images/f/f7/Butterfree_DW.png/revision/latest/scale-to-width-down/340?cb=20130318014733&path-prefix=es"), new Image("https://static.wikia.nocookie.net/espokemon/images/e/ee/Butterfree_espalda_G6.gif/revision/latest?cb=20190812073558"));
    // Pokemon para pasar a la ventana de pelea:
    Pokemon miPokemon;

    @FXML
    public void initialize() {
        // Pokemon 1
        label1Nombre.setText(pokemon1.nombre);
        label1Nivel.setText(pokemon1.nivel);
        label1Vida.setText(pokemon1.vidaRestante + "/" + pokemon1.vidaTotal);
        progressbar1.setProgress((double)pokemon1.vidaRestante/(double)pokemon1.vidaTotal);
        image1.setImage(pokemon1.imagenPokemon);

        // Pokemon 2
        label2Nombre.setText(pokemon2.nombre);
        label2Nivel.setText(pokemon2.nivel);
        label2Vida.setText(pokemon2.vidaRestante + "/" + pokemon2.vidaTotal);
        progressbar2.setProgress((double)pokemon2.vidaRestante/(double)pokemon2.vidaTotal);
        image2.setImage(pokemon2.imagenPokemon);

        // Pokemon 3
        label3Nombre.setText(pokemon3.nombre);
        label3Nivel.setText(pokemon3.nivel);
        label3Vida.setText(pokemon3.vidaRestante + "/" + pokemon3.vidaTotal);
        progressbar3.setProgress((double)pokemon3.vidaRestante/(double)pokemon3.vidaTotal);
        image3.setImage(pokemon3.imagenPokemon);

        // Pokemon 4
        label4Nombre.setText(pokemon4.nombre);
        label4Nivel.setText(pokemon4.nivel);
        label4Vida.setText(pokemon4.vidaRestante + "/" + pokemon4.vidaTotal);
        progressbar4.setProgress((double)pokemon4.vidaRestante/(double)pokemon4.vidaTotal);
        image4.setImage(pokemon4.imagenPokemon);

        // Pokemon 5
        label5Nombre.setText(pokemon5.nombre);
        label5Nivel.setText(pokemon5.nivel);
        label5Vida.setText(pokemon5.vidaRestante + "/" + pokemon5.vidaTotal);
        progressbar5.setProgress((double)pokemon5.vidaRestante/(double)pokemon5.vidaTotal);
        image5.setImage(pokemon5.imagenPokemon);

        // Pokemon 6
        label6Nombre.setText(pokemon6.nombre);
        label6Nivel.setText(pokemon6.nivel);
        label6Vida.setText(pokemon6.vidaRestante + "/" + pokemon6.vidaTotal);
        progressbar6.setProgress((double)pokemon6.vidaRestante/(double)pokemon6.vidaTotal);
        image6.setImage(pokemon6.imagenPokemon);

        // Botones de Salir y Siguiente
        botonExit.setText("Quitar selección");
        botonNext.setText("Siguiente");
        botonExit.setDisable(false);
        botonNext.setDisable(true);
    }

    // Elección de Pokémon
    public void pokemonSelected(VBox vbox, Label nombre, Label nivel, Label vida) {
        vbox.setStyle("-fx-background-color: #F5A9F2; -fx-border-color: #DF01D7; -fx-border-width: 2");
        nombre.setTextFill(Color.BLACK);
        nivel.setTextFill(Color.BLACK);
        vida.setTextFill(Color.BLACK);
        botonNext.setDisable(false);
        botonExit.setDisable(false);
    }

    // Volver a los valores iniciales cuando ningún Pokémon esté seleccionado
    public void pokemonNoSelected(VBox vbox, Label nombre, Label nivel, Label vida) {
        vbox.setStyle("-fx-background-color:  #BE81F7; -fx-border-color:  #4B088A; -fx-border-width: 2");
        nombre.setTextFill(Color.WHITE);
        nivel.setTextFill(Color.WHITE);
        vida.setTextFill(Color.WHITE);
        botonExit.setDisable(false);
        botonNext.setDisable(true);
    }

    public void quitarSelected() {
        pokemonNoSelected(vbox1, label1Nombre, label1Nivel, label1Vida);
        pokemonNoSelected(vbox2, label2Nombre, label2Nivel, label2Vida);
        pokemonNoSelected(vbox3, label3Nombre, label3Nivel, label3Vida);
        pokemonNoSelected(vbox4, label4Nombre, label4Nivel, label4Vida);
        pokemonNoSelected(vbox5, label5Nombre, label5Nivel, label5Vida);
        pokemonNoSelected(vbox6, label6Nombre, label6Nivel, label6Vida);
    }

    // Volver a los valores iniciales al pulsar en Salir
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
        quitarSelected();
        if (pokemon1.vidaRestante == 0) {
            pokemonNoSelected(vbox1, label1Nombre, label1Nivel, label1Vida);
        } else {
            pokemonSelected(vbox1, label1Nombre, label1Nivel, label1Vida);
            miPokemon = pokemon1;
        }
    }
    @FXML
    public void onClickPokemon2(){
        quitarSelected();
        if (pokemon2.vidaRestante == 0) {
            pokemonNoSelected(vbox2, label2Nombre, label2Nivel, label2Vida);
        } else {
            pokemonSelected(vbox2, label2Nombre, label2Nivel, label2Vida);
            miPokemon = pokemon2;
        }
    }
    @FXML
    public void onClickPokemon3(){
        quitarSelected();
        if (pokemon3.vidaRestante == 0) {
            pokemonNoSelected(vbox3, label3Nombre, label3Nivel, label3Vida);
        } else {
            pokemonSelected(vbox3, label3Nombre, label3Nivel, label3Vida);
            miPokemon = pokemon3;
        }
    }
    @FXML
    public void onClickPokemon4(){
        quitarSelected();
        if (pokemon4.vidaRestante == 0) {
            pokemonNoSelected(vbox4, label4Nombre, label4Nivel, label4Vida);
        } else {
            pokemonSelected(vbox4, label4Nombre, label4Nivel, label4Vida);
            miPokemon = pokemon4;
        }
    }
    @FXML
    public void onClickPokemon5(){
        quitarSelected();
        if (pokemon5.vidaRestante == 0) {
            pokemonNoSelected(vbox5, label5Nombre, label5Nivel, label5Vida);
        } else {
            pokemonSelected(vbox5, label5Nombre, label5Nivel, label5Vida);
            miPokemon = pokemon5;
        }
    }
    @FXML
    public void onClickPokemon6(){
        quitarSelected();
        if (pokemon6.vidaRestante == 0) {
            pokemonNoSelected(vbox6, label6Nombre, label6Nivel, label6Vida);
        } else {
            pokemonSelected(vbox6, label6Nombre, label6Nivel, label6Vida);
            miPokemon = pokemon6;
        }
    }

    // NUEVA VENTANA
    @FXML
    private void onButtonNextClicked(MouseEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
            GridPane root = (GridPane) loader.load();
            Scene scene = new Scene(root,650,450);
            stage.setScene(scene);
            // Oculta los botones de cerrar/minimizar/maximizar
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            Ventana2Controller controller = loader.getController();
            controller.enviarMiPokemon(miPokemon,this);
            controller.setVentana1(this);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Cambiar los datos del Pokemon en la ventana1 después de la batalla
    Ventana2Controller ventana2Controller;
    public void recibirPokemon(Pokemon pokemon, Ventana2Controller ventana2) {
        ventana2Controller = ventana2;
        miPokemon = pokemon;

        switch (pokemon.nombre) {
            case "Jolteon" : {
                label1Vida.setText(String.valueOf(pokemon.vidaRestante));
                progressbar1.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
            }
            break;
            case "Charizard" : {
                label2Vida.setText(String.valueOf(pokemon.vidaRestante));
                progressbar2.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
            }
            break;
            case "Vaporeon" : {
                label3Vida.setText(String.valueOf(pokemon.vidaRestante));
                progressbar3.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
            }
            break;
            case "Blastoise" : {
                label4Vida.setText(String.valueOf(pokemon.vidaRestante));
                progressbar4.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
            }
            break;
            case "Mewtwo" : {
                label5Vida.setText(String.valueOf(pokemon.vidaRestante));
                progressbar5.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
            }
            break;
            case "Butterfree" : {
                label6Vida.setText(String.valueOf(pokemon.vidaRestante));
                progressbar6.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
            }
            break;
        }
    }
}
