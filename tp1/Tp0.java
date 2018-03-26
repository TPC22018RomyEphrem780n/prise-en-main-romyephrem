/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import tp1.Client.ClientBuilder;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Romy
 */
public class Tp0 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
     
        HashMap<String, Client> hashmap = new HashMap<String, Client>();

        // Create 2 Clients Romy and Richard
        Client romy = new Client.ClientBuilder("1", "Romy", "Ephrem", "03222444", "bouar", 
                "safra", "keserwan", "961", "Liban", "blabla@hotmail.com").build();
        Client richard = new Client.ClientBuilder("2", "Richard", "Antonios", "03666888",
                "ghazir", "jounieh", "keserwan", "961", "Liban", "bobobo@hotmail.com").build();
        
        // Insert Clients Romy and Richard 
        ClientBuilder.insert(hashmap, romy);
        ClientBuilder.insert(hashmap, richard);
        
        // Find Clients Romy and Richard by their Ids
        Client newRomy = ClientBuilder.find(hashmap, romy);
        Client newRichard = ClientBuilder.find(hashmap, richard);
        
        System.out.println(newRomy.toString());
        System.out.println();
        System.out.println(newRichard.toString());
        
        // Remove Client Richard
        ClientBuilder.remove(hashmap, richard);
        // Check to see if Client Richard still exists in the hashmap
        Client oldRichard = ClientBuilder.find(hashmap, newRichard);
        
        try
        {
            System.out.println(oldRichard.toString());
        }catch(Exception e){
            System.out.println();
            System.out.println("Richard not Found!\nIt has been removed!");
        }

        // Update Client Romy with other Values
        Client rita = new Client.ClientBuilder("3", "Rita", "Ephrem", 
                "03444888", "ghazir", "jounieh", "keserwan", "961", "Liban", "borori@hotmail.com").build();
        
        ClientBuilder.update(hashmap, romy, rita);
        
        // We still give the id of Client Romy because the update method only updates the data and not the key
        Client newRita = ClientBuilder.find(hashmap, romy);
        
        System.out.println();
        System.out.println(newRita.toString());
        
    }  
        
    }
    

