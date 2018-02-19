package com.dashboard.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dashboard.web.model.ServerStat;

@Service
public class StatService {
    private static List<ServerStat> stats = new ArrayList<ServerStat>();
    private static int todoCount = 3;
    private static int numEntries = 100;
    static {
      for (int i = 0; i < numEntries; i+=2) {
        stats.add(new ServerStat("i", "Down"));
        stats.add(new ServerStat("i+1", "Up"));
      }

    }

    public List<ServerStat> retrieveServerStats() {
        return stats;
    }

    public ServerStat retrieveServerStat(String hostName) {
        for (ServerStat s : stats) {
            if (s.getHostName()==hostName) {
                return s;
            }
        }
        return null;
    }

    public void updateServerStat(ServerStat servStat){
    		stats.remove(servStat);
    		stats.add(servStat);
    }

    public void addServerStat(String hostName, String hostStatus) {
        stats.add(new ServerStat(hostName, hostStatus));
    }

    public void deleteServerStat(String hostName) {
        Iterator<ServerStat> iterator = stats.iterator();
        while (iterator.hasNext()) {
            ServerStat servStat = iterator.next();
            if (servStat.getHostName() == hostName) {
                iterator.remove();
            }
        }
    }
}
