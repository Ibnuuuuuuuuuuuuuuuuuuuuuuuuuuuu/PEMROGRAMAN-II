package soal1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    private void acakNilai() {
        Random rand = new Random();
        this.nilai = rand.nextInt(6) + 1; 
    }

    public int getNilai() {
        return nilai;
    }
}


