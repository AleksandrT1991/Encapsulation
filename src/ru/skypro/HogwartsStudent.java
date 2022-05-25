package ru.skypro;



    public abstract class HogwartsStudent {
        private String name;
    public int magic;
    private int transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int abilityHogwarts() {
        return magic + transgression;
    }

    public void print() {
        System.out.println(this);
    }
    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = abilityHogwarts();
        int ability2 = hogwartsStudent.abilityHogwarts();
        if (ability1 > ability2) {
            System.out.printf("������� %s ����� �������� %s%n", getName(), hogwartsStudent.getName());
        } else if (ability2 > ability1) {
            System.out.printf("������� %s ����� �������� %s%n",hogwartsStudent.getName(), getName());
        } else
            System.out.printf("������� %s ����� ��, ��� %s%n",hogwartsStudent.getName(), getName());
    }

    @Override
    public String toString() {
        return String.format("������� %s; ���� ����� %d; ���� ������������; %d", name, magic, transgression);
    }

}
