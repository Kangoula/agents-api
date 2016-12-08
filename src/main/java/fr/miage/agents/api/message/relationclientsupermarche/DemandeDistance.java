package fr.miage.agents.api.message.relationclientsupermarche;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Demande envoyée à un agent Supermarché par un agent Client pour connaitre la distance les séparants
 * Le message de réponse est un ResultatDistance
 * 
 * @author kangoula
 */
public class DemandeDistance extends Message {
    
    public DemandeDistance() {
        super(TypeMessage.DemandeDistance);
    }
    
}
