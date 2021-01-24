package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.Random;

public class Ventana2Controller {

    private Ventana1Controller ventana1Controller; //Variable que contiene lo de la ventana1
    Ventana2Controller ventana2Controller;

    // Botones
    @FXML
    private Button buttonSeguro, buttonArriesgado, buttonMuyArriesg, buttonCancelar, buttonAtacar, buttonCurar;

    // Elementos de los Pokémon
    private Pokemon miPokemon;
    Pokemon pkRival = new Pokemon("Pikachu", "Nv 88", 245,130, new Image("https://assets.stickpng.com/images/580b57fcd9996e24bc43c319.png"), new Image("https://img1.picmix.com/output/stamp/normal/4/8/0/4/1604084_93e2e.gif"));
    @FXML
    private Label nombreRival, nivelRival, nombrePokemon, nivelPokemon, labelTiposAtaque, labelPSRival, labelPSPokemon;
    @FXML
    private ProgressBar progressbarRival, progressbarPokemon;
    @FXML
    private ImageView imageRival, imagePokemon;

    // Saber si mi Pokemon ha ganado la batalla
    private boolean peleaGanada;

    @FXML
    public void initialize() {
        nombreRival.setText(pkRival.nombre);
        nivelRival.setText(pkRival.nivel);
        progressbarRival.setProgress((double)pkRival.vidaRestante/(double)pkRival.vidaTotal);
        imageRival.setImage(pkRival.imagenPelea);
    }

    // Pasar el Pokemon elegido para pelear
    public void enviarMiPokemon(Pokemon pokemon, Ventana1Controller ventana1) {
        ventana1Controller = ventana1;
        miPokemon = pokemon;
        nombrePokemon.setText(pokemon.nombre);
        nivelPokemon.setText(pokemon.nivel);
        progressbarPokemon.setProgress((double)pokemon.vidaRestante/(double)pokemon.vidaTotal);
        imagePokemon.setImage(pokemon.imagenPelea);
    }

    public void clickOnCurar() {
        Random r = new Random();

        if (miPokemon.vidaRestante < miPokemon.vidaTotal) {
            int vidaPokemon = miPokemon.vidaRestante + r.nextInt(75-25+1) + 25;
            miPokemon.vidaRestante = Math.min(vidaPokemon, miPokemon.vidaTotal);
            progressbarPokemon.setProgress((double)miPokemon.vidaRestante/(double)miPokemon.vidaTotal);
            ventana1Controller.recibirPokemon(miPokemon, this);
        }

        if (pkRival.vidaRestante < pkRival.vidaTotal) {
            int vidaRival = pkRival.vidaRestante + r.nextInt(75-25+1) + 25;
            pkRival.vidaRestante = Math.min(vidaRival, pkRival.vidaTotal);
            progressbarRival.setProgress((double)pkRival.vidaRestante/(double)pkRival.vidaTotal);
        }
    }

    public void clickOnAtacar() {
        buttonAtacar.setVisible(false);
        buttonCurar.setVisible(false);
        labelTiposAtaque.setVisible(true);
        buttonSeguro.setVisible(true);
        buttonArriesgado.setVisible(true);
        buttonMuyArriesg.setVisible(true);
        buttonCancelar.setVisible(true);
    }

    // Método para quitar puntos de vida:
    public void ataques(int punto1, int punto2) {
        Random r = new Random();
        int aleatorio = r.nextInt(punto2-punto1+1)+punto1;
        pkRival.vidaRestante = pkRival.vidaRestante - aleatorio;
        progressbarRival.setProgress((double)pkRival.vidaRestante/(double)pkRival.vidaTotal);

        if (pkRival.vidaRestante <= 0) {
            pkRival.vidaRestante = 0;
            peleaGanada = true;
            alertaFinBatalla();
        } else {
            miPokemon.vidaRestante = miPokemon.vidaRestante - aleatorio;
            progressbarPokemon.setProgress((double)miPokemon.vidaRestante/(double)miPokemon.vidaTotal);

            if (miPokemon.vidaRestante <= 0) {
                miPokemon.vidaRestante = 0;
                peleaGanada = false;
                alertaFinBatalla();
            }
            ventana1Controller.recibirPokemon(miPokemon, this);
        }
    }

    public void onClickSeguro() {
        ataques(20, 20);
    }

    public void onClickArriesgado() {
        ataques(10, 25);
    }

    public void onClickMuyArriesgado() {
        ataques(0, 50);
    }

    public void onClickCancelar() {
        buttonAtacar.setVisible(true);
        buttonCurar.setVisible(true);
        labelTiposAtaque.setVisible(false);
        buttonSeguro.setVisible(false);
        buttonArriesgado.setVisible(false);
        buttonMuyArriesg.setVisible(false);
        buttonCancelar.setVisible(false);
    }

    public void alertaFinBatalla() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        //Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();

        if (peleaGanada) {
            alert.setHeaderText("¡GANASTE!");
            alert.setGraphic(new ImageView(miPokemon.imagenPokemon));
        } else {
            alert.setHeaderText(pkRival.nombre + " GANÓ ESTA PELEA :(");
            alert.setGraphic(new ImageView(pkRival.imagenPelea));
        }

        alert.setTitle("Fin de la batalla");
        alert.setContentText("¿Qué desea hacer?");

        ButtonType volver = new ButtonType("Otra partida");
        ButtonType salir = new ButtonType("Salir");

        alert.getButtonTypes().clear();
        alert.getButtonTypes().addAll(volver, salir);

        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == volver){
            buttonCancelar.getScene().getWindow().hide();
        } else {
            System.out.println("Fin del juego.");
            System.exit(0);
        }
    }

    // Pasar ratón sobre la Progress Bar de cada Pokemon:
    public void mostrarVidaPSRival(MouseEvent mouse) {
        labelPSRival.setText(String.valueOf(pkRival.vidaRestante));
    }
    public void mostrarPSRival(MouseEvent mouse) {
        labelPSRival.setText("PS");
    }
    public void mostrarVidaPSPokemon(MouseEvent mouse) {
        labelPSPokemon.setText(String.valueOf(miPokemon.vidaRestante));
    }
    public void mostrarPSPokemon(MouseEvent mouse) {
        labelPSPokemon.setText("PS");
    }

    // Pasar info desde ventana2 a ventana1
    public void setVentana1(Ventana1Controller ventana1){
        ventana1Controller = ventana1;
    }

}
