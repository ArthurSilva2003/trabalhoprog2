package com.mycompany.maquinacoxa;

public class Maquina {
    
    private Integer coxinha; 
    
    
    public Maquina(){
        coxinha = 0; 
    }
    
    
    public void adicionar(){
        coxinha++;
    }
    
    
    public void retirar(){
        if (coxinha > 0){
            coxinha--;
        }        
    }
    
    public void zerar ()
    {
        coxinha=0;
    }
    
    public Integer getCoxinha(){
        return coxinha; 
    }
    
    
}