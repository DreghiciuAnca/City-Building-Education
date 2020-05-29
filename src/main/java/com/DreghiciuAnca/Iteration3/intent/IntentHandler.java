package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.agent.AgentCreatePlace;
import com.DreghiciuAnca.Iteration3.agent.AgentDeletePlace;

import java.io.DataInputStream;
import java.util.regex.*;
import java.net.Socket;

public class IntentHandler {
    private int index =0;

    private Socket socket = null;
    private DataInputStream input = null;

    public IntentHandler(int index)
    {
        this.index = index;
        splitIntent(this.index);
    }

    private void splitIntent(int index)
    {
        switch(index)
        {
            case 0:
            {
                AgentCreatePlace agentCreatePlace = new AgentCreatePlace(4030);
                break;
            }
            case 1:
            {
                AgentDeletePlace agentDeletePlace = new AgentDeletePlace( 4000);
                break;
            }
        }

    }







}
