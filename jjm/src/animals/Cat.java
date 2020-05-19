package animals;

// класс семейства "Кошачьи"
class Cat extends Animal { // указываем на наследование от класса Animal
    private String regnum; // царство, к которому принадлежит семейство
    private String phylum; // тип, к котрому принадлежит семейство
    private String classis; // класс, к которому принадлежит семейство
    private String ordo; // отряд, к которому принадлежит семейство

    public Cat(String regio, String regnum, String phylum, String classis, String ordo) {
        super(regio); // вызываем конструктор из родительского класса, передаем параметр
        this.regnum = regnum;
        this.phylum = phylum;
        this.classis = classis;
        this.ordo = ordo;
    }

    public String getRegnum() { // геттер для regnum
        return regnum;
    }

    public String getPhylum() { // геттер для phylum
        return phylum;
    }

    public String getClassis() { // геттер для classis
        return classis;
    }

    public String getOrdo() { // геттер для ordo
        return ordo;
    }
}
