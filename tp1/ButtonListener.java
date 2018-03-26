/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.HashMap;
import tp1.Client.ClientBuilder;

/**
 *
 * @author Romy 
 */
public class ButtonListener implements IButtonListener{
    
    HashMap<String, Client> hashmap = new HashMap<String, Client>();
    
    @Override
    public void OnClickCreate(Client client){
        ClientBuilder.insert(hashmap, client);
        System.out.println(hashmap.toString());
    }
    
}
