package fr.miage.agents.api.message.relationclientsupermarche;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Message envoyé en réponse d'un Message de type DemandeDistance
 * 
 * @author kangoula
 */
public class ResultatDistance extends Message{
    
    // la distance entre le client et le supermarché
    public double distance;
    // le délai de livraison en fonction de cette distance
    public int delai;
    
    public ResultatDistance() {
        super(TypeMessage.ResultatDistance);
    }
    
}