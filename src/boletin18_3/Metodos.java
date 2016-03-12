/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_3;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Metodos {
    int numAlumnos= Integer.parseInt(JOptionPane.showInputDialog("cuantos alumnos?"));
    int[]notas = new int[numAlumnos];
    String[]nomesAlumnos = new String[numAlumnos];
    
   
    
    
    public void cargarArray(){
    for(int i=0;i<notas.length;i++){
      /*  notas[i] = pedirNotas();
        nomesAlumnos[i]= pedirAlumno();*/
        
      nomesAlumnos[i]= JOptionPane.showInputDialog("nome");
      notas[i]= Integer.parseInt(JOptionPane.showInputDialog("nota"));
        
      }}
    public void visualizarArray(){
     for(int i=0;i<notas.length;i++){
         System.out.print(nomesAlumnos[i]+ "   "+notas[i]+ "\n");
         
          }}
    public void visualizarNotaAlumno(String consultaNota){
         consultaNota = JOptionPane.showInputDialog("de que alumno quere saber a nota?");
        for(int i=0;i<notas.length;i++){
         if(consultaNota.equalsIgnoreCase(nomesAlumnos[i])){  
          System.out.println(nomesAlumnos[i]+" ten un: "+notas[i]);
         }}
         }
    public void visualizarAprobados(){
         for(int i=0;i<notas.length;i++)
           if(notas[i]>=5) 
               System.out.println(nomesAlumnos[i]+" aprobou cun "+notas[i]);
    
   }
    public void listaOrdenada(){
        System.out.println("notas ordenadas");
        int aux;
        String aux2;
     for(int i=0;i<notas.length-1;i++){
         for(int m=i+1;m<notas.length;m++){
             if(notas[i]>notas[m]){
                 aux = notas[i];
                 notas[i] = notas[m];
                 notas[m]= aux;
                 
                 aux2 =nomesAlumnos[i];
                 nomesAlumnos[i]=nomesAlumnos[m];
                 nomesAlumnos[m]=aux2;
                 
         }}
     }
    }
    
}
