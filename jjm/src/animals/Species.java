package animals;

// класс вида
public class Species extends Cat { // указываем на наследование от класса Cat
    private String nameOfSpecie; // название вида
    private String subfamilia; // подсемейство, к которому принадлежит данный вид
    private String genus; // род, к которому принадлежит данный вид

    public Species(String regio, String regnum, String phylum, String classis, String ordo, String nameOfSpecie, String subfamilia, String genus) {
        super(regio, regnum, phylum, classis, ordo); // вызываем конструктор из родительского класса, передаем параметры
        this.nameOfSpecie = nameOfSpecie;
        this.subfamilia = subfamilia;
        this.genus = genus;
    }

    public String getNameOfSpecie() { // геттер для nameOfSpecie
        return nameOfSpecie;
    }

    public String getSubfamilia() { // геттер для subfamilia
        return subfamilia;
    }

    public String getGenus() { // геттер для genus
        return genus;
    }
}
