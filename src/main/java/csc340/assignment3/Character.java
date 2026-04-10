package csc340.assignment3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long characterId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String description;

  private String universe;
  private String species;
  private int age;
  private String image;

  public Character() {
  }

  public Character(String name, String description, String universe, String species, int age) {
    this.name = name;
    this.description = description;
    this.universe = universe;
    this.species = species;
    this.age = age;
  }

  public Character(Long characterId, String name, String description, String universe, String species, int age) {
    this.characterId = characterId;
    this.name = name;
    this.description = description;
    this.universe = universe;
    this.species = species;
    this.age = age;
  }

  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getUniverse() {
    return universe;
  }

  public void setUniverse(String universe) {
    this.universe = universe;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

}