package com.mycompany.maquinacoxa;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ArthurSilva
 */
public class Controller {
    
    @FXML
    TextField valor;
    Maquina coxinha;
    
      @FXML
    private void initialize(){
        coxinha = new Maquina(); 
        valor.setText(String.valueOf(coxinha.getCoxinha()));
    }
  @FXML
    private void adicionar(){
        coxinha.adicionar();
        valor.setText(String.valueOf(coxinha.getCoxinha()));
    }
    
    
    @FXML
    private void retirar(){
        if(coxinha.getCoxinha() == 0){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não há coxinhas para retirar");
            alert.show();
            return; 
        }
        coxinha.retirar();
        valor.setText(String.valueOf(coxinha.getCoxinha()));
    }
    
    
    @FXML
    private void zerar(){
       coxinha.zerar();
        valor.setText(String.valueOf(coxinha.getCoxinha()));
    }   
}
