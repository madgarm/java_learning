package animals;

// класс царства "Животные"
class Animal {
    private String regio; // домен, к которому принадлежит семейство

    Animal(String regio) {
        this.regio = regio;
    }

    public String getRegio() { // геттер для regio
        return regio;
    }

    protected void setRegio(String regio) { // сеттер для regio
        this.regio = regio;
    }
}


