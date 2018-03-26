/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.HashMap;

/**
 *
 * @author Romy
 */
public class Client {
    private String _id;
    private String _prenom;
    private String _nom;
    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;
    private String _mail;
    //private HashMap<Integer, String> hmap ;
    
    public void setId (String i){
        this._id =i ;
    }
    
    public String getId (){
        return _id;
    }
    
    public void setPrenom (String p){
        this._prenom =p ;
    }
    
    public String getPrenom (){
        return _prenom;
    }
    
    public void setNom (String n){
        this._nom = n ;
    }
    
    public String getNom(){
        return _nom;
    }
    
    public void setTelephone (String t){
        this._telephone = t ;
    }
    
    public String getTelephone (){
        return _telephone;
    }
    
    public void setRue (String r){
        this._rue = r ;
    }
    
    public String getRue (){
        return _rue;
    }
    
    public void setVille (String v){
        this._ville = v ;
    }

    public String getVille (){
        return _ville;
    }
    
    public void setEtat (String e){
        this._etat = e;
    }
    
    public String getEtat (){
        return _etat;
    }
    
    public void setCode (String c){
        this._code = c ;
    }
    
    public String getCode (){
        return _code;
    }
    
    public void setPays (String p){
        this._pays =p ;
    }
    
    public String getPays (){
        return _pays;
    }
    
    public void setMail (String m){
        this._mail =m ;
    }
    
    public String getMail (){
        return _mail;
    }
    
        public String toString()
    {
        return this._id + "\n " + this._prenom + "\n " + this._nom + "\n " + this._telephone + "\n " + this._rue + "\n " + this._ville + "\n " + 
                this._etat + "\n " + this._code + "\n " + this._pays + "\n " + this._mail;
    }
    
      private Client (ClientBuilder builder){
        this._id = builder._id;
        this._prenom = builder._prenom;
        this._nom = builder._nom;
        this._telephone = builder._telephone;
        this._rue = builder._rue;
        this._ville = builder._ville;
        this._etat = builder._etat;
        this._code = builder._code;
        this._pays = builder._pays;
        this._mail = builder._mail;
    }
 
     public static class ClientBuilder
    {
        private final String _id;
        private final String _prenom;
        private final String _nom;
        private final String _telephone;
        private final String _rue;
        private final String _ville;
        private final String _etat;
        private final String _code;
        private final String _pays;
        private final String _mail;
        
        public ClientBuilder(String id, String prenom, String nom, String telephone, String rue, String ville, String etat, String code, String pays, String mail)
        {
            this._id = id;
            this._prenom = prenom;
            this._nom = nom;
            this._telephone = telephone;
            this._rue = rue;
            this._ville = ville;
            this._etat = etat;
            this._code = code;
            this._pays = pays;
            this._mail = mail;
        }
        
        public Client build()
        {
            return new Client(this);
        }
        
        public static void insert(HashMap hm, Client c)
        {
            hm.put(c.getId(), c);
        }
        
        public static Client find(HashMap hm, Client c)
        {
            return (Client)hm.get(c.getId());
        }
        
        public static void remove(HashMap hm, Client c)
        {
            hm.remove(c.getId());
        }
        
        public static void update(HashMap hm, Client c, Client updatedc)
        {
            hm.put(c.getId(), updatedc);
        }
    }
  
  
    
}
