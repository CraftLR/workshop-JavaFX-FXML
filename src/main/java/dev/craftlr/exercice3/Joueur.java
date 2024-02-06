package dev.craftlr.exercice3;

import javafx.beans.property.IntegerProperty;
import javafx.scene.image.Image;

public class Joueur {
    public static final Joueur NOIR = new Joueur("assets/noirgrand.png");
    public static final Joueur BLANC = new Joueur("assets/blancgrand.png");
    public static final Joueur PERSONNE = new Joueur("assets/vide.png");

    private Image image;
    private IntegerProperty score;

    Joueur(String fileName) {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public static void initialiserScores() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    private void initialiserScore() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public IntegerProperty scoreProperty() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public int getScore() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    private void setScore(int score) {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public void decrementerScore() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public void incrementerScore() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public Image getImage() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }

    public Joueur suivant() {
        throw new UnsupportedOperationException("Not yet implemented !");
    }
}
