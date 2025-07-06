package interfaces.map;

import interfaces.assets.maps.Lobby;

public class Map {
    public void show() {
        Lobby lobby = new Lobby();
        int[][] lobbyMap = lobby.getLobby();
        System.out.println(lobby.getDescription());
        for (int i = 0; i < lobbyMap.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < lobbyMap[i].length; j++) {
                if (lobbyMap[i][j] == 1) {
                    System.out.print("█");
                    continue;
                }
                System.out.print(" ");
            }
        }
    }
}