package ru.skypro;

import ru.skypro.HogwartsStudent;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int derermination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int derermination, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.derermination = derermination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDerermination() {
        return derermination;
    }

    public void setDerermination(int derermination) {
        this.derermination = derermination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int ability() {
        return cunning + derermination + ambition + ingenuity + thirstForPower;
    }
        public void compareSlytherin(SlytherinStudent slytherinStudent) {
            int ability1 = ability();
            int ability2 = slytherinStudent.ability();
            if (ability1 > ability2) {
                System.out.printf("Студент %s лучше студента %s%n", getName(), slytherinStudent.getName());
            } else if (ability2 > ability1) {
                System.out.printf("Студент %s лучше студента %s%n", slytherinStudent.getName(), getName());
            } else
                System.out.printf("Студент %s такой же, как %s%n", slytherinStudent.getName(), getName());

    }
    @Override
    public String toString() {
        return String.format(" %s; хитрость: %d; решительность: %d; амбициозность: %d;" +
                        " находчивость:" + " %d; жажда власти: %d",
                super.toString(), cunning, derermination, ambition, ingenuity, thirstForPower);
    }
}
