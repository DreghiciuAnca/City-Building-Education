package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.agent.AgentCreatePlace;
import com.DreghiciuAnca.Iteration3.agent.AgentDeletePlace;

import java.io.DataInputStream;
import java.net.Socket;

public class IntentHandler {
    private String intent = "";
    private String noun ="";
    private String verb = "";

    private Socket socket = null;
    private DataInputStream input = null;

    public IntentHandler(String intent)
    {
        this.intent = intent;
        splitIntent(this.intent);
    }

    public String getIntent()
    {
        return this.intent;
    }
    private void splitIntent(String intent)
    {
        String[] words =null;
        words = intent.split(" ");
        for(String i : words)
            System.out.print(i);

        this.verb= words[0];
        this.noun = words[1];

        if(verb.equals("create") && noun.equals("place"))
        {

            AgentCreatePlace agentCreatePlace = new AgentCreatePlace(4030);
        }
        if(verb.equals("delete") && noun.equals("place") || noun.equals("building"))
        {
            AgentDeletePlace agentDeletePlace = new AgentDeletePlace( 4000);
        }
    }







}
