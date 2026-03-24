package org.example;

import java.io.*;
import java.util.ArrayList;

public class TXTParser implements Parser{
    @Override
    public Mission parse(File file) throws IOException {

        Mission myMission = new Mission();
        Curse myCurse = new Curse();
        ArrayList<Sorcerer> sorcerers = new ArrayList<>();
        ArrayList<Technique> techniques = new ArrayList<>();
        int sorcerer_amount = 0;
        int technique_amount = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        ArrayList<String> myList = new ArrayList<>();

        String tmp = bufferedReader.readLine();

        while (tmp != null)
        {
            if (!tmp.isEmpty())
            {
                myList.add(tmp);
            }
            tmp = bufferedReader.readLine();
        }

        for (String i : myList)
        {
            if (i.startsWith("technique")) technique_amount++;
            if (i.startsWith("sorcerer")) sorcerer_amount++;

            String result = i.substring(i.indexOf(":")+2);
            switch (i.substring(0, i.indexOf(":")))
            {
                case "missionId" : myMission.setMissionId(result); break;
                case "date" : myMission.setDate(result); break;
                case "location" : myMission.setLocation(result); break;
                case "outcome" : myMission.setOutcome(result); break;
                case "damageCost" : myMission.setDamageCost(Integer.parseInt(result)); break;
                case "note" : myMission.setComment(result); break;

                case "curse.name" : myCurse.setName(result); break;
                case "curse.threatLevel" : myCurse.setThreatLevel(result); break;
            }
        }

        for (int j = 0; j < sorcerer_amount/2; j++) sorcerers.add(new Sorcerer());
        for (int j = 0; j < technique_amount/4; j++) techniques.add(new Technique());

        for (String i : myList)
        {
            if (i.startsWith("technique"))
            {
                int number = Integer.parseInt(i.substring(i.indexOf("[")+1, i.indexOf("]")));
                String type = i.substring(i.indexOf(".")+1, i.indexOf(":"));
                String result = i.substring(i.indexOf(":")+2);

                switch (type)
                {
                    case "name" : techniques.get(number).setName(result); break;
                    case "type" : techniques.get(number).setType(result); break;
                    case "owner" : techniques.get(number).setOwner(result); break;
                    case "damage" : techniques.get(number).setDamage(Integer.parseInt(result)); break;
                }
            }

            else if (i.startsWith("sorcerer"))
            {
                int number = Integer.parseInt(i.substring(i.indexOf("[")+1, i.indexOf("]")));
                String result = i.substring(i.indexOf(":")+2);
                String type = i.substring(i.indexOf(".")+1, i.indexOf(":"));

                switch (type)
                {
                    case "name" : sorcerers.get(number).setName(result); break;
                    case "rank" : sorcerers.get(number).setRank(result); break;
                }
            }
        }

        myMission.setCurse(myCurse);
        myMission.setSorcerers(sorcerers);
        myMission.setTechniques(techniques);
        return myMission;
    }

}
