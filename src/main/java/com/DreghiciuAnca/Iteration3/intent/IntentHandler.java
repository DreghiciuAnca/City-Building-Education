package com.DreghiciuAnca.Iteration3.intent;

import com.DreghiciuAnca.Iteration3.agent.AgentCreatePlace;
import com.DreghiciuAnca.Iteration3.agent.AgentDeletePlace;
import com.DreghiciuAnca.Iteration3.dto.DeletePlaceDto;
import com.DreghiciuAnca.Iteration3.dto.PlaceDTO;

import java.io.DataInputStream;
import java.util.regex.*;
import java.net.Socket;

public class IntentHandler {
    private int index =0;

    private Socket socket = null;
    private DataInputStream input = null;
    private PlaceDTO placeDTO= null;
    private DeletePlaceDto placeDeleteDto = null;

    public IntentHandler(int index, PlaceDTO placeDTO)
    {
        this.index = index;
        this.placeDTO = placeDTO;
        splitIntent(this.index);
    }

    public IntentHandler(int index, DeletePlaceDto placeDeleteDto)
    {
        this.index = index;
        this.placeDeleteDto =placeDeleteDto;
        splitIntent(this.index);
    }



    private void splitIntent(int index)
    {
        switch(index)
        {
            case 0:
            {
                AgentCreatePlace agentCreatePlace = new AgentCreatePlace(4030, placeDTO);

                break;
            }
            case 1:
            {
                AgentDeletePlace agentDeletePlace = new AgentDeletePlace( 4000, placeDeleteDto);
                break;
            }
        }

    }







}
