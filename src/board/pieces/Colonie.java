package board.pieces;

import board.VertexLocation;
import board.cartes.CarteResource;

public class Colonie extends Structure {

    public Colonie (int x, int y, int o) {
        super.setLocation(new VertexLocation(x,y,0));
        super.setType(0);
    }

    public void donnerResources(String type) {
        super.getJoueur().setNombreResourcesType(type,super.getJoueur().getNombreResourcesType(type)+1);
    }

}