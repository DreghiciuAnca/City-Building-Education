package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.agent.AgentCreatePlace;

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

        if(words[0].equals("create") || words[0].equals("add"))
        {
            System.out.print("o intrat?");
            AgentCreatePlace agentCreatePlace = new AgentCreatePlace(4030);
           //IntentCreatePlace intentCreatePlace = new IntentCreatePlace("127.0.0.1",4030);
            //datele astea trebuie trimise la AgentCreatePlace prin port

            //agentCreatePlace.setVerb(verb);
            //agentCreatePlace.setNoun(noun);

        }
    }







}
