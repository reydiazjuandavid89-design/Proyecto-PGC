package Main;

import BackEnd.Maestro;
import BackEnd.Capataz;
import FrontEnd.MenuMaestro;
import FrontEnd.Login;
import FrontEnd.MenuCapataz;


public class ProyectoPGC {
  
    
    public static void main(String[] args) {
         
        Login login= new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        String rol;
        
        
       
    }
        
        
        
        public void login( String rol, int usuario, char[] contraseña){
            
            if (rol.equals("Maestro")){
                MenuMaestro menuM= new MenuMaestro();
                menuM.setVisible(true);
                menuM.setLocationRelativeTo(null);
               
               
                       
              
                
            }else{
                if(rol.equals("Capataz")){
                    Capataz capataz= new Capataz();
                    MenuCapataz menuC= new MenuCapataz();
                    
                }
                
                
            }
            
            
            
            
            
            
            
            
        }
        
        
        
      
    
    
}
