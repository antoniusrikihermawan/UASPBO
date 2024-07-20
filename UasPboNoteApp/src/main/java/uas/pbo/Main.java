/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.pbo;

import uas.noteapp.NoteApp;

/**
 *
 * @author DKID
 */
public class Main {
    public static void main(String[] args) {
        NoteApp noteapp = new NoteApp("notes.db");
        noteapp.start();
    }
}
