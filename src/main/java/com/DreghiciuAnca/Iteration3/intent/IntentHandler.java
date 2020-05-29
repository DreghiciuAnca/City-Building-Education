package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.agent.AgentCreatePlace;

public class IntentHandler {
    private String intent = "";
    private String noun ="";
    private String verb = "";
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

        if(words[0].equals("create") || words[0].equals("add"))
        {
            System.out.print("o intrat?");
            AgentCreatePlace agentCreatePlace = new AgentCreatePlace();
            agentCreatePlace.setVerb(words[0]);
            agentCreatePlace.setNoun(words[1]);
        }
    }





}
