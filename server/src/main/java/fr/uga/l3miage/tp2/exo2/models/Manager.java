package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
public class Manager extends Employe{
    String niveauGestion;
}