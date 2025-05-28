package com.gildeonbs.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

// This entity uses a composite primary key represented by the BelongingPK class.
// The @EmbeddedId annotation indicates that the 'id' field is a composite key.
// The BelongingPK class is marked with @Embeddable and contains two @ManyToOne associations: one to Game and one to GameList.
// These two objects (game and gameList) together uniquely identify a Belonging instance.
// In the constructor, we set each part of the composite key separately using the setters of the embedded id object.
// This pattern is common in JPA when mapping many-to-many relationships with additional attributes like 'position'.

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    // The helper class BelongingPK was created because in this model, we have repository cases
    // that require a single type for the ID, and it cannot consist of multiple attributes
    // This class represents a composite primary key
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging() {
    }

    // Constructor for the Belonging entity, which represents a many-to-many relationship between Game and GameList
    // Sets the composite primary key (game and game list) and the additional attribute 'position'
    public Belonging(Game game, GameList list, Integer position) {
       id.setGame(game);
       id.setGameList(list);
       this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
